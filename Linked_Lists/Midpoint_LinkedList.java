package Linked_Lists;

public class Midpoint_LinkedList {

	public static int midPoint(Node<Integer> head){
		if(head == null){
			return 0;
		}
		
		Node<Integer> fast = head, slow = head;
		
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return slow.data;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = Insert_Node.takeInput();
		System.out.println(midPoint(head));
	}

}
