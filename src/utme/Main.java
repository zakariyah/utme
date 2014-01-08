/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utme;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SplashScreen;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author zakariyah
 */
public class Main {
    private static SplashScreen mySplash;
    private static Double splashTextArea;
    private static Double splashProgressArea;
   private static Graphics2D splashGraphics;
   private static Font font;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       splashInit();           // initialize splash overlay drawing parameters
       appInit();              // simulate what an application would do
                                // before starting
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 try {
            // Set System L&F
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
    }
    catch (UnsupportedLookAndFeelException e) {
       // handle exception
    }
    catch (ClassNotFoundException e) {
       // handle exception
    }
    catch (InstantiationException e) {
       // handle exception
    }
    catch (IllegalAccessException e) {
       // handle exception
    }
                    createTrayIcon();
                new StartUpPage().setVisible(true);
                //Utility.createHelp();
            }

    private void createTrayIcon() {
     if (!SystemTray.isSupported())
        {
            System.out.println("SystemTray is not supported");
            return;
        }
        final PopupMenu popup = new PopupMenu();
        final TrayIcon trayIcon =
                new TrayIcon(createImage("images/bulb.gif", "tray icon"));
        final SystemTray tray = SystemTray.getSystemTray();
        MenuItem aboutItem = new MenuItem("About UTMESOFT");
        //CheckboxMenuItem cb1 = new CheckboxMenuItem("Set auto size");
        //CheckboxMenuItem cb2 = new CheckboxMenuItem("Set tooltip");
        Menu helpMenu = new Menu("Help");
        MenuItem standardExamItem = new MenuItem("Standard Exam");
        MenuItem customizedExamItem = new MenuItem("Customized Exam");
        MenuItem instructionItem = new MenuItem("Instructions");
        helpMenu.add(standardExamItem);
        helpMenu.add(customizedExamItem);
        helpMenu.addSeparator();
        helpMenu.add(instructionItem);
        MenuItem exitItem = new MenuItem("Exit");
        popup.add(aboutItem);
        popup.add(helpMenu);
        popup.addSeparator();
        popup.add(exitItem);
        trayIcon.setPopupMenu(popup);
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("UTMESOFT by ITcolony");
        trayIcon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               //trayIcon.displayMessage("UTMESOFT","Taking Education to your doorstep", TrayIcon.MessageType.INFO);
            }
        });
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               System.exit(1);
            }
        });
        standardExamItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Utility.paintAboutPage(AboutPages.StandardExam, new JFrame(), true);
            }
        });
        customizedExamItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Utility.paintAboutPage(AboutPages.CustomizedExam, new JFrame(), true);
            }
        });
         aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Utility.paintAboutPage(AboutPages.About, new JFrame(), true);
            }
        });
         instructionItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Utility.paintAboutPage(AboutPages.Instruction, new JFrame(), true);
            }
        });

        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
            return;
        }

            }

            private Image createImage(String path, String description)
            {
        URL imageURL = StartUpPage.class.getResource(path);

        if (imageURL == null) {
            System.err.println("Resource not found: " + path);
            return null;
        } else {
            return (new ImageIcon(imageURL, description)).getImage();
        }

            }
        });
    }
        private static void splashInit()
    {
        mySplash = SplashScreen.getSplashScreen();
        if (mySplash != null)
        {   // if there are any problems displaying the splash this will be null
            Dimension ssDim = mySplash.getSize();
            int height = ssDim.height;
            int width = ssDim.width;
            // stake out some area for our status information
            splashTextArea = new Rectangle2D.Double(width* .40, height*0.75, width * .85, 15.);
            splashProgressArea = new Rectangle2D.Double(0, height*.7, width, 3 );

            // create the Graphics environment for drawing status info
            splashGraphics = mySplash.createGraphics();
            font = new Font("Dialog", Font.ITALIC + Font.BOLD, 10);
            splashGraphics.setFont(font);

            // initialize the status info
            splashText("initializing, please wait...");
            splashProgress(0);
        }
    }
public static void splashProgress(int pct)
    {
        if (mySplash != null && mySplash.isVisible())
        {

            // Note: 3 colors are used here to demonstrate steps
            // erase the old one
            splashGraphics.setPaint(Color.LIGHT_GRAY);
            splashGraphics.fill(splashProgressArea);

            // draw an outline
            splashGraphics.setPaint(Color.BLUE);
            splashGraphics.draw(splashProgressArea);

            // Calculate the width corresponding to the correct percentage
            int x = (int) splashProgressArea.getMinX();
            int y = (int) splashProgressArea.getMinY();
            int wid = (int) splashProgressArea.getWidth();
            int hgt = (int) splashProgressArea.getHeight();

            int doneWidth = Math.round(pct*wid/100.f);
            doneWidth = Math.max(0, Math.min(doneWidth, wid-1));  // limit 0-width

            // fill the done part one pixel smaller than the outline
            splashGraphics.setPaint(new Color(116, 28, 116));
            splashGraphics.fillRect(x, y+1, doneWidth, hgt-1);

            // make sure it's displayed
            mySplash.update();
        }
    }
private static void appInit()
    {
    String [] message = {"Loading English", "Loading Mathematics", "Loading Chemistry"};
        for(int i=1;i<=10;i++)
        {
            int pctDone = i * 10;
            //splashText("Doing task #" + i);
            splashProgress(pctDone);

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                // ignore it
            }
        }
    }

    private static void splashText(String string) {
        splashGraphics.drawString(string, (float)splashTextArea.x, (float)splashTextArea.y);
    }

}
