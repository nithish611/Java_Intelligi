public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-14,-7,-5,-3,0,1,5,6,9,10,15,24,30};
        int target=15;
        int ans=binarySearch(arr,target);
        if(ans!=-1){
            System.out.println("Element Found at The Index : "+ans);
        }else {                                                                     // Time Complexity : O(log n)
            System.out.println("Element Not Found");
        }
    }

    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid = start + (end - start) / 2; // mid value exceed int range so, we have taken alternative formula " (start + end) / 2 = start + (end - start) / 2 "

            if(target>arr[mid]){
                start = mid+1;
            } else if (target < arr[mid]) {
                end = mid-1;
            }else {
                return mid;
            }

        }
        return -1;

    }
}
