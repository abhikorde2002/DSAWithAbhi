package Array;
//Fibonacci Number
public class recursion1 {
    static int n=0,n1=1,n2=0;
    public static void main(String[] args) {
     int num=10;
        System.out.print(n+" "+n1);

      //  withoutRecursion(num);
        withRecursion(num);
    }
    //0 1 1 2 3 5 8 13
  static void withoutRecursion(int num){
        int num1=0, num2=1,num3=0;
      System.out.print(num1+" "+num2);
        for (int i=2;i<num;++i){
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(" "+num3);
        }
  }
  static void withRecursion(int num){

        if (num>0){
            n2=n+n1;
            n=n1;
            n1=n2;
            System.out.print(" " +n2);
            withRecursion(num-1);
        }
  }

}
