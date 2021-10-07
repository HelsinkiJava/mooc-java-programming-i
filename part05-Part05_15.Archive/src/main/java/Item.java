public class Item {
    private String name;
    private String id;
    public Item(String name, String id){
        this.name = name;
        this.id = id;
    }
    @Override
    public boolean equals(Object compared){
        Item object = (Item) compared;
        if(this == compared){
            return true;
        }else if(!(compared instanceof Item)){
            return false;
        }else{
            return id.equals(object.id);
        }
    }
    @Override
    public String toString(){
        return id + ": " + name;
    }
}
