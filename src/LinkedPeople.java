import java.util.LinkedList;

public class LinkedPeople {
    public LinkedPeople next;
    public String id, name, gender, birthday, division, salary;

    public LinkedPeople(String id, String name, String gender, String birthday, String division, String salary){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.division = division;
        this.salary = salary;
    }

}