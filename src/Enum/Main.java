package Enum;

public class Main {
    public static void main(String[] args) {
        Direction direction = Direction.LEFT;
        System.out.println(direction);
        System.out.println(direction.getName());
        System.out.println(direction.getCode());
        System.out.println(direction.getDirectionName());

        System.out.println();

        Direction myWay = Direction.UP;
        System.out.println(myWay);
        System.out.println(myWay.getName());
        System.out.println(myWay.getCode());
        System.out.println(myWay.getDirectionName());

        System.out.println();

        Direction[] values = Direction.values();
        for (Direction direction1 : values) {
            System.out.println(direction1);
            System.out.println(direction1.getName());
            System.out.println(direction1.getCode());
            System.out.println(direction1.getDirectionName());
        }

    }
}
