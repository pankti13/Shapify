
package oom_project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Colortransition extends JFrame {

    ShowRandomColor cc = new ShowRandomColor();
    String shape;
    
 JButton jButton1;
 JButton jButton2;
 JLabel jLabel1;
 JLabel jLabel2;
 JLabel jLabel3;
 JLabel jLabel4;
 JLabel jLabel5;
 JPanel jPanel1;
 JPanel jPanel2;
 JRadioButton jRadioButton1;
 JRadioButton jRadioButton2;
 JRadioButton jRadioButton3;
 JSpinner jSpinner1;
 JSpinner jSpinner2;
    
                       
    public Colortransition (){

        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jSpinner1 = new JSpinner();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jSpinner2 = new JSpinner();
        jPanel2 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();

       // setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.YELLOW);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new Font("Arial Black", 3, 36)); 
        jLabel1.setForeground(new Color(0, 102, 204));
        jLabel1.setText("COLOR TRANSITION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 56, 470, 60));

        jPanel1.setBackground(Color.YELLOW);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new Font("Arial Black", 3, 24)); 
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Choose Dimensions");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 30, 300, 44));

        jLabel3.setFont(new Font("Sitka Display", 1, 24)); 
        jLabel3.setForeground(new Color(153, 153, 255));
        jLabel3.setText("Choose Shape");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 260, 60));

        jRadioButton1.setText("RECTANGLE");
        jRadioButton1.setBackground(Color.YELLOW);
        jRadioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jRadioButton2.setText("OVAL");
        jRadioButton2.setBackground(Color.YELLOW);
        jRadioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jRadioButton3.setText("TRIANGLE");
        jRadioButton3.setBackground(Color.YELLOW);
        jRadioButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
      
        jLabel4.setFont(new Font("Sitka Display", 2, 24));
        jLabel4.setForeground(new Color(153, 153, 255));
        jLabel4.setText("Height");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, 40));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 120, -1));

        jLabel5.setFont(new Font("Sitka Display", 2, 24)); 
        jLabel5.setForeground(new Color(153, 153, 255));
        jLabel5.setText("Width");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 180, 40));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 460, 470));

        jButton1.setFont(new Font("Times New Roman", 3, 48)); 
        jButton1.setForeground(new Color(0, 204, 204));
        jButton1.setText("START");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new Font("Times New Roman", 3, 48));
        jButton2.setForeground(new Color(0, 204, 204));
        jButton2.setText("STOP");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setBackground(Color.YELLOW);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 280, 410));

        pack();
    }                        

     private void jRadioButton1ActionPerformed(ActionEvent evt) {                                              
     
        if(jRadioButton1.isSelected()){
            shape= "RECTANGLE";
        }   
    }
     
    private void jRadioButton2ActionPerformed(ActionEvent evt) {                                              
      
         if(jRadioButton2.isSelected()){
            shape= "OVAL";
        }
    }                                             

    private void jRadioButton3ActionPerformed(ActionEvent evt) {                                              
       
         if(jRadioButton3.isSelected()){
            shape= "TRIANGLE";
        }
    }                                             

   
    private void jButton1ActionPerformed(ActionEvent evt) {                                         
     
         int H = (Integer)(jSpinner1.getValue());
         int W = (Integer)(jSpinner2.getValue());
         
         cc.draw(shape,H,W);
        
    }                                        

    private void jButton2ActionPerformed(ActionEvent evt) {                                         
    
        cc.cancel();
        
    }                                        
    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colortransition().setVisible(true);
            }
        });
    }

                   
}

