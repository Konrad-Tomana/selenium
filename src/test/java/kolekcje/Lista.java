package kolekcje;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {

    List <String> imiona = new ArrayList<String>();

    List<Integer> numery = new LinkedList<Integer>();

    public void dodajImiona(){
        imiona.add("Tomek");
        imiona.add("Maciek");
        imiona.add("Szymon");


    }

    public void ustawNumeryLotto(){
        numery.add(2);
        numery.add(22);
        numery.add(13);
        numery.add(11);
        numery.add(49);
        numery.add(18);
    }

    @Test
    public void testListy(){
        dodajImiona();
        System.out.println(imiona.get(0));
        System.out.println(imiona.size());
        imiona.remove("Tomek");
        System.out.println(imiona.size());
        System.out.println(imiona.indexOf("Maciek"));
        System.out.println(imiona.contains("Maciek"));
    }

    @Test
    public void testLinkedListy(){
        ustawNumeryLotto();
        System.out.println(numery.get(0));
        System.out.println(numery.contains(2));
        System.out.println(numery.size());
        System.out.println(numery.remove(2));
        System.out.println(numery.size());
    }
}
