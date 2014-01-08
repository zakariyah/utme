/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utme;

/**
 *
 * @author ADmin
 */
public class ResultInfo
{
private int score;
private int[] scoresPerSubject;
private String[] nameOfSubjects;
private String name;
private int pscore;
private int total;
private  QuestionInfo qInfo;
public ResultInfo(int score,int pscore,int total, int[] scoresPerSubject, String name, String[] nameOfSubjects, QuestionInfo qInfo)
{
    this.score = score;
    this.nameOfSubjects = nameOfSubjects;
    this.scoresPerSubject =  scoresPerSubject;
    this.name = name;
    this.pscore = pscore;
    this.total = total;
    this.qInfo = qInfo;
}
public int getScore()
    {
    return score;
}
public int[] getScoresPerSubject()
    {
    return scoresPerSubject;
}
public String getName()
{
    return name;
}
public String[] getNameOfSubjects()
    {
    return nameOfSubjects;
}
public int getPscore()
    {
    return pscore;
}
public int getTotal()
    {
    return total;
}
public QuestionInfo getQuestionInfo()
    {
    return qInfo;
}
}
