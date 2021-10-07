import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> mess;
    public MessagingService(){
        this.mess = new ArrayList<>();
    }
    public void add(Message message){
        if(message.getContent().length() <= 280){
            mess.add(message);
        }
    }
    public ArrayList<Message> getMessages(){
        return mess;
    }
}
