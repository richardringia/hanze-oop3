package week1.lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestSorting {

    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        System.out.println("After Sort");

        // sort the list on age
        listDevs.sort(Comparator.comparingInt(Developer::getAge));

        // print the List
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }
    }

    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("Alwin", 33));
        result.add(new Developer("Peter", 24));
        result.add(new Developer("Johan", 26));
        result.add(new Developer("Tanja", 25));

        return result;
    }
}
