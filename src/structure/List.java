package structure;

public class List {
	
	private Node ref;
	
	public List() {
		ref = null;
	}
	
	public void insert(int data) {
		Node newNode = new Node(data, ref);
		ref = newNode;
	}
	
	public boolean isEmpty() {
		return ref == null;
	}
	
	public void print() {
		if (isEmpty()) {
			System.out.println("Empty List;");
			return;
		}
		for(Node n = ref; n != null; n = n.getNextNode()) {
			System.out.println("Data: "+n.getData());
		}
		System.out.println();
	}
	
	public int count() {
		int count = 0;
		if (isEmpty()) {
			return count;
		}
		for(Node n = ref; n != null; n = n.getNextNode()) {
			count++;
		}
		return count;
	}
	
	public int find(int findData) {
		if(isEmpty()) {
			System.out.println("List is empty;");
			return -1;
		}
		Node wanted = new Node(findData);
		int count = 0;
		for(Node n = ref; n != null; n = n.getNextNode()) {
			if(n.equals(wanted)) {
				return count;
			}
			count++;
		}
		return -1;
	}
		
	public Node findByIndex(int index) {
		if(isEmpty()) {
			System.out.println("List is empty;");
			return null;
		}
		int count = 0;
		for(Node n = ref; n != null; n = n.getNextNode()) {
			if(count == index) {
				return n;
			}
			count++;
		}
		return null;
	}
	
	public boolean remove(int data) {
		if(isEmpty()) {
			System.out.println("List is empty;");
			return false;
		}
		int indexRN = this.find(data);
		if(indexRN == -1) {
			return false;
		}
		Node nodeToRemove = this.findByIndex(indexRN);
		Node temp = this.findByIndex(indexRN-1);
		temp.setNextNode(nodeToRemove.getNextNode());
		nodeToRemove = null;
		return true;
	}
	
	public boolean removeByIndex(int index) {
		if(isEmpty()) {
			System.out.println("List is empty;");
			return false;
		}
		Node wanted = this.findByIndex(index);
		if(wanted == null) {
			return false;
		}
		
		Node temp = this.findByIndex(index-1);
		temp.setNextNode(wanted.getNextNode());
		wanted = null;
		return true;
		
	}
	
	
	
	
}
