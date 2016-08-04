package jxbrowse;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
 
import javax.swing.*;
import java.awt.*;
 
public class GoogleMapsSample {
   public static void main(String[] args) {

 
       JFrame frame = new JFrame("helloworld");
       final Browser browser = new Browser();
       BrowserView browserView = new BrowserView(browser);
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frame.setSize(900, 500);
       frame.setLocationRelativeTo(null);
       frame.getContentPane().setLayout(new BorderLayout(0, 0));
       frame.add(browserView);
       JButton btnNewButton = new JButton("New button");
       frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
       frame.setVisible(true);
       
       browser.loadURL("D:\\WorkSpaceAll\\PercyWorkSpace\\jxbrowse\\internetexaple.html");
//       browser.loadURL("D:\\Desktop\\usbphp\\root\\internetexaple.html");
   }
}