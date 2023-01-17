
package oom_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomePage extends JFrame
{
    
     JLabel jLabel1;
     JButton jButton1;
     JLabel jLabel2;
     JLabel jLabel3;
     JLabel jLabel4;
     JButton jButton2;
     JLabel jLabel5;
    JLabel jLabel6;
     
     public HomePage() {
        
        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jButton2 = new JButton();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.YELLOW);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        jLabel1.setBackground(new Color(100, 240, 240));
        jLabel1.setFont(new Font("Times New Roman", 1, 48)); 
        jLabel1.setForeground(new Color(168, 0, 0));
        jLabel1.setText("SHAPIFY");
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 740, 140));

        jButton1.setBackground(new Color(204, 204, 255));
        jButton1.setFont(new Font("Rockwell", 1, 36)); 
        jButton1.setForeground(new Color(102, 102, 255));
        jButton1.setText("Click To Switch");
        
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 320, 80)); 

        jLabel2.setFont(new Font("Trebuchet MS", 3, 24)); 
        jLabel2.setForeground(new Color(0, 204, 204));
        jLabel2.setText("SHAPE TRANSITION");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 240, 60)); 

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 740, 40, 0)); 

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 730, 90, 0)); 

        jButton2.setBackground(new Color(204, 204, 255));
        jButton2.setFont(new Font("Rockwell", 1, 36)); 
        jButton2.setForeground(new Color(102, 102, 255));
        jButton2.setText("Click to Switch");
       
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 380, 340, 80));

        jLabel5.setFont(new Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel5.setForeground(new Color(0, 204, 204));
        jLabel5.setText("COLOR TRANSITION");
        jLabel5.setBackground(Color.YELLOW);
        //jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 260, 40));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1071, 370, 0, 20));

        pack();
       
    }
    
    private void jButton1ActionPerformed(ActionEvent evt) {                                         
        new Shapetransition().setVisible(true);
        
    }         

    private void jButton2ActionPerformed(ActionEvent evt) {                                         
        new Colortransition().setVisible(true);
        
    }                                        

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }
             
}
