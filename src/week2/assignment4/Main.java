package week2.assignment4;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        CarFactory factory = null;

        for (int i=0; i<20; i++){
            Random rand = new Random();
            int r1 = rand.nextInt(4) + 1;

            switch (r1) {
                // your code
                case 1:
                    factory = new SedanFactory();
                case 2:
                    factory = new PickUpFactory();
                case 3:
                    factory = new StationWagonFactory();
                case 4:
                    factory = new SUVFactory();
            }
        
            // your code
            Car car = null;
            if (factory != null) {
                car = factory.makeCar();
                System.out.println("Type of car is " + car + " with price " + car.getCost());
            }
        }
    }
}
