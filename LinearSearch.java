public class LinearSearch {                                       // this is Program For "LinerSearch Algorithm"
    public static void main(String[] args) {
        System.out.println("Linear Search Is Started");
        int[] arr={1,2,3,4,5,7,8,9};
        int tar=10;
        boolean ans=linearSearch(arr,tar);
        if(ans){
            System.out.println("Element Found ");
        }else {
            System.out.println("Element not Found");
        }
        System.out.println("LinearSearch Is Done✔️");
    }
     static boolean linearSearch(int[] arr,int tar){
        if (arr.length==0){
            return false;
        }
         for (int index : arr) {                                   //index Position
             if (index == tar) {
                 return true;
             }

         }
        return false;
    }
}
