package week2.assignment2;

import javafx.application.Application;
import javafx.stage.Stage; 

public class App extends Application { 

    @Override 
    public void start(Stage stage) {
        // create the Subject
        StockGenerator stockGen = new StockGenerator();

        // create 3 runnables, pass them Subject and initial stock proces
//        Runnable genIBM = new UpdateStock(stockGen, "IBM", 97.0f);
//        Runnable genAAPL = new UpdateStock(stockGen, "AAPL", 174.6f);
//        Runnable genGOOG = new UpdateStock(stockGen, "GOOG", 267.4f);

        // create the observer counter
        ObserverCounter cnt = new ObserverCounter();

        // create Observers and pass Subject
        Observer ibmObserver = new IBMObserver(stockGen, cnt);
//        Observer aaplObserver = new AAPLObserver(stockGen, cnt);
//        Observer googObserver = new GOOGObserver(stockGen, cnt);

        // and start 3 threads        
//        new Thread(genIBM).start();
//        new Thread(genAAPL).start();
//        new Thread(genGOOG).start();
    }
}
