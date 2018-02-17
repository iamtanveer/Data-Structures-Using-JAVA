package Linked_Lists;

public class Remove_Duplicates {

	public static Node<Integer> removeDuplicates(Node<Integer> head){
		if(head == null){
			return head;
		}
		
		if(head.next == null){
			return head;
		}
		
		Node<Integer> t1 = head;
		Node<Integer> t2 = head.next;
		
		while(t2 != null){
			if(t1.data == t2.data){
				t2 = t2.next;
			}else{
				t1.next = t2;
				t1 = t2;
				t2 = t2.next;
			}
		}
		
		t1.next = t2;
		
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = Insert_Node.takeInput();
		Node<Integer> res = removeDuplicates(head);
		Insert_Node.print(res);
	}

}
