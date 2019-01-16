package Node;

public class Node {
	private Object data;
	private Node next;

	public Node(Object d){
		data = d;
	}
	public Node(Object d, Node nextNode){
		data = d;
		next = nextNode;
	}
	public Node getNext(){
		return next;
	}
	public Object getData(){
		return data;
	}
	public void setNext(Node n){
		next = n;
	}
	public void setData(Object o){
		data = o;
	}
}
