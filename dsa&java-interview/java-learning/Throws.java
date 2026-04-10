class Throws {

    // Using throws (declaring exception)
    static void checkAge(int age) throws Exception {

        if (age < 18) {
            // Using throw (actually throwing exception)
            throw new Exception("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(15);  // calling method
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}  //throw is used to throw an exception, throws is used to declare it,
  //If you don’t handle an exception using try-catch, you can use throws to pass it to the caller
  /*
       try-catch → you solve it
       throws → you pass it to caller or at end jvm.
  */