/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kari7.seconddegreefunction;
import java.io.PrintStream;
import java.util.Locale;

/**
 *
 * @author mario
 */
public class SecondDegreeFunction extends javax.swing.JFrame {

    /**
     * Creates new form SecondDegreeFunction
     */
    public SecondDegreeFunction() {
        initComponents();
        lbl_delta.setVisible(false);
        lbl_xv.setVisible(false);
        lbl_yv.setVisible(false);
        lbl_sit_a.setVisible(false);
        lbl_sit_b.setVisible(false);
        lbl_sit_c.setVisible(false);
        lbl_sit_delta.setVisible(false);
        lbl_val_one.setVisible(false);
        lbl_val_two.setVisible(false);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_ax = new javax.swing.JSpinner();
        txt_bx = new javax.swing.JSpinner();
        txt_cx = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_calc = new javax.swing.JButton();
        lbl_delta = new javax.swing.JLabel();
        lbl_xv = new javax.swing.JLabel();
        lbl_yv = new javax.swing.JLabel();
        lbl_sit_a = new javax.swing.JLabel();
        lbl_sit_b = new javax.swing.JLabel();
        lbl_sit_c = new javax.swing.JLabel();
        lbl_sit_delta = new javax.swing.JLabel();
        lbl_val_one = new javax.swing.JLabel();
        lbl_val_two = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txt_ax.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txt_axStateChanged(evt);
            }
        });

        txt_bx.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txt_bxStateChanged(evt);
            }
        });

        txt_cx.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txt_cxStateChanged(evt);
            }
        });

        jLabel1.setText("Ax²:");

        jLabel2.setText("Bx:");

        jLabel3.setText("C:");

        jLabel4.setText("X頂点:");

        jLabel5.setText("Y頂点：");

        jLabel6.setText("デルタ：");

        jLabel7.setText("状況「A」：");

        jLabel8.setText("状況「B」：");

        jLabel9.setText("状況「C」：");

        jLabel10.setText("状況「デルタ」：");

        jLabel11.setText("X1行");

        jLabel12.setText("X2行:");

        btn_calc.setText("計算して！");
        btn_calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcActionPerformed(evt);
            }
        });

        lbl_delta.setText("0");

        lbl_xv.setText("0");

        lbl_yv.setText("0");

        lbl_sit_a.setText("Nil.");

        lbl_sit_b.setText("Nil.");

        lbl_sit_c.setText("Nil.");

        lbl_sit_delta.setText("Nil.");

        lbl_val_one.setText("0");

        lbl_val_two.setText("0");

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 0, 36)); // NOI18N
        jLabel13.setText("二次関数");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(117, 117, 117)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_val_two)
                                    .addComponent(lbl_val_one)
                                    .addComponent(lbl_sit_delta)
                                    .addComponent(lbl_sit_c)
                                    .addComponent(lbl_sit_b)
                                    .addComponent(lbl_sit_a)
                                    .addComponent(lbl_yv)
                                    .addComponent(lbl_xv)
                                    .addComponent(lbl_delta)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_calc, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_ax, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_bx, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_cx, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel13)))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txt_bx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_cx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbl_delta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_xv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_yv))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbl_sit_a))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbl_sit_b))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbl_sit_c))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbl_sit_delta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbl_val_one))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbl_val_two))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btn_calc)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcActionPerformed
        // TODO add your handling code here:
        int ax = Integer.parseInt(txt_ax.getValue().toString());
        int bx = Integer.parseInt(txt_bx.getValue().toString());
        int cx = Integer.parseInt(txt_cx.getValue().toString());
            
        if (ax != 0) {
            btn_calc.setEnabled(true);
        
        try {
            PrintStream out = new PrintStream(System.out, true, "UTF-8");
            Locale locale;
            locale = new Locale("ja", "");
            


            double delt, xvidros, yamero, xline, xline2; //Funções
            String sit_a, sit_b, sit_c, sit_delt;

            //Variáveis matemáticas
            delt = Math.pow(bx, 2) - (4 * ax * cx);
            xvidros = (-1d * bx) / (2d * ax);
            yamero = (-1d * delt) / (4d * ax);
            xline = ((-1d * bx) + Math.sqrt(delt))/(2d * ax);
            xline2 = ((-1d * bx) - Math.sqrt(delt))/(2d * ax);


            //Situações de Texto
            // Situação de Ax²
            if (ax > 0) {
                sit_a = "Parabola facing up";
            } else if (ax == 0) {
                sit_a = "Not Second Degree Equation";
            } else {
                sit_a = "Parabola facing down";
            }

            //Situação de Bx
            if (bx > 0) {
                sit_b = "The curvature of the parabola will rise";
            } else if (bx == 0) {
                sit_b = "There will be no inclinations";
            } else {
                sit_b = "The curvature of the parabola will descend";
            }

            //Situação de C
             if (cx > 0) {
                sit_c = "The parabola will cut the Y axis above the origin.";
            } else if (cx == 0) {
                sit_c = "The parabola will cut the Y axis at the origin, i.e. point (0,0).";
            } else {
                sit_c = "The parabola will cut the Y axis below the origin.";
            }

            //Situação de Delta
              if (delt > 0) {
                sit_delt = "Two distinct real roots and the parabola intersects the x-axis at two different points";
            } else if (delt == 0) {
                sit_delt = "Two equal real roots and the parabola is tangent to the x axis";
            } else {
                sit_delt = "There are no real roots and the parabola does not intersect the x axis";
            }       

            lbl_delta.setVisible(true);
            lbl_xv.setVisible(true);
            lbl_yv.setVisible(true);
            lbl_sit_a.setVisible(true);
            lbl_sit_b.setVisible(true);
            lbl_sit_c.setVisible(true);
            lbl_sit_delta.setVisible(true);
            lbl_val_one.setVisible(true);
            lbl_val_two.setVisible(true);

            lbl_delta.setText(String.format("%.0f", delt));
            lbl_xv.setText(String.format("%.3f", xvidros));
            lbl_yv.setText(String.format("%.3f", yamero));
            lbl_sit_a.setText(sit_a);
            lbl_sit_b.setText(sit_b);
            lbl_sit_c.setText(sit_c);
            lbl_sit_delta.setText(sit_delt);
            lbl_val_one.setText(String.format("%.3f", xline));
            lbl_val_two.setText(String.format("%.3f", xline2));
        }
        catch (Exception e) {
              e.printStackTrace();
        }
        } else {
            btn_calc.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_btn_calcActionPerformed

    private void txt_axStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txt_axStateChanged
        // TODO add your handling code here:
        int ax = Integer.parseInt(txt_ax.getValue().toString());
        btn_calc.setEnabled(true);
    }//GEN-LAST:event_txt_axStateChanged

    private void txt_bxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txt_bxStateChanged
        int bx = Integer.parseInt(txt_bx.getValue().toString());
       // TODO add your handling code here:
    }//GEN-LAST:event_txt_bxStateChanged

    private void txt_cxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txt_cxStateChanged
        // TODO add your handling code here:
        int cx = Integer.parseInt(txt_cx.getValue().toString()); 
    }//GEN-LAST:event_txt_cxStateChanged

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
            java.util.logging.Logger.getLogger(SecondDegreeFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondDegreeFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondDegreeFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondDegreeFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondDegreeFunction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_delta;
    private javax.swing.JLabel lbl_sit_a;
    private javax.swing.JLabel lbl_sit_b;
    private javax.swing.JLabel lbl_sit_c;
    private javax.swing.JLabel lbl_sit_delta;
    private javax.swing.JLabel lbl_val_one;
    private javax.swing.JLabel lbl_val_two;
    private javax.swing.JLabel lbl_xv;
    private javax.swing.JLabel lbl_yv;
    private javax.swing.JSpinner txt_ax;
    private javax.swing.JSpinner txt_bx;
    private javax.swing.JSpinner txt_cx;
    // End of variables declaration//GEN-END:variables
}
