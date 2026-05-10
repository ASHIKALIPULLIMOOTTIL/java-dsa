package Array;

public class maxProfit {
    public static void main(String[] args) {
        int a[]={4,8,1,5,6,7,3};
        int n=a.length;
        int min=a[0];
        int profit=0;
        int maxProfit=0;

        for(int i=1;i<n;i++){
            profit=a[i]-min;
              if(a[i]<min){
                min=a[i];
              }
              maxProfit=Math.max(maxProfit, profit);
        }

        System.out.println(maxProfit);
    }
}
