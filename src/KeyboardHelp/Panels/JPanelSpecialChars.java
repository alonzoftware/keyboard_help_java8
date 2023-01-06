package KeyboardHelp.Panels;

import KeyboardHelp.Components.JButtonChar;

import javax.swing.*;
import java.awt.*;

public class JPanelSpecialChars extends JPanel {
    //1st ROW
    //=================================================
    public JButton btn01;
    public JButtonChar jbuttonChar01,jbuttonChar02,jbuttonChar03;
    public JButtonChar jbuttonChar04,jbuttonChar05,jbuttonChar06;
    //=================================================
    public JPanelSpecialChars(){
        super(null);
        this.setBackground(Color.GRAY);
        startComponents();
    }
    private void startComponents() {
        int x = 15;
        int xDiff = 65;
        int y = 10;
        jbuttonChar01 = new JButtonChar("ª",x,y);
        this.add(jbuttonChar01);
        x= x +xDiff;
        jbuttonChar02 = new JButtonChar("|",x ,y);
        this.add(jbuttonChar02);
        x= x +xDiff;
        jbuttonChar03 = new JButtonChar("@",x,y);
        this.add(jbuttonChar03);
        x= x +xDiff;
        jbuttonChar04 = new JButtonChar("#",x,y);
        this.add(jbuttonChar04);
        x= x +xDiff;
        jbuttonChar05 = new JButtonChar("~",x,y);
        this.add(jbuttonChar05);
        x= x +xDiff;
        jbuttonChar06 = new JButtonChar("€",x,y);
        this.add(jbuttonChar06);
    }
}
