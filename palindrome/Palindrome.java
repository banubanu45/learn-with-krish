package example;

import java.util.LinkedList;

public class Palindrome {
	static Node head; 
    
    static class Node { 
        char data; 
        Node next; 
        Node(char ch) 
        { 
            data = ch; 
            next = null; 
        } 
    } 
  
    static Node reverse(Node head) 
    { 
        if (head == null || head.next == null) 
            return head; 
  

        Node rest = reverse(head.next); 
        head.next.next = head; 
  
     
        head.next = null; 
        return rest; 
    } 
  
    static Node print() 
    { 
        Node temp = head; 
        
        while (temp != null) { 
            temp = temp.next; 
            
        } 
        
        return temp;
    } 
  
    static void push(char ch) 
    { 
        Node temp = new Node(ch); 
        temp.next = head; 
        head = temp; 
    } 
   
  
    public static void main(String args[]) 
    { 
	
	
	LinkedList<Object> list =new LinkedList<>();
	String name = "AOA";
	char[] ch = name.toCharArray();
	for(int i=0;i<ch.length;i++) {
		list.add(ch[i]);
		push(ch[i]);
	}

    Node ob =  print(); 
  
    head = reverse(head); 

    Node ob1 = print(); 
    
    if(ob==ob1) {
    	System.out.println("Palindrome");
    }else {
    	System.out.println("Not palindrome");
    }
    

}



}