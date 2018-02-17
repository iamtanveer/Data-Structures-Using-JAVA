package Linked_Lists;

import java.util.Scanner;

public class Length_Of_LL {

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		System.out.println(length(head));
	}
	
	public static int length(Node<Integer> head){
		int count = 1;
		while(head.next!=null){
			head = head.next;
			count++;
		}
		return count;
	}
	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		while(data != -1){
			Node<Integer> newNode = new Node<>(data);
			if(head == null){
				head = newNode;
				tail = newNode;
			}else{
				tail.next = newNode;
				tail = newNode;
			}
			
			data = s.nextInt();
		}
		
		
		return head;
	}

}
