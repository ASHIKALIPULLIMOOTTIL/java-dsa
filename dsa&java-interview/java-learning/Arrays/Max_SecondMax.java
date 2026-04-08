public class Max_SecondMax{
    public static void main(String[] args) {
        //int[] arr=new int[5];
        int[] arr={10,2,7,3,0};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum value = "+max);

        for(int i=0;i<arr.length;i++){
            if(arr[i]<max && arr[i]>smax){
                smax=arr[i];
            }
        }

        System.out.println("Second max value = "+smax);
       
    }
}