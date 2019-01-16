package Node;

public class NodeList {
	private Node head;
	private Node tail; // the last Node in  the chain

	public NodeList(Node n){
		head = n;
		tail = head;
	}
	public NodeList(Node h, Node t){
		head = h;
		tail = t;
	}
	public NodeList(){

	}
	public void add(Node newNode){
		Node temp = head;
		head = newNode;
		newNode.setNext(temp);
	}
	public void add(Node nodes[]){
		for (int i = 0 ; i < nodes.length; i++){
			Node temp = head;
			head = nodes[i];
			head.setNext(temp);
		}
	}
	public int getSize(){
		int size = 0;
		Node crawlerNode = head;
		while (crawlerNode.getNext() != null){
			size++;
		}
		return size;
	}
}
