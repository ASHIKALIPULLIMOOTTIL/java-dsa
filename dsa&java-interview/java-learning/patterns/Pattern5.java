public class Pattern5 {
    public static void main(String[] args) {
           int m=5;
          for(int i=1;i<=5;i++){

            for(int j=1;j<m;j++){
                System.out.print("  ");
            }


            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            for(int k=0;k<i-1;k++){
                System.out.print("* ");
            }
            
            System.out.println();
            m--;
          }
   


        }
}
/*
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 

*/