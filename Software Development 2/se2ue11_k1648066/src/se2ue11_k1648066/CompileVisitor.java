package se2ue11_k1648066;

public class CompileVisitor implements ResourceVisitor {
	@Override
	public void visit(SourceFile sourceFile) {
		if(sourceFile.getBinary() == null) {
			BinaryFile newBinary = new BinaryFile(sourceFile.getName() + ".binary", sourceFile.getParent(), sourceFile);
			newBinary.setSize(sourceFile.getSize() * 2);
		}
	}
	
	@Override
	public void visit(BinaryFile binaryFile) {
		throw new UnsupportedOperationException("Compile Visitor can not visit Binary File");
	}
}
