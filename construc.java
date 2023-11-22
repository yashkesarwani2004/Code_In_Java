public class construc {
    String name;
  construc(String nm)
  {
     this.name=nm;
  }
 public static void main(String args[])
 {
    construc p1 = new construc("Rushda");
    construc p2 = new construc("Yash");
    construc p3 = new construc("Brijendra");
    System.out.println(p1.name);
    System.out.println(p2.name);
    System.out.println(p3.name);
 }
}
