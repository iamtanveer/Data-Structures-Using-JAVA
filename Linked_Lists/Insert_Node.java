package Linked_Lists;

import java.util.Scanner;

public class Insert_Node {

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		Node<Integer> res = insert(head, 100, 3);
		print(res);
	}

	public static void print(Node<Integer> head){
		while(head.next!=null){
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.print(head.data+ " ");
	}
	
	public static Node<Integer> insert(Node<Integer> head, int data, int pos){
		int count = 0;
		Node<Integer> newNode = new Node<>(data);
		
		if(pos==0){
			newNode.next = head;
			head = newNode;
			return head;
		}
		
		Node<Integer> temp = head;
		
		while(temp!=null && count < pos -1){
			temp = temp.next;
			count++;
		}
		
		if(temp == null){
			return head;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
		
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
