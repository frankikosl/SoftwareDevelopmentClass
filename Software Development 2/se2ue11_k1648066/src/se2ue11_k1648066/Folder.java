package se2ue11_k1648066;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Resource {
	private List<Resource> children = new ArrayList<>();
	public Folder(String name, Folder folder) {
		super(name, folder);
	}
	
	@Override
	public void accept(ResourceVisitor resourceVisitor) {
		for(Resource res : children) {
			this.accept(resourceVisitor);
		}
	}

	public List<Resource> getChildren() {
		return children;
	}

}
