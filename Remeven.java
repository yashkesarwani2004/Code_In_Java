public class Remeven {
    
  public static void main(String args [])
  {
     int arr[]={2,4,6,1,3,5};
     int new_arr[] = new int[arr.length];
     for(int i=0;i<arr.length;i++)
     {
        if(arr[i]%2!=0)
        {
           new_arr[i]=arr[i];
        }
         
    System.out.println("The new array is:" +new_arr[i]);
     }

  }
}
