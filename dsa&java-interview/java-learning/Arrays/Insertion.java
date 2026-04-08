public class Insertion {
    public static void main(String[] args) {
        int[] arr=new int[10];
         arr[0]=7;
         arr[1]=3;
         arr[2]=5;
         arr[3]=1;

        int n=4;//number of element
        int x=9;//number to insert
        int index=2;//index to insert

        for(int i=n;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=x;
        
        for(int j=0;j<n+1;j++){
       System.out.print(arr[j]+",");
        }
    }
}
