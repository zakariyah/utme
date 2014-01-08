/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utme;

/**
 *
 * @author ADmin
 */
public enum AboutPages {
    About("About", "about.html"),
    SubjectButtons("Subject Buttons", "subjectButtons.html"),
 TypesofExam("Types of Exam", "typesOfExam.html"),
  StandardExam("Standard Exam", "standardExam.html"),
  CustomizedExam("Customized Exam", "customizedExam.html"),
 SoftwareActions("Software Actions", "softwareActions.html"),
 Next("Next", "next.html"),
 Previous("Previous", "previous.html"),
 Submit("Submit", "submit.html"),
  Review("Review", "review.html"),
  TakeSameExam("Take Same Exam", "takeSameExam.html"),
  TakeAnotherExam("Take Another Exam", "takeAnotherExam.html"),
  Print("Print", "print.html"),
  Exit("Exit", "exit.html"),
  Instruction("instruction", "instruction.html");

    private final String htmlPage,treeNodeValue ;
  AboutPages(String treeNodeValue, String htmlPage)
    {
      this.htmlPage = htmlPage;
      this.treeNodeValue = treeNodeValue;
  }
  public String getHtmlPage()
    {
      return htmlPage;
  }
  private String getTreeNodeValue()
    {
      return treeNodeValue;
  }
  public static String getCorrespondingHtmlPage(String treeNodeValue)
    {
      String html = "about.html";
        for(AboutPages about:AboutPages.values())
        {
            if(about.getTreeNodeValue().equals(treeNodeValue))
            {
                html = about.getHtmlPage();
             }
        }
        return html;
    }
}
