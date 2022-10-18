package Array;

public class remove {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,20};
        int result[]=new int[arr.length-1];
        int index=0;
        int target=4;
        rem(result,index,arr,target);
    }
    static void rem(int result[],int index,int arr[],int target){
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]==target){
                index=i;
                break;
            }
            result[i]=arr[i];
        }
        for (int i=index;i<result.length;i++){
            result[i]=arr[i+1];
        }
        for (int a:result){
            System.out.println(a);
        }
    }
}
