package Basic;

public class Array {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Mercedes", "Fiat"};
        System.out.println(cars[0]);

        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);
    }
}
