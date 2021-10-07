
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    @Override
    public String toString(){
        String listOfElements = "";
        String output = "";
        for(String e : elements){
            if(e.equals(elements.get(elements.size() - 1))){
               listOfElements += e;
            }else{
                listOfElements += e + "\n";
            }
        }
        if(elements.size() == 1){
            output = "The collection " + name + " has 1 element:\n" + listOfElements;
        }else if(elements.size() == 0){
            output = "The collection " + name + " is empty.";
        }else
            output = "The collection " + name + " has " + elements.size() + " elements:\n" + listOfElements;
        return output;
    }
    
}
