import java.util.Timer;
import java.util.TimerTask;

public class ChatController {
    private GUI v;
    public ChatController(GUI v) {
        super();
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
        v.lblNewLabel().setText(Client.chatAbfrage().toString());
    }
}
