public class Car implements Comparable <Car>{

    int Price;
    int Speed;

    public int compareTo(Car o) {
        return this.Price - o.Price;
    }
}
