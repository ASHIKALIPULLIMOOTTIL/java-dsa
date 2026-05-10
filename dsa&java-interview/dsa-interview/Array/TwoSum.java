package Array;
/* 
public class TwoSum {
    public static void main(String[] args) {
        int a[]={1,5,3,7,9};
        int n=a.length;
        int t=16;

        for (int i=0;i<n-1;i++){
           for (int j=i+1;j<n;j++){
            if((a[i]+a[j])==t){
                System.out.println("yes"+"=>"+i+" "+j);
            }
           }
        }
    }
}
*/

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int a[]={1,5,3,7,9,5};
        int n=a.length;
        int t=12;

        HashMap<Integer,Integer> map=new HashMap<>();


        for (int i=0;i<n;i++){
            
           if(!map.containsKey(t-a[i])){
              map.put(a[i], i);
           }
           else{
            map.put(a[i], i);
            System.out.println("yes=>"+map.get(t-a[i])+" "+i);
           }
        }
    }
}