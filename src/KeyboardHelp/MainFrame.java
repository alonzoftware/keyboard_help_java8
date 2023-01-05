package KeyboardHelp;
import com.apple.eawt.Application;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    //Containers
    JTabbedPane jTabbedPaneMain;
    JPanel jPanelLogicChars;
    JPanel jPanelSpecialChars;


    //MAIN WINDOW
    public MainFrame() {
        basicFrameConfiguration();
        createContainers();
        configContainers();
        this.setLayout(null);
        this.setVisible(true);
    }
    private void basicFrameConfiguration(){
        this.setTitle("Keyboard Helper - Developed By Alonzoftware");
        final int sizeMain_x = 512,  sizeMain_y = 512;
        this.setSize(sizeMain_x, sizeMain_y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("img/logo01.png"));
        String os = System.getProperty("os.name");
        if (os.contains("Mac")) {
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
        jPanelLogicChars = new JPanel();
        jPanelLogicChars.setLayout(null);
        jPanelSpecialChars = new JPanel();
        jPanelSpecialChars.setLayout(null);
        //----------------------------------------
    }
    private void configContainers (){
        //=========================================
        this.add(jTabbedPaneMain);
        jTabbedPaneMain.add("LOGIC CHARACTERS", jPanelLogicChars);
        jTabbedPaneMain.add("SPECIAL CHARACTERS", jPanelSpecialChars);
        //=========================================
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
