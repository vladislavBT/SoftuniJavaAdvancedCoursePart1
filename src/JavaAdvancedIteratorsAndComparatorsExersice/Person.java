package JavaAdvancedIteratorsAndComparatorsExersice;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person o) {
        if(o.age==this.age && name.equals(this.name) && town.equals(this.town)){
            return 1;
        }else {
            return 0;
        }
    }
}
