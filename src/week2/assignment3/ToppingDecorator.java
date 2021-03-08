package week2.assignment3;

abstract class ToppingDecorator extends Pizza {
    protected Pizza tempPizza;
    
    public ToppingDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }
    
    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getCost() {
        return tempPizza.getCost();
    }
}
