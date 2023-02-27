package Enum;

public enum Direction {
    UP("Fel",0), DOWN("Le",1), LEFT("Balra",2) {
        @Override
        public String getDirectionName() {
            return "This is the left way!";
        }
    }, RIGHT("Jobbra",3);

    private final String name;
    private final int code;

    Direction(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public String getDirectionName() {
        return "Any";
    }
}
