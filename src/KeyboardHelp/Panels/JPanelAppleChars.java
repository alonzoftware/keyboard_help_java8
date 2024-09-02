package KeyboardHelp.Panels;

import KeyboardHelp.Components.JButtonChar;
import KeyboardHelp.Components.JLabelNormal;

import javax.swing.*;
import java.awt.*;

public class JPanelAppleChars extends JPanel {
    //1st ROW
    //=================================================
    public JButtonChar jBtnChar01;
    private JLabelNormal jLbl01;
    public JButtonChar jBtnChar02;
    private JLabelNormal jLbl02;
    //=================================================
    public JPanelAppleChars (){

        super(null);
        this.setBackground(Color.GRAY);
        startComponents();
    }
    private void startComponents() {
        renderRow0(15,75,10);
    }
    private void renderRow0(int x, int xDiff, int y){
        jLbl01 = new JLabelNormal("Command",x,y);
        this.add(jLbl01);
        x= x + 90;
        jBtnChar01 = new JButtonChar("⌘",x,y);
        this.add(jBtnChar01);
        x= x + 100;
        jLbl02 = new JLabelNormal("Option",x,y);
        this.add(jLbl02);
        x= x + 90;
        jBtnChar02 = new JButtonChar("⌥",x ,y);
        this.add(jBtnChar02);
    }
}
