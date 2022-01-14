package hippodrome;

public class Horse {
    String name;
    double speed;
    double distance;
    public Horse(String name, double speed, double distance) {
        super();
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void print() {
        int dot = (int)this.distance;
        for (int i = 0; i < dot; i++) {
            System.out.print(".");
        }
        System.out.print(this.name);
        System.out.println();

    }
    public void move() {
        distance += speed*Math.random();

    }
}

