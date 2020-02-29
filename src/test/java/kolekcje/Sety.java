package kolekcje;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class Sety {

    Set<String> nicks = new HashSet<String>();

    public void dodajNickiUzytkownikow() {

        nicks.add("Wesoly Romek");
        nicks.add("Czarna owca");
        nicks.add("Peppa");
        nicks.add("Gorąca Asia");

    }
    @Test
    public void testSetow(){
        dodajNickiUzytkownikow();
        nicks.add("kolejny user");
        System.out.println(nicks.size());
        System.out.println(nicks.contains("Peppa"));
        nicks.remove("Gorąca Asia");
        System.out.println(nicks.size());
        nicks.add("kolejny user");
        System.out.println(nicks.size());

    }
}
