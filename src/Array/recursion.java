package Array;
//Factorial
public class recursion {
    public static void main(String[] args) {
        int a=5;
        System.out.println(factorial(a));
        System.out.println("The value of Factorial a is :- "+factorial_iterative(a));

    }
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n* factorial(n-1);
        }
    }
    static int factorial_iterative(int x){
        if (x==0 || x==1) {
            return 1;
        }
        else{
                int product=1;
            for (int i = 1; i <=x ; i++) {
                product=product*i;
            }
        return product;
        }
    }
}
