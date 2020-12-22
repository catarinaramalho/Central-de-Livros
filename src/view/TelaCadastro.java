package view;

import entidades.*;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nometxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        senha1txt = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        senha2txt = new javax.swing.JPasswordField();
        l_cliente = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        l_funcionario = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Central De Livros - Cadastro");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_open.png")).getImage());
        setResizable(false);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadusuarios.png"))); // NOI18N
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -10, 510, 270));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Digite seu login:");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        nometxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLayeredPane1.add(nometxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 310, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Digite sua senha:");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        senha1txt.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLayeredPane1.add(senha1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 310, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("Digite novamente sua senha: ");
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 330, 250, -1));

        senha2txt.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLayeredPane1.add(senha2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 310, -1));

        l_cliente.setBackground(new java.awt.Color(255, 153, 153));
        l_cliente.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        l_cliente.setText("Cliente");
        jLayeredPane1.add(l_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 80, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("Tipo de usuário:");
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        l_funcionario.setBackground(new java.awt.Color(255, 153, 153));
        l_funcionario.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        l_funcionario.setText("Funcionário");
        jLayeredPane1.add(l_funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 130, -1));

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_undo.png"))); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (nometxt.getText().equals("") || senha1txt.getText().equals("") || senha2txt.getText().equals("") || (l_funcionario.isSelected() == false && l_cliente.isSelected() == false)) {
            JOptionPane.showMessageDialog(null, "Campos não preenchidos!");
        } else if (senha1txt.getText().equals(senha2txt.getText())) {
            if (l_cliente.isSelected() && l_funcionario.isSelected()) {
                JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro com os campos Cliente e Funcionários marcados simultâneamente!");
            } else if (l_cliente.isSelected()) {
                Cliente cliente = new Cliente(nometxt.getText(), senha1txt.getText());
                if (Central.cadastrarCliente(cliente)) {
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    TelaLogin telaLogin = new TelaLogin();
                    telaLogin.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário já cadastrado!");
                }
            } else if (l_funcionario.isSelected()) {
                Funcionario funcionario = new Funcionario(nometxt.getText(), senha1txt.getText());
                if (Central.cadastrarFuncionario(funcionario)) {
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    TelaLogin telaLogin = new TelaLogin();
                    telaLogin.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário já cadastrado!");

                }
            }

        } else if (!senha1txt.getText().equals(senha2txt.getText())) {
            JOptionPane.showMessageDialog(null, "Senhas diferentes!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButton l_cliente;
    private javax.swing.JRadioButton l_funcionario;
    private javax.swing.JTextField nometxt;
    private javax.swing.JPasswordField senha1txt;
    private javax.swing.JPasswordField senha2txt;
    // End of variables declaration//GEN-END:variables
}
