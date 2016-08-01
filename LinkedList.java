package OOAD_practice;

class Node {
	private int data;
	private Node next;
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node n) {
		next = n;
	}
	
	
	public Node() {
		data=0;
		next=null;
	}
	
	public Node(int d,Node n) {
		data = d;
		next = n;
	}
}

class LinkedListOperations {
	 private Node start;
	 
	 public LinkedListOperations() {
		 start=null;
	 }
	 
	 public void addFirst(int data) {
		 Node n = new Node(data,null);
		 n.setData(data);
		 if(start==null) {
			start=n;
			start.setNext(null);
		 }
		 else {
			 n.setNext(start);
			 start = n;
		 }
		 
	 }
	 
	 public void addLast(int data) {
		 Node n = new Node(data,null);
		 n.setData(data);
		 if(start==null) {
			 start=n;
			 start.setNext(null);
		 }
		 else {
			 Node temp=start;
			 while(temp.getNext()!=null) {
				 temp=temp.getNext();
        	  }
			 temp.setNext(n);
			 n.setNext(null);
			 
		 }
	 }
	 
	 public void addPos(int data,int pos) {
		 Node n = new Node(data,null);
		 if(pos==0 || start==null) {
			 addFirst(data);
		 }
		 else {
			 int counter=0;
			 Node temp = start;
			 while(counter<pos) {
				 temp = temp.getNext();
				 counter++;
			 }
			 n.setNext(temp.getNext());
			 temp.setNext(n);
			 
		 }
	 }
	 
	 public void printAll() {
		 Node temp = start;
		 int counter =0;
		 while(temp.getNext()!=null) {
			 System.out.println("value is-->"+temp.getData());
			 temp=temp.getNext();
			 counter++;
		 }
		 System.out.println("value is-->"+temp.getData());
		 System.out.println("size is-->"+(counter+1));
	 }
	
}



public class LinkedListImpl {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListOperations a = new LinkedListOperations();
		
		a.addFirst(2);
		a.addLast(3);
		a.addFirst(10);
		a.addLast(5);
		a.addPos(12, 1);
		a.printAll();

	}

}
