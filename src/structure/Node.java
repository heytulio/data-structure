package structure;

import java.util.Objects;

public class Node {
	
	private int data;
	private Node nextNode;
	
	public Node(int data) {
		this.data = data;
		this.nextNode = null;
	}
	
	public Node (int data, Node node) {
		this.data = data;
		this.nextNode = node;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node node) {
		this.nextNode = node;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		return data == other.data;
	}
	
}
