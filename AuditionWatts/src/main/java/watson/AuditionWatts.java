/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watson;

/**
 *
 * @author mario
 */
public class AuditionWatts extends javax.swing.JFrame {

    /**
     * Creates new form AuditionWatts
     */
    public AuditionWatts() {
        initComponents();
        pan_intdeb.setVisible(false);
        pan_debint.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pan_intdeb = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_base = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pot = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbl_value = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_comp = new javax.swing.JLabel();
        btn_convert_1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_intdeb = new javax.swing.JButton();
        btn_debint = new javax.swing.JButton();
        pan_debint = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_dec = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbl_pot = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_convert_2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pan_intdeb.setEnabled(false);

        jLabel1.setText("Valor da Intensidade: ");

        txt_base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_baseActionPerformed(evt);
            }
        });

        jLabel2.setText("* 10 ^");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Decibel:");

        lbl_value.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_value.setText("0");

        jLabel4.setText("Compara????o: ");

        lbl_comp.setText("Nenhuma compara????o feita.");

        btn_convert_1.setText("Converter");
        btn_convert_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_convert_1ActionPerformed(evt);
            }
        });

        jLabel8.setText("W/m??");

        javax.swing.GroupLayout pan_intdebLayout = new javax.swing.GroupLayout(pan_intdeb);
        pan_intdeb.setLayout(pan_intdebLayout);
        pan_intdebLayout.setHorizontalGroup(
            pan_intdebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_intdebLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_intdebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_intdebLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_convert_1))
                    .addGroup(pan_intdebLayout.createSequentialGroup()
                        .addGroup(pan_intdebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pan_intdebLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_value))
                            .addGroup(pan_intdebLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(txt_base, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_pot, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE))
                    .addGroup(pan_intdebLayout.createSequentialGroup()
                        .addGroup(pan_intdebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lbl_comp))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pan_intdebLayout.setVerticalGroup(
            pan_intdebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_intdebLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_intdebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_pot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addGroup(pan_intdebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_value))
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_comp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_convert_1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_intdeb.setText("Intensidade / Decibel");
        btn_intdeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_intdebActionPerformed(evt);
            }
        });

        btn_debint.setText("Decibel / Intensidade");
        btn_debint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_debintActionPerformed(evt);
            }
        });

        jLabel5.setText("Decibel:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("I = 10");

        lbl_pot.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("W/m??");

        btn_convert_2.setText("Converter");
        btn_convert_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_convert_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan_debintLayout = new javax.swing.GroupLayout(pan_debint);
        pan_debint.setLayout(pan_debintLayout);
        pan_debintLayout.setHorizontalGroup(
            pan_debintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_debintLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pan_debintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_debintLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_pot)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(pan_debintLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dec, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_debintLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_convert_2)
                .addContainerGap())
        );
        pan_debintLayout.setVerticalGroup(
            pan_debintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_debintLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pan_debintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_dec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pan_debintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_debintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addComponent(lbl_pot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btn_convert_2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pan_intdeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_intdeb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_debint))
                    .addComponent(pan_debint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_intdeb)
                    .addComponent(btn_debint))
                .addGap(14, 14, 14)
                .addComponent(pan_debint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan_intdeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_debintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_debintActionPerformed
        // TODO add your handling code here:
        pan_intdeb.setVisible(false);
        pan_debint.setVisible(true);
    }//GEN-LAST:event_btn_debintActionPerformed

    private void btn_intdebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_intdebActionPerformed
        // TODO add your handling code here:
        pan_intdeb.setVisible(true);
        pan_debint.setVisible(false);
    }//GEN-LAST:event_btn_intdebActionPerformed

    private void btn_convert_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_convert_2ActionPerformed
        // TODO add your handling code here:
        double ctext = Double.parseDouble(txt_dec.getText());
        
        double drib = (ctext/10) - 12;
        
        lbl_pot.setText(String.format("%.3f", drib));
        
    }//GEN-LAST:event_btn_convert_2ActionPerformed

    private void btn_convert_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_convert_1ActionPerformed
        // TODO add your handling code here:
        double atext = Double.parseDouble(txt_base.getText());
        double btext = Double.parseDouble(txt_pot.getText());
        double era = 10;

        double ninguemMenos = atext*Math.pow(era,btext);
        double ninguemMais = Math.pow(era,-12);
        double queOLendario = ninguemMenos/ninguemMais;
        double rezendeEvil = era * Math.log10(queOLendario);

        if (rezendeEvil < 10) {
            lbl_comp.setText("Cochicho");
        } else if (10 > rezendeEvil || rezendeEvil < 20) {
            lbl_comp.setText("Conversa normal");
        } else if (20 > rezendeEvil || rezendeEvil < 30) {
            lbl_comp.setText("Biblioteca");
        } else if (30 > rezendeEvil || rezendeEvil < 40) {
            lbl_comp.setText("M??sica baixa");
        } else if (40 > rezendeEvil || rezendeEvil < 50) {
            lbl_comp.setText("Escrit??rio");
        } else if (50 > rezendeEvil || rezendeEvil < 60) {
            lbl_comp.setText("Conversa Alta");
        } else if (60 > rezendeEvil || rezendeEvil < 70) {
            lbl_comp.setText("Motor de Caminh??o");
        } else if (70 > rezendeEvil || rezendeEvil < 80) {
            lbl_comp.setText("Tr??nsito movimentado");
        } else if (80 > rezendeEvil || rezendeEvil < 90) {
            lbl_comp.setText("Britadeira");
        } else if (90 > rezendeEvil || rezendeEvil < 100) {
            lbl_comp.setText("Buzina");
        } else if (100 > rezendeEvil || rezendeEvil < 110) {
            lbl_comp.setText("Show de Rock");
        } else if (110 > rezendeEvil || rezendeEvil < 120) {
            lbl_comp.setText("Avi??o decolando");
        } else if (120 > rezendeEvil || rezendeEvil < 203) {
            lbl_comp.setText("Evite a qualquer custo");
        } else if (203 > rezendeEvil || rezendeEvil < 205) {
            lbl_comp.setText("Saturn V");
        } else if (205 > rezendeEvil || rezendeEvil < 220) {
            lbl_comp.setText("Meteoritos");
        } else if (221 > rezendeEvil || rezendeEvil < 223) {
            lbl_comp.setText("Bomba Tsar");
        } else if (223 > rezendeEvil || rezendeEvil < 275) {
            lbl_comp.setText("Exterm??nio da Humanidade");
        } else if (275 > rezendeEvil || rezendeEvil < 319) {
            lbl_comp.setText("Estrelas");
        } else if (320 > rezendeEvil || rezendeEvil < 322) {
            lbl_comp.setText("Estrela de N??utrons");
        } else if (322 > rezendeEvil || rezendeEvil < 500) {
            lbl_comp.setText("Desconhecido, mas poderoso");
        } else if (500 > rezendeEvil) {
            lbl_comp.setText("Colis??o de Buracos Negros");
        }

        lbl_value.setText(String.format("%.2f DB", rezendeEvil));
    }//GEN-LAST:event_btn_convert_1ActionPerformed

    private void txt_baseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_baseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_baseActionPerformed

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
            java.util.logging.Logger.getLogger(AuditionWatts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuditionWatts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuditionWatts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuditionWatts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuditionWatts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_convert_1;
    private javax.swing.JButton btn_convert_2;
    private javax.swing.JButton btn_debint;
    private javax.swing.JButton btn_intdeb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_comp;
    private javax.swing.JLabel lbl_pot;
    private javax.swing.JLabel lbl_value;
    private javax.swing.JPanel pan_debint;
    private javax.swing.JPanel pan_intdeb;
    private javax.swing.JTextField txt_base;
    private javax.swing.JTextField txt_dec;
    private javax.swing.JTextField txt_pot;
    // End of variables declaration//GEN-END:variables
}
