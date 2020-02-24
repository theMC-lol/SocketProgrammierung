import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JLabel;

public class GUI{

    public void iniz(){

        JPanel pnPanel0;
        ButtonGroup rbgPanel0;
        JTextField tfText0;
        JToggleButton tbtTglBut0;
        JTextField tfText1;
        JLabel lbLabel0;
        JLabel lbLabel2;
        JLabel lbLabel3;
        
        pnPanel0 = new JPanel();
        pnPanel0.setBorder( BorderFactory.createTitledBorder( "Tabelle_namen" ) );
        pnPanel0.setBackground( new Color( 240,240,240 ) );
        pnPanel0.setForeground( new Color( 0,0,0 ) );
        rbgPanel0 = new ButtonGroup();
        GridBagLayout gbPanel0 = new GridBagLayout();
        GridBagConstraints gbcPanel0 = new GridBagConstraints();
        pnPanel0.setLayout( gbPanel0 );
        
        tfText0 = new JTextField( );
        tfText0.setCaretColor( new Color( 0,0,0 ) );
        tfText0.setDisabledTextColor( new Color( 109,109,109 ) );
        tfText0.setForeground( new Color( 0,0,0 ) );
        tfText0.setMargin( new Insets( 2,2,2,2 ) );
        tfText0.setSelectedTextColor( new Color( 255,255,255 ) );
        tfText0.setSelectionColor( new Color( 0,120,215 ) );
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
        
        tbtTglBut0 = new JToggleButton( "Eingabe"  );
        tbtTglBut0.setBackground( new Color( 240,240,240 ) );
        tbtTglBut0.setForeground( new Color( 0,0,0 ) );
        tbtTglBut0.setOpaque( false );
        tbtTglBut0.setRolloverEnabled( true );
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
        
        tfText1 = new JTextField( );
        tfText1.setCaretColor( new Color( 0,0,0 ) );
        tfText1.setDisabledTextColor( new Color( 109,109,109 ) );
        tfText1.setForeground( new Color( 0,0,0 ) );
        tfText1.setMargin( new Insets( 2,2,2,2 ) );
        tfText1.setSelectedTextColor( new Color( 255,255,255 ) );
        tfText1.setSelectionColor( new Color( 0,120,215 ) );
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
        lbLabel0.setBackground( new Color( 240,240,240 ) );
        lbLabel0.setForeground( new Color( 0,0,0 ) );
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
        
        lbLabel2 = new JLabel( ""  );
        gbcPanel0.gridx = 0;
        gbcPanel0.gridy = 0;
        gbcPanel0.gridwidth = 17;
        gbcPanel0.gridheight = 17;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 1;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints( lbLabel2, gbcPanel0 );
        pnPanel0.add( lbLabel2 );
        
        lbLabel3 = new JLabel( ""  );
        gbcPanel0.gridx = 17;
        gbcPanel0.gridy = 2;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 15;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 1;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints( lbLabel3, gbcPanel0 );
        pnPanel0.add( lbLabel3 );
}

    public static void main(final String[] args) {
        final GUI aufrufen = new GUI();
        aufrufen.iniz();
    }
}