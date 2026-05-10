package Array;

class RemoveDuplicates  {
    public static void main(String[] args) {
        int a[] = {0,1,1,2,2,2,3,3,4,5,5,7,9,10,11,20};
        //int temp[] = new int[a.length];

        int k = 0;
        a[k++] = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                a[k++] = a[i];
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(a[i]+" ,");
        }
    }
}
