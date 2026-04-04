public class RemoveSpecial {
    public static void main(String[] args) {
        //int num = 100;
        

        String s1 = "a%#hjg1)*23@";
        
        
   for(int i=0;i<s1.length();i++){
    char c=s1.charAt(i);
    String s2=String.valueOf(c);
    
    if(s2.matches("\\w")){
        
        System.out.print(s2);
    }
   }
   System.out.println();
        
    }
}  //RemoveSpecialCharacter