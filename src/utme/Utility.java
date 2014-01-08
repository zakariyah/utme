package utme;
import java.awt.Font;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BUSIRYOR
 */
public class Utility {
    //private static Set<About> about = new HashSet<About>();
    private static AboutDialog aboutUs;
    private static final URL imageURL = Utility.class.getResource("images/bulb.gif");
    private static final Icon icon = new ImageIcon(imageURL);
    private String [] settled = {"eng", "maths", "gov","phy", "bio", "chem" };
    public static Icon getIcon()
    {
        return icon;
    }
   
    public static String getSubjectCode(String subject)
    {
        String code = "";
        if(subject.equals("English"))
        {
         code  = "en";   
        }
 else if(subject.equals("Mathematics"))
        {
         code  = "m";
      }
        else if(subject.equals("Physics"))
        {
            code  =  "p";
        }
        else if(subject.equals("Chemistry"))
        {
            code  = "c";
        }
        else if(subject.equals("Biology"))
        {
            code  =  "b";
        }
        else if(subject.equals("Economics"))
        {
            code  =  "e";
        }
        else if(subject.equals("Government"))
        {
            code  =  "g";
        }
     return code;
    //private String []subjects = {"Mathematics", "Physics", "Biology", "Chemistry", "Economics","Government"};
}
    public static void area(JTextArea comp)
    {
         comp.setEditable(false);
         comp.setLineWrap(true);
         comp.setWrapStyleWord(true);
         comp.setFont(new Font("Serif", Font.BOLD, 16));
    }
    public static int getAvailableNumberOfQuestions(String subject)
    {
        int code;
        if(subject.equals("English"))
        {
         code  = 216;
        }
 else if(subject.equals("Mathematics"))
        {
         code  = 100;
      }
        else if(subject.equals("Physics"))
        {
            code  =  130;
        }
        else if(subject.equals("Chemistry"))
        {
            code  = 99;
        }
        else if(subject.equals("Biology"))
        {
            code  =  120;
        }
        else if(subject.equals("Economics"))
        {
            code  =  186;
        }
        else if(subject.equals("Government"))
        {
            code  =  150;
        }
     else
     code = 1000;
     return code;
    //private String []subjects = {"Mathematics", "Physics", "Biology", "Chemistry", "Economics","Government"};
}
public static  int availableNumberOfComprehension()
{
    return 9;
}
public static int getAvailableNumberOfQuestionTypeForEnglish()
    {
    return 2;
}
public static String englishtypes(int i)
{
    String type = "";
            if(i == 1)
            {
                type = "LexisAndStructure/";
            }
            else if(i ==2)
            {
                type = "VowelAndConsonant/";
            }
            
    return type;
}
    public static String[]  getSubjectTypes()
    {
        String subjectTypes[] = {"Mathematics", "Physics", "Biology", "Chemistry", "Economics", "Government"};
        return subjectTypes;
    }
    /*private static About getAbout()
    {
         /*if(about.isEmpty())
         {
      
        about.add(aboutUs);
         }
              aboutUs = new About();
        return aboutUs;
    }*/
    public static void paintAboutPage(AboutPages aboutPage, JFrame frame, boolean modal)
    {
         aboutUs = new AboutDialog(frame, modal);
         aboutUs.showParticularPage(aboutPage);
         aboutUs.setAlwaysOnTop(true);
          aboutUs.setVisible(true);
          
       //System.out.println("I was called");
    }
    public static void createHelp(JFrame frame, boolean modal)
    {
              aboutUs = new AboutDialog(frame, modal);
    }
}
