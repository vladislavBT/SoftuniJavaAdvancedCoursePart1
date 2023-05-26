package JavaAdvancedExamPreparation;

import java.util.ArrayList;
import java.util.List;

public class University {
    private int capacity;
    private List<Student> students=new ArrayList<>();

    public University(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentCount(){
        return students.size();
    }

    public String registerStudent(Student student){

        if(students.isEmpty()){
            students.add(student);
            return String.format("Added student %s %s", student.getFirstName(),student.getLastName());
        }else if(students.contains(student)){
            return "Student is already in the university";
        }else if(students.size()+1>capacity) {
            return "No seats in the university";
        }else {
            students.add(student);
            return String.format("Added student %s %s", student.getFirstName(),student.getLastName());
        }
    }

    public String dismissStudent(Student student){
        if(!students.contains(student)){
            return "No seats in the university";
        }else {
            students.remove(student);
            return "";
        }
    }
    public Student getStudent(String firstName, String lastName){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getFirstName().equals(firstName) && students.get(i).getLastName().equals(lastName)){
                return students.get(i);
            }
        }
        Student student = new Student("","","");
        return student;
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
           Student student= students.get(i);
           sb.append(String.format("==Student: First Name = %s, Last Name = %s, Best Subject = %s%n",student.getFirstName(),student.getLastName(),student.getBestSubject()));

        }
        return sb.toString();
    }
}
