/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * StartUpPage.java
 *
 * Created on Nov 25, 2012, 12:46:44 PM
 */

package utme;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import java.util.Set;

/**
 *
 * @author ADmin
 */
public class StartUpPage extends javax.swing.JFrame
{
    private CardLayout card;
    private int tracker= 1;
    private Desktop desktop = null;
    //private char esc = '\n';

    /** Creates new form StartUpPage */
    public StartUpPage() {
        initComponents();
        Image icon = new ImageIcon(StartUpPage.class.getResource("images/bulb.gif")).getImage();
        setIconImage(icon);
        browser.setEnabled(false);
        if (Desktop.isDesktopSupported()) {
            desktop = Desktop.getDesktop();
             if (desktop.isSupported(Desktop.Action.BROWSE))
             browser.setEnabled(true);
        }
        setLocationRelativeTo(null);
        setChangingPanel();
    }
    private void setSelectedButtonColor()
    {

        setAllBackToDefault();
        if(tracker == 1)
        {
            button1.setForeground(Color.red);
        }
        else if(tracker == 2)
        {
            button2.setForeground(Color.red);
        }
        else if(tracker == 3)
        {
            button3.setForeground(Color.red);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        browser = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        changingPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        takeExam = new javax.swing.JMenu();
        takeStandardExam = new javax.swing.JMenuItem();
        takeCustomizedExam = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        content = new javax.swing.JMenu();
        aboutStandardExam = new javax.swing.JMenuItem();
        aboutCustomizedExam = new javax.swing.JMenuItem();
        aboutOthers = new javax.swing.JMenuItem();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UTMESOFT BY ITCOLONY");
        setBackground(new java.awt.Color(255, 204, 0));
        setForeground(new java.awt.Color(255, 204, 0));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 204, 0));
        mainPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0), new java.awt.Color(51, 0, 0))));
        mainPanel.setFont(new java.awt.Font("Tahoma", 1, 12));

        button2.setBackground(new java.awt.Color(255, 204, 0));
        button2.setText("TAKE A STANDARD EXAM");
        button2.setBorder(null);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(255, 204, 0));
        button3.setText("TAKE A CUSTOMIZED EXAM");
        button3.setBorder(null);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(255, 204, 0));
        button1.setText("ABOUT THE SOFTWARE");
        button1.setBorder(null);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Software designed and developed by");

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("IT COLONY");

        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Email: zakariyahsoroye@itcolonyweb.com");

        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Telephone: 08076318561");

        browser.setBackground(new java.awt.Color(255, 204, 0));
        browser.setFont(new java.awt.Font("Tahoma", 1, 12));
        browser.setForeground(new java.awt.Color(102, 0, 102));
        browser.setText("<html>Website: <u><i>www.itcolonyweb.com</i></u>");
        browser.setActionCommand("<html>Website: <i>zz</i>");
        browser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        browser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(button3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addGap(59, 59, 59))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(browser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(78, 78, 78))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel2)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        mainPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button1, button2, button3});

        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(browser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button1, button2, button3});

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18));
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("WELCOME TO UTME SOFT");

        changingPanel.setOpaque(false);

        javax.swing.GroupLayout changingPanelLayout = new javax.swing.GroupLayout(changingPanel);
        changingPanel.setLayout(changingPanelLayout);
        changingPanelLayout.setHorizontalGroup(
            changingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );
        changingPanelLayout.setVerticalGroup(
            changingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        file.setText("File");

        takeExam.setText("Take Exam");

        takeStandardExam.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        takeStandardExam.setText("Standard Exam");
        takeStandardExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeStandardExamActionPerformed(evt);
            }
        });
        takeExam.add(takeStandardExam);

        takeCustomizedExam.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        takeCustomizedExam.setText("Cusomized Exam");
        takeCustomizedExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeCustomizedExamActionPerformed(evt);
            }
        });
        takeExam.add(takeCustomizedExam);

        file.add(takeExam);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        jMenuBar1.add(file);

        help.setText("Help");

        content.setText("Content");

        aboutStandardExam.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        aboutStandardExam.setText("About Standard Exam");
        aboutStandardExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutStandardExamActionPerformed(evt);
            }
        });
        content.add(aboutStandardExam);

        aboutCustomizedExam.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        aboutCustomizedExam.setText("About Customized Exam");
        aboutCustomizedExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutCustomizedExamActionPerformed(evt);
            }
        });
        content.add(aboutCustomizedExam);

        aboutOthers.setText("Others");
        aboutOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutOthersActionPerformed(evt);
            }
        });
        content.add(aboutOthers);

        help.add(content);

        about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        help.add(about);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void takeStandardExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeStandardExamActionPerformed
        // TODO add your handling code here:
        card.show(changingPanel, "stan");
        tracker = 2;
        setSelectedButtonColor();
    }//GEN-LAST:event_takeStandardExamActionPerformed

    private void takeCustomizedExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeCustomizedExamActionPerformed
        // TODO add your handling code here:
        card.show(changingPanel, "cus");
        tracker = 3;
        setSelectedButtonColor();
    }//GEN-LAST:event_takeCustomizedExamActionPerformed

    private void aboutOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutOthersActionPerformed
        // TODO add your handling code here:
       Utility.paintAboutPage(AboutPages.About, new JFrame(), true);
    }//GEN-LAST:event_aboutOthersActionPerformed

    private void aboutCustomizedExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutCustomizedExamActionPerformed
        // TODO add your handling code here:
       Utility.paintAboutPage(AboutPages.CustomizedExam, new JFrame(), true);
    }//GEN-LAST:event_aboutCustomizedExamActionPerformed

    private void aboutStandardExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutStandardExamActionPerformed
        // TODO add your handling code here:
        Utility.paintAboutPage(AboutPages.StandardExam, new JFrame(), true);
    }//GEN-LAST:event_aboutStandardExamActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        card.show(changingPanel, "about");
        tracker = 1;
        setSelectedButtonColor();
}//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        card.show(changingPanel, "cus");
        tracker = 3;
        setSelectedButtonColor();
}//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        card.show(changingPanel, "stan");
        tracker = 2;
        setSelectedButtonColor();
}//GEN-LAST:event_button2ActionPerformed

    private void browserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browserActionPerformed
        // TODO add your handling code here:
         URI uri = null;
        try {
            uri = new URI("http://www.itcolonyweb.com");
            desktop.browse(uri);
        } catch(IOException ioe) {
            System.out.println("The system cannot find the " + uri +
                " file specified");
            //ioe.printStackTrace();
        } catch(URISyntaxException use) {
            System.out.println("Illegal character in path");
            //use.printStackTrace();
        }
    }//GEN-LAST:event_browserActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
        Utility.paintAboutPage(AboutPages.About, new JFrame(), true);
    }//GEN-LAST:event_aboutActionPerformed

    /**
    * @param args the command line arguments
    */
    /*public static void main(String args[]) {
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
               trayIcon.displayMessage("UTMESOFT","Taking Education to your doorstep", TrayIcon.MessageType.INFO);
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
    }|*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem aboutCustomizedExam;
    private javax.swing.JMenuItem aboutOthers;
    private javax.swing.JMenuItem aboutStandardExam;
    private javax.swing.JButton browser;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JPanel changingPanel;
    private javax.swing.JMenu content;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenu help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem takeCustomizedExam;
    private javax.swing.JMenu takeExam;
    private javax.swing.JMenuItem takeStandardExam;
    // End of variables declaration//GEN-END:variables

    private void setChangingPanel()
    {
        setSelectedButtonColor();
        card = new CardLayout();
        changingPanel.setLayout(card);
        Customizer cus = new Customizer();
        aboutTheSoftware abouter = new aboutTheSoftware();
        standardized stan = new standardized();
        changingPanel.add(abouter, "about");
        changingPanel.add(stan, "stan");
        changingPanel.add(cus, "cus");
    }

    private void setAllBackToDefault() {
        button1.setForeground(Color.black);
        button2.setForeground(Color.black);
        button3.setForeground(Color.black);
    }

}
