import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println("Enter the size of element:");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<size;i++)
         {
              array[i] = scan.nextInt();
         }
         scan.close();
         /*for(int i=0;i<size;i++)
         {
          
         }*/
         System.out.println("Array elements are::");
         for(int i=0;i<size;i++)
         {
              System.out.println(Arrays.toString(array));
         }
         System.out.println("==========================================");
    }
    
}
