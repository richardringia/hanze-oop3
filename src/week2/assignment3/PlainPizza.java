package week2.assignment3;

public class PlainPizza extends Pizza {
 
    public String getDescription() {
        return "a plain pizza";
    }

    public double getCost() {
        System.out.println("Cost of plain pizza: " + 4.00);
        return 4.00;
    }
}
