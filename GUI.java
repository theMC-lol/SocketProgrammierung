import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class GUI extends JFrame implements ActionListener
{
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextArea lblNewLabel;
    private JTextArea lblNewLabel_1;
    
    public JTextArea lblNewLabel() {
        return lblNewLabel;
    }

    public void iniz() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 250, 500, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        lblNewLabel = new JTextArea("");
        //lblNewLabel.setEnabled(false);
        lblNewLabel.setForeground(Color.black);
        contentPane.add(lblNewLabel, BorderLayout.CENTER);

        textField = new JTextField();
        textField.addActionListener(this);
        contentPane.add(textField, BorderLayout.SOUTH);
        textField.setColumns(10);
        textField.setEnabled(false);

        lblNewLabel_1 = new JTextArea("Mitglieder");
        contentPane.add(lblNewLabel_1, BorderLayout.EAST);

        textField_1 = new JTextField();
        textField_1.addActionListener(this);
        contentPane.add(textField_1, BorderLayout.NORTH);
        textField_1.setColumns(10);
        textField_1.setText("Bitte Namen eingeben");

        
        new ChatController(this);
    }

    public static void main(final String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI aufrufen = new GUI();
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
