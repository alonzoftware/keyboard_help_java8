package KeyboardHelp;
import KeyboardHelp.Components.JButtonChar;
import KeyboardHelp.Helpers.OSInfo;
import KeyboardHelp.Panels.JPanelLogicChars;
import KeyboardHelp.Panels.JPanelMain;
import KeyboardHelp.Panels.JPanelSpecialChars;
import com.apple.eawt.Application;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.util.Objects;

public class MainFrame extends JFrame {

    //Containers
    JTabbedPane jTabbedPaneMain;
    JPanelMain jPanelMain;
    JPanelSpecialChars jPanelSpecialChars;
    JPanelLogicChars jPanelLogicChars;


    //MAIN WINDOW
    public MainFrame() {
        basicFrameConfiguration();
        createContainers();
        configContainers();
        eventsComponents();
        this.setLayout(null);
        this.setVisible(true);
    }
    private void basicFrameConfiguration(){
        this.setTitle("Keyboard Helper - Developed By Alonzoftware");
        final int sizeMain_x = 512,  sizeMain_y = 512;
        this.setSize(sizeMain_x, sizeMain_y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("img/logo01.png")));
        if (OSInfo.getPlatform().equals("Mac")){
            //System.setProperty("apple.eawt.Application.setDockIconImage", img.getImage());
            Application application = Application.getApplication();
            application.setDockIconImage(img.getImage());
        }
        this.setIconImage(img.getImage());
    }
    private void createContainers (){
        //TABS
        //===========
        //Tab Main
        //=============================================
        jTabbedPaneMain = new JTabbedPane();
        jTabbedPaneMain.setBounds(5, 65, 485, 400);
        //PANELS
        //===========
        //Main Panels
        jPanelMain = new JPanelMain();
        jPanelMain.setBounds(0, 0, 512, 512);

        jPanelSpecialChars = new JPanelSpecialChars();
        jPanelSpecialChars.setBounds(0, 0, 485, 400);

        jPanelLogicChars = new JPanelLogicChars() ;
        jPanelLogicChars.setBounds(0, 0, 485, 400);
        //----------------------------------------

    }
    private void configContainers (){
        //=========================================
        this.add(jTabbedPaneMain);
        this.add(jPanelMain);

        jTabbedPaneMain.add("SPECIAL CHARACTERS", jPanelSpecialChars);
        jTabbedPaneMain.add("LOGIC CHARACTERS", jPanelLogicChars);
        //=========================================
    }
    private void eventsComponents(){

        setButtonAction(jPanelSpecialChars.jbuttonChar01);
        setButtonAction(jPanelSpecialChars.jbuttonChar02);
        setButtonAction(jPanelSpecialChars.jbuttonChar03);
        setButtonAction(jPanelSpecialChars.jbuttonChar04);
        setButtonAction(jPanelSpecialChars.jbuttonChar05);
        setButtonAction(jPanelSpecialChars.jbuttonChar06);

        setButtonAction(jPanelSpecialChars.jbuttonChar12);
        setButtonAction(jPanelSpecialChars.jbuttonChar13);
        setButtonAction(jPanelSpecialChars.jbuttonChar11);
        setButtonAction(jPanelSpecialChars.jbuttonChar14);
        setButtonAction(jPanelSpecialChars.jbuttonChar15);
        setButtonAction(jPanelSpecialChars.jbuttonChar16);

        setButtonAction(jPanelSpecialChars.jbuttonChar22);
        setButtonAction(jPanelSpecialChars.jbuttonChar23);
        setButtonAction(jPanelSpecialChars.jbuttonChar21);
        setButtonAction(jPanelSpecialChars.jbuttonChar24);
        setButtonAction(jPanelSpecialChars.jbuttonChar25);
        setButtonAction(jPanelSpecialChars.jbuttonChar26);


        setButtonAction(jPanelLogicChars.jbuttonChar01);
        setButtonAction(jPanelLogicChars.jbuttonChar02);
        setButtonAction(jPanelLogicChars.jbuttonChar03);
        setButtonAction(jPanelLogicChars.jbuttonChar04);
        setButtonAction(jPanelLogicChars.jbuttonChar05);
        setButtonAction(jPanelLogicChars.jbuttonChar06);

        setButtonAction(jPanelLogicChars.jbuttonChar11);
        setButtonAction(jPanelLogicChars.jbuttonChar12);
        setButtonAction(jPanelLogicChars.jbuttonChar13);
        setButtonAction(jPanelLogicChars.jbuttonChar14);
        setButtonAction(jPanelLogicChars.jbuttonChar15);
        setButtonAction(jPanelLogicChars.jbuttonChar16);

        setButtonAction(jPanelLogicChars.jbuttonChar22);
        setButtonAction(jPanelLogicChars.jbuttonChar21);
        setButtonAction(jPanelLogicChars.jbuttonChar23);
        setButtonAction(jPanelLogicChars.jbuttonChar24);
        setButtonAction(jPanelLogicChars.jbuttonChar25);
        setButtonAction(jPanelLogicChars.jbuttonChar26);

        setButtonAction(jPanelLogicChars.jbuttonChar32);
        setButtonAction(jPanelLogicChars.jbuttonChar31);
        setButtonAction(jPanelLogicChars.jbuttonChar33);
        setButtonAction(jPanelLogicChars.jbuttonChar34);
        setButtonAction(jPanelLogicChars.jbuttonChar35);
        setButtonAction(jPanelLogicChars.jbuttonChar36);

    }

    private void setButtonAction(JButtonChar jButtonChar){
        jButtonChar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = jButtonChar.getText();
                copyChar(str);
                jPanelMain.txtCharCopied.setText("Copied :  " + str);
            }
        });
    }
    private void copyChar(String str){
        String myString = str;
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
}

/*public class MainFrame {
    JFrame f;
    public MainFrame(){
        f=new JFrame();
        JTextArea ta=new JTextArea(10,150);
        ta.setBounds(5,5,100,15);
        JTextArea ta2=new JTextArea(10,150);
        ta2.setBounds(5,5,100,15);
        JPanel p1=new JPanel(null);
        p1.add(ta);
        JPanel p2=new JPanel(new BorderLayout());
        JPanel p3=new JPanel(new BorderLayout());
        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(0,25,300,300);
        tp.add("main",p1);
        tp.add("visit",p2);
        tp.add("help",p3);
        f.add(ta2);
        f.add(tp);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}*/
