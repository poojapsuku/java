// Array Concepts

public class Arrays {
    public static void main(String[] args) {

        String[] Student = {"Adona","Pinky","Riya","Rahul","Rishana","Divya"}; // array variable declaration
        System.out.println(Student[5]);
        
        int[] marks = {50,95,34,89,72,48};// Integer array variable declaration
        System.out.println(marks[5]); 
        System.out.println(marks[5]+marks[2]); 

        // To find array length
        System.out.println("Length =" + Student.length); 

        // print array elements one by one
        System.out.println("Students are ::"); 
        for(int i=0;i<=Student.length-1;i++)
         { 
            
            System.out.println((i+1) + "." +Student[i]); 
         }

         // MultiDimensional Array

         int[][] num = {{20,52,47,36,18},{43,16,75,38,90}}; // MD Array Declaration
         
         System.out.println(num[0][3]); 
         System.out.println(num[0][4] + num[1][1]);


    }
        
    
    
}
