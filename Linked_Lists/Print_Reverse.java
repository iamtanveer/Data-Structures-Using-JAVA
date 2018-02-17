package Linked_Lists;

public class Print_Reverse {

	public static void printReverse(Node<Integer> head){
		if(head == null){
			return;
		}
		
		printReverse(head.next);
		System.out.print(head.data+ " ");
		
	}
	
	public static void main(String[] args) {
		Node<Integer> head = Insert_Node.takeInput();
		printReverse(head);
	}

}
