public class Fix {
    public static void main(String[] args) {
        int [] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;

        for (int i = 0; i < numList.length; i++) {
            System.out.printf("Value at numList[%d]: %d\n", i, numList[i]);
            total += numList[i];
        }
        System.out.println("\nTotal: " + total);
    }
}
