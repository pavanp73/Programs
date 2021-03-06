
public class Node {
	private String value;
	private boolean visited = false;
	private int level;
	private Node parent;
	
	public Node(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}

	@Override
	public int hashCode() {
		
		return this.getValue().hashCode()+37;
	}

	@Override
	public boolean equals(Object obj) {
		Node object = (Node)obj;
		
		if(this.value.equals(object.getValue())){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		
		return this.value+" "+this.level+" ";
	}
	
}
