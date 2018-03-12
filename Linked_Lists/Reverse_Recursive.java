package Linked_Lists;

public class Reverse_Recursive {

	public static Node<Integer> reverseRecursive(Node<Integer> head){
		
		if(head==null || head.next == null){
			return head;
		}
		
		Node<Integer> reversedTail = head.next;
		Node<Integer> smallHead = reverseRecursive(head.next);
		reversedTail.next = head;
		head.next = null;
		
		return smallHead;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = Insert_Node.takeInput();
		Node<Integer> res = reverseRecursive(head);
		Insert_Node.print(res);
	}

}
