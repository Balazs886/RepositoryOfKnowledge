package Generics.Basic;

public class Box<T> {
    private String name;
    private T object;

    public Box(String name) {
        this.name = name;
    }

    public boolean isEmpty() {
        return object == null;
    }

    public void put(T objectToPut) {
        if (isEmpty()) {
            object = objectToPut;
            System.out.println("Sikeresen beletettük az " + objectToPut + " objektumot a dobozba.");
        } else {
            System.out.println("A doboz nem volt üres, nem tutuk bele tenni.");
        }
    }

    public T get() {
        if (isEmpty()) {
            System.out.println("A doboz üres, nem tudtam mit kivenni belőle");
            return null;
        } else {
            T temp = object;
            object = null;
            return temp;
        }
    }
}
