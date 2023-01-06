package KeyboardHelp.Components;

import javax.swing.*;
import java.awt.*;

public class JButtonChar extends JButton {
    private int x,y;
    private int width = 50;
    private int height = 50;
    public JButtonChar(String str, int x, int y) {
        //Button Download
        super(str);
        this.setBounds(x,y, width,height);
        this.setFont(new Font("Arial", Font.BOLD, 20));
    }
}
