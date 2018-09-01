package se2ue11_k1648066;

public abstract class Resource {
	private final String name;
	private final Folder parent;
	
	public Resource(String name, Folder parent) {
		this.name = name;
		this.parent = parent;
	}
	
	public abstract void accept(ResourceVisitor resourceVisitor);
	
	public boolean equals(Resource resource) {
		return this.getName().equals(resource.getName()) && 
				this.getParent().equals(resource.getParent());
	}

	public String getName() {
		return name;
	}

	public Folder getParent() {
		return parent;
	}
}
