/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

/**
 *
 * @author dex
 */
public class MyWindow extends javax.swing.JFrame {

    /**
     * Creates new form MyWindow
     */
    public MyWindow() {
        initComponents();
    }
    private API resSubsets=new API();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCB1 = new javax.swing.JCheckBox();
        jTF1 = new javax.swing.JTextField();
        jTF2 = new javax.swing.JTextField();
        jTF3 = new javax.swing.JTextField();
        jTF4 = new javax.swing.JTextField();
        jTF5 = new javax.swing.JTextField();
        jCB2 = new javax.swing.JCheckBox();
        jCB3 = new javax.swing.JCheckBox();
        jCB4 = new javax.swing.JCheckBox();
        jCB5 = new javax.swing.JCheckBox();
        jTF6 = new javax.swing.JTextField();
        jTF7 = new javax.swing.JTextField();
        jTF8 = new javax.swing.JTextField();
        jTF9 = new javax.swing.JTextField();
        jTF10 = new javax.swing.JTextField();
        jCB6 = new javax.swing.JCheckBox();
        jCB7 = new javax.swing.JCheckBox();
        jCB8 = new javax.swing.JCheckBox();
        jCB9 = new javax.swing.JCheckBox();
        jCB10 = new javax.swing.JCheckBox();
        jTF11 = new javax.swing.JTextField();
        jCB11 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        getSetsButton = new javax.swing.JButton();
        getNearestNumButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA1 = new javax.swing.JTextArea();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Test sets programm");
        setResizable(false);

