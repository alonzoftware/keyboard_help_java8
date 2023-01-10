package KeyboardHelp.Panels;

import KeyboardHelp.Components.JButtonChar;

import javax.swing.*;
import java.awt.*;

public class JPanelLogicChars extends JPanel {
    //1st ROW
    //=================================================
    public JButtonChar jbuttonChar01,jbuttonChar02,jbuttonChar03;
    public JButtonChar jbuttonChar04,jbuttonChar05,jbuttonChar06;
    //=================================================
    //2nd ROW
    //=================================================
    public JButtonChar jbuttonChar11,jbuttonChar12,jbuttonChar13;
    public JButtonChar jbuttonChar14,jbuttonChar15,jbuttonChar16;
    //=================================================
    //3rd ROW
    //=================================================
    public JButtonChar jbuttonChar21,jbuttonChar22,jbuttonChar23;
    public JButtonChar jbuttonChar24,jbuttonChar25,jbuttonChar26;
    //=================================================
    public JPanelLogicChars(){
        super(null);
        this.setBackground(Color.GRAY);
        startComponents();
    }
    private void startComponents() {
        renderRow0(15,75,10);
        renderRow1(15,75,70);
        renderRow2(15,75,130);
    }
    private void renderRow0(int x, int xDiff, int y){
        jbuttonChar01 = new JButtonChar("<",x,y);
        this.add(jbuttonChar01);
        x= x +xDiff;
        jbuttonChar02 = new JButtonChar(">",x ,y);
        this.add(jbuttonChar02);
        x= x +xDiff;
        jbuttonChar03 = new JButtonChar("<=",x,y);
        this.add(jbuttonChar03);
        x= x +xDiff;
        jbuttonChar04 = new JButtonChar(">=",x,y);
        this.add(jbuttonChar04);
        x= x +xDiff;
        jbuttonChar05 = new JButtonChar("<==",x,y);
        this.add(jbuttonChar05);
        x= x +xDiff;
        jbuttonChar06 = new JButtonChar(">==",x,y);
        this.add(jbuttonChar06);

    }
    private void renderRow1(int x, int xDiff, int y){
        jbuttonChar11 = new JButtonChar("=",x,y);
        this.add(jbuttonChar11);
        x= x +xDiff;
        jbuttonChar12 = new JButtonChar("==",x ,y);
        this.add(jbuttonChar12);
        x= x +xDiff;
        jbuttonChar13 = new JButtonChar("===",x,y);
        this.add(jbuttonChar13);
        x= x +xDiff;
        jbuttonChar14 = new JButtonChar("!",x,y);
        this.add(jbuttonChar14);
        x= x +xDiff;
        jbuttonChar15 = new JButtonChar("!=",x,y);
        this.add(jbuttonChar15);
        x= x +xDiff;
        jbuttonChar16 = new JButtonChar("!===",x,y);
        this.add(jbuttonChar16);

    }
    private void renderRow2(int x, int xDiff, int y){
        jbuttonChar21 = new JButtonChar("||",x,y);
        this.add(jbuttonChar21);
        x= x +xDiff;
        jbuttonChar22 = new JButtonChar("&&",x ,y);
        this.add(jbuttonChar22);
        x= x +xDiff;
        jbuttonChar23 = new JButtonChar("??",x,y);
        this.add(jbuttonChar23);
        x= x +xDiff;
        jbuttonChar24 = new JButtonChar("||",x,y);
        this.add(jbuttonChar24);
        x= x +xDiff;
        jbuttonChar25 = new JButtonChar("&&",x,y);
        this.add(jbuttonChar25);
        x= x +xDiff;
        jbuttonChar26 = new JButtonChar("??",x,y);
        this.add(jbuttonChar26);

    }
}
