class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}

/*
Dry Run

Input:
[1,2,3]
Output:
[1,2,4]

Input:
[9,9,9]
Set all digits to 0
Create new array [1,0,0,0]
Output:
[1,0,0,0]

Input:
[1,2,9]
Output:
[1,3,0]
*/
