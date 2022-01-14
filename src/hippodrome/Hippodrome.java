package hippodrome;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Hippodrome{

    private static List<Horse> horses = new ArrayList<>();
    static Hippodrome game;
    public static void main(String[] args){
        game = new Hippodrome(horses);
        Horse ryzhik = new Horse("Ryzhik", 3., 0.);
        Horse martha = new Horse("Martha", 3., 0.);
        Horse betsy = new Horse("Betsy", 3., 0.);

        horses.add(ryzhik);
        horses.add(martha);
        horses.add(betsy);

        game.run();
        game.printWinner();

    }
    public List<Horse> getHorses() {
        return horses;
    }
    public Hippodrome(List<Horse> horses) {
        super();
        this.horses = horses;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
    public void move() {
        for (Horse horse : horses) {
            ((Horse) horse).move();
        }
    }
    public void print() {
        for (Horse horse : horses) {
            ((Horse) horse).print();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println();

        }
    }

    public static Horse getWinner() {
        for (Horse horse : horses) {
            return horses.stream().max(Comparator.comparing(Horse::getDistance)).orElse(null);
        }
        return null;

    }
    public void printWinner() {
        Horse horse = getWinner();
        System.out.println("Winner is " + horse.getName() + "!");
    }

}