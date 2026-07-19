package dynamic_programming;

public class v_PartitionArray{

    static int solve(int i,
                     int[] arr,
                     int k) {

        if (i == arr.length)
            return 0;

        int maxSum = 0;
        int currentMax = 0;

        for (int j = i;
             j < Math.min(arr.length, i + k);
             j++) {

            currentMax =
                    Math.max(currentMax,
                             arr[j]);

            int length =
                    j - i + 1;

            int sum =
                    currentMax * length
                  + solve(j + 1,
                          arr,
                          k);

            maxSum =
                    Math.max(maxSum,
                             sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr =
                {1,15,7,9,2,5,10};

        System.out.println(
                solve(0,
                      arr,
                      3));
    }
}
