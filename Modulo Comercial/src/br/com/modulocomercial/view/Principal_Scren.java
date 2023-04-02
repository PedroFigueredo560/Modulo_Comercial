package br.com.modulocomercial.view;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author joanb
 */

import javax.swing.JFrame;

public class Principal_Scren extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Principal
     */
    public Principal_Scren() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanelLS = new javax.swing.JPanel();
        jLabelMD = new javax.swing.JLabel();
        txtlogin = new javax.swing.JFormattedTextField();
        jPasswordFieldPassLS = new javax.swing.JPasswordField();
        LOGINBUTTON = new javax.swing.JButton();
        CANCELBUTTON = new javax.swing.JButton();
        jCheckBoxEmployee = new javax.swing.JCheckBox();
        jCheckBoxUser = new javax.swing.JCheckBox();
        jLabelUserLS = new javax.swing.JLabel();
        jLabelPasswordLS = new javax.swing.JLabel();
        jLabelNEWRegister = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(33, 54, 76));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 470));
        jPanel1.setLayout(null);

        jPanelLS.setBackground(new java.awt.Color(15, 27, 54));

        jLabelMD.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        jLabelMD.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMD.setText("MÓDULO COMERCIAL");

        javax.swing.GroupLayout jPanelLSLayout = new javax.swing.GroupLayout(jPanelLS);
        jPanelLS.setLayout(jPanelLSLayout);
        jPanelLSLayout.setHorizontalGroup(
            jPanelLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLSLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelMD)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jPanelLSLayout.setVerticalGroup(
            jPanelLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLSLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabelMD)
                .addContainerGap())
        );

        jPanel1.add(jPanelLS);
        jPanelLS.setBounds(0, 10, 610, 50);

        txtlogin.setBackground(new java.awt.Color(51, 51, 51));
        txtlogin.setForeground(new java.awt.Color(255, 255, 255));
        txtlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginActionPerformed(evt);
            }
        });
        jPanel1.add(txtlogin);
        txtlogin.setBounds(360, 160, 169, 32);

        jPasswordFieldPassLS.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordFieldPassLS.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordFieldPassLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPassLSActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordFieldPassLS);
        jPasswordFieldPassLS.setBounds(360, 240, 170, 30);

        LOGINBUTTON.setBackground(new java.awt.Color(51, 51, 51));
        LOGINBUTTON.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        LOGINBUTTON.setForeground(new java.awt.Color(102, 204, 0));
        LOGINBUTTON.setText("Login");
        LOGINBUTTON.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGINBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINBUTTONActionPerformed(evt);
            }
        });
        jPanel1.add(LOGINBUTTON);
        LOGINBUTTON.setBounds(360, 300, 80, 32);

        CANCELBUTTON.setBackground(new java.awt.Color(51, 51, 51));
        CANCELBUTTON.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        CANCELBUTTON.setForeground(new java.awt.Color(204, 0, 0));
        CANCELBUTTON.setText("Cancel");
        CANCELBUTTON.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CANCELBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELBUTTONActionPerformed(evt);
            }
        });
        jPanel1.add(CANCELBUTTON);
        CANCELBUTTON.setBounds(450, 300, 80, 32);

        jCheckBoxEmployee.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jCheckBoxEmployee.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxEmployee.setText("Funcionário");
        jCheckBoxEmployee.setBorder(null);
        jCheckBoxEmployee.setContentAreaFilled(false);
        jCheckBoxEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxEmployeeMouseClicked(evt);
            }
        });
        jCheckBoxEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxEmployee);
        jCheckBoxEmployee.setBounds(330, 430, 120, 20);

        jCheckBoxUser.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jCheckBoxUser.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxUser.setText("Usuário");
        jCheckBoxUser.setContentAreaFilled(false);
        jCheckBoxUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxUserMouseClicked(evt);
            }
        });
        jCheckBoxUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUserActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxUser);
        jCheckBoxUser.setBounds(470, 430, 100, 20);

        jLabelUserLS.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelUserLS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUserLS.setText("User:");
        jPanel1.add(jLabelUserLS);
        jLabelUserLS.setBounds(360, 120, 170, 32);

        jLabelPasswordLS.setFont(new java.awt.Font("Unispace", 0, 16)); // NOI18N
        jLabelPasswordLS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPasswordLS.setText("Password:");
        jPanel1.add(jLabelPasswordLS);
        jLabelPasswordLS.setBounds(360, 200, 170, 32);

        jLabelNEWRegister.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNEWRegister.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        jLabelNEWRegister.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNEWRegister.setText("Click here for create a new account:");
        jLabelNEWRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelNEWRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNEWRegisterMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelNEWRegister);
        jLabelNEWRegister.setBounds(320, 400, 260, 15);

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SP_TECH-removebg-preview.png"))); // NOI18N
        jLabelLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabelLogo.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabelLogo.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabelLogo);
        jLabelLogo.setBounds(-20, 90, 410, 330);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo-azul-do-gradiente-de-luxo-abstrato-liso-azul-escuro-com-vinheta-preta-studio-banner.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(7, 60, 590, 420);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 600, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloginActionPerformed

    private void CANCELBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELBUTTONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CANCELBUTTONActionPerformed

    private void jLabelNEWRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNEWRegisterMouseClicked

        
    }//GEN-LAST:event_jLabelNEWRegisterMouseClicked

    private void jPasswordFieldPassLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPassLSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPassLSActionPerformed

    private void LOGINBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINBUTTONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGINBUTTONActionPerformed

    private void jCheckBoxEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxEmployeeActionPerformed

    private void jCheckBoxUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxUserActionPerformed

    private void jCheckBoxEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxEmployeeMouseClicked
        Register_ScreenFunc rgf = new Register_ScreenFunc();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jCheckBoxEmployeeMouseClicked

    private void jCheckBoxUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxUserMouseClicked
        Register_ScreenUser rgf = new Register_ScreenUser();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();                    
    }//GEN-LAST:event_jCheckBoxUserMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal_Scren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Scren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Scren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Scren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Scren().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CANCELBUTTON;
    private javax.swing.JButton LOGINBUTTON;
    private javax.swing.JCheckBox jCheckBoxEmployee;
    private javax.swing.JCheckBox jCheckBoxUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMD;
    private javax.swing.JLabel jLabelNEWRegister;
    private javax.swing.JLabel jLabelPasswordLS;
    private javax.swing.JLabel jLabelUserLS;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLS;
    private javax.swing.JPasswordField jPasswordFieldPassLS;
    private javax.swing.JFormattedTextField txtlogin;
    // End of variables declaration//GEN-END:variables
}
