public class Counter {
    private int count;
    public Counter(){
        this.count = 0;
    }
    public Counter(int startValue){
        this.count = startValue;
    }
    public int value(){
        return count;
    }
    public void increase(){
        count++;
    }
    public void decrease(){
        count--;
    }
    public void increasee(int increaseBy){
        if(increaseBy < 0){
            this.count = count;
        }else{
            count += increaseBy;
        }
    }
    public void decrease(int decreaseBy){
        if(decreaseBy < 0){
            this.count = count;
        }else{
            count -= decreaseBy;
        }
    }
}
