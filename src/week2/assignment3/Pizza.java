package week2.assignment3;

public abstract class Pizza {
    String beschrijving = "Onbekende pizza";
    String size = "M";

    public String getDescription() {
        String size = "Normale ";
        if (this.size.equalsIgnoreCase("L")) {
            size = "Super grote ";
        } else if (this.size.equalsIgnoreCase("S")) {
            size = "Kleine ";
        }

        return size + beschrijving;
    }

    public void setSize(String size) {
        this.size=size;
    }

    public abstract double getCost();
}
