public class Function3 {
    
 public static boolean isexit(int arr[],int k)
 {
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==k)
        {
            return true;
        }

       return false;
    }
 }

 public static void main(String args[])
 {
    int arr[]={2,4,9,1,5};
    int k=9;
    boolean ispresent = isexit(arr, k);
    if(ispresent==true)
    {
        System.out.println("Exit");
    }

    else
    {
        System.out.println("Not exit");
    }
 }
}
