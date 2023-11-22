// import java.util.*;

// import javax.swing.text.html.HTMLDocument.Iterator;

// public class linkedlist {

//     public static void main(String arg[]) {
//         LinkedList<String> ln = new LinkedList<>();
//         ln.add("Mango");
//         ln.add("Banana");
//         ln.add("Apple");
//         ln.add("Guava");
//         java.util.Iterator<String> itr = ln.iterator();

//         while (itr.hasNext()) {
//             System.out.println(itr.next());
//         }

//        ln.add(2,"yash");
//        System.out.println(ln);
//        ln.remove(2);
//        System.out.println(ln);
//        LinkedList<String> ln2 = new LinkedList<>();
//        ln.add("Mango2");
//         ln.add("Banana2");
//         ln.add("Apple34");
//         ln.add("Guava3");
//         System.out.println(ln2);
//         ln.addAll(ln2);
//         System.out.println(ln);
//         ln.addFirst("yash23");
//         System.out.println(ln);
//         ln.addLast(ln);
//         System.out.println(ln);
        
//     }
// }

import java.util.Scanner;

public class linkedlist{

  public static class Node{
     int data;
     Node next;
  }
  static Node head;
  public static void main(String arg[])
  {

    Node node1=new Node();
    node1.data=1;
    Node node2=new Node();
    node2.data=2;
    head=node1;
    node1.next=node2;
    Node node3=new Node();
    node3.data=3;
    node2.next=node3;;
    Node node4=new Node();
    node4.data=4;
    node3.next=node4;
    node4.next=null;
    Node newnode=new Node();
    newnode.data=6;
    newnode.next=node3;
    node2.next=newnode;
    System.out.println("Enter the value of node");
    Scanner sc=new Scanner(System.in);
    int value=sc.nextInt();
    System.out.println("Enter the value of loaction");
    Scanner sc2=new Scanner(System.in);
    int location=sc2.nextInt();
    // insertatlast(value);
    insert(value, location);
    display();
  }

  public static void display()
  {
    Node curr=head;
    while(curr!=null)
    {
        System.out.print(curr.data+"-->");
        curr=curr.next;
    }
  }

 public static void insert(int value,int location)
 {
     Node newNode=new Node();
     newNode.data=value;
     if(head==null){
      head=newNode;
      head.next=null;
      return;
     }
     else{
       Node curr=head;
       while(location>1)
       {
        curr =curr.next;
        location--;
       }
       newNode.next=curr.next;
       curr.next=newNode;
     }
 }
  
//   public static void insertatbeginning(int value)
//   {
//     Node newNode=new Node();
//     newNode.data=value;
//     if(head==null){
//      head=newNode;
//      head.next=null;
//      return;
//     }
//     newNode.next=head;
//     head=newNode;
//   }

//     public static void insertatlast(int value)
// {
//      Node newNode=new Node();
//      newNode.data=value;
//      if(head==null)
//      {
//         head=newNode;
//      }

//      else{
//         Node curr=head;
//         while(curr.next!=null)
//         {
//             curr=curr.next;
//         }
//         curr.next=newNode;
//      }
// }
}