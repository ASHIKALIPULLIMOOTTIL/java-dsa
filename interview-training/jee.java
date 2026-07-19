import java.util.Scanner;

public class jee {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of visit: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the ranks get: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int count=0;
        int min = arr[0];

        for(int i=1; i<n; i++){
            if(min > arr[i]){
                min = arr[i];
                count++;
            }
        }
        System.out.println("Rank cuts: " + count);
    }
}