public class  Masking{
    public static void main(String[] args) {

        // Step 1: Initialize values
        byte a = 9;   // 00001001
        byte b = 12;  // 00001100

        byte c;

        // Step 2: Shift 'a' left by 4 bits
        c = (byte)(a << 4);
        // 00001001 << 4 → 10010000
        // c = 10010000

        // Step 3: Merge 'b' into lower 4 bits using OR
        c = (byte)(c | b);
        // 10010000
        // 00001100
        // ----------
        // 10011100  (c)

        // Step 4: Extract left 4 bits (original 'a')
        System.out.println((c & 0b11110000) >> 4);
        // c = 10011100
        // mask = 11110000
        // AND → 10010000
        // >> 4 → 00001001 → 9

        // OUTPUT: 9   


        // Step 5: Extract right 4 bits (original 'b')
        System.out.println((c & 0b00001111));
        // c = 10011100
        // mask = 00001111
        // AND → 00001100 → 12

        // OUTPUT: 12
    }
}   /*🔹 What This Code Does (Simple)

👉 Stores two numbers (a and b) inside one byte
👉 Then retrieves them back */