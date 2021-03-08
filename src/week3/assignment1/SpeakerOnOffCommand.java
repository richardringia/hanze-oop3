package week3.assignment1;

// concrete command
public class SpeakerOnOffCommand implements Command {
    
    enum State {ON, OFF};

    // (a)
    private Device device;
    private State state = State.OFF;

    public SpeakerOnOffCommand (Device device) {
        // (a)
        this.device = device;
    }

    @Override
    public void execute() {
        // (a)
        if (this.state.equals(State.ON)) {
            this.state = State.OFF;
            this.device.off();
        } else {
            this.state = State.ON;
            this.device.on();
        }
    }
}