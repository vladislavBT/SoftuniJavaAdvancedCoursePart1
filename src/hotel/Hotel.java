package hotel;

import java.util.ArrayList;
import java.util.List;


public class Hotel {
    String name;
    int capacity;
    List<Person> roaster=new ArrayList<>();


    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void add(Person person){
        if(roaster.size()<capacity){
            this.roaster.add(person);
        }
    }
    public boolean remove(String name){
        for (int i = 0; i < roaster.size(); i++) {
            if(roaster.get(i).getName().equals(name)){
                roaster.remove(i);
                return true;
            }
        }
        return false;
    }

    public Person getPerson(String name, String hometown){
        for (int i = 0; i < roaster.size(); i++) {
            if(roaster.get(i).getName().equals(name)&& roaster.get(i).getHometown().equals(hometown)){
                return roaster.get(i);
            }
        }
        return null;
    }

    public int getCount(){
        return roaster.size();
    }

    public String getStatistics(){
        StringBuilder sb =new StringBuilder();
        sb.append(String.format("The people in the hotel %s are:%n",this.name));
        for (int i = 0; i < roaster.size(); i++) {
            sb.append(roaster.get(i).toString());
        }
        return sb.toString();
    }
}
