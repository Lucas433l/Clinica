/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import DAO.AdminDAO;
import DAO.MedicoDAO;
import DAO.SecretariaDAO;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno 22
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form PagInc
     */
    public Login() {
        initComponents();
        
        CPF.setBackground(new Color(0,0,0,64));
        SENHA.setBackground(new Color(0,0,0,64));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SENHA = new javax.swing.JPasswordField();
        CPF = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 50, 30));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jButton3.setText("x");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 50, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 410, 160));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CPF");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 80, 40));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Senha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 100, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mostrar-a-senha-24.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, 20));

        SENHA.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        SENHA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SENHA.setBorder(null);
        SENHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SENHAActionPerformed(evt);
            }
        });
        getContentPane().add(SENHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 250, 40));

        CPF.setBorder(null);
        try {
            CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPF.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFActionPerformed(evt);
            }
        });
        getContentPane().add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 250, 40));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/entrar-48.png"))); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cpf = CPF.getText();
        String password = new String(SENHA.getPassword());
        
        
        try{
            ArrayList lista;
            AdminDAO admin  = new AdminDAO();
            lista = admin.readForLogin(cpf, password);
            boolean login = (boolean) lista.get(0);
            String nome = (String) lista.get(1);
            if(cpf.replace(".","").replace("-","").replace(" ","").equals("") || password.equals("")){
                JOptionPane.showMessageDialog(this,"Algum dos campos não foi preenchido.");
            }
            else if(login){
                JOptionPane.showMessageDialog(this,"Login Realizado com Sucesso.");
                JOptionPane.showMessageDialog(this,"Seja bem-vindo(a) Administrador(a) "+nome);
                this.dispose();
                new inicio(0).setVisible(true);
            }
            else{
                SecretariaDAO sec = new SecretariaDAO();
                lista = sec.readForLogin(cpf, password);
                login = (boolean) lista.get(0);
                nome = (String) lista.get(1);
                if(login){
                    JOptionPane.showMessageDialog(this,"Login realizado com sucesso.");
                    JOptionPane.showMessageDialog(this,"Seja bem-vindo(a) Secratária(o) "+nome);
                    this.dispose();
                    new inicio(1).setVisible(true);
                }
                else{
                    MedicoDAO med = new MedicoDAO();
                    lista = med.readForLogin(cpf, password);
                    login = (boolean) lista.get(0);
                    nome = (String) lista.get(1);
                    if(login){
                        JOptionPane.showMessageDialog(this,"Login realizado com sucesso.");
                        JOptionPane.showMessageDialog(this,"Seja bem-vindo(a) Médico(a) "+nome);
                        this.dispose();
                        new inicio(2).setVisible(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"CPF ou Senha incorreto.");
                    }
                }

            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SENHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SENHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SENHAActionPerformed

    private void CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(SENHA.getEchoChar() == '*'){
            SENHA.setEchoChar('\u0000');
        }else{
            SENHA.setEchoChar('*');
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CPF;
    private javax.swing.JPasswordField SENHA;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
