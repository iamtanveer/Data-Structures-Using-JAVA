package Linked_Lists;

public class Delete_Nth {

	public static void main(String[] args) {
		Node<Integer> head = Insert_Node.takeInput();
		Node<Integer> res = deleteNode(head, 3);
		
		Insert_Node.print(res);
	}
	
	public static Node<Integer> deleteNode(Node<Integer> head, int i){
		if(head == null){
			return head;
		}
		
		if(i==0){
			return head.next;
		}
		
		int count = 0;
		Node<Integer> temp = head;
		while(temp.next!=null && count < i-1){
			temp = temp.next;
			count++;
		}
		
		if(temp == null){
			return head;
		}
		
		if(temp.next != null){
			temp.next = temp.next.next;
		}
		
		return head;
		
		
		
		
		
	}

}
