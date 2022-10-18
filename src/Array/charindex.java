package Array;

public class charindex {
    public static void main (String[]args){
      char []array={'a','b','c'};
      char ch=' ';
      int index=2;
      chr(array,ch,index);
    }
    static void chr(char arr[],char ch,int index){
        for (int i=1;i< arr.length;i++){
            if (index==i){
                ch= arr[i];
                break;
            }
        }
        System.out.print("Char at index "+index+" is" +ch);
    }
}
