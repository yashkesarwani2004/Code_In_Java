import java.util.Scanner;

public class circularLinkedls {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head=null;
    static Node tail=null;

    public static void main(String arg[]) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n1;
        // add();
        // add();
        // add();
        // lastAdd();
        // lastAdd();
        // lastAdd();
                
        display();

        // System.out.println("Enter the position");
        // Scanner sc = new Scanner(System.in);
        // int pos=sc.nextInt();
        //  midAdd(pos);
        // display();
    }

    public static void add()
    {
        if(head==null)
        {
            Node newnNode=new Node(1);
            head=newnNode;
            tail=newnNode;
            newnNode.next=tail;
        }
        else
        {
            Node newNode=new Node(2);
            newNode.next=head;
            head=newNode;
            tail.next=head;
        }
    }

    public static void lastAdd()
    {
        if(head==null)
        {
            Node newnNode=new Node(1);
            head=newnNode;
            tail=newnNode;
            newnNode.next=tail;
        }
        else{
             Node newNode=new Node(2);
             tail.next=newNode;
             tail=newNode;
             newNode.next=head;
        }
    }

    public static void midAdd(int pos)
    {
        Node newNode=new Node(5);
        Node curr=head;
        for(int i=1;i<pos;i++)
        {
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }

    public static void display()
   {
    Node temp=head;
    do{
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }while (temp != head); 
   }

}
