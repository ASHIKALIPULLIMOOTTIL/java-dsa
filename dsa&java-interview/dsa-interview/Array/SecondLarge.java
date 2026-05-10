package Array;

public class SecondLarge {
    public static void main(String[] args) {
        
    int arr[]={1,7,2,9,4,0,8,9};
    int l1 =arr[0];
    int l2=arr[0];

    for(int i=0;i<arr.length;i++){
          if(arr[i]>l1){
            l1=arr[i];
          }
    }

    for(int i=0;i<arr.length;i++){
        if(arr[i]!=l1 && arr[i]>l2){
            l2=arr[i];
        }
    }

    System.out.println(l2);
}
}

/*
//optimal with one for loop
 for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
*/