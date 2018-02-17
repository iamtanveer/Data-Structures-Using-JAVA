package Linked_Lists;

public class Check_Palindrome {

	public static boolean checkPalindrome(Node<Integer> head){
		
		if(head == null || head.next == null){
			return true;
		}
		
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		
		Node<Integer> secondHead = slow.next;
		slow.next = null;
		secondHead = reverse(secondHead);
		
		Node<Integer> p = head, q = secondHead;
		while(q != null){
			if(q.data != p.data){
				return false;
			}
			q = q.next;
			p = p.next;
		}
		
		return true;
	}
	
	public static Node<Integer> reverse(Node<Integer> head){
		Node<Integer> curr = head, fwd = null, prev = null;
		
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
		System.out.println(checkPalindrome(head));
	}

}
