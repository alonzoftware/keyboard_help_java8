package KeyboardHelp.Panels;

import KeyboardHelp.Components.JButtonChar;

import javax.swing.*;
import java.awt.*;

public class JPanelLogicChars extends JPanel {
    //1st ROW
    //=================================================
    public JButton btn01;
    public JButtonChar jbuttonChar01;
    //=================================================
    public JPanelLogicChars(){
        super(null);
        this.setBackground(Color.GRAY);
        startComponents();
    }
    private void startComponents() {
        jbuttonChar01 = new JButtonChar("<",10,10);
        this.add(jbuttonChar01);
    }

}
