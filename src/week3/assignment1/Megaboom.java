package week3.assignment1;

// a comand receiver
public class Megaboom implements Device {

    private int volume = 0;

    // (b)

    @Override
    public void on() {
        System.out.println(this.getClass().getName() + " has turned on");
    }

    @Override
    public void off() {
        System.out.println(this.getClass().getName() + " has turned off");
    }

    @Override
    public void volumeUp() {
        this.volume++;
        System.out.println("Volume: " + this.volume);
    }

    @Override
    public void volumeDown() {
        this.volume--;
        System.out.println("Volume: " + this.volume);
    }

}