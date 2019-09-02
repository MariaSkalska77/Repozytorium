package pl.sda.programwanie2.zadania;

import java.util.List;

public class Nazwiska {
    public static void main(String[] args) {


//1) Wszystkie nazwiska o długości co najwyżej 4 znaków, zapisane wielkimi literami


//2) Wszystkie nazwiska zaczynające się na literę 'B'
//3) Początkowe trzy litery wszystkich nazwisk, bez powtórzeń, z małych liter


//4) 10 najdłuższych nazwisk, posortowanych malejąco według długości
        List<String> list4 = (List<String>) DataCollections.getSurnames().stream();



//4*) Obsłuż miejsca "ex aequo"
//5) 20 najkrótszych nazwisk, posortowanych według ostatniej litery
//6) Odwróć kolejność liter we wszystkich nazwiskach i pozstaw jedynie te, które mają literę 'A' wsród pierwszych trzech liter (odwróconego nazwiska)
//7) Policz, ile jest nazwisk zaczynających się na każdą z liter alfabetu (rezultat jako Map<Character, Integer>)
//8*) Jaka litera pojawia się najcześciej we wszystkich nazwiskach?
    }
}
