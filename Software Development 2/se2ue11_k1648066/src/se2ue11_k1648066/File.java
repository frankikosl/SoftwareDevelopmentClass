package se2ue11_k1648066;

public abstract class File extends Resource {
	private int size;
	
	public File(String name, int size, Folder folder) {
		super(name, folder);
		this.size = size;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
