
import java.util.Scanner;

public class sam {
    public static void main(String[] args) {
        
        System.out.println("Enter No of Elements In array :"); 
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();                       // getting No Of elements In array From the user
        int[] arr= new int[n];

        int t;                                  // Temperovary Variable

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();                //Getting Input Elements From User
        }

        for (int j = 0; j < n; j++) {
            for (int k = j+1; k < n; k++) {
                if (arr[j] > arr[k])
                {
                    t = arr[j];
                    arr[j] = arr[k];
                    arr[k] = t;
                }
            }
        }
    }
}

