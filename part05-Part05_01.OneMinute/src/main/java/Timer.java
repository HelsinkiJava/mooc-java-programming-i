public class Timer {
    private ClockHand hundredSeconds;
    private ClockHand seconds;
    public Timer(){
        this.hundredSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    public void advance(){
        hundredSeconds.advance();
        if(hundredSeconds.value() == 0){
            seconds.advance();
        }
    }
    @Override
    public String toString(){
        return seconds + ":" + hundredSeconds;
    }
}
