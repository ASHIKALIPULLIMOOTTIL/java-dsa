package Array;

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int a[]={1,0,1,1,0,0,1,1,1,1,0,0,0};
        int n=a.length;
        int max=0;
        int c=0;
        for (int i=0;i<n;i++){
            if(a[i]==0){
                c=0;
            }
            if(a[i]==1){
                c++;
            }
            max=Math.max(max, c);

        }
        System.out.println(max);
    }
}
