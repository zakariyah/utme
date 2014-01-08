package utme;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BUSIRYOR
 */
public class QuestionInfo 
{
    private int noOfSubjects, noOfQuestionsPerSubject;
    private String nameOfSubjects[];
    private int time;
    private String nameOfStudent;
    public QuestionInfo(int noOfSubjects,int  noOfQuestionsPerSubject,String [] nameOfSubjects, int time, String nameOfStudent)
    {
        this.nameOfSubjects = nameOfSubjects;
        this.noOfQuestionsPerSubject = noOfQuestionsPerSubject;
        this.noOfSubjects = noOfSubjects;
        this.time = time;
        this.nameOfStudent = nameOfStudent;
    }
    public String[] getNameOfSubjects()
    {
        return nameOfSubjects;
    }
    public String getNameOfStudent()
    {
        return nameOfStudent;
    }
    public  int getNoOfSubjects()
    {
        return noOfSubjects;
    }
    public int getNoOfQuestionsPerSubject()
    {
        return noOfQuestionsPerSubject;
    }
    public int getTime()
    {
        return time;
    }
}
