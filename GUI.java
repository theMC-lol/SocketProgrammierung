
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI extends JFrame // implements ActionListener
{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;


        public void iniz(){
            
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        
        JLabel lblNewLabel = new JLabel("Hier der Chat");
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        contentPane.add(lblNewLabel, BorderLayout.CENTER);
        
        textField = new JTextField();
        contentPane.add(textField, BorderLayout.SOUTH);
        textField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Liste User");
        lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
        contentPane.add(lblNewLabel_1, BorderLayout.EAST);
        
        textField_1 = new JTextField();
        contentPane.add(textField_1, BorderLayout.NORTH);
        textField_1.setColumns(10);

    }

    public static void main(final String[] args) {
        GUI aufrufen = new GUI();
        aufrufen.setVisible(true);
        aufrufen.iniz();
    }
    /*
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource() == this.textField_1){
            lblNewLabel_1.setText(("Button 1 wurde betätigt"));
        }
    } 
    */
}
