package Arrays;

import java.util.ArrayList;

public class arrayListExample {

    public static void main(String[] args) {
        // ArrayList<String> heroes = ArrayList<String>();
        ArrayList<String> heroes = new ArrayList<>();
        ArrayList<String> movies = new ArrayList<String>();

        heroes.add("Iron Man");
        heroes.add("Captian Amerika");
        heroes.add("Halk Superhero");

        movies.add("Marvel");
        movies.add("Bollywood");

        heroes.remove(0);
        heroes.remove("Halk Superhero");

        // System.out.println(heroes[0]);

    }

}
