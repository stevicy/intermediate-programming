package MySimPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection {

    //==================Belong to 2nd Simulation Run=======================
    public static ArrayList<String> infoPersonality(ArrayList<String> traits) {
        return traits;
    }
    
    public static ArrayList<String> mySports(String[] sports) {
        return new ArrayList<>(Arrays.asList(sports));
    }

    public static ArrayList<String> fighters(ArrayList<String> fighters) {
        return fighters;
    }

    public static String[] wealthyPeople() {
        return new String[] {"Bill Gates", "Mark Zuckerberg", "Steve Jobs"};
        
    }

    public static ArrayList<String> favoriteGames(String[] Games) {
        return new ArrayList<>(Arrays.asList(Games));
    }

    public static ArrayList<String> countriesVisited(String[] countries) {
        return new ArrayList<>(Arrays.asList(countries));
    }
}
