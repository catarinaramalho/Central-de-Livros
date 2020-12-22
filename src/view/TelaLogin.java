package view;

import javax.swing.JOptionPane;
import entidades.*;

public class TelaLogin extends javax.swing.JFrame {

   
    public TelaLogin() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        nometxt = new javax.swing.JTextField();
        senhatxt = new javax.swing.JPasswordField();
        b_cadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b_entrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        l_cliente = new javax.swing.JRadioButton();
        l_funcionario = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Central De Livros - Login");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_open.png")).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(850, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logotipo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 500, 200));

        nometxt.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        nometxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nometxtActionPerformed(evt);
            }
        });
        getContentPane().add(nometxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 274, 310, 30));
        getContentPane().add(senhatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 310, 30));

        b_cadastrar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        b_cadastrar.setText("Cadastre-se");
        b_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 130, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Login:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 50, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Senha: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        b_entrar.setBackground(new java.awt.Color(0, 204, 255));
        b_entrar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        b_entrar.setText("Entrar");
        b_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_entrarActionPerformed(evt);
            }
        });
        getContentPane().add(b_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 310, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Ainda não possui uma conta?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        l_cliente.setText("Cliente");
        l_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(l_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        l_funcionario.setText("Funcionário");
        l_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_funcionarioActionPerformed(evt);
            }
        });
        getContentPane().add(l_funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_entrarActionPerformed
        if (l_cliente.isSelected() && l_funcionario.isSelected()) {
            JOptionPane.showMessageDialog(null, "Acesso Negado!");
        } else if (nometxt.getText() == "" || senhatxt.getText() == "" || (l_funcionario.isSelected() == false && l_cliente.isSelected() == false)) {
            JOptionPane.showMessageDialog(null, "Campos não preenchidos!");
        } else if (l_cliente.isSelected()) {
            if (Central.verificarLoginCliente(nometxt.getText(), senhatxt.getText()) == null) {
                JOptionPane.showMessageDialog(null, "Usuário Inválido");
            } else {
                Central.setClienteLogado(Central.verificarLoginCliente(nometxt.getText(), senhatxt.getText()));
                TelaCliente telaCliente = new TelaCliente();
                telaCliente.setVisible(true);
                dispose();
            }
        } else if (l_funcionario.isSelected()) {
            if (Central.verificarLoginFuncionario(nometxt.getText(), senhatxt.getText()) == null) {
                JOptionPane.showMessageDialog(null, "Usuário Inválido");
            } else {
                Central.setFuncionarioLogado(Central.verificarLoginFuncionario(nometxt.getText(), senhatxt.getText()));
                TelaFuncionario telaFuncionario = new TelaFuncionario();
                telaFuncionario.setVisible(true);
                dispose();
            }

        }

    }//GEN-LAST:event_b_entrarActionPerformed

    private void nometxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nometxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nometxtActionPerformed

    private void b_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarActionPerformed
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_cadastrarActionPerformed

    private void l_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_clienteActionPerformed

    }//GEN-LAST:event_l_clienteActionPerformed

    private void l_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_funcionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l_funcionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cadastrar;
    private javax.swing.JButton b_entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton l_cliente;
    private javax.swing.JRadioButton l_funcionario;
    private javax.swing.JTextField nometxt;
    private javax.swing.JPasswordField senhatxt;
    // End of variables declaration//GEN-END:variables
}
