package Basic;

public class While {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.print("\n");
            }
            i++;
        } while (i < 51);

        System.out.println("");

        int e = 1;
        while (e < 51) {
            System.out.print("*");
            if (e % 10 == 0) {
                System.out.print("\n");
            }
            e++;
        }
    }
}
