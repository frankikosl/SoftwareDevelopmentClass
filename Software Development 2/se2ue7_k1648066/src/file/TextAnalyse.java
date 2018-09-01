package file;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import junit.framework.Test;

public class TextAnalyse{
	
	static Optional<String> findLine(String inFile, String text) throws IOException{
		Path path = Paths.get(inFile);
		Stream<String> file = null;
		try {
			file = Files.lines(path);
		} catch (Exception e) {
			Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, e);
		}
		Optional<String> line = file.filter(s -> s.contains(text)).findFirst();
		return line;
	}
	static List<String> findLines(String inFile, String text) throws IOException{
		Path path = Paths.get(inFile);
		Stream<String> file = null;
		try {
			file = Files.lines(path);
		} catch (Exception e) {
			Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, e);
		}
		List<String> lines = file.filter(s -> s.contains(text)).collect(Collectors.toList());
		return lines;
		
	}
	static void writeNoEmptyLines (String inFile, String outFile) throws IOException{
		Path path = Paths.get(inFile);
		Path pathOut = Paths.get(outFile);
		Stream<String> file = null;
		try {
			file = Files.lines(path);
		} catch (Exception e) {
			Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, e);
		}
		List<String> lines = file.filter(s -> !s.isEmpty()).collect(Collectors.toList());
		Files.write(pathOut, lines);
		
	}
	static Stream<String> wordStream(String inFile) throws IOException{
		Path path = Paths.get(inFile);
		Stream<String> file = null;
		try {
			file = Files.lines(path);
			return file.flatMap(i -> Arrays.stream(i.toLowerCase().split("[ .,;?!.:()-]")).filter(s -> (s.length() > 0)).filter(s -> s.substring(0, 1).matches("[a-z]") || (s.substring(0, 1).matches("[A-Z]")))).sorted().distinct();
		} catch (Exception e) {
			Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, e);
			return null;
		}
		
	}
	static List<String> words(String inFile) throws IOException{
		List<String> wordsList = wordStream(inFile).collect(Collectors.toList());
		return wordsList;
	}
	static double averageLineLength(String inFile) throws IOException{
		Path path = Paths.get(inFile);
		Stream<String> file = null;
		Stream<String> file2 = null;
		try {
			file = Files.lines(path);
			file2 = Files.lines(path);
		} catch (Exception e) {
			return 0;
		}
		return (double) file.map(i -> i.length()).reduce(0, (a, b) -> a + b) / (double) file2.count();
	}
	static double averageWordsInLine (String inFile) throws IOException{
		Path path = Paths.get(inFile);
		Stream<String> file = null;
		Stream<String> file2 = null;
		try {
			file = Files.lines(path);
			file2 = Files.lines(path);
		} catch (Exception e) {
			Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, e);
		}
		return (double) file.flatMap(i -> Arrays.stream(i.split("[ .,;?!.:()-]")).filter(s -> (s.length() > 0))).count()/ (double) file2.count();
	}
	static Map<Character, List<String>> alphaGrouping(String inFile) throws IOException{
		return wordStream(inFile).collect(Collectors.groupingBy(e -> e.charAt(0)));
	}
}