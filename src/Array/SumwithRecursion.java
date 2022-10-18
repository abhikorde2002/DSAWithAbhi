package Array;

public class SumwithRecursion {
    public static void main(String[] args) {
        int num=5;
        System.out.println(sumRec(num));
    }
    static int sumRec(int n){
        //sum(n)=1+2+3+4...+ n-1 +n
        //sum(n)= n + sum(n-1);
        //sum of N number with Recursion.
        if(n==1){
            return 1;
        }
        else {
            return n+ sumRec(n-1);
        }
    }
}
