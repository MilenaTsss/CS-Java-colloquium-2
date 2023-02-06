import java.util.ArrayList;

public class Theatre {
    static ArrayList<TheatricalProduction> theatricalProductions;

    static {
        theatricalProductions = new ArrayList<>();
        TheatricalProduction theatricalProduction = new TheatricalProduction("The Best Big Theatre");
        theatricalProductions.add(theatricalProduction);
    }


    public static void makeTheatricalProduction() {
        Person person = new Person("Mary Jane Watson");
        for (TheatricalProduction theatricalProduction : theatricalProductions) {
            theatricalProduction.accept(person);
        }
    }
}