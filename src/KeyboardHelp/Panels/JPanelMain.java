package KeyboardHelp.Panels;

import KeyboardHelp.Components.JButtonChar;
import KeyboardHelp.Helpers.OSInfo;

import javax.swing.*;
import java.awt.*;

public class JPanelMain extends JPanel {
    JLabel lblCharCopied;
    public JTextField txtCharCopied;
    public JPanelMain(){
        super(null);
        this.setBackground(Color.GRAY);
        startComponents();
    }
    private void startComponents() {
        setLblCharCopied();
        setTxtCharCopied();
    }
    private void setLblCharCopied() {
        lblCharCopied = new JLabel("CHARACTER COPIED");
        if (OSInfo.getPlatform()=="Mac"){
            lblCharCopied.setFont(new Font("Calibri", Font.BOLD, 15));
        }else{

            lblCharCopied.setFont(new Font("Calibri", Font.BOLD, 18));
        }
        lblCharCopied.setForeground(Color.YELLOW);
        lblCharCopied.setBounds(15, 15, 180, 30);
        lblCharCopied.setHorizontalAlignment(JLabel.LEFT);
        lblCharCopied.setVerticalAlignment(JLabel.CENTER);
        this.add(lblCharCopied);
    }
    private void setTxtCharCopied() {
        txtCharCopied = new JTextField("");
        txtCharCopied.setBounds(205, 15, 150, 30);
        txtCharCopied.setHorizontalAlignment(JTextField.CENTER);
        txtCharCopied.setFont(new Font("Calibri", Font.BOLD, 18));
        this.add(txtCharCopied);
    }
}
