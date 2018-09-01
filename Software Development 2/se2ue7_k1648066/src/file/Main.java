package file;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String [] args) {
		Out.println("Finding lines with the word file in Sampletext");
		try {
			TextAnalyse.findLines("sampletext.txt", "file").forEach(i -> System.out.println(i + " "));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Out.println("\nFinding first line with the word file in Sampletext");
		try {
			Out.println(TextAnalyse.findLine("sampletext.txt", "file"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Out.println("\nWriting text without empty lines in sampletext2");
		try {
			TextAnalyse.writeNoEmptyLines("sampletext.txt", "sampletext2.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Out.println("\nGetting all words in the sampletext");
		try {
			TextAnalyse.words("sampletext.txt").forEach(i -> System.out.print(i + " "));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Out.println("\n\nGetting average Line length in the sampletext");
		try {
			Out.println(TextAnalyse.averageLineLength("sampletext.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Out.println("\nGetting average Word length in the sampletext");
		try {
			Out.println(TextAnalyse.averageWordsInLine("sampletext.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Out.println("\nGetting the alphaGrouping map in the sampletext");
		try {
			TextAnalyse.alphaGrouping("sampletext.txt").forEach((c, v) -> System.out.println("Letter: "+ c + " Words: " + v));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Out.println("\n\nFinding lines with the word euch in Faust");
		try {
			TextAnalyse.findLines("faust_1.txt", "euch").forEach(i -> System.out.println(i + " "));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Out.println("\nFinding first line with the word euch in Faust");
		try {
			Out.println(TextAnalyse.findLine("faust_1.txt", "euch"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Out.println("\nWriting text without empty lines in Faust2");
		try {
			TextAnalyse.writeNoEmptyLines("faust_1.txt", "faust_2.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Out.println("\nGetting all words in the Faust");
		try {
			TextAnalyse.words("faust_1.txt").forEach(i -> System.out.print(i + " "));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Out.println("\n\nGetting average Line length in the Faust");
		try {
			Out.println(TextAnalyse.averageLineLength("faust_1.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Out.println("\nGetting average Word length in the Faust");
		try {
			Out.println(TextAnalyse.averageWordsInLine("faust_1.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Out.println("\nGetting the alphaGrouping map in the Faust");
		try {
			TextAnalyse.alphaGrouping("faust_1.txt").forEach((c, v) -> System.out.println("Letter: "+ c + " Words: " + v));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
