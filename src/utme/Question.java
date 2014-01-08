package utme;
/*
 * This class creates a question with all its properties.
 *It also provides for four and five optioned questions
 */

/**
 *
 * @author BUSIRYOR
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.*;
public class Question {
    /* instance variables of the class. Declared private to add encapsulation. 
     * Names are quite intuitive */
    private String instruction;
    private String question;
    private ArrayList<String> questionInfo;
    private int answer;
    private String [ ]options;
    private Scanner input;
    private Iterator iterator;
    private int numberOfOptions;
    private String questionName = "";
    public Question()
    {
        
    }
    public Question(String qno)
    {
        try {
            questionName = qno;
            ZipFile zipfile = new ZipFile("wxyz");
            ZipEntry zipentry = zipfile.getEntry("Questions/" + questionName);
            InputStream inputStream = zipfile.getInputStream(zipentry);
            InputStreamReader reader = new InputStreamReader(inputStream);
            //getScanner(qno);
            getScanner(reader);
            setQuestionInfo();
            setAll(questionInfo.size());
        } catch (IOException ex) {
            Logger.getLogger(Question.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Question(String questionNumber, int questionType)
    {
        try {
            questionName = questionNumber;
            String type = Utility.englishtypes(questionType);
            ZipFile zipfile = new ZipFile("wxyz");
            ZipEntry zipentry = zipfile.getEntry("Questions/" + type + questionName);
            InputStream inputStream = zipfile.getInputStream(zipentry);
            InputStreamReader reader = new InputStreamReader(inputStream);
            //String path = type + questionNumber;
            //getScanner(path);
            getScanner(reader);
            setQuestionInfo();
            setAll(questionInfo.size());
        } catch (IOException ex) {
            Logger.getLogger(Question.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public   String getQuestionName()
    {
        return questionName;
    }
    private void getScanner(String qno)
            //private void getScanner(InputStreamReader qno)
    {
        try
        {
            input = new Scanner(new BufferedReader(new FileReader("Questions/" + qno)));
            //input = new Scanner(qno);
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(Question.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void getScanner(InputStreamReader reader)
    {

            input = new Scanner(reader);
            //input = new Scanner(qno);
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
            numberOfOptions = size -3;
            setIQOA(numberOfOptions);        
    }

    private void setIQOA(int noOfOption) 
    {
            setInstruction();
            setQuestions();
            setOptions(noOfOption);
            setAnswer();    
    }

    private void setInstruction() 
    {
        iterator = questionInfo.iterator();
        instruction = (String)iterator.next();
    }

    private void setQuestions() 
    {
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
    public String getInstruction()
    {
        return instruction;
    }
    public String getQuestion()
    {
        return question;
    }
    public String[] getOptions()
    {
        return options;
    }
    public int getAnswer()
    {
       // System.out.println(answer);
        return answer;
    }
    public int getNoOfOptions()
    {
        return numberOfOptions;
    }
}