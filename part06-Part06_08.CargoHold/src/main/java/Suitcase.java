import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;



    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (item.getWeight() + totalWeight() < maxWeight) {
            items.add(item);
        }

    }
    public int totalWeight(){
        int weight = 0;
        for(Item i : items){
            weight += i.getWeight();
        }
        return weight;
    }
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }else{
            Item heavy = this.items.get(0);
            for(Item i : items){
                if(i.getWeight() > heavy.getWeight()){
                    heavy = i;
                }
            }
            return heavy;
        }
    }
    @Override
    public String toString() {
        if(items.size() == 0){
            return "no items (" + totalWeight() + " kg)";
        }else if(items.size() == 1){
            return items.size() + " item (" + totalWeight() + " kg)";
        }else{
            return items.size() + " items (" + totalWeight() + " kg)";
        }

    }


}
