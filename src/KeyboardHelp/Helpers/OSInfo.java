package KeyboardHelp.Helpers;

import com.apple.eawt.Application;

public class OSInfo {
    public static String getPlatform(){
        String os = System.getProperty("os.name");
        if (os.contains("Mac")) {
            return "Mac";
        } else if (os.contains("Windows")) {
            return "Windows";
        } else {
            return "Linux";
        }
    }
}
