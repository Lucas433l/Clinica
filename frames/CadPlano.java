/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import DAO.PlanoDAO;
import javax.swing.JOptionPane;
import model.Plano;

/**
 *
 * @author lucasz
 */
public class CadPlano extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadPlano
     */
    public CadPlano() {
        initComponents();
    }
    
    public void limpar(){
        jT_Tipo.setText("");
        jT_Desc.setText("");
        jS_Conv.setValue(1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jS_Conv = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jT_Tipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Desc = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpar-48.png"))); // NOI18N
        jLabel7.setText("Limpar");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel1.setText("Convênio:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jS_Conv.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jS_Conv.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(jS_Conv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 70, 31));

        jLabel2.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel2.setText("Tipo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, 36));

        jT_Tipo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(jT_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 240, 30));

        jLabel3.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel3.setText("Descrição:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jT_Desc.setColumns(20);
        jT_Desc.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jT_Desc.setRows(5);
        jScrollPane1.setViewportView(jT_Desc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 510, 180));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4.setText("Cadastrar Plano");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar-como-48.png"))); // NOI18N
        jLabel5.setText("Salvar");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 110, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        limpar();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        boolean confirm = false;
        
        String tipo = jT_Tipo.getText();
        if(tipo.equals("")){
            confirm = false;
        }
        
        String desc = jT_Desc.getText();
        if(desc.equals("")){
            confirm = false;
        }
        
        int cod = (int) jS_Conv.getValue();
        if(cod == 1){
            JOptionPane.showMessageDialog(this,"Convênio um não pode ser usado.");
            confirm = false;
        }
        
        if(confirm){
            Plano plano = new Plano();
            plano.setCod_con(cod);
            plano.setTipo(tipo);
            plano.setDesc(desc);
            
            int op = JOptionPane.showConfirmDialog(this,"Deseja realmente cadastrar esse plano?");
            if(op == 0){
                PlanoDAO dao = new PlanoDAO();
                dao.insert(plano);
            }
            else{
                JOptionPane.showMessageDialog(this,"Plano não cadastrado.");
            }
        }
        
        else{
            JOptionPane.showMessageDialog(this,"Alguma informação não foi preenchida.");
        }
    }//GEN-LAST:event_jLabel5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner jS_Conv;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jT_Desc;
    private javax.swing.JTextField jT_Tipo;
    // End of variables declaration//GEN-END:variables
}
