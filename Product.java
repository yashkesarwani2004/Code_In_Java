public class Product{
    String name,brand;
    int price,quantity;
    public Product(String nm,int p,int q,String b)
    {
        this.name=nm;
        this.brand=b;
        this.price=p;
        this.quantity=q;
    }

 public void display()
 {
    System.out.println(name+ " " +price+ " " +quantity+ " " +brand);
 }
 public static void main(String args[])
 {
     Product p1 = new Product("Biscuit",5,10,"parle1");
     Product p2 = new Product("Biscuit",5,100,"parle2");
     Product p3 = new Product("Biscuit",5,50,"parle3");

     p1.display();
     p2.display();
     p3.display();
 }
}
