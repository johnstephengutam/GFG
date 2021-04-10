package com.day5;

public class LinkedList{
	static Node head;
	static Node head2;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	static void displayLinkedList(){
		Node list = head;
		System.out.println();
		if(list == null){
			System.out.println("No elements");
			return;
		}
		
		while(list != null){
			System.out.print(list.data+"-->");
			list = list.next;
		}
		//System.out.println();
	}
	
	 void insertAtEnd(int data){
		Node newNode = getNewNode(data);
		
		Node itr = head;
		if(itr == null){
			head = newNode;
			return;
		}
		while(itr.next != null){
			itr = itr.next;
		}
		itr.next = newNode;
	}
	
	 void insertAtBegin(int data){
		 Node newNode = getNewNode(data);
		 
		 Node itr = head;
		 if(itr == null){
			 head = newNode;
			 return;
		 }
		 newNode.next = itr;
		 head = newNode;
	 }
	 
	 static Node getNewNode(int data){
		 Node newNode = new Node(data);
		 newNode.next = null;
		 return newNode;
	 }
	 
	 //We need to get the previous node itr to the postion that we need to insert
	 void insertAtKpostion(int data, int k){
		 Node newNode = getNewNode(data);
		 Node itr = head;
		 k = k -2;
		 while(itr != null && k != 0){
			 itr = itr.next;
			 k--;
		 }
		 newNode.next = itr.next;
		 itr.next = newNode;
	 }
	 
	 static void deleteNode(int data){
		 Node itr = head;
		 Node prev = head;
		 
		 if(itr.data == data){
			 head = head.next;
			 return;
		 }
		 while(itr.data != data && itr.next != null){
			 prev = itr;
			 itr = itr.next;
		 }
		/* if(itr.next == null || head ==null){
			 System.out.println("Data not present");
			 return;
		 }*/
		 prev.next = itr.next;
		 itr.next = null;
	 }
	 
	 static void insertAfterData30(int data){
		 Node newNode = getNewNode(data);
		 Node itr = head;
		 
		 while(itr.data != 30 && itr != null)
			 itr = itr.next;
		 
		 newNode.next = itr.next;
		 itr.next = newNode;
		 
	 }
	 
	 static void middleElement(){
		 int count = 0;
		 
		 Node itr = head;
		 
		 while(itr != null){
			 count++;
			 itr = itr.next;
		 }
		 
		 System.out.println("No of nodes "+ count);
		 
		 if(count%2 == 0)
			 System.out.println("No middle element");
		 else{
			 itr = head;
			 int mid = count/2;
			 while(itr != null && mid != 0){
				 mid--;
				 itr = itr.next;
			 }
			 System.out.println("Middle element "+itr.data);
		 }
	 }
	 
	 static void middleElement2PointersApproach(){
		Node fast = head;
		Node slow = head;
		
		if(fast.next == null){
			System.out.println("Middle Element "+fast.data);
			return;
		}
			
		
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		/*if(fast.next != null && fast.next.next == null){
			System.out.println("No middle element");
		}*/
		System.out.println("2pointersAproach Middle Element "+slow.data);
	 }
	 
	 static void kthElementFromEnd(int k){
		 int n = 0;
		 Node itr = head;
		 
		 while(itr != null){
			 n++;
			 itr = itr.next;
		 }
		 
		 int num = n - k +1;
		 itr = head;
		 
		 while(itr != null && num > 1){
			 itr = itr.next;
			 num = num - 1;
		 }
		 
		 System.out.println(k+"rd/th element from end "+ itr.data);
	 }
	 
	 public static void kthElementFromEndApproachByPointers(int l){
		 int k = l;
		 Node first = head;
		 Node second = head;
		 while(k > 1){
			 second = second.next;
			 k--;
		 }
		 while(second.next !=null){
			 first = first.next;
			 second = second.next;
		 }
		 System.out.println(l +"rd/th element from end by pointer approach "+ first.data);
	 }
	 
	 public static void reverseLinkedList(){
		 Node prev = null;
		 Node curr = head;
		 Node next = curr.next;
		 
		 if(head == null|| head.next == null)
			 return;
		 
		 while(curr.next != null){
			 curr.next = prev;
			 prev = curr;
			 curr = next;
			 next = next.next;
		 }
		 curr.next= prev;
		 head = curr;
	 }
	 
	 
	 
	/*public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		
		displayLinkedList();
		
		list.insertAtBegin(5);
		
		displayLinkedList();
		
		list.insertAtKpostion(15,3);
		
		displayLinkedList();
		
		insertAfterData30(35);
		
		displayLinkedList();
		
		//deleteNode(40);
		
		//displayLinkedList();
		
		middleElement();
		
		middleElement2PointersApproach();
		
		kthElementFromEnd(3);
		
		kthElementFromEndApproachByPointers(1);
		
		reverseLinkedList();
		
		displayLinkedList();
	}*/
	 
