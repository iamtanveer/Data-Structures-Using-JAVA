package Linked_Lists;

public class Reverse_Recursive {

	public static Node<Integer> reverseRecursive(Node<Integer> head){
		
		if(head.next == null){
			return head;
		}
		
		Node<Integer> finalHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return finalHead;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = Insert_Node.takeInput();
		Node<Integer> res = reverseRecursive(head);
		Insert_Node.print(res);
	}

}
