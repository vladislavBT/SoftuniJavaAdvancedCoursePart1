package JavaAdvancedIteratorsAndComparatorsExersice;

public class PersonTwo implements Comparable<PersonTwo>{
    String name;
    int age;

    public PersonTwo(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(PersonTwo o) {
        return 0;
    }

    @Override
    public String toString(){
        return String.format("%s %d", name,age);
    }
}