	 public static void palindromeOrNot(){
		 int n = 0;
		 
		 Node itr = head;
		 Node list1 = head;
		 Node list2 = null;
		 
		 while(itr != null){
			 n++;
			 itr = itr.next;
		 }
		 
		 if(n%2 == 0){
			 int mid = n/2;
			 while(list1 != null && mid > 1){
				list1 = list1.next;
				mid = mid - 1;
			 }
			 list2 = list1.next;
		 }
		 else{
			 int mid = (int) Math.ceil(n/2);
			 while(list1 != null && mid > 1){
				 list1 = list1.next;
				 mid = mid - 1;
			 }
			 list2 = list1.next.next;
		 }
		 
		 //Reversing the list2
		 Node prev = null;
		 Node curr = list2;
		 Node next = curr.next;
		 
		 while(curr.next != null){
			 curr.next = prev;
			 prev = curr;
			 curr = next;
			 next = next.next;
		 }
		 curr.next= prev;
		 list2 = curr;
		 
		 //Comparing the list1 and reverse of list2
		 list1 = head;
		 int flag = 0;
		 while(list1 != null && list2 != null){
			 if(list1.data == list2.data){
				 flag++;
				 list1 = list1.next;
				 list2 = list2.next;
			 }
			 else
			 break;
		 }
		 if(flag == n/2)
			 System.out.println(true);
		 else
			 System.out.println(false);
		 
		 
	 }
	 
	/* public static void main(String[] args){
		 LinkedList list = new LinkedList();
		 list.insertAtEnd(1);
		 list.insertAtEnd(32);
		 list.insertAtEnd(4);
		 list.insertAtEnd(5);
		 list.insertAtEnd(4);
		 list.insertAtEnd(32);
		 list.insertAtEnd(1);
		 
		 palindromeOrNot();
	 }*/
	 Node insertForSpecificPurposeHead1(int data){
			Node newNode = getNewNode(data);
			
			Node itr = head;
			if(itr == null){
				head = newNode;
				return head;
			}
			while(itr.next != null){
				itr = itr.next;
			}
			itr.next = newNode;
			
			return newNode;
		}
	 Node insertForSpecificPurposeHead2(int data){
			Node newNode = getNewNode(data);
			
			Node itr = head2;
			if(itr == null){
				head2 = newNode;
				return head2;
			}
			while(itr.next != null){
				itr = itr.next;
			}
			itr.next = newNode;
			
			return newNode;
		}
	 
	 public static void findIntersection(){
		 Node itr1 = head;
		 Node itr2 = head2;
		 int len1 = 0;
		 int len2 = 0;
		 
		 while(itr1 != null){
			 len1++;
			 itr1 = itr1.next;
		 }
		 System.out.println("len1 "+len1);
		 while(itr2 != null){
			 len2++;
			 itr2 = itr2.next;
		 }
		 System.out.println("len2 "+len2);
		 itr1 = head;
		 itr2 = head2;
		 while(len1 > len2){
			 itr1 = itr1.next;
			 len1--;
		 }
		 while(len2 > len1){
			 itr2 = itr2.next;
			 len2--;
		 }
		 while(itr1 != itr2){
			 itr1 = itr1.next;
			 itr2 = itr2.next;
		 }
		 
		 System.out.println("Intersection node :"+itr1.data);
	 }
	 
	/* public static void main(String[] args){
		 LinkedList list1 = new LinkedList();
		 LinkedList list2 = new LinkedList();
		 
		 list1.insertAtEnd(3);
		 list1.insertAtEnd(5);
		 list1.insertAtEnd(6);
		 Node x = list1.insertForSpecificPurposeHead1(9);
		 list1.insertAtEnd(15);
		 
		 Node y = list2.insertForSpecificPurposeHead2(10);
		 y.next = x;
		 
		 findIntersection();
	 }*/
	 public static void detectLoop(){
		 Node slow = head;
		 Node fast = head;
		 slow = slow.next;
		 fast = fast.next.next;
		 while(slow != fast && fast.next !=null){
			 slow = slow.next;
			 fast = fast.next.next;
		 }
		 
		 if(slow == fast)
			 System.out.println("loop is there");
		 if(slow.next == null || fast.next == null)
			 System.out.println("loop not there");
	 }
	 
	 public static void detectLoopAndRemove(){
		 Node slow = head;
		 Node fast = head;
		 
		 slow = slow.next;
		 fast = fast.next.next;
		 
		 while(slow != fast && fast.next !=null){
			 slow = slow.next;
			 fast = fast.next.next;
		 }
		 
		 if(slow == fast){
			 //System.out.println("loop is there");
			 slow = head;
		 }
		 while(slow.next != fast.next){
			 slow = slow.next;
			 fast = fast.next;
		 }
		 fast.next = null;
		 
		 System.out.println("After loop removal");
		 displayLinkedList();
	 }
	 
	 public static void main(String[] args){
		 LinkedList list = new LinkedList();
		 
		 list.insertAtEnd(1);
		 list.insertAtEnd(2);
		 Node x = list.insertForSpecificPurposeHead1(3);
		 list.insertAtEnd(4);
		 list.insertAtEnd(5);
		 list.insertAtEnd(6);
		 list.insertAtEnd(7);
		 list.insertForSpecificPurposeHead1(8).next = x;
		 
		 detectLoop();
		 
		 detectLoopAndRemove();
		 
	 }
	 
	 
}
