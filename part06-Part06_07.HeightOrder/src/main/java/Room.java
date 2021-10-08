import java.util.ArrayList;

public class Room {
    private ArrayList<Person> person;

    public Room() {
        this.person = new ArrayList<>();
    }

    public void add(Person person) {
        this.person.add(person);
    }

    public boolean isEmpty() {
        return person.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return person;
    }

    public Person shortest() {
        if (person.isEmpty()) {
            return null;
        } else {
            Person shortest = person.get(0);
            for (Person p : person) {
                if (p.getHeight() < shortest.getHeight()) {
                    shortest = p;
                }
            }
            return shortest;
        }
    }
    public Person take(){
        if(person.isEmpty()){
            return null;
        }else{
            Person shorter = shortest();
            this.person.remove(shorter);
            return shorter;
        }
    }
}
