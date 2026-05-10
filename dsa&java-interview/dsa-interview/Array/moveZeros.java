package Array;

public class moveZeros {
    public static void main(String[] args) {
        int a[]={0,1,0,2,3,4,0,0,6,0,0,9};
        int n=a.length;
         int k=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                a[k]=a[i];
                k++;
            }
        }

        for(int i=k;i<n;i++){
            a[i]=0;
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
}

/*
package Array;

public class moveZeros {
    public static void main(String[] args) {

        int a[] = {0,1,0,2,3,4,0,0,6,0,0,9};
        int n = a.length;

        int k = 0; 
        
        // move non-zero elements forward by swapping
        for(int i = 0; i < n; i++){
            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
                k++;
            }
        }

        // print result
        System.out.println("Array after moving zeros to end:");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}

*/