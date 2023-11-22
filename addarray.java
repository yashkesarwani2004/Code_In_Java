public class addarray {
    
 public static void main(String args[])
 {
    int arr1[]={3,5,6,8,10};
    int arr2[]={3,4,6,9};

    int l1=arr1.length;
    int l2=arr2.length;
    int add[]=new int[l1+l2];
    int i=0,j=0,k=0;
    while(i<l1 && j<l2)
    {
        if(arr1[i]<arr2[j])
       {
          add[k]=arr1[i];
          k++;
          i++;
       }

       else{
        add[k]=arr2[j];
        k++;
        j++;
       }
    }
   while(i<l1)
    {
        add[k]=arr1[i];
        k++;
        i++;
    }

   while(i<l1)
    {
        add[k]=arr1[i];
        k++;
        i++;
    }
for(int n=0;n<add.length;n++)
{
    System.out.print(add[n]);
    System.out.print( " ");
}
 } 
    
}
