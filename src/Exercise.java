import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;


public class Exercise {
    public static void main(String[] args) {

        //Define a testing class with a main() method where you:
        // -Create a not mutable List of strings called cityNames using asList() that you populate with 3 city names -

        List<String> cityNames = Arrays.asList("Agrigento", "Verona", "Napoli");

        //Try to add a 4th city name at the end of the List
        // -If you get an exception, try to understand why and eventually comment the faulty code


        // -----------------------------------------------------------------------------------------


        // cityNames.add("Roma");
        // Essendo una lista immutabile, non si possono aggiungere elementi all'interno, rendo quindi la stringa
        // qui sopra un commento, per non creare errori nella stampa del codice.

        // -----------------------------------------------------------------------------------------


        // Try to change the 2nd item of the array, entering the value Tegucigalpa print the content of cityNames

        cityNames.set(1, "Tegucigalpa");

        System.out.println(cityNames);

        //Define a mutable empty List of strings called kingsOfRome
        // -Insert the names of the 7 kings of Rome into the mutable list

        ArrayList<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");

        // Print the content of kingsOfRome

        System.out.println(kingsOfRome);

        //Convert kingsOfRome into an array called kingsOfRomeArray,
        // using new String[0] to determine the type of the array

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

        // Change the value of the 7th king in kingsOfRomeArray with the value Lucius Tarquinius Supercar

        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        // Print the content of kingsOfRomeArray

        System.out.println(Arrays.toString(kingsOfRomeArray));


        // Ci tengo a precisare che ho svolto l'esercizio, ma capendone praticamente meno della metà, visto che
        // circa l'80% dell'intero esercizio necessitava di librerie o metodi esterni.
        // Capisco pienamente che dobbiamo cercare dei riferimenti anche online perchè non tutto viene spiegato nelle lezioni
        // ma in questo modo è tutto un semplice copia e incolla di metodi e librerie, senza capirne
        // realmente l'utilizzo e la piena potenzialità.
        // Chiederei quindi se possibile, di revisionare sul serio questi esercizi perchè, ci sta imparare a cercare da soli
        // librerie e metodi, ma se questo deve diventare opprimente e pesante, perchè l'esercizio si basa SOLO su quello
        // e non su quello che abbiamo studiato nei video, a questo rende l'utilità delle lezioni viste ed il tempo speso
        // fine a se stesso, grazie.


    }
}
