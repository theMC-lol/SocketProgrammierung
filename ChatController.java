import java.util.Timer;
import java.util.TimerTask;

public class ChatController {
    public ChatController(GUI v) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new chatAktualisieren(v), 0, 1000);
    }

}
class chatAktualisieren extends TimerTask{
    private GUI v;
    public chatAktualisieren(GUI v) {
        super();
        this.v = v;
    }

    public void run()
    {
        String temp = Client.chatAbfrage();
        v.lblNewLabel().setText(temp);
    }
}
