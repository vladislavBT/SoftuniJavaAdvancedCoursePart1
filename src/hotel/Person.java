package hotel;

public class Person {
    String name;
    int id;
    int age;
    String hometown="n/a";

    public Person(String name, int id, int age, String hometown) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }

    @Override
    public String toString(){
        return String.format("Person %s: %d, Age: %d, Hometown: %s%n",this.name,this.id,this.age,this.hometown);
    }

}
