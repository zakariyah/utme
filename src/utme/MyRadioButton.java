/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utme;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author ADmin
 */
public class MyRadioButton extends JPanel{

    @Override
     public void paintComponent( Graphics g )
    {
        super.paintComponent(g);
        //int lengthOfText = text.length();
        g.setColor(Color.red);
        g.drawLine(5, 0,10 , getHeight());
        g.drawLine(10, getHeight(), 40, 0);
        //g.fillRect(lengthOfText, 0, 40, 5);

    }

}
