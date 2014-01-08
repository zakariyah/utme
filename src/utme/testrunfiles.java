/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utme;

/**
 *
 * @author zakariyah
 */
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.*;
public class testrunfiles extends JFrame{

    /**
     * @param args the command line arguments
     */
    private JButton but = new JButton("next");
    private JButton bute = new JButton("previous");
    private CardLayout card = new CardLayout();
    private JPanel pan = new JPanel();
    private final int number = 150;
    public testrunfiles()
    {
        setLayout(new BorderLayout());
       pan.setLayout(card);
       Question questions[]  = new Question[number];
        QuestionPanel [] pans = new  QuestionPanel[number];
        for(int i = 0; i < pans.length; i ++)
        {
            questions[i] = new Question("g" + (i+1) + ".txt");
            if(questions[i].getNoOfOptions() != 4)
            {
                JOptionPane.showMessageDialog(null,"na here" + (i + 1));
            }
            pans[i] = new QuestionPanel(questions[i], i+ 1);
            pan.add(pans[i], ""+i);
        }
        but.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ed)
            {
                card.next(pan);
            }
        });
        bute.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ed)
            {
                card.previous(pan);
            }
        }
        );
        add(pan);
        add(but, BorderLayout.NORTH);
        add(bute, BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        testrunfiles frame = new testrunfiles();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
