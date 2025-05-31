public class LoopsLab {

    // Task 1: Difference between max and min
    public static int differenceMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    // Task 2: Find and print smallest and second smallest
    public static void printTwoSmallest(int[] array) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num != first) {
                second = num;
            }
        }
        System.out.println("Smallest: " + first);
        System.out.println("Second smallest: " + second);
    }

    // Task 3: Calculate expression x^2 + ((4y/5) - x)^2
    public static double calculateExpression(double x, double y) {
        double part = (4 * y / 5) - x;
        return Math.pow(x, 2) + Math.pow(part, 2);
    }

    // Método principal para probar todo
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};

        System.out.println("Task 1 - Difference: " + differenceMaxMin(array));

        System.out.println("Task 2 - Two Smallest:");
        printTwoSmallest(array);

        double x = 3;
        double y = 5;
        System.out.println("Task 3 - Expression result: " + calculateExpression(x, y));
    }
}
