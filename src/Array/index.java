package Array;

public class index {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int ind=2;
        int key=0;
        elementAtIndex(ind,arr,key);
        //indexfind(ind,arr,key);
    }
    static void indexfind(int ind,int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key){
                ind=i;
                break;
            }
        }
        System.out.println("Index of element "+ key +" is " +ind);
    }
    static void elementAtIndex(int ind,int arr[],int key){
        for (int i=0;i< arr.length;i++){
            if (ind==i){
                key=arr[i];
                break;
            }
        }
        System.out.println("Element at Index "+ ind +" is " +key);
    }
}
