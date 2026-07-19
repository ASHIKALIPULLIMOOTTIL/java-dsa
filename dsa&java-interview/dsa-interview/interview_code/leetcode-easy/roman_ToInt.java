import java.util.Scanner;

public class roman_ToInt {
    public static int romanToInt(String s) {
        int sum = 0;
            for(int i=0;i<s.length()-1;i++){
                    switch(s.charAt(i)){
                        case 'I':
                            if(s.charAt(i+1)=='V'||s.charAt(i+1)=='X')
                                {sum=sum-1;
                                break;}
                            else
                                sum += 1;
                                break;
                        case 'V':
                            sum += 5;
                            break;
                        case 'X':
                            if(s.charAt(i+1)=='L'||s.charAt(i+1)=='C')
                                {   sum=sum-10;
                                    break;
                                }
                            else{
                                sum += 10;
                                break;
                        }
                        case 'L':
                            sum += 50;
                            break;
                        case 'C':
                            if(s.charAt(i+1)=='D'||s.charAt(i+1)=='M')
                                {
                                    sum=sum-100;
                                    break;
                                }
                            else{
                                sum += 100;
                                break;
                            }
                        case 'D':
                            sum += 500;
                            break;
                        case 'M':
                            sum += 1000;                  
                    }
            }
            switch (s.charAt(s.length()-1)) {
                case 'I':
                    sum++;
                    break;
                case 'V':
                    sum=sum+5;
                    break;
                   case 'X':
                        sum += 10;
                        break;
                    case 'L':
                        sum += 50;
                        break;
                    case 'C':
                        sum += 100;
                        break;
                   case 'D':
                            sum += 500;
                            break;
                    case 'M':
                            sum += 1000;
                            break;                  
            }
        return sum; 
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Roman numeral: ");
    String roman = sc.nextLine();
    int converter = romanToInt(roman);
    System.out.println("The integer value is: " + converter);
    sc.close();
    }   
}

