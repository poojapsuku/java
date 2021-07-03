// Method Overloading
// Multiple methods can have the same name 

public class mthdOvrLoading {

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static double sum(Double a, Double b){
        return a+b;
    }
    public static void main(String[] args) {

        int sum1 = sum(85, 9);
        int sum2 = sum(45, 52, 45);
        double sum3 = sum(45.5, 46.89);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
       
    }
}
