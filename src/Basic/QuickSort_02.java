package Basic;

public class QuickSort_02 {
    public static void main(String[] args) {
        int[] numbers = {7, 27, 11, 32, 43, 26, 29, 9, 9, 13};
        int last = numbers.length - 1;
        int lower = 0;
        arrayPrint(numbers);

        for (int pivot = 1; pivot < numbers.length - 1; pivot++) {
            System.out.println("for pivot " + numbers[pivot]);
            if (last > pivot) {
                while (numbers[pivot] < numbers[pivot - 1]) {
                    System.out.println("while1");
                    int tmp = numbers[last];
                    numbers[last] = numbers[pivot - 1];
                    numbers[pivot - 1] = tmp;
                    last--;
                    arrayPrint(numbers);
                }
            }
//            while (numbers[pivot] > numbers[pivot + 1] && lower < pivot && numbers[lower] > numbers[pivot]) {
//                System.out.println("while2");
//                int tmp = numbers[lower];
//                numbers[lower] = numbers[pivot + 1];
//                numbers[pivot + 1] = tmp;
//                lower++;
//                arrayPrint(numbers);
//            }

        }

        //arrayPrint(numbers);

    }

    private static void arrayPrint(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


}
