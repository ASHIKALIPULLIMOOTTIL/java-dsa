public class Pattern3 {
    public static void main(String[] args) {
           int m=5;
          for(int i=1;i<=5;i++){
            for(int k=0;k<i-1;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
            m--;
          }
   


        }
}
/* 
* * * * * 
  * * * * 
    * * * 
      * * 
        * 

public class Patterns3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i <= j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
        
*/