/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AboutDialog.java
 *
 * Created on Nov 27, 2012, 6:40:22 AM
 */

package utme;

import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author ADmin
 */
public class AboutDialog extends javax.swing.JDialog {
    private URL Url;

    /** Creates new form AboutDialog */
    public AboutDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(new Color(255,204,0));
        setLocationRelativeTo(null);
        setPages();
    }
    private void setPages()
    {
    Url = About.class.getResource("about.html");
        if (Url != null) {
    try {
        pages.setPage(Url);
    } catch (IOException e) {
        System.err.println("Attempted to read a bad URL: " +Url );
    }
} else {
    System.err.println("Couldn't find file: ");
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

        jScrollPane2 = new javax.swing.JScrollPane();
        abouttree = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        pages = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HELP");
        setBackground(new java.awt.Color(255, 204, 0));
        setResizable(false);

        abouttree.setBackground(new java.awt.Color(204, 204, 204));
        abouttree.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        abouttree.setForeground(new java.awt.Color(255, 153, 0));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("About");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Types of Exam");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Standard Exam");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Customized Exam");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Software Actions");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Subject Buttons");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Next");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Previous");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Submit");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Review");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Take Same Exam");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Take Another Exam");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Exit");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        abouttree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        abouttree.setOpaque(false);
        abouttree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                abouttreeValueChanged(evt);
            }
        });
        abouttree.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                abouttreeAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(abouttree);

        pages.setBackground(new java.awt.Color(255, 204, 0));
        pages.setBorder(null);
        pages.setEditable(false);
        pages.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        pages.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(pages);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abouttreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_abouttreeValueChanged
        // TODO add your handling code here:
        String helpURL = "about.html";
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                abouttree.getLastSelectedPathComponent();

        if (node == null) {
            return ;
        }
        String nodeInfo = node.toString();
        System.out.println(nodeInfo);
        //nodeInfo.replaceAll("\\w", "");
        if (node.isLeaf()) {
            String UrlString = AboutPages.getCorrespondingHtmlPage(nodeInfo);
            displayURL(UrlString);
        } else {
            displayURL(helpURL);
        }
    }//GEN-LAST:event_abouttreeValueChanged

    private void abouttreeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_abouttreeAncestorAdded
        // TODO add your handling code here:
}//GEN-LAST:event_abouttreeAncestorAdded

    /**
    * @param args the command line arguments
    */
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AboutDialog dialog = new AboutDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }*/

     private void displayURL(String UrlString) {
             Url = About.class.getResource(UrlString);
        if (Url != null) {
    try {
        pages.setPage(Url);
    } catch (IOException e) {
        System.err.println("Attempted to read a bad URL: " +Url );
    }
} else {
    System.err.println("Couldn't find file: ");
}

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree abouttree;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JEditorPane pages;
    // End of variables declaration//GEN-END:variables

     public void showParticularPage(AboutPages about)
    {
        String UrlOfPage = about.getHtmlPage();
        displayURL(UrlOfPage);
    }
}
