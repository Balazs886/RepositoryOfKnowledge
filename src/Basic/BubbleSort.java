package Basic;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 1, 9, 4, 2, 6, 7, 8, 0};
        boolean arrangement = false;
        do {
            for (int i = 0; i < numbers.length - 1; i++) {
                arrangement = false;
                for (int j = 0; j < numbers.length - 1 - i; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int tmp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = tmp;
                        arrangement = true;
                    }

                    for (int number : numbers) {
                        System.out.print(number + " ");
                    }
                    System.out.println();
                }
            }
        } while (arrangement);

    }
}
