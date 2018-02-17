package Linked_Lists;

public class Node<T> {
	
	T data;
	Node<T> next; //points to class's object | stores the reference to next node
	
	public Node(T data){
		this.data = data;
		this.next = null;
	}
}
