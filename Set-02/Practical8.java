public class Practical8 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 7, 8, 9, 9, 9 };
        count9(arr);

    }

    static void count9(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                count++;
            }
        }

        System.out.println("Total Count = " + count);

    }

}
