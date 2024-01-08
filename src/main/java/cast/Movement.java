package cast;

public class Movement {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{plane, train, bus};
        for (Vehicle object : vehicles) {
            object.move();
        }
    }
}


