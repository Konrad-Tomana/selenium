package kolekcje;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Mapy {


    Map<Integer, String> dziennik = new HashMap<Integer, String>();

    public void dodajUczniow(){
        dziennik.put(1,"Kowalski");
        dziennik.put(2,"Chujalski");
        dziennik.put(3,"Debilski");
        dziennik.put(4,"Wacek");
        dziennik.put(5,"Pizdus");
    }
    @Test
    public void testMapy(){
        dodajUczniow();
        System.out.println(dziennik.size());
        dziennik.remove(1);
        System.out.println(dziennik.size());
        System.out.println(dziennik.get(2));
        dziennik.put(2, "Nowa wartosc");
        System.out.println(dziennik.containsKey(3));
        System.out.println(dziennik.get(2));

    }
}
