public class KthLargest {

    public static void main(String[] args) {

        int arr[] = {1,7,2,9,4,0,8,9};
        int k = 3;

        int previousMax = Integer.MAX_VALUE;

        for (int count = 0; count < k; count++) {

            int currentMax = Integer.MIN_VALUE;

            for (int num : arr) {

                if (num < previousMax && num > currentMax) {
                    currentMax = num;
                }
            }

            previousMax = currentMax;
        }

        System.out.println(previousMax);
    }
}