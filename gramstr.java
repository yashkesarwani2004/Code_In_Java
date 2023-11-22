import java.util.Arrays;

public class gramstr {
    
 public static void main(String  args[])
 {
    String str="gram";
    String str1="rang";
    str.toCharArray();
    char strarr[]=str1.toCharArray();
   char str1arr[]=str1.toCharArray();
   Arrays.sort(strarr);
   Arrays.sort(str1arr);

   boolean var=false;
   for(int i=0;i<4;i++)
   {
      if(str1arr[i]!=strarr[i])
      {
         var=true;
         break;
      }
   }

   if(var==false)
   {
      System.out.println("Same");
   }

   else{
      System.out.println("Not Same");
   }
 }
}
