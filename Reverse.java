public class Reverse {

   public static void main(String args[]) {
      int arr[] = { 1, 2, 3, 4, 5 };
      int new_arr[] = new int[arr.length];

      int index = 0;
      for (int i = arr.length - 1; i >= 0; i--) {
         new_arr[index] = arr[i];
         System.out.println(new_arr[index]);
         index++;
      }

   }

}