package Linked_Lists;

import java.util.Scanner;


public class Print_ith_Node {

	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		printIth(head, 3);
	}
	
	public static void printIth(Node<Integer> head, int i){
		int count = 0;
		while(head!=null){
			if(i==0){
				System.out.println(head.data);
				return;
			}
			
			head = head.next;
			
			count++;
			if(count==i){
				System.out.println(head.data);
				return;
			}
		}
		return;
	}
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data!=-1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head==null){
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
