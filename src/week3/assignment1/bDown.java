package week3.assignment1;

// invoker
public class bDown implements Button {


    private Command cmd;

    @Override
    public void setCommand(Command cmd) {
        this.cmd = cmd;
    }

    @Override
    public void pressButton() {
        this.cmd.execute();
    }
}