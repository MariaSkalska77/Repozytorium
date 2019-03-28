package pl.sda;

public class Family1 {

    Person dad;
    Person mum;
    Person child;

    public Family1(Person dad, Person mum, Person child) {

        this.dad = dad;
        this.mum = mum;
        this.child = child;
    }

    public Person getDad() {
        return dad;
    }

    public Person getMum() {
        return mum;
    }

    public Person getChild() {
        return child;
    }

    @Override
    public String toString() {
        return "pl.sda.Family1{" +
                "dad=" + dad +
                ", mum=" + mum +
                ", child=" + child +
                '}';
    }
}