        jCB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB1ActionPerformed(evt);
            }
        });

        jTF1.setEditable(false);
        jTF1.setText("Enter set");
        jTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF1ActionPerformed(evt);
            }
        });
        jTF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF1KeyTyped(evt);
            }
        });

        jTF2.setEditable(false);
        jTF2.setText("Enter set");
        jTF2.setToolTipText("");
        jTF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF2KeyTyped(evt);
            }
        });

        jTF3.setEditable(false);
        jTF3.setText("Enter set");
        jTF3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF3KeyTyped(evt);
            }
        });

        jTF4.setEditable(false);
        jTF4.setText("Enter set");
        jTF4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF4KeyTyped(evt);
            }
        });

        jTF5.setEditable(false);
        jTF5.setText("Enter set");
        jTF5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF5KeyTyped(evt);
            }
        });

        jCB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB2ActionPerformed(evt);
            }
        });

        jCB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB3ActionPerformed(evt);
            }
        });

        jCB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB4ActionPerformed(evt);
            }
        });

        jCB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB5ActionPerformed(evt);
            }
        });

        jTF6.setEditable(false);
        jTF6.setText("Enter set");
        jTF6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF6KeyTyped(evt);
            }
        });

        jTF7.setEditable(false);
        jTF7.setText("Enter set");
        jTF7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF7KeyTyped(evt);
            }
        });

        jTF8.setEditable(false);
        jTF8.setText("Enter set");
        jTF8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF8KeyTyped(evt);
            }
        });

        jTF9.setEditable(false);
        jTF9.setText("Enter set");
        jTF9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF9KeyTyped(evt);
            }
        });

        jTF10.setEditable(false);
        jTF10.setText("Enter set");
        jTF10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF10KeyTyped(evt);
            }
        });

        jCB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB6ActionPerformed(evt);
            }
        });

        jCB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB7ActionPerformed(evt);
            }
        });

        jCB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB8ActionPerformed(evt);
            }
        });

        jCB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB9ActionPerformed(evt);
            }
        });

        jCB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB10ActionPerformed(evt);
            }
        });

        jTF11.setEditable(false);
        jTF11.setText("Enter number");

        jCB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCB4)
                            .addComponent(jCB5))
                        .addComponent(jCB3)
                        .addComponent(jCB2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jCB1))
                    .addComponent(jCB11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTF11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTF2)
                                .addComponent(jTF3)
                                .addComponent(jTF4)
                                .addComponent(jTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCB6)
                            .addComponent(jCB7)
                            .addComponent(jCB8)
                            .addComponent(jCB9)
                            .addComponent(jCB10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTF6)
                            .addComponent(jTF7)
                            .addComponent(jTF8)
                            .addComponent(jTF9)
                            .addComponent(jTF10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB1)
                    .addComponent(jTF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB6)
                    .addComponent(jTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB2)
                    .addComponent(jTF7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB3)
                    .addComponent(jTF8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB4)
                    .addComponent(jTF9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB5)
                    .addComponent(jTF10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB11)))
        );

        jLabel1.setText("Results");
        jLabel1.setToolTipText("");

        getSetsButton.setText("Get sets");
        getSetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSetsButtonActionPerformed(evt);
            }
        });

        getNearestNumButton.setText("Get nearest num");
        getNearestNumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNearestNumButtonActionPerformed(evt);
            }
        });

        jTA1.setEditable(false);
        jTA1.setColumns(20);
        jTA1.setRows(5);
        jScrollPane1.setViewportView(jTA1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getSetsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getNearestNumButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(getSetsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(getNearestNumButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF1ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jTF1ActionPerformed

    private void getSetsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSetsButtonActionPerformed
            jTA1.setText("");  
            if(!emptyOrNotEditableFileds(jTFBox())){
                resSubsets.setDefaultSets(fieldsSurvey(jTFBox()));            
               
                int c=0;
                for (Map.Entry<Integer,TreeSet<Integer>> entry : resSubsets.getSubSets().entrySet()) {
                    if (c!=0) jTA1.append("u");
                    jTA1.append("["+entry.getValue().first().toString() + "," + entry.getValue().last().toString() + "]");          
                    c++;
                } 
            }else{jTA1.setText("Fields is empty "+"\n");        }
    }//GEN-LAST:event_getSetsButtonActionPerformed

    private void jCB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB1ActionPerformed
        ifif(jCB1,jTF1);       
    }//GEN-LAST:event_jCB1ActionPerformed

    private void jCB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB2ActionPerformed
        ifif(jCB2,jTF2);         
    }//GEN-LAST:event_jCB2ActionPerformed

    private void jCB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB3ActionPerformed
         ifif(jCB3,jTF3);          
    }//GEN-LAST:event_jCB3ActionPerformed

    private void jCB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB4ActionPerformed
        ifif(jCB4,jTF4);    
    }//GEN-LAST:event_jCB4ActionPerformed

    private void jCB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB5ActionPerformed
         ifif(jCB5,jTF5);   
    }//GEN-LAST:event_jCB5ActionPerformed

    private void jCB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB11ActionPerformed
        ifif(jCB11,jTF11);   
    }//GEN-LAST:event_jCB11ActionPerformed

    private void jCB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB6ActionPerformed
         ifif(jCB6,jTF6);  
    }//GEN-LAST:event_jCB6ActionPerformed

    private void jCB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB7ActionPerformed
         ifif(jCB7,jTF7);  
    }//GEN-LAST:event_jCB7ActionPerformed

    private void jCB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB8ActionPerformed
          ifif(jCB8,jTF8);   
    }//GEN-LAST:event_jCB8ActionPerformed

    private void jCB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB9ActionPerformed
         ifif(jCB9,jTF9);  
    }//GEN-LAST:event_jCB9ActionPerformed

    private void jCB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB10ActionPerformed
         ifif(jCB10,jTF10);    
    }//GEN-LAST:event_jCB10ActionPerformed

    private void jTF1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF1KeyTyped
        keyTyped(evt,jTF1); 
    }//GEN-LAST:event_jTF1KeyTyped

    private void jTF5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF5KeyTyped
        keyTyped(evt, jTF5);    
    }//GEN-LAST:event_jTF5KeyTyped

    private void jTF2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF2KeyTyped
         keyTyped(evt, jTF2); 
    }//GEN-LAST:event_jTF2KeyTyped

    private void jTF3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF3KeyTyped
         keyTyped(evt, jTF3);        
    }//GEN-LAST:event_jTF3KeyTyped

    private void jTF4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF4KeyTyped
         keyTyped(evt, jTF4); 
    }//GEN-LAST:event_jTF4KeyTyped

    private void jTF6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF6KeyTyped
         keyTyped(evt, jTF6); 
    }//GEN-LAST:event_jTF6KeyTyped

    private void jTF7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF7KeyTyped
         keyTyped(evt, jTF7); 
    }//GEN-LAST:event_jTF7KeyTyped

    private void jTF8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF8KeyTyped
         keyTyped(evt, jTF8); 
    }//GEN-LAST:event_jTF8KeyTyped

    private void jTF9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF9KeyTyped
         keyTyped(evt, jTF9); 
    }//GEN-LAST:event_jTF9KeyTyped

    private void jTF10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF10KeyTyped
         keyTyped(evt, jTF10); 
    }//GEN-LAST:event_jTF10KeyTyped

    private void getNearestNumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNearestNumButtonActionPerformed

    if((jTF11.isEditable())&&(!jTF11.getText().isEmpty())){
        resSubsets.setNumber(Integer.valueOf(jTF11.getText()));
           if(!emptyOrNotEditableFileds(jTFBox())){
                jTA1.append(String.valueOf("\n" + "nearest num is " + resSubsets.getNearestnumber()));
           }else{jTA1.append("The default set was used [0,1]" + "\n" + "nearest num is " + resSubsets.getNearestnumber());      }
         }else jTA1.append("'Enter number' field is emty" +"\n");
    }//GEN-LAST:event_getNearestNumButtonActionPerformed

     
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getNearestNumButton;
    private javax.swing.JButton getSetsButton;
    private javax.swing.JCheckBox jCB1;
    private javax.swing.JCheckBox jCB10;
    private javax.swing.JCheckBox jCB11;
    private javax.swing.JCheckBox jCB2;
    private javax.swing.JCheckBox jCB3;
    private javax.swing.JCheckBox jCB4;
    private javax.swing.JCheckBox jCB5;
    private javax.swing.JCheckBox jCB6;
    private javax.swing.JCheckBox jCB7;
    private javax.swing.JCheckBox jCB8;
    private javax.swing.JCheckBox jCB9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTA1;
    private javax.swing.JTextField jTF1;
    private javax.swing.JTextField jTF10;
    private javax.swing.JTextField jTF11;
    private javax.swing.JTextField jTF2;
    private javax.swing.JTextField jTF3;
    private javax.swing.JTextField jTF4;
    private javax.swing.JTextField jTF5;
    private javax.swing.JTextField jTF6;
    private javax.swing.JTextField jTF7;
    private javax.swing.JTextField jTF8;
    private javax.swing.JTextField jTF9;
    // End of variables declaration//GEN-END:variables

 private void sout(){
        System.out.println("test string");
    }
 
 private void ifif(JCheckBox jCB, JTextField jTF){
     if (jCB.isSelected()){
         jTF.setEditable(true); jTF.setText("");
     }
        else  {jTF.setEditable(false);jTF.setText("[x1,x2] or [[x1,x2]u[x3,x4]]");} 
 }
