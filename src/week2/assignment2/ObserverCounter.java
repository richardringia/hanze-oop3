package week2.assignment2;

class ObserverCounter {

    private static int counter2;
    private int counter;

    ObserverCounter() {
        counter = 0;
    }

    public static int getNextValue()
    {
        return ++counter2;
    }
}
