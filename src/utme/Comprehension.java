/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**All comprehension passages must have only % questions attached to it
 *
 * @author ADmin
 */
public class Comprehension extends Question
{

    private String question, instruction;
    private String [] options;
    private int answer;
    private URL pathToPassage;
    private int numberInPanel;
    private Scanner input;
    private ArrayList<String> questionInfo;
    private int noOfOptions;
    private Iterator<String> iterator;
    public Comprehension(int comprehensionNumber, int questionNumberInPassage, int numberInPanel)
    {
        super();
        try {
            this.numberInPanel = numberInPanel;
            ZipFile zipfile = new ZipFile("wxyz");
            ZipEntry zipentry = zipfile.getEntry("Comprehension/en" + comprehensionNumber + questionNumberInPassage + ".txt");
            InputStream inputStream = zipfile.getInputStream(zipentry);
            InputStreamReader reader = new InputStreamReader(inputStream);
            getScanner(reader);
            setURL(comprehensionNumber);
            setInstruction(numberInPanel);
            setQuestionInfo();
            setAll(questionInfo.size());
        } catch (IOException ex) {
            Logger.getLogger(Comprehension.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private void getScanner(InputStreamReader reader) {
            input = new Scanner(new BufferedReader(reader));
        }

    
    
    private void setURL(int cN)
    {
      pathToPassage =   Comprehension.class.getResource(
                                "Comprehension/en" + cN + ".txt.html");
    }
    public URL getURL()
    {
        return pathToPassage;
    }

    private void setInstruction(int numberInPanel)
    {
     int first = (numberInPanel - 1) / 5 + 1;
     int last = first + 4;
     instruction = "Use the information in the  passage to answer questions " + first + " - " + last;

    }
     private void setQuestionInfo()
    {
        questionInfo = new ArrayList<String>();
        int i =0;
        while(input.hasNextLine())
        {
            if(i > 6)
                break;
            questionInfo.add(input.nextLine());
            i++;
        }
    }
     private void setAll(int size)
    {
            noOfOptions = size -2;
            setQOA(noOfOptions);
    }

    private void setQOA(int noOfOption)
    {
            //setInstruction();
            setQuestions();
            setOptions(noOfOption);
            setAnswer();
    }

    private void setQuestions()
    {
            iterator = questionInfo.iterator();
        question = (String)iterator.next();
    }

    private void setOptions(int noOfOption)
    {
     options = new String[noOfOption];
     for(int i = 0; i < options.length; i++)
     {
         options[i] = (String)iterator.next();
     }
    }

    private void setAnswer()
    {
        answer = Integer.parseInt((String)iterator.next());
    }
    @Override
    public String getInstruction()
    {
        return instruction;
    }
    @Override
    public String getQuestion()
    {
        return question;
    }
    @Override
    public String[] getOptions()
    {
        return options;
    }
    @Override
    public int getAnswer()
    {
       // System.out.println(answer);
        return answer;
    }
    @Override
    public int getNoOfOptions()
    {
        return noOfOptions;
    }


}
