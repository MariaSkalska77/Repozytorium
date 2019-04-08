package pl.sda.TypyGeneryczne;

import java.util.*;

public class Tasks {

    public static void main(String[] args) {
        //#1
        Set<Double> doubles = setOfDoubles();



        //#2
        Map<Integer, String> genericMap = genericMap();

        //#3
        List<Number> numbers = doublesToNumbers(doubles);
        System.out.println("numbers = " + numbers);

        //#4
        //NumbersBox numbersBox = numbersToNumbersBox(numbers);

        //#5
        //NumbersBox<Double> doubleNumbersBox = boxOfDoubles(doubles);
    }

    /**
     * 1. Stwórz kolekcję typu Set, zawierającą obiekty klasy Double. Dodaj do niej kilka liczb.
     * Następnie pobierz i wyświetl w konsoli wszystkie elementy kolekcji.
     * Metoda powinna zwrócić stworzoną kolekcję.
     */
    private static Set<Double> setOfDoubles() {
        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(3.4);
        doubleSet.add(5.4);
        doubleSet.add(6.7);

        for(Double aDouble: doubleSet){
            System.out.println(aDouble.toString());
        }

        return doubleSet;
    }


    /**
     * 2. Stwórz mapę zawierającą obiekty typu Integer jako klucze i String jako wartości. Dodaj kilka obiektów do mapy.
     * Pobierz i wyświetl w konsoli pojedyncze elementy.
     * Następnie pobierz i wyświetl w konsoli wszystkie elementy mapy.
     * Metoda powinna zwrócić stworzoną mapę.
     */
    private static Map<Integer, String> genericMap() {

        Map<Integer, String> sampleMap = new HashMap<>();
        sampleMap.put(1, "one");
        sampleMap.put(2, "two");
        sampleMap.put(3, "three");
        for (Integer key : sampleMap.keySet()) {
            System.out.println(key + " " +sampleMap.get(key));
        }


        return sampleMap;
        }


    /**
     * 3. Skopiuj podany zbiór liczby Double do listy obiektów klasy Number.
     * Nie kopiuj obiektu jeżeli jest równy null.
     * Zwróć nową listę jako wynik metody.
     */
    private static List<Number> doublesToNumbers(Set<Double> doubles) {

        List<Number> list = new ArrayList<>();//Number - typ klasy
        for (Double aDouble : doubles) {//pobieramy elementy listy i przypisujemy do aDouble
            if (aDouble != null){//sprawdzamy czy nie rowna sie zero, jak nie rowna to add to list
                list.add(aDouble);//dodajemy do listy
            }
        }
        return list;
    }

    /**
     * 4. Uzupełnij klasę NumbersBox która ma przechowywać listę obiektów klasy Number.
     * Dodaj metody które:
     * - sprawdzą czy lista jest pusta
     * - pobierze pierwszy element listy
     * - pobierze pierwszy element listy jako int
     * - pobierze ostatni element listy
     * - pobierze ostatni element listy jako int
     * Zwróć obiekt klasy NumbersBox jako wynik tej metody.
     */
//    private static NumbersBox numbersToNumbersBox(List<Number> numbers) {
//        NumbersBox<Number> numbersbox = new NumbersBox<>(numbers);
//        System.out.println(numbersbox.isEmpty());
//        System.out.println(numbersbox.getFirstelement());
//        System.out.println(numbersbox.getFirstelementASInteger());
//
//        System.out.println(numbersbox.getLastelement());
//
//        return numbersbox;
//    }

    /**
     * 5. Zmień klasę NumbersBox - tak żeby przyjmowała różne typy liczbowe - np. Double
     * Zwróć obiekt klasy NumbersBox jako wynik tej metody.
     */
    private static NumbersBox<Double> boxOfDoubles(Set<Double> doubles) {
        return null;
    }
}
