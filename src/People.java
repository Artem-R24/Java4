import java.util.LinkedList;
public class People {
	private LinkedPeople head;

    public People() {
        head = null;
    }

    public void add(String id, String name, String gender, String birthday, String division, String salary) {
        LinkedPeople temp = new LinkedPeople(id, name, gender, birthday, division, salary);
        temp.next = head;
        head = temp;
    }

    public void print() {
        LinkedPeople kr = head;
        while (kr.next != null) {
            System.out.println(kr.id + "; " + kr.name + "; " + kr.gender + "; " + kr.birthday + "; "
                    + kr.division + "; " + kr.salary);
            kr = kr.next;
        }
    }
}
