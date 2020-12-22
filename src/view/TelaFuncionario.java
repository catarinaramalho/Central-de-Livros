package view;

import entidades.*;

public class TelaFuncionario extends javax.swing.JFrame {

    public TelaFuncionario() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        cadastLivros = new javax.swing.JButton();
        ListarCompras = new javax.swing.JButton();
        ListarLivros = new javax.swing.JButton();
        ListarUsuarios = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        removerLivro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        sair = new javax.swing.JMenuItem();
        excluir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Central de Livros - Funcionário");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_open.png")).getImage());
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(850, 600));
        setResizable(false);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(850, 600));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastLivros.setBackground(new java.awt.Color(0, 204, 255));
        cadastLivros.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cadastLivros.setText("Cadastrar Livros");
        cadastLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastLivrosActionPerformed(evt);
            }
        });
        jLayeredPane1.add(cadastLivros, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 300, 40));

        ListarCompras.setBackground(new java.awt.Color(0, 204, 255));
        ListarCompras.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        ListarCompras.setText("Listar Compras");
        ListarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarComprasActionPerformed(evt);
            }
        });
        jLayeredPane1.add(ListarCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 300, 40));

        ListarLivros.setBackground(new java.awt.Color(0, 204, 255));
        ListarLivros.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        ListarLivros.setText("Listar Livros");
        ListarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarLivrosActionPerformed(evt);
            }
        });
        jLayeredPane1.add(ListarLivros, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 300, 40));

        ListarUsuarios.setBackground(new java.awt.Color(0, 204, 255));
        ListarUsuarios.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        ListarUsuarios.setText("Listar Usuários");
        ListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarUsuariosActionPerformed(evt);
            }
        });
        jLayeredPane1.add(ListarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 300, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 330, 210));

        removerLivro.setBackground(new java.awt.Color(0, 204, 240));
        removerLivro.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        removerLivro.setText("Remover Livro");
        removerLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerLivroActionPerformed(evt);
            }
        });
        jLayeredPane1.add(removerLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 300, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 850, -1));

        jMenuBar1.setMinimumSize(null);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_red.png"))); // NOI18N
        jMenu1.setText("Opções da Conta");

        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_go.png"))); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenu1.add(sair);

        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_delete.png"))); // NOI18N
        excluir.setText("Excluir Conta");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        jMenu1.add(excluir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastLivrosActionPerformed
        TelaCadastrarLivro telaCadastrarLivro = new TelaCadastrarLivro();
        telaCadastrarLivro.setVisible(true);
        dispose();
    }//GEN-LAST:event_cadastLivrosActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        Central.excluirFuncionario(Central.getFuncionarioLogado());
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_excluirActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void ListarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarLivrosActionPerformed

        TelaListagemLivros telaListagemLivros = new TelaListagemLivros();
        telaListagemLivros.setVisible(true);
        dispose();
    }//GEN-LAST:event_ListarLivrosActionPerformed

    private void ListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarUsuariosActionPerformed
        TelaListagemUsuarios telaListagemUsuarios = new TelaListagemUsuarios();
        telaListagemUsuarios.setVisible(true);
        dispose();
    }//GEN-LAST:event_ListarUsuariosActionPerformed

    private void ListarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarComprasActionPerformed
        TelaListagemCompras telaListagemCompras = new TelaListagemCompras();
        telaListagemCompras.setVisible(true);
        dispose();
    }//GEN-LAST:event_ListarComprasActionPerformed

    private void removerLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerLivroActionPerformed
        TelaRemoverLivro telaRemoverLivro = new TelaRemoverLivro();
        telaRemoverLivro.setVisible(true);
        dispose();
    }//GEN-LAST:event_removerLivroActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListarCompras;
    private javax.swing.JButton ListarLivros;
    private javax.swing.JButton ListarUsuarios;
    private javax.swing.JButton cadastLivros;
    private javax.swing.JMenuItem excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton removerLivro;
    private javax.swing.JMenuItem sair;
    // End of variables declaration//GEN-END:variables
}