public void keyTyped(KeyEvent e, JTextField jTF) {
    jTF.setForeground(Color.BLACK);
   }

 private  boolean checkIn(String s){
       
        Pattern p = Pattern.compile("(\\[\\u002D?\\d*\\,\\u002D?\\d*\\]\\u0075?\\[?\\u002D?\\d*?\\,?\\u002D?\\d*?\\]?)");  
        Matcher m = p.matcher(s);       
        return m.matches();
        
    }
 
 private JTextField[] jTFBox(){
    JTextField[] box = new JTextField[10];
    box[0] = jTF1; box[1] = jTF2;box[2] = jTF3;box[3] = jTF4;box[4] = jTF5;
    box[5] = jTF6; box[6] = jTF7;box[7] = jTF8;box[8] = jTF9;box[9] = jTF10;   
        
 return box;
 }
 
 private TreeSet myParser(String s){
     
     TreeSet<Integer> treeset = new TreeSet<>();
     
    if(s.contains("u")){
        String[] subSets = s.split("(\\u0075)");
        for (int i = 0; i < subSets.length; i++) {
            String[] parts = subSets[i].split("\\s|\\[|\\,|\\]");
            if(Integer.valueOf(parts[2])>Integer.valueOf(parts[1])){
                for (int j = Integer.valueOf(parts[1]); j <= Integer.valueOf(parts[2]); j++) {
                    treeset.add(j);
                }
            }else{
                jTA1.append("первый элемент подмножества больше второго" + "\n");
                return treeset;
            }
        }
    } else {
        String[] parts = s.split("\\s|\\[|\\,|\\]");
        
        if(Integer.valueOf(parts[2])>Integer.valueOf(parts[1])){
            for (int j = Integer.valueOf(parts[1]); j <= Integer.valueOf(parts[2]); j++) {
                treeset.add(j);    
            } 
        }else{
                jTA1.append("первый элемент подмножества больше второго" + "\n");
                return treeset;
            }
    }
     return treeset;
 
 }
 
 private HashMap<Integer,TreeSet> fieldsSurvey(JTextField[] container){
     HashMap<Integer,TreeSet> sets = new HashMap<>();
        for (int i = 0; i < container.length; i++) {
         if(container[i].isEditable() ) {
             if(checkIn(container[i].getText())){       
                sets.put(i,myParser(container[i].getText()));
             }else{
                 jTA1.append("Неверный формат в "+(i+1) +" текстовом поле" + "\n");
                 container[i].setForeground(Color.RED);
             }
         }
     }
       for (Map.Entry<Integer,TreeSet> entry: sets.entrySet()) {
           System.out.println(entry.getValue());
     }
     return sets;
 
 }
 
 private boolean  emptyOrNotEditableFileds(JTextField[] container)    {
     
     int flag=0;
      for (int i = 0; i < container.length; i++) {
          if((!container[i].isEditable()) || ((container[i].getText().isEmpty()))){
              flag++;
          } 
      }
      if(flag==10) return true;
      else return false;
 }
 
 
 
}