import com.physix.lab.PhysixLabWindow;
import com.physix.lab.StaticInfo;

import javax.swing.*;

/**
 * Created by arch on 11/28/15.
 */
public class Main {


    public static void main(String args[]) {

        System.out.println(StaticInfo.logotype);
        System.out.println(StaticInfo.generateInfoBox());
        JFrame window = new PhysixLabWindow();
        window.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        window.setVisible (true);
    }
}
