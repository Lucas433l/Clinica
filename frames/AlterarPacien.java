/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projmedico;

/**
 *
 * @author Aluno 22
 */
public class AlterarPacien extends javax.swing.JInternalFrame {

    /**
     * Creates new form AlterarPacien
     */
    public AlterarPacien() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 80, 70, 40);

        jLabel3.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel3.setText("CPF:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 220, 40, 21);

        jLabel4.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel4.setText("Telefone:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 220, 80, 21);

        jLabel5.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel5.setText("Endereço:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 160, 80, 21);

        jLabel6.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Alterar Paciente");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 0, 430, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(80, 90, 520, 30);
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(270, 220, 140, 29);

        jLabel7.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel7.setText("RG:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(420, 220, 32, 20);
        getContentPane().add(jFormattedTextField2);
        jFormattedTextField2.setBounds(470, 210, 140, 30);
        getContentPane().add(jFormattedTextField3);
        jFormattedTextField3.setBounds(90, 220, 120, 29);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(100, 160, 410, 30);

        jLabel8.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel8.setText("Sexo:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 280, 42, 21);

        jRadioButton1.setFont(new java.awt.Font("Liberation Serif", 1, 14)); // NOI18N
        jRadioButton1.setText("Masculino");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(70, 280, 90, 23);

        jRadioButton2.setFont(new java.awt.Font("Liberation Serif", 1, 14)); // NOI18N
        jRadioButton2.setText("Feminino");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(170, 280, 100, 30);

        jLabel9.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("/media/aluno/669C88B99C888571/clinica/src/img/icons8-salvar-e-fechar-48.png")); // NOI18N
        jLabel9.setText("Salvar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 340, 120, 50);

        jLabel11.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon("/media/aluno/669C88B99C888571/clinica/src/img/icons8-limpar-símbolo-filled-48 (1).png")); // NOI18N
        jLabel11.setText("Excluir ");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(150, 350, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tay2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}