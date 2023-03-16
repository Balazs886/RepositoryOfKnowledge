package Generics.Basic;


///*********
public class Main {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>("Kék doboz");
        if (box1.isEmpty()) {
            System.out.println("A doboz most üres.");
        }

        System.out.println();

        box1.put("Lorem ipsum dolor sit amet.");
        if (!box1.isEmpty()) {
            System.out.println("A doboz most adatot tartalmaz");
        }

        System.out.println();

        System.out.println(box1.get());
        if (box1.isEmpty()) {
            System.out.println("A doboz most üres.");
        }
    }
}
