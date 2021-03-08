package week3.assignment1;

// concrete command
public class VolumeUpCommand implements Command {
    
    // (a)
    private Device device;

    public VolumeUpCommand (Device device) {
        // (a)
        this.device = device;
    }

    @Override
    public void execute() {
        // (a)
        this.device.volumeUp();
    }
}