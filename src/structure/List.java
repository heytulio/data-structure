package structure;

public class List {

	protected Node ref;

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
		for (Node n = ref; n != null; n = n.getNextNode()) {
			System.out.println("Data: " + n.getData());
		}
		System.out.println();
	}

	public int length() {
		int count = 0;
		if (isEmpty()) {
			return count;
		}
		for (Node n = ref; n != null; n = n.getNextNode()) {
			count++;
		}
		return count;
	}

	public int find(int findData) {
		if (isEmpty()) {
			System.out.println("List is empty;");
			return -1;
		}
		Node wanted = new Node(findData);
		int count = 0;
		for (Node n = ref; n != null; n = n.getNextNode()) {
			if (n.equals(wanted)) {
				return count;
			}
			count++;
		}
		return -1;
	}

	public Node findByIndex(int index) {
		if (isEmpty()) {
			System.out.println("List is empty;");
			return null;
		}
		int count = 0;
		for (Node n = ref; n != null; n = n.getNextNode()) {
			if (count == index) {
				return n;
			}
			count++;
		}
		return null;
	}

	public boolean remove(int data) {
		if (isEmpty()) {
			System.out.println("List is empty;");
			return false;
		}
		int indexRN = this.find(data);
		if (indexRN == -1) {
			return false;
		}
		Node nodeToRemove = this.findByIndex(indexRN);
		Node temp = this.findByIndex(indexRN - 1);
		temp.setNextNode(nodeToRemove.getNextNode());
		nodeToRemove = null;
		return true;
	}

	public boolean removeByIndex(int index) {
		if (isEmpty()) {
			System.out.println("List is empty;");
			return false;
		}
		Node wanted = this.findByIndex(index);
		if (wanted == null) {
			return false;
		}

		Node temp = this.findByIndex(index - 1);
		temp.setNextNode(wanted.getNextNode());
		wanted = null;
		return true;

	}

	public void append(int data) {
		Node newNode = new Node(data, null);
		if (ref == null) {
			newNode.setNextNode(ref);
			ref = newNode;
			return;
		}
		for (Node n = ref; n != null; n = n.getNextNode()) {
			if(n.getNextNode() == null) {
				n.setNextNode(newNode);
				return;
			}
		}
	}
	
	public void insertInto(int data, int index) {
		Node newNode = new Node(data, null);
		if (ref == null) {
			newNode.setNextNode(ref);
			ref = newNode;
			return;
		}
		int counter = 0;
		for(Node n = ref; n!= null; n = n.getNextNode()) {
			if(counter == index) {
				Node prev = this.findByIndex(index-1);
				prev.setNextNode(newNode);
				newNode.setNextNode(n);
				return;
			}
			counter++;
		}
	}
	
	public int count(int data) {
		if (isEmpty()) {
			return 0;
		}
		int counter = 0;
		for (Node n = ref; n != null; n = n.getNextNode()) {
			if(n.getData() == data) {
				counter++;
			}
		}
		return counter;
	}

}
