public class Rotaion {
    public static void main(String[] args) {
        //int[] arr=new int[5];
        int[] arr={10,2,7,3,0};
        int l=arr.length;
        int temp=arr[0];
        for(int i=0;i<l-1;i++){
            arr[i]=arr[i+1];
        }
        arr[l-1]=temp;
        for(int j=0;j<l;j++){
       System.out.print(arr[j]+",");
        }
    }
}
