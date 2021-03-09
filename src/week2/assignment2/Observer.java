package week2.assignment2;

public interface Observer {

    // update method is called when the Subject changes
    public void update(String stock, float price);
}
