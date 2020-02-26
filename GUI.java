import java.util.Timer;
import java.util.TimerTask;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
 
class ChatController{
    private GUI v;
    private Client m;
    public ChatController(GUI v, Client m) {
        super();
        this.v = v;
        this.m = m;
         
        Timer timer = new Timer();
         
        timer.scheduleAtFixedRate(new chatAktualisieren(m, v), 0, 1000);
    }
}
class chatAktualisieren extends TimerTask{
    private GUI v;
    public chatAktualisieren(Client m, GUI v) {
        super();
        this.v = v;
    }

    public void run()
    {
        String temp = Client.chatAbfrage();
        v.lblNewLabel().setText(temp);
    }
}

public class GUI extends JFrame implements ActionListener
{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    
    public JLabel lblNewLabel() {
        return lblNewLabel;
    }

    public void iniz() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 250, 500, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        lblNewLabel = new JLabel("Florian: \t noch mehr text \n Tayfun \t auch hier?");
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        contentPane.add(lblNewLabel, BorderLayout.CENTER);

        textField = new JTextField();
        textField.addActionListener(this);
        contentPane.add(textField, BorderLayout.SOUTH);
        textField.setColumns(10);
        textField.setEnabled(false);

        lblNewLabel_1 = new JLabel("Mitglieder");
        lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
        contentPane.add(lblNewLabel_1, BorderLayout.EAST);

        textField_1 = new JTextField();
        textField_1.addActionListener(this);
        contentPane.add(textField_1, BorderLayout.NORTH);
        textField_1.setColumns(10);
        textField_1.setText("Bitte Namen eingeben");
    }

    public static void main(final String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    final GUI aufrufen = new GUI();
                    aufrufen.setVisible(true);
                    aufrufen.iniz();
                } catch (final Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public String getTextFieldName(JTextField textField){
        return textField.getText();
    }

    public String getTextFiel_1dName(JTextField textField_1){
        return textField_1.getText();
    }
    
    public void actionPerformed (final ActionEvent ae){
        if(ae.getSource() == this.textField_1){
            if(this.textField_1.getText() != "")
            {
                textField_1.setEnabled(false);
                textField.setEnabled(true);
            }
            else 
            {
                String message = "\"BITTE ZUERST NAMEN OBEN EINGEBEN\"\n";
                JOptionPane.showMessageDialog(new JFrame(), message, "Error",
                JOptionPane.ERROR_MESSAGE);
            }
        }
        if(ae.getSource() == this.textField){
            if(textField_1.getText().length() != 0){
                Client.senden(textField_1.getText(), textField.getText());
                textField.setText((""));
            }
            else 
            {
                String message = "\"BITTE ZUERST NAMEN OBEN EINGEBEN\"\n";
                JOptionPane.showMessageDialog(new JFrame(), message, "Error",
                JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
