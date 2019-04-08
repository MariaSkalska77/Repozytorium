package pl.sda.TypyGeneryczne;

import java.util.List;

public class NumbersBox<T extends Number> {//jesli nie zrobimy extends number to moze wszystko przechowywac
    private List<T> items;

    public NumbersBox(List<T> items) {
        this.items = items;
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public T getFirstelement(){
        if(isEmpty())
            return null;
        return items.get(0);
    }
//    public T getLastelement();
//
//        if(isEmpty())
//            return null;
//        return items.get(0);

}