public class ReverseArray {
    public static void main(String[] args) {
        //int[] arr=new int[5];
        int[] arr={10,2,7,3,0};
        int l=arr.length;
        for(int i=0;i<l/2;i++){
            int temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }

        for(int j=0;j<l;j++){
       System.out.print(arr[j]+",");
        }
    }
}
