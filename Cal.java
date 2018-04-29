/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculate;

import javax.swing.JOptionPane;

/**
 *
 * @author Kasun
 */
public class Cal extends javax.swing.JFrame {

    /**
     * Creates new form Cal
     */
    public Cal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        firstNumber = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        secondNumber = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        answer = new javax.swing.JLabel();
        plus = new javax.swing.JButton();
        sub = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Calculator");

        firstNumber.setColumns(20);
        firstNumber.setRows(5);
        jScrollPane1.setViewportView(firstNumber);

        secondNumber.setColumns(20);
        secondNumber.setRows(5);
        jScrollPane2.setViewportView(secondNumber);

        jLabel1.setText("First Number");

        jLabel2.setText("Second number");

        answer.setFont(new java.awt.Font("Tekton Pro", 2, 18)); // NOI18N
        answer.setText("Answer is : ");

        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plus)
                        .addGap(37, 37, 37)
                        .addComponent(sub))
                    .addComponent(answer)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plus)
                    .addComponent(sub))
                .addGap(19, 19, 19)
                .addComponent(answer)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
         int number1,number2;
        try            
        {
           number1 = Integer.parseInt
                (this.firstNumber.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog
            (this,"Bad Message","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try            
        {
           number2 = Integer.parseInt
                (this.secondNumber.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog
            (this,"Bad Message","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int answer = number1 + number2;
        this.answer.setText("Answer is : "+answer);
    }//GEN-LAST:event_plusActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        {
             int number1,number2;
        try            
        {
           number1 = Integer.parseInt
                (this.firstNumber.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog
            (this,"Bad Message","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try            
        {
           number2 = Integer.parseInt
                (this.secondNumber.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog
            (this,"Bad Message","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int answer = number1 - number2;
        this.answer.setText("Answer is : "+answer);
        }
    }//GEN-LAST:event_subActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answer;
    private javax.swing.JTextArea firstNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton plus;
    private javax.swing.JTextArea secondNumber;
    private javax.swing.JButton sub;
    // End of variables declaration//GEN-END:variables
}
