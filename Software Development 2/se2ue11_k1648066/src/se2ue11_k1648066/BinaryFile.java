package se2ue11_k1648066;

public class BinaryFile extends File {
	private SourceFile sourceFile;
	
	public BinaryFile(String name, Folder parent, SourceFile sourceFile) {
		super(name, 0, parent);
		this.sourceFile = sourceFile;
	}
	@Override
	public void accept(ResourceVisitor resourceVisitor) {
		resourceVisitor.visit(this);
	}
	public SourceFile getSourceFile() {
		return sourceFile;
	}

}
