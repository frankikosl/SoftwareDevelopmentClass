package se2ue11_k1648066;

public class ComputeSizeVisitor implements ResourceVisitor {
	private boolean includeBinary;
	private int size;
	public ComputeSizeVisitor(boolean includeBinary) {
		this.includeBinary = includeBinary;
		size = 0;
	}
	@Override
	public void visit(SourceFile sourceFile) {
		size += sourceFile.getSize();
	}
	
	@Override
	public void visit(BinaryFile binaryFile) {
		if(includeBinary) {
			size += binaryFile.getSize();
		}
	}
	public int getSize() {
		return size;
	}
}