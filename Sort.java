
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {

        System.out.print("Enter No of Elements In array :");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();                       // getting No Of elements In array From the user
        int[] arr= new int[n];

        int t;

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();                //Getting Input Elements From User
        }

        for (int j = 0; j < n; j++) {
            for (int k = j+1; k < n; k++) {
                if (arr[j] > arr[k])               // Taking First Element Of an Array As An Minimum Element
                {
                    t = arr[j];                     // Comaparing It  With All Elements.sawp It
                    arr[j] = arr[k];
                    arr[k] = t;
                }
            }
        }

        for (int l = 0; l < n; l++) {               //Print The Array In Ascending Order.
            System.out.print(arr[l]+" ");
        }
    }
}
