import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> box;
    public Package(){
        this.box = new ArrayList<>();
    }
    public void addGift(Gift gift){
        box.add(gift);
    }
    public int totalWeight(){
        int weight = 0;
        for(Gift boxes : box){
            weight += boxes.getWeight();
        }
        return weight;
    }
}
