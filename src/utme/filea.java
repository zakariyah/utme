/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utme;

/**
 *
 * @author zakariyah
 */
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.*;
public class filea {
    private static String  all [] = new String[7];
   private static String namer;
    public static String[] openall(String name)
    {
        namer = name;
        try {
            ZipFile zipfile = new ZipFile("wxyz");
            ZipEntry zipentry = zipfile.getEntry(name);
            InputStream input = zipfile.getInputStream(zipentry);
            InputStreamReader reader = new InputStreamReader(input);
            Scanner scanner = new Scanner(reader);
            for(int i = 0; i <all.length; i++)
            {
                all[i] = scanner.nextLine();
            }
        } catch (IOException ex) {
            System.out.println(namer);
            Logger.getLogger(filea.class.getName()).log(Level.SEVERE, null, ex);
        }
        return all;
    }
}
