public class adding_1_toArray {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        int n = arr.length;
        
        int digit=0;
        int m=1;
        for(int i=n-1;i>=0;i--){
          digit=digit+arr[i]*m;
          m=m*10;
        }
       
        System.out.println(digit+1);//o/p:1000
        
    }
}

