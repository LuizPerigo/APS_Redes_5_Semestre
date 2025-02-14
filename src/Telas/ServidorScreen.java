/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import ClassesExec.InformacoesServidor;
import ClassesExec.ServidoresSockets;
import java.awt.Color;

/**
 *
 * @author Fer-san
 */
public class ServidorScreen extends javax.swing.JFrame {
    InformacoesServidor informacoesServidor;
    ServidoresSockets servidoresSockets;

    /**
     * Creates new form Servidor
     */
    protected Color escuro = new Color(31, 43, 171);
    protected Color claro = new Color(250, 204, 102);
    protected Color botao_claro = new Color(31, 135, 235);
    protected Color botao_escuro = new Color(255, 178, 39);
    protected Color text_escuro = new Color(255, 255, 255);
    protected Color text_claro = new Color(0, 0, 0);
    private static boolean clicou = false;
    public ServidorScreen(boolean clicou) {
        informacoesServidor = InformacoesServidor.getInstance();
        servidoresSockets = new ServidoresSockets();
        servidoresSockets.servidoresComecemAOuvir();
        initComponents();
        this.clicou = clicou;
        if(this.clicou){
            jPanel1.setBackground(escuro);
            jButton1.setBackground(botao_escuro);
            jLabel1.setForeground(text_escuro);
            jLabel2.setForeground(text_escuro);
            jLabel3.setForeground(text_escuro);
            jButton2.setBackground(escuro);
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/LampadaIcon30x30Branco.png")));
        }else{
            jPanel1.setBackground(claro);
            jButton1.setBackground(botao_claro);
            jLabel1.setForeground(text_claro);
            jLabel2.setForeground(text_claro);
            jLabel2.setForeground(text_claro);
            jButton2.setBackground(claro);
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/LampadaIcon30x30Preto.png")));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servidor");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ip público do servidor: " + informacoesServidor.getIpPublicoServidor());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ip local do servidor: " + informacoesServidor.getIpLocalServidor());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Servidor Ativo!");

        jButton1.setBackground(new java.awt.Color(31, 135, 235));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton1.setText("ENCERRAR");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/LogoLovelace-1.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 204, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/LampadaIcon30x30Preto.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.servidoresSockets.servidoresParemDeOuvir();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.servidoresSockets.servidoresParemDeOuvir();
        inicial init = new inicial(clicou);
        init.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.clicou = !this.clicou;
        if(this.clicou){
            jPanel1.setBackground(escuro);
            jButton1.setBackground(botao_escuro);
            jLabel1.setForeground(text_escuro);
            jLabel2.setForeground(text_escuro);
            jLabel3.setForeground(text_escuro);
            jButton2.setBackground(escuro);
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/LampadaIcon30x30Branco.png")));
        }else{
            jPanel1.setBackground(claro);
            jButton1.setBackground(botao_claro);
            jLabel1.setForeground(text_claro);
            jLabel2.setForeground(text_claro);
            jLabel3.setForeground(text_claro);
            jButton2.setBackground(claro);
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/LampadaIcon30x30Preto.png")));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
