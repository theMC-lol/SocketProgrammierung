import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JLabel;

public class GUI{

public void initialize(){

JPanel pnPanel0;
ButtonGroup rbgPanel0;
JTextArea taArea0;
JTextField tfText0;
JToggleButton tbtTglBut0;
JList lsList0;
JTextField tfText1;
JLabel lbLabel0;

pnPanel0 = new JPanel();
pnPanel0.setBorder( BorderFactory.createTitledBorder( "Tabelle_namen" ) );
rbgPanel0 = new ButtonGroup();
GridBagLayout gbPanel0 = new GridBagLayout();
GridBagConstraints gbcPanel0 = new GridBagConstraints();
pnPanel0.setLayout( gbPanel0 );

taArea0 = new JTextArea(2,10);
gbcPanel0.gridx = 0;
gbcPanel0.gridy = 0;
gbcPanel0.gridwidth = 17;
gbcPanel0.gridheight = 17;
gbcPanel0.fill = GridBagConstraints.BOTH;
gbcPanel0.weightx = 1;
gbcPanel0.weighty = 1;
gbcPanel0.anchor = GridBagConstraints.NORTH;
gbPanel0.setConstraints( taArea0, gbcPanel0 );
pnPanel0.add( taArea0 );

tfText0 = new JTextField( );
gbcPanel0.gridx = 0;
gbcPanel0.gridy = 17;
gbcPanel0.gridwidth = 17;
gbcPanel0.gridheight = 3;
gbcPanel0.fill = GridBagConstraints.BOTH;
gbcPanel0.weightx = 1;
gbcPanel0.weighty = 0;
gbcPanel0.anchor = GridBagConstraints.NORTH;
gbPanel0.setConstraints( tfText0, gbcPanel0 );
pnPanel0.add( tfText0 );

tbtTglBut0 = new JToggleButton( "send_button"  );
rbgPanel0.add( tbtTglBut0 );
gbcPanel0.gridx = 17;
gbcPanel0.gridy = 17;
gbcPanel0.gridwidth = 1;
gbcPanel0.gridheight = 3;
gbcPanel0.fill = GridBagConstraints.BOTH;
gbcPanel0.weightx = 1;
gbcPanel0.weighty = 0;
gbcPanel0.anchor = GridBagConstraints.NORTH;
gbPanel0.setConstraints( tbtTglBut0, gbcPanel0 );
pnPanel0.add( tbtTglBut0 );

String []dataList0 = { "User:" };
lsList0 = new JList( dataList0 );
gbcPanel0.gridx = 17;
gbcPanel0.gridy = 2;
gbcPanel0.gridwidth = 1;
gbcPanel0.gridheight = 15;
gbcPanel0.fill = GridBagConstraints.BOTH;
gbcPanel0.weightx = 1;
gbcPanel0.weighty = 1;
gbcPanel0.anchor = GridBagConstraints.NORTH;
gbPanel0.setConstraints( lsList0, gbcPanel0 );
pnPanel0.add( lsList0 );

tfText1 = new JTextField( );
gbcPanel0.gridx = 17;
gbcPanel0.gridy = 1;
gbcPanel0.gridwidth = 1;
gbcPanel0.gridheight = 1;
gbcPanel0.fill = GridBagConstraints.BOTH;
gbcPanel0.weightx = 1;
gbcPanel0.weighty = 0;
gbcPanel0.anchor = GridBagConstraints.NORTH;
gbPanel0.setConstraints( tfText1, gbcPanel0 );
pnPanel0.add( tfText1 );

lbLabel0 = new JLabel( "Wähle deinen Namen:"  );
gbcPanel0.gridx = 17;
gbcPanel0.gridy = 0;
gbcPanel0.gridwidth = 1;
gbcPanel0.gridheight = 1;
gbcPanel0.fill = GridBagConstraints.BOTH;
gbcPanel0.weightx = 1;
gbcPanel0.weighty = 1;
gbcPanel0.anchor = GridBagConstraints.NORTH;
gbPanel0.setConstraints( lbLabel0, gbcPanel0 );
pnPanel0.add( lbLabel0 );

}
}