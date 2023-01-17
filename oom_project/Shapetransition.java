
package oom_project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Shapetransition extends JFrame {
   
    JButton jB1;
    JButton jB2;
    JColorChooser jColorChooser1;
    JLabel jLabel1;
    JLabel jLabel2;
    JLabel jLabel3;
    JLabel jLabel4;
    JLabel jLabel5;
    JPanel jPanel1;
    JPanel jPanel2;
    JSpinner jSpinner1;
    JSpinner jSpinner2;
  
    
    ShowRandomShapes s = new ShowRandomShapes();
    
    public Shapetransition() {

        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jSpinner1 = new JSpinner();
        jSpinner2 = new JSpinner();
        jPanel2 = new JPanel();
        jB1 = new JButton();
        jB2 = new JButton();
        jColorChooser1 = new JColorChooser();
        jLabel5 = new JLabel();

        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.YELLOW);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new Color(102, 255, 102));
        jLabel1.setFont(new Font("Arial Black", 3, 36));
        jLabel1.setForeground(new Color(0, 102, 204));
        jLabel1.setText("SHAPE TRANSITION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 530, 110));

         jPanel1.setBackground(Color.YELLOW);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new Font("Arial Black", 3, 24)); 
        jLabel2.setText("ENTER DIMENSIONS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 350, 40));

        jLabel3.setFont(new Font("PMingLiU-ExtB", 3, 24));
        jLabel3.setText("Height");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 40));

        jLabel4.setFont(new Font("PMingLiU-ExtB", 3, 24));
        jLabel4.setText("Width");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 30));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 80, -1));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 400, 210));

        jB1.setFont(new Font("Impact", 1, 48)); 
        jB1.setForeground(new Color(102, 204, 255));
        jB1.setText("START");
        
        jB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB2.setFont(new Font("Impact", 0, 48)); 
        jB2.setForeground(new Color(102, 204, 255));
        jB2.setText("STOP");
        jB2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setBackground(Color.YELLOW);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jB1, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jB2, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jB1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 900, 190));
        getContentPane().add(jColorChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 480, 240));

        jLabel5.setFont(new Font("Arial Black", 3, 24)); // NOI18N
        jLabel5.setText("CHOOSE COLOR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 370, 50));

        pack();
    }


    private void jB1ActionPerformed(ActionEvent evt) {
       
         int H = (Integer)(jSpinner1.getValue());
         int W = (Integer)(jSpinner2.getValue());
             s.draw(jColorChooser1.getColor(), H, W);
             
    }

    private void jB2ActionPerformed(ActionEvent evt) {
       
          s.cancel();
    }

}

