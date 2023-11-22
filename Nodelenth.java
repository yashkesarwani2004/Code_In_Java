import java.util.Scanner;

public class Nodelenth {
    
    public static class Node{
        int data;
        Node next;
    }
static Node head;
    public static void display()
  {
    Node curr=head;
    while(curr!=null)
    {
        System.out.print(curr.data+"-->");
        curr=curr.next;
    }
  }
    public static void main(String args[])
    {
       Node node1=new Node();
       node1.data=1;
       head=node1;
       Node node2=new Node();
       node2.data=2;
       node1.next=node2;
       Node node3=new Node();
       node3.data=3;
       node2.next=node3;
       Node node4=new Node();
       node4.data=4;
       node3.next=node4;
       display();
       System.out.println();
       System.out.println(getlenth());
      //  System.out.println("Enter the value:");
      //  Scanner sc=new Scanner(System.in);
      //  int value=sc.nextInt();
      //  System.out.println(find(value));
      //  rev();
      // lenth();
      System.out.println(lenth());
    }
    
    public static int getlenth()
    {    Node curr=head;

        if(head==null)
        {
            return 0;
        }
        int len=0;
        while(curr!=null)
        {
           curr=curr.next;
           len++;
        }
        return len;
    }

    public static int find(int value)
    {
       Node curr=head;
       int len=1;
       if(head==null)
       {
          return 0;
       }
       else{
           
          while(curr.data!=value)
          {
            curr=curr.next;
            len++;
          }
       }
       return len;
    }

    public static void rev()
    {
      if(head==null || head.next==null)
      {
          return;
      }
      else{
        Node pre=null;
        
           Node curr=head;
           Node next=null;
        while(curr!=null)
        {
          next=curr.next;
          curr.next=pre;
          pre=curr;
          curr=next;
        }
        head=pre;
      }
    }
    public static int lenth()
    {
      Node fast=head;
      Node slow=head;
      if(head==null && head.next==null)
      {
        System.out.println("if");
        return 0;
      } 
      else{
        // System.out.println("else");
          while(fast.next!=null || fast!=null)
          {
            System.out.println("while");
            slow=slow.next;
            fast=fast.next.next;
            // System.out.println(fast.data);
          }
          return slow.data;
      }
    }
}
