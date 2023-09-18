package Personal;

public class SecondMaxNum {
    public static int SecondMax(int[] arr) {
        int max = arr[0];
        int secMax = arr[1];

        for (int num = 0; num < arr.length; num++) {

            if (arr[num] > max) {
                secMax = max;
                max = arr[num];
            } else if (arr[num] > secMax && arr[num] < max) {
                secMax = arr[num];
            }

        }

        return secMax;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int secMax = SecondMax(arr);

        System.out.println(secMax);
    }
}
