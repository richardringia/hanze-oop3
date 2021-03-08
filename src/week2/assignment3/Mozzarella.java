package week2.assignment3;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding mozzarella");
    }
    
    public String getDescription() {
        return tempPizza.getDescription() + " + mozzarella";
    }
    
    public double getCost() {
        System.out.println("Cost of mozzarella: " + .50);
        return tempPizza.getCost() + .50;
    }
}
