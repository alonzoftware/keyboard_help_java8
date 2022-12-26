package KeyboardHelp;
import com.apple.eawt.Application;
import javax.swing.*;

public class MainFrame extends JFrame {

    //MAIN WINDOW
    public MainFrame() {
        basicFrameConfiguration();
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
}
