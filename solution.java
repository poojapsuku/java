import java.util.Scanner;

//import jdk.internal.jshell.tool.resources.l10n;

public class solution {
        
    static int findMinimumAdjacentSwaps(int arr[], int N)
    {
    
       // visited array to check if value is seen already    
        boolean[] visited = new boolean[N + 1];
     
            int minimumSwaps = 0;
    
        Arrays.fill(visited,false);
    
        
         
        for (int i = 0; i < 2 * N; i++) {
    
            if (visited[arr[i]] == false) {
    
                visited[arr[i]] = true;
     
    
                int count = 0;
     
    
                for (int j = i + 1; j < 2 * N; j++) {
     
    
                    if (visited[arr[j]] == false)
    
                        count++;
     
    
    
                    else if (arr[i] == arr[j])
    
                        minimumSwaps += count;
    
                }
    
            }
    
        }
    
        return minimumSwaps;
    }
     
      
    public static void main(String args[])
    {
         Scanner s = new Scanner(System.in);
         var N = s.nextInt();
         int[] arr= new int[N];
         for(int i=0;i<N;i++)
           {
               arr[i] = s.nextInt();
           } 
          s.close();
        //int arr[] = { 1, 2, 3, 3, 1, 2 };
        //int N = arr.length;
         // N /= 2;
     
    
        System.out.println(findMinimumAdjacentSwaps(arr, N));
    
         
    }
    } 

