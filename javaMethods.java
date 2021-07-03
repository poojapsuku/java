// Methods
// to perform certain actions

public class javaMethods {
    // Structure of method / method declaration
    // static means that the method belongs to the Main class and not an object of the Main class.

    static void message(){
        System.out.println("Java Methods / Functions");

    } 

  // Method with parameter 
    static void msg(String name){

        System.out.println("Hai "+ name);

    }

    // Method with multiple parameter

    static void prod(int a, int b){

        System.out.println(a*b);
    }

    // Method wih parameter and return value

    static int Square(int a){
         
        return a*a;
    }
public static void main(String[] args) {
    System.out.println(" ");
    message();    // calling the method
    msg( "Pooja");
    msg("Ajoop");
    prod(20,50);
    System.out.println(Square(81));
}
        
}
