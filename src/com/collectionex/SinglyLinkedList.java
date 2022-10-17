package com.collectionex;

import java.util.Scanner;

public class SinglyLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList llist = new SinglyLinkedList();
		llist.head = new Node(1);
		
		
		Node parent=llist.head;
		for(int i=2;i<=5;i++)
		{
			parent.next=new Node(i);
			parent =parent.next;
		}
		Node temp=llist.head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println("\nEnter the number to search");
		Scanner sc=new Scanner(System.in);
		int search=sc.nextInt();
		Node temp1=llist.head;
		int i=0;
		boolean found=false;
		while(temp1!=null)
		{
			i++;
			if(temp1.data==search)
			{
				System.out.println("Element found :"+i+"th node");
				found=true;
				break;
			}
			temp1=temp1.next;
		}
		if(!found)
		{
			System.out.println("Element is not found!");
		}
		
	}

}
