package pl.sda;

public class FamilyTest {

    public static void main(String[] args) {
        Person dad = new Person("Michal ", "Kowalski ", 45);
        System.out.println( "dad " +dad);
        Person mum = new Person("Michalina " , "Kowalska ", 45);
        System.out.println("mum " + mum);
        Person child = new Person("Ula " , "Kowalska ", 5);
        System.out.println("child " + child);

        Family1 family666 = new Family1 (dad, mum, child);
        System.out.println(family666);

    }

}
