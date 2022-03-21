package signos;

public class formSigno extends javax.swing.JFrame {
    
    public formSigno() {
        initComponents();
    }
        // Declaração das váriaveis
        String nome, signo;
        Double diaNascimento, mesNascimento;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        btnResultado = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Signos");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setName(""); // NOI18N

        jLabel2.setText("Nome:");

        jLabel3.setText("Mês de Nascimento");

        jLabel4.setText("Dia de Nascimento");

        txtNome.setBackground(new java.awt.Color(0, 0, 0));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtDia.setBackground(new java.awt.Color(0, 0, 0));
        txtDia.setForeground(new java.awt.Color(255, 255, 255));
        txtDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });

        txtMes.setBackground(new java.awt.Color(0, 0, 0));
        txtMes.setForeground(new java.awt.Color(255, 255, 255));
        txtMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });

        btnResultado.setBackground(new java.awt.Color(0, 0, 0));
        btnResultado.setForeground(new java.awt.Color(255, 255, 255));
        btnResultado.setText("Descobrir Signo");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(0, 0, 0));
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnLimpar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtResultado, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome)
                                    .addComponent(txtMes, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(txtDia)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResultado)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        nome = txtNome.getText();
        diaNascimento = Double.parseDouble(txtDia.getText());
        mesNascimento = Double.parseDouble(txtMes.getText());
            if ((diaNascimento >= 21)&&(diaNascimento <=31)&&(mesNascimento == 3)){
                    signo = "Áries";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 1)&&(diaNascimento <=20)&&(mesNascimento == 4)){
                    signo = "Áries";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 21)&&(diaNascimento <=30)&&(mesNascimento == 4)){
                    signo = "Touro";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 1)&&(diaNascimento <=20)&&(mesNascimento == 5)){
                    signo = "Touro";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 21)&&(diaNascimento <=30)&&(mesNascimento == 5)){
                    signo = "Gêmeos";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 1)&&(diaNascimento <=20)&&(mesNascimento == 6)){
                    signo = "Gêmeos";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 21)&&(diaNascimento <=30)&&(mesNascimento == 6)){
                    signo = "Câncer";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 1)&&(diaNascimento <=20)&&(mesNascimento == 7)){
                    signo = "Câncer";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 21)&&(diaNascimento <=30)&&(mesNascimento == 7)){
                    signo = "Leão";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 1)&&(diaNascimento <=20)&&(mesNascimento == 8)){
                    signo = "Leão";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 21)&&(diaNascimento <=30)&&(mesNascimento == 8)){
                    signo = "Virgem";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 1)&&(diaNascimento <=20)&&(mesNascimento == 9)){
                    signo = "Virgem";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 21)&&(diaNascimento <=30)&&(mesNascimento == 9)){
                    signo = "Libra";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 1)&&(diaNascimento <=20)&&(mesNascimento == 10)){
                    signo = "Libra";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 21)&&(diaNascimento <=30)&&(mesNascimento == 10)){
                    signo = "Escorpião";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 1)&&(diaNascimento <=20)&&(mesNascimento == 11)){
                    signo = "Escorpião";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 21)&&(diaNascimento <=30)&&(mesNascimento == 11)){
                    signo = "Sagitário";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 1)&&(diaNascimento <=20)&&(mesNascimento == 12)){
                    signo = "Sagitário";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 21)&&(diaNascimento <=30)&&(mesNascimento == 12)){
                    signo = "Capricórnio";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 1)&&(diaNascimento <=20)&&(mesNascimento == 1)){
                    signo = "Capricórnio";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 21)&&(diaNascimento <=30)&&(mesNascimento == 1)){
                    signo = "Aquário";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 1)&&(diaNascimento <=20)&&(mesNascimento == 2)){
                    signo = "Aquário";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 21)&&(diaNascimento <=30)&&(mesNascimento == 2)){
                    signo = "Peixes";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
                } else if ((diaNascimento >= 1)&&(diaNascimento <=20)&&(mesNascimento == 3)){
                    signo = "Peixes";
                    txtResultado.setText(nome + ", Seu signo é de: " + signo);
    }
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        nome = txtNome.getText();
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        diaNascimento = Double.parseDouble(txtDia.getText());
    }//GEN-LAST:event_txtDiaActionPerformed

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
        mesNascimento = Double.parseDouble(txtMes.getText());
    }//GEN-LAST:event_txtMesActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtMes.setText("");
        txtDia.setText("");
        txtResultado.setText("");
        
    }//GEN-LAST:event_btnLimparActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formSigno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
