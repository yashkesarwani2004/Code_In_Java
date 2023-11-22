import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Arraylst {
 
 public static void main(String args[])
 {
    ArrayList<String>names=new ArrayList<String>(); 
    System.out.println(names);
    names.trimToSize();
    names.add("Rushda");
    names.add("Yash");
    names.add("brijendra");
    names.size();
    names.get(1);
    System.out.println(names);
    // for(int i=0;i<names.size();i++)
    // {
    //     System.out.println(names.get(i));
    // }

    names.set(1, "harsh");
    System.out.println(names);
    names.add(2,"shushma");
    System.out.println(names);

    // Iterator itr = names.iterator();
    // while(itr.hasNext()){
    //     System.out.println(itr.next());
    // }

    names.remove(3);
    System.out.println(names);
    
    List<String>names2=new ArrayList<>();
    names2.add("Himanshu");
    names2.add("Rajat");
    names.addAll(2, names2);
    System.out.println(names);

    Collections.sort(names);
    System.out.println(names);

    // List<String>sublist=names.subList(2, 4);
    // System.out.println(sublist);

    System.out.println(names.contains("yash"));
    System.out.println(names.isEmpty());

    System.out.println(names.containsAll(names2));
    names.clear();
    System.out.println(names);
 }
}
