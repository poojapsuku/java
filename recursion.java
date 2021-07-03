// Recursion
// A method call itself

public class recursion {
static int sum(int a){
    if (a>0) {
        return a+sum(a-1);
        
    } else {
        return 0;
    }
} 

    public static void main(String[] args) {
        
        System.out.println("Sum is = " + sum(10));
    }
}
