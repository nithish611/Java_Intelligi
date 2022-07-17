import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr={40,20,5,2,3,4,7,8,9};
        int n=arr.length;
        System.out.println(insort(arr,n));
    }
    static String insort(int[] arr, int n){
        for (int j = 1; j < n; j++)  {
            int key=arr[j];
            int i=j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1]=arr[i];
                i=i-1;
            }
            arr[i+1]=key;
        }
        return Arrays.toString(arr);
    }
}
