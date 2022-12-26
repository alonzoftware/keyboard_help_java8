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
    }
    private void basicFrameConfiguration(){
        this.setTitle("Keyboard Helper - Developed By Alonzoftware");
        final int sizeMain_x = 1024,  sizeMain_y = 768;
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
        //this.setLayout(null);

    }
    private void createContainers (){
        //TABS
        //===========
        //Tab Main
        //=============================================
        jTabbedPaneMain = new JTabbedPane();
        jTabbedPaneMain.setBounds(100, 100, 512, 512);
        //PANELS
        //===========
        //Main Panels
        jPanelLogicChars = new JPanel(new BorderLayout());
        jPanelLogicChars.setLayout(new BorderLayout());
        jPanelSpecialChars = new JPanel(new BorderLayout());
        jPanelSpecialChars.setLayout(new BorderLayout());
        //----------------------------------------
    }
    private void configContainers (){
        //=========================================
        this.add(jTabbedPaneMain);
        jTabbedPaneMain.add("Servidor Local", jPanelLogicChars);
        jTabbedPaneMain.add("Servidor Nacional", jPanelSpecialChars);
        //=========================================
        //this.setVisible(true);
    }
}
