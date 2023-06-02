package br.com.modulocomercial.cliente.view;

import br.com.modulocomercial.venda.model.Venda;
import br.com.modulocomercial.cliente.model.Cliente;
import br.com.modulocomercial.infrastructure.service.FacadeInstance;
import br.com.modulocomercial.view.Principal_Screen_NEW;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author joanb
 */


public class Profile_Screen_NEW extends javax.swing.JFrame {
    Cliente user = new Cliente();
    Cliente cli = Principal_Screen_NEW.clien;
    
    public static int points;
    
    int idInt = Long.valueOf(cli.getId()).intValue();
    List<Cliente> clientes = FacadeInstance.getInstance().getAllClientes();
    List<Venda> vendas = FacadeInstance.getInstance().findByClienteVenda(idInt);
    
    
    /**
     * Creates new form Profile_Screen
     */
    public Profile_Screen_NEW() {
        initComponents();
        this.setLocationRelativeTo(null);
            lblName.setText(cli.getNome());
            lblEmail.setText(cli.getEmail());
            preencherTabela(vendas);
            lblPoints.setText(String.valueOf(cli.getPontos()));
    }

    private void preencherTabela(List<Venda> itens) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Products");
        modelo.addColumn("Stock");
        modelo.addColumn("Price/Purchase");

        for (Venda venda : itens) {
            Object[] linha = new Object[4];
            linha[0] = venda.getNomeProduto();
            linha[1] = venda.getQuantidade();
            linha[2] = venda.getTotal();
            modelo.addRow(linha);
        }

        jTablePS.setModel(modelo);
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLS = new javax.swing.JPanel();
        jLabelUserProfilePS = new javax.swing.JLabel();
        jPromotionPS = new javax.swing.JScrollPane();
        jTablePS = new javax.swing.JTable();
        ReturnButtonPS = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelIconProfile = new javax.swing.JLabel();
        jLabelPoints = new javax.swing.JLabel();
        lblPoints = new javax.swing.JLabel();
        jLabelUserPS = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabelEmailPS = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jButtonEditProfilePS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Profile Screen");
        setMinimumSize(new java.awt.Dimension(785, 540));
        getContentPane().setLayout(null);

        jPanelLS.setBackground(new java.awt.Color(15, 27, 54));
        jPanelLS.setMinimumSize(new java.awt.Dimension(730, 500));
        jPanelLS.setPreferredSize(new java.awt.Dimension(730, 500));

        jLabelUserProfilePS.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUserProfilePS.setFont(new java.awt.Font("Impact", 0, 22)); // NOI18N
        jLabelUserProfilePS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUserProfilePS.setText("USER PROFILE");

        javax.swing.GroupLayout jPanelLSLayout = new javax.swing.GroupLayout(jPanelLS);
        jPanelLS.setLayout(jPanelLSLayout);
        jPanelLSLayout.setHorizontalGroup(
            jPanelLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUserProfilePS)
                .addContainerGap(669, Short.MAX_VALUE))
        );
        jPanelLSLayout.setVerticalGroup(
            jPanelLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUserProfilePS)
                .addContainerGap(466, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelLS);
        jPanelLS.setBounds(0, 0, 790, 60);

        jPromotionPS.setBackground(new java.awt.Color(51, 51, 51));
        jPromotionPS.setForeground(new java.awt.Color(51, 51, 51));
        jPromotionPS.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jPromotionPS.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jPromotionPS.setVerifyInputWhenFocusTarget(false);

        jTablePS.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jTablePS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PRODUCTS", "STOCK", "PRICE/PURCHASE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePS.setGridColor(new java.awt.Color(0, 0, 0));
        jTablePS.setMaximumSize(new java.awt.Dimension(800, 360));
        jTablePS.setMinimumSize(new java.awt.Dimension(800, 360));
        jTablePS.setPreferredSize(new java.awt.Dimension(700, 360));
        jTablePS.setRowHeight(30);
        jTablePS.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTablePS.setShowGrid(true);
        jPromotionPS.setViewportView(jTablePS);

        getContentPane().add(jPromotionPS);
        jPromotionPS.setBounds(380, 80, 370, 350);

        ReturnButtonPS.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ReturnButtonPS.setForeground(new java.awt.Color(204, 0, 0));
        ReturnButtonPS.setText("RETURN");
        ReturnButtonPS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReturnButtonPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonPSActionPerformed(evt);
            }
        });
        getContentPane().add(ReturnButtonPS);
        ReturnButtonPS.setBounds(660, 450, 90, 32);

        jPanel1.setBackground(new java.awt.Color(244, 245, 241));

        jLabelIconProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/modulocomercial/imagens/5340287_man_people_person_user_users_icon.png"))); // NOI18N

        jLabelPoints.setFont(new java.awt.Font("Impact", 0, 22)); // NOI18N
        jLabelPoints.setForeground(new java.awt.Color(15, 27, 54));
        jLabelPoints.setText("POINTS:");

        lblPoints.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        lblPoints.setForeground(new java.awt.Color(15, 27, 54));
        lblPoints.setText("000");

        jLabelUserPS.setFont(new java.awt.Font("Impact", 0, 22)); // NOI18N
        jLabelUserPS.setForeground(new java.awt.Color(15, 27, 54));
        jLabelUserPS.setText("NAME:");

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName.setText("NAME PROFILE HERE");
        lblName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelEmailPS.setFont(new java.awt.Font("Impact", 0, 22)); // NOI18N
        jLabelEmailPS.setForeground(new java.awt.Color(15, 27, 54));
        jLabelEmailPS.setText("EMAIL:");

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("EMAIL PROFILE HERE");
        lblEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonEditProfilePS.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButtonEditProfilePS.setForeground(new java.awt.Color(0, 102, 153));
        jButtonEditProfilePS.setText("EDIT PROFILE");
        jButtonEditProfilePS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditProfilePS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditProfilePSMouseClicked(evt);
            }
        });
        jButtonEditProfilePS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditProfilePSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEditProfilePS, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelUserPS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelEmailPS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelIconProfile)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addComponent(lblPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(442, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIconProfile, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabelPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUserPS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmailPS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonEditProfilePS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnButtonPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonPSActionPerformed
        Principal_Screen_NEW rgf = new Principal_Screen_NEW();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ReturnButtonPSActionPerformed

    private void jButtonEditProfilePSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditProfilePSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditProfilePSActionPerformed

    private void jButtonEditProfilePSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditProfilePSMouseClicked
        EditProfile_Screen_NEW rgf = new EditProfile_Screen_NEW();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonEditProfilePSMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile_Screen_NEW().setVisible(true);            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReturnButtonPS;
    private javax.swing.JButton jButtonEditProfilePS;
    private javax.swing.JLabel jLabelEmailPS;
    private javax.swing.JLabel jLabelIconProfile;
    private javax.swing.JLabel jLabelPoints;
    private javax.swing.JLabel jLabelUserPS;
    private javax.swing.JLabel jLabelUserProfilePS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLS;
    private javax.swing.JScrollPane jPromotionPS;
    private javax.swing.JTable jTablePS;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPoints;
    // End of variables declaration//GEN-END:variables
}
