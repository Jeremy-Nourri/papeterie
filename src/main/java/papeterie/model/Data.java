package Papeterie.Models;

import java.util.HashMap;
import Papeterie.Models.Ramette;
import Papeterie.Models.Stylo;

public class Data {

    HashMap<String, Article> tableDeHachage = new HashMap<>();

    public Table() {

        tableDeHachage.put("1", new Ramette(1,"Ramette A4",80, 8 ));
        tableDeHachage.put("2", new Ramette(2,"Ramette A3", 100, 20));
        tableDeHachage.put("3", new Ramette(3,"Ramette A4", 90, 5));
        tableDeHachage.put("4", new Ramette(4,"Ramette A5", 70, 5));


        tableDeHachage.put("5", new Stylo(1,"Stylo bleu", 8, "bleu"));
        tableDeHachage.put("6", new Stylo(2,"Stylo noir", 4, "noir"));
        tableDeHachage.put("7", new Stylo(3,"Stylo rouge", 9, "rouge"));
        tableDeHachage.put("8", new Stylo(4,"Stylo vert", 6, "vert"));
        tableDeHachage.put("9", new Stylo(5,"Stylo noir", 7, "noir"));
    }
}