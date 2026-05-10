package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
    
        int arr[] = {1,2,3,4,-1};
        int l = arr.length;
        int didswap=0;
        for(int i = 0; i < l -1; i++) {  //i<l-1 => last element is already sorted
           
            for(int j = 0; j < l-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didswap=1;
                }
            }
            if(didswap==0){
                System.out.println("already sorted");
                System.out.println(Arrays.toString(arr));
                break;      //best case(tc=o(n))
            }
            
        }
        if(didswap==1){
        System.out.println("not sorted,sorted= "+Arrays.toString(arr));
        }
    }
}
