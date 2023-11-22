import java.util.Scanner;

public class Linkedlisthw {
    
    public static class Node{
        int data;
        Node next;
    }
 public static void main(String args[])
 {
     Node node1=new Node();
     node1.data=1;
     Node node2=new Node();
     node2.data=2;
     node1.next=node2;
     Node node3=new Node();
     node3.data=3;
     node2.next=node3;
     Node node4=new Node();
     node4.data=4;
     node3.next=node4;
     node4.next=null;
   //   System.out.println("Enter the value of position");
   //   Scanner sc2= new Scanner(System.in);
   //   int position = sc2.nextInt();
   //   rev(position);
     display();
 }
static Node node1;
 public static void display()
 {
    Node curr=node1;
     while(curr!=null)
     {
        System.out.print(curr.data+"-->");
        curr=curr.next;
     }
 }
static Node head;
 public static void rev(int position)
 {
    // node4.next=node3;
    // node3.next=node2;
    // node2.next=node1;
    // node1.next=null;
    Node head=node1;
         Node curr=head;
         while(position>2)
         {
            curr.next=curr.next.next;
         }
    
 }
}
