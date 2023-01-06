package KeyboardHelp.Components;

import javax.swing.*;
import java.awt.*;

public class JButtonChar extends JButton {
    private String str;
    private int x,y;
    private int width = 70;
    private int height = 50;
    public JButtonChar(String str, int x, int y) {
        //Button Download
        super(str);
        this.str = str;
        this.setBounds(x,y, width,height);
        this.setFont(new Font("Arial", Font.BOLD, 15));
    }
    public String getButtonChar(){
        return this.str;
    }
}
