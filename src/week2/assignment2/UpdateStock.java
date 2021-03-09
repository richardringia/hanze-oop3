package week2.assignment2;

public class UpdateStock implements Runnable {
    
    private String stock;
    private float price;
//    private final StockGenerator stockGenerator;
    
    public UpdateStock(){
        // (b)
    }
    
    public synchronized void run(){
        
        for(int i = 0; i < 10; i++){
        
            try{
                // sleep for 1 second
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            
            // generate a random number between -3 and +3
            float randNum = (float)(6*Math.random() - 3);
            price = price + randNum;
            // (b) notify observers
        }
    }
}
