class CLI_Sum{
    public static void main(String[] args) {
        double sum=0;
        for(int i=0;i<args.length;i++){
            if(args[i].matches("[0-9\\.]+")){   //accepting 0-9 and number with decimal
                sum+=Double.parseDouble(args[i]);
            }
        }
      
       System.out.println(sum);
    }
}
