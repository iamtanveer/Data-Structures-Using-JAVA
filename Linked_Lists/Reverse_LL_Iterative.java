package Linked_Lists;

public class Reverse_LL_Iterative {

	public static Node<Integer> reverse(Node<Integer> head){
		Node<Integer> curr = head, prev = null, fwd = null;
		
		while(curr != null){
			fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;
		}
		
		return prev;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = Insert_Node.takeInput();
		Node<Integer> res = reverse(head);
		Insert_Node.print(res);
	}

}
