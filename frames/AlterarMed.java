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
public class AlterarMed extends javax.swing.JInternalFrame {

    /**
     * Creates new form AlterarMed
     */
    public AlterarMed() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alterar Dados dos Médicos ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 0, 300, 50);

        jLabel3.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel3.setText("Nome ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 80, 51, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(80, 80, 410, 30);

        jLabel4.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel4.setText("Cpf");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 150, 40, 20);

        jLabel5.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel5.setText("RG");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(230, 150, 40, 20);

        jLabel6.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel6.setText("Telefone");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 220, 80, 21);

        jLabel7.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel7.setText("Sexo");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(240, 220, 50, 20);

        jLabel8.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel8.setText("Endereço");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 280, 90, 30);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(60, 150, 150, 30);

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextField2);
        jFormattedTextField2.setBounds(270, 150, 110, 30);

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(85)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFormattedTextField3);
        jFormattedTextField3.setBounds(100, 220, 120, 30);

        jRadioButton1.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jRadioButton1.setText("Feminino");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(300, 220, 99, 25);

        jRadioButton2.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jRadioButton2.setText("Masculino");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(400, 220, 130, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(100, 280, 410, 30);

        jLabel10.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("/media/aluno/669C88B99C888571/clinica/src/img/icons8-salvar-e-fechar-48.png")); // NOI18N
        jLabel10.setText("Salvar");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 340, 130, 50);

        jLabel9.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("/media/aluno/669C88B99C888571/clinica/src/img/icons8-limpar-símbolo-filled-48 (1).png")); // NOI18N
        jLabel9.setText("Apagar");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(150, 350, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("/media/aluno/669C88B99C888571/clinica/src/img/tay2.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}