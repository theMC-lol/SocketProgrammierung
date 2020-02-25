
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener
{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;


        public void iniz(){
            
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(150, 150, 500, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        
        lblNewLabel = new JLabel("Hier der Chat");
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        contentPane.add(lblNewLabel, BorderLayout.CENTER);
        
        textField = new JTextField();
        textField.addActionListener(this);
        contentPane.add(textField, BorderLayout.SOUTH);
        textField.setColumns(10);
        
        lblNewLabel_1 = new JLabel("Liste User");
        lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
        contentPane.add(lblNewLabel_1, BorderLayout.EAST);
        
        textField_1 = new JTextField();
        textField_1.addActionListener(this);
        contentPane.add(textField_1, BorderLayout.NORTH);
        textField_1.setColumns(10);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI aufrufen = new GUI();
                    aufrufen.setVisible(true);
                    aufrufen.iniz();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /*
     * public void actionPerformed(ActionEvent eve) {
     * JOptionPane.showMessageDialog(rootPane, eve.getActionCommand()); }
     */

    public void actionPerformed (final ActionEvent ae){
        if(ae.getSource() == this.textField_1){
            lblNewLabel_1.setText(("Hier den Namen an den Server"));
            textField_1.setEnabled(false);
        }
        if(ae.getSource() == this.textField){
            lblNewLabel.setText(("Hier die Chatnachricht an den Server"));
            textField.setText((""));
        }
    }
}
