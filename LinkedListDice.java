/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto1;

import java.util.Random;

/**
 *
 * @author Jassper
 */
public class LinkedListDice {
    protected int total=0;
    protected int num=5;
    protected String hold="";
    protected int roll[]=new int[num];
    Random rand=new Random();
    public static LinkedListDice list;
    private int max;
    Node head;

    
    public LinkedListDice(int num) {
        this.num = num;
    }
    
    
    
    public static class Node {
        
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    

    public void setList(LinkedListDice list) {
        LinkedListDice.list = list;
    }
    
    
    
    public LinkedListDice insert(int data){
        
        Node current=new Node(data);
        current.next=null;
        
        if(list.head==null){
            list.head=current;
            
        } else {
            Node last=list.head;
            
            while(last.next!=null){
                last=last.next;
            }
            last.next=current;
        }
//        System.out.println(list.head.data);
        return list;
        
    }
    
    public String printList() 
    { 
        Node current = list.head; 
   
        System.out.print("Linked List Implementation : Roll "+num+" time(s)"); 
        String str="\n";
        
        
        while (current != null) { 
            // Print the data at current node 
            str+=(current.data + " "); 
            current = current.next; 
   
        } 
        return str;
    } 
    
    
    public void roll() {
        
        for(int i=0;i<num;i++){
            roll[i]=rand.nextInt(6)+1;
            insert(roll[i]);
            hold+=roll[i]+" ";
            total+=roll[i];
        }
    }
    
    public int getTotal() {
        return this.total;
    }
    
    
    public static void main(String[] args) 
    { 
        LinkedListDice list = new LinkedListDice(4); 
        list.setList(list);
        list.roll();
        System.out.println(list.printList()+"\nTotal is "+list.getTotal()); 
    } 
    
}

