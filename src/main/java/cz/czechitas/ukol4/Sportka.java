package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.util.Collections.shuffle;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
    private final List<Integer> osudi = new ArrayList<>();

    public Sportka() {
        for (int i = 0; i < 49; i++) {
            osudi.add(i + 1);
        }
    }

    /**
     * Zamíchá osudí.
     *
     * @see Collections#shuffle(List)
     */
    public void zamichat() {
        shuffle(osudi,new Random());



    }

    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     * @see List#subList(int, int)
     */
    public List<Integer> vylosovanaCisla() {
        //TODO Vrátit seznam prvních 6 čísel z osudí.
        List<Integer> vylosovane = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
           vylosovane.add(osudi.get(0+i));
        }
        return vylosovane;
    }

    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */
    public Integer dodatkoveCislo() {
       int a = osudi.get(6); //TODO Vrátit sedmé číslo z osudí.
        return a;
    }


}
