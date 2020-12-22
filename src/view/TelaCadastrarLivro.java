package view;

import entidades.*;
import javax.swing.JOptionPane;

public class TelaCadastrarLivro extends javax.swing.JFrame {


    public TelaCadastrarLivro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomeLivrotxt = new javax.swing.JTextField();
        nomeAutortxt = new javax.swing.JTextField();
        editoratxt = new javax.swing.JTextField();
        qntdAddLivro = new javax.swing.JSpinner();
        cadastrarLivro = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        preco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Central de Livros - Tela de Cadastro de Livros");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_open.png")).getImage());
        setResizable(false);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadlivro.png"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 410, 210));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Nome do livro:");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Autor:");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("Editora:");
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("Preço:");
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("Quantidade a ser adicionada:");
        jLayeredPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        nomeLivrotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeLivrotxtActionPerformed(evt);
            }
        });
        jLayeredPane1.add(nomeLivrotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 310, -1));
        jLayeredPane1.add(nomeAutortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 310, -1));
        jLayeredPane1.add(editoratxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 310, -1));
        jLayeredPane1.add(qntdAddLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 410, 70, -1));

        cadastrarLivro.setBackground(new java.awt.Color(0, 204, 255));
        cadastrarLivro.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cadastrarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_add.png"))); // NOI18N
        cadastrarLivro.setText("Cadastrar Livro");
        cadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarLivroActionPerformed(evt);
            }
        });
        jLayeredPane1.add(cadastrarLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        voltar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_undo.png"))); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jLayeredPane1.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));
        jLayeredPane1.add(preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 80, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_red.png"))); // NOI18N
        jMenu1.setText("Opções");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_delete.png"))); // NOI18N
        jMenuItem1.setText("Excluir Conta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_go.png"))); // NOI18N
        jMenuItem2.setText("Sair");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void nomeLivrotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeLivrotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeLivrotxtActionPerformed

    private void cadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarLivroActionPerformed

        int valor = Integer.parseInt(qntdAddLivro.getValue().toString());
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        String p = preco.getText();
        p.replaceAll(",", ".");
        for (int i = 0; i < p.length(); i++) {
            if ((p.charAt(i) != '1') && (p.charAt(i) != '2') && (p.charAt(i) != '3') && (p.charAt(i) != '4') && (p.charAt(i) != '5') && (p.charAt(i) != '6') && (p.charAt(i) != '7')&& (p.charAt(i) != '8') && (p.charAt(i) != '9') && (p.charAt(i) != '0') && (p.charAt(i) != '.') && (p.charAt(i) != ',')) {
                cont1++;
            } else if (p.charAt(i) == '.') {
                cont2++;
            } else if (p.charAt(i) == ',') {
                cont3++;
            }
        }
        if (nomeLivrotxt.getText().equals("") || nomeAutortxt.getText().equals("") || editoratxt.getText().equals("") ||preco.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "Campos não preenchidos ou incorretos", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if (((cont2 >= 2) || (cont3 >= 2) || (cont1 >= 1)) || ((p.length() == 1) && ((cont2 == 1) || (cont3 == 1)))||(p.length()==2 && ((cont2 == 1) && (cont3 == 1)))) {
            JOptionPane.showMessageDialog(null, "Números não reconhecidos no preço!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Quantidade inválida!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            double precoDoLivro = Double.parseDouble(p);
            if (Central.getFuncionarioLogado().cadastrarLivro(nomeLivrotxt.getText(), nomeAutortxt.getText(), editoratxt.getText(), precoDoLivro, valor)) {
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucesso!");
                TelaCadastrarLivro telaCadastrarLivro = new TelaCadastrarLivro();
                telaCadastrarLivro.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Livro já Cadastrado!", "Aviso", JOptionPane.WARNING_MESSAGE);

            }
        }
    }//GEN-LAST:event_cadastrarLivroActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        TelaFuncionario telaFuncionario = new TelaFuncionario();
        telaFuncionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarLivro;
    private javax.swing.JTextField editoratxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField nomeAutortxt;
    private javax.swing.JTextField nomeLivrotxt;
    private javax.swing.JTextField preco;
    private javax.swing.JSpinner qntdAddLivro;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
