package week3.assignment1;

// concrete command
public class VolumeDownCommand implements Command {
    
    // (a)
    private Device device;

    VolumeDownCommand (Device device) {
        // (a)
        this.device = device;
    }

    @Override
    public void execute() {
        // (a)
        this.device.volumeDown();
    }
}