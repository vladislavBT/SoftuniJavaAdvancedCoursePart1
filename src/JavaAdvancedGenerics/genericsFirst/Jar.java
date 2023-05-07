package JavaAdvancedGenerics;

import java.util.ArrayList;

public class Jar<E>{
    private ArrayList<E> elements;
    public Jar() {
        this.elements=new ArrayList<>();
    }

    public void add(E element){
        this.elements.add(element);
    }
    public void remove(){
        this.elements.remove(0);
    }
}
