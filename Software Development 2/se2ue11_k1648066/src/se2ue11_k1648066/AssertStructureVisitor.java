package se2ue11_k1648066;

import java.util.ArrayList;
import java.util.List;

public class AssertStructureVisitor implements ResourceVisitor {
	List<File> files = new ArrayList<File>();
	@Override
	public void visit(BinaryFile binaryFile) {
		if(binaryFile.getParent() == null) throw new AssertionException("No valid Parent", binaryFile);
		else if(!binaryFile.getParent().getChildren().contains(binaryFile)) 
			throw new AssertionException("Parent doesnt have child", binaryFile);
		if(files.contains(binaryFile)) throw new AssertionException("Structure must be a tree", binaryFile);
		if(binaryFile.getSourceFile() != null) {
			if(binaryFile.getSourceFile().getParent() != binaryFile.getParent()) {
				throw new AssertionException("Binary must be in same directory as source", binaryFile);
			}
		}
		else {
			throw new AssertionException("Binary must be reference a source file", binaryFile);
		}
		files.add(binaryFile);
		boolean rootFound = false;
		for (File file : files) {
			if(file.getParent() == null) {
				if (rootFound) {
					throw new AssertionException("Only one folder can have no parent", binaryFile);
				}
				else {
					rootFound = true;
				}
			}
		}
		
	}

	@Override
	public void visit(SourceFile sourceFile) {
		if(sourceFile.getParent() == null) throw new AssertionException("No valid Parent", sourceFile);
		else if(!sourceFile.getParent().getChildren().contains(sourceFile)) 
			throw new AssertionException("Parent doesnt have child", sourceFile);
		if(files.contains(sourceFile)) throw new AssertionException("Structure must be a tree", sourceFile);
		files.add(sourceFile);
		boolean rootFound = false;
		for (File file : files) {
			if(file.getParent() == null) {
				if (rootFound) {
					throw new AssertionException("Only one folder can have no parent", sourceFile);
				}
				else {
					rootFound = true;
				}
			}
		}
		
	}

}
