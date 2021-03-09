package week2.assignment2;

import java.util.ArrayList;

public class StockGenerator implements Subject {
    
    private ArrayList<Observer> observers;
    
    public StockGenerator(){
        // (a)
    }
    
    public void register(Observer newObserver) {
        // (a)
    }

    public void unregister(Observer deleteObserver) {
        // (a)
    }

    public void notifyObserver(String stock, float price) {
        // cycle through all observers and notifies them of price changes
        // (a)
    }
}
