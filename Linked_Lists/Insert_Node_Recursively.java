package Linked_Lists;

import java.util.Scanner;

public class Insert_Node_Recursively {

	public static Node<Integer> Insert_Recursive(Node<Integer> head, int data, int pos){
		if(head==null){
			if(pos==0){
				Node<Integer> newNode = new Node<Integer>(data);
				newNode.next = head;
				return newNode;
			}else{
				return head;
			}
		}
		
		if(pos==0){
			Node<Integer> newNode = new Node<Integer>(data);
			newNode.next = head;
			return newNode;
		}
		
		
		head.next = Insert_Recursive(head.next, data, pos-1);
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();	
		Node<Integer> res = Insert_Recursive(head, 100, 3);
		print(res);
		
	}
	
	public static void print(Node<Integer> head){
		while(head.next!=null){
			System.out.print(head.data+ " ");
			head = head.next;
		}
		System.out.print(head.data+ " ");
	}
	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
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
