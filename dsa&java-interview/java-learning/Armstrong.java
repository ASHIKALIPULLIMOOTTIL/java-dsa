    class Functions{
    public static int countDigits(int n)
    {
        int cnt = 0;
        while(n > 0)
        {
            n /=10;
            cnt++;
        }
        return cnt;
    }
    
    public static void armstrongNum(int digit)
    {
        int sum = 0;
        int cnt = countDigits(digit);
        int temp = digit;
        int r;
        while(digit > 0)
        {
            r = digit%10;
            digit /=10;
            sum += (int)Math.pow(r, cnt);
        }
            if(temp==sum)            
                System.out.println("Armstrong number");            
            else
            System.out.println("Not an Armstrong number");
    }
    }
    class Armstrong{
        public static void main(String[] args) {
           // Functions fn=new Functions();  //since method is static
            Functions.armstrongNum(1634);
        }
    }