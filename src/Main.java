//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//        In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un LinkedList con elementi e stamparlo in console.
//        Aggiungere un elemento al primo posto della lista e uno all'ultimo
//        Stampare la collezione aggiornata

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        Creare un LinkedList con elementi e stamparlo in console.
        LinkedList<Fruit> listaFrutta = new LinkedList<>();
        listaFrutta.add(new Fruit("banana"));
        listaFrutta.add(new Fruit("mela"));


        //Prima stampa della lista
        System.out.println("Prima stampa della lista frutta :");
        for (Fruit frutta : listaFrutta) {
            System.out.println(frutta);
        }

        //Aggiunti elementi sia all'inizio che alla fine della lista
        listaFrutta.addFirst(new Fruit("pera"));
        listaFrutta.addLast(new Fruit("ciliegia"));

        //Stampa lista aggiornata:
        System.out.println("\nLista aggiornata :");
        for (Fruit frutta2 : listaFrutta) {
            System.out.println(frutta2);
        }
    }
}
