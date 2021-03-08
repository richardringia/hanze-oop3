package week3.assignment1;


import java.util.InputMismatchException;
import java.util.Scanner;

// the client
public class App {
    
    public static void main(String[] args) {

        Device d;
        Scanner sc;
        char keuze;

        while (true) {

            System.out.println("Kies 'm' (Megaboom) of 'b' (Bose):");

            sc = new Scanner(System.in);
            keuze = sc.next().charAt(0);
        
            // create command receiver
            if (keuze == 'm') {
                d = new Megaboom();
            } else {
                d = new Bose();
            }
        
            // create three commands and pass them a receiver
            Command onoff = new SpeakerOnOffCommand(d);
            // (d)
            Command down = new VolumeDownCommand(d);
            Command up = new VolumeUpCommand(d);

            // create three invokers
            Button b_OnOff = new bOnOff();
            b_OnOff.setCommand(onoff);
            // d
            Button b_Down = new bDown();
            b_Down.setCommand(down);

            Button b_Up = new bUp();
            b_Up.setCommand(up);

            while (true) {

                System.out.println("Kies 'o', 'u', 'd' voor on/off, volume up, volume down:");

                try {
                    sc = new Scanner(System.in);
                    keuze = sc.next().charAt(0);

                    switch (keuze) {
                        // invoke command = pass command to invoker
                        case 'x': b_OnOff.pressButton(); break;
                        case 'u': b_Up.pressButton(); break;
                        case 'd': b_Down.pressButton(); break;
                        default: throw new InputMismatchException();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Onjuiste letter gekozen");
                }
            } // while
        } // while
    } // main
}