package se2ue11_k1648066;

public class SourceFile extends File{
	private BinaryFile binaryFile;
	
	public SourceFile(String name, Folder parent) {
		super(name, 0, parent);
	}
	public SourceFile(String name, Folder parent, BinaryFile binaryFile) {
		super(name, 0, parent);
		this.binaryFile = binaryFile;
	}
	@Override
	public void accept(ResourceVisitor resourceVisitor) {
		resourceVisitor.visit(this);
	}
	public BinaryFile getBinary() {
		return this.binaryFile;
	}
		
}
