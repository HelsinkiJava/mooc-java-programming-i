import java.util.ArrayList;
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> hold;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<Suitcase>();
    }
    public void addSuitcase(Suitcase suitcase){
        if(weight() + suitcase.totalWeight() <= maxWeight){
            hold.add(suitcase);
        }else{
            return;
        }
    }
    public int weightSuitcase(){
        int weight = 0;
        for(Suitcase s : hold){
            weight += s.totalWeight();
        }
        return weight;
    }
    public int weight(){
        int weight = 0;
        for(Suitcase s : hold){
            weight += s.totalWeight();
        }
        return weight;
    }
    @Override
    public String toString(){
        String output = " ";
        if(hold.isEmpty()){
            output = "no suitcases";
        }else if(hold.size() == 1){
            output = "1 suitcase";
        }else{
            output = hold.size() + " suitcases (" + weight() + " kg)";
        }
        return output;
    }
    public void printItems(){
        for(Suitcase s : hold){
            s.printItems();
        }
    }
}
