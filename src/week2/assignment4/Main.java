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
            }
        
            // your code
            System.out.println("Type of car is " + car + " with price " + car.getCost());
        }
    }
}
