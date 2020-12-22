/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import entidades.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.omg.CORBA.Object;

public class TelaCliente extends javax.swing.JFrame {

    public TelaCliente() {
        Cliente aux = new Cliente("a", "156");
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        editarCarrinho = new javax.swing.JButton();
        visualizarLivros = new javax.swing.JButton();
        removerCarrinho = new javax.swing.JButton();
        qntdLivro = new javax.swing.JSpinner();
        efetuarCompra = new javax.swing.JButton();
        addcarrinho = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        produtos = new javax.swing.JTable();
        nomelivrotxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        sair = new javax.swing.JMenuItem();
        excluir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Central de Livros - Cliente");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_open.png")).getImage());
        setResizable(false);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(850, 600));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editarCarrinho.setBackground(new java.awt.Color(0, 204, 255));
        editarCarrinho.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        editarCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cart_edit.png"))); // NOI18N
        editarCarrinho.setText("Editar Quantidade");
        editarCarrinho.setMaximumSize(new java.awt.Dimension(203, 25));
        editarCarrinho.setMinimumSize(new java.awt.Dimension(203, 25));
        editarCarrinho.setPreferredSize(new java.awt.Dimension(203, 25));
        editarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCarrinhoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(editarCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 210, 30));

        visualizarLivros.setBackground(new java.awt.Color(0, 204, 255));
        visualizarLivros.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        visualizarLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier.png"))); // NOI18N
        visualizarLivros.setText("Visualizar Livros");
        visualizarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarLivrosActionPerformed(evt);
            }
        });
        jLayeredPane1.add(visualizarLivros, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 210, 30));

        removerCarrinho.setBackground(new java.awt.Color(0, 204, 255));
        removerCarrinho.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        removerCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cart_delete.png"))); // NOI18N
        removerCarrinho.setText("Remover do Carrinho");
        removerCarrinho.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        removerCarrinho.setPreferredSize(new java.awt.Dimension(169, 27));
        removerCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerCarrinhoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(removerCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 210, 30));
        jLayeredPane1.add(qntdLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 70, -1));

        efetuarCompra.setBackground(new java.awt.Color(0, 204, 255));
        efetuarCompra.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        efetuarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coins.png"))); // NOI18N
        efetuarCompra.setText("Efetuar Compra");
        efetuarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efetuarCompraActionPerformed(evt);
            }
        });
        jLayeredPane1.add(efetuarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 560, -1));

        addcarrinho.setBackground(new java.awt.Color(0, 204, 255));
        addcarrinho.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        addcarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cart_add.png"))); // NOI18N
        addcarrinho.setText("Adicionar no Carrinho");
        addcarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcarrinhoActionPerformed(evt);
            }
        });
        jLayeredPane1.add(addcarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 210, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Quantidade:");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(produtos);

        jLayeredPane1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 340, 150));

        nomelivrotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomelivrotxtActionPerformed(evt);
            }
        });
        jLayeredPane1.add(nomelivrotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 200, -1));
        nomelivrotxt.getAccessibleContext().setAccessibleName("txtNome");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("Nome do Livro: ");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/compras.png"))); // NOI18N
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -10, 840, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 600));

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 153));

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
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addcarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcarrinhoActionPerformed
        DefaultTableModel carrinho = (DefaultTableModel) produtos.getModel();
        int valor = Integer.parseInt(qntdLivro.getValue().toString());
        boolean existe = false;
        String nome = (String) nomelivrotxt.getText();
        ArrayList<Livro> c = Central.getClienteLogado().getCarrinho();
        ArrayList<Integer> q = Central.getClienteLogado().getQuantidadesRetiradas();
        int qntd = valor;
        for (int i = 0; i < produtos.getRowCount(); i++) {
            if (c.get(i).getNome().equalsIgnoreCase(nome)) {
                existe = true;
            }
        }
        if (nomelivrotxt.getText().equals("") || valor <= 0) {
            JOptionPane.showMessageDialog(null, "Valores errados!");
        } else if (existe) {
            for (int i = 0; i < produtos.getRowCount(); i++) {
                if (c.get(i).getNome().equalsIgnoreCase(nome)) {
                    qntd = qntd + q.get(i);
                    Central.getClienteLogado().adicionarCarrinho(nome, valor);
                    produtos.setValueAt(String.valueOf(qntd), i, 1);
                }
            }

        } else if (Central.getClienteLogado().adicionarCarrinho(nome, valor)) {
            carrinho.addRow(new String[]{nomelivrotxt.getText(), qntdLivro.getValue().toString()});
        } else {
            JOptionPane.showMessageDialog(null, "Livros não disponíveis!");
        }

    }//GEN-LAST:event_addcarrinhoActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed

        Central.excluirCliente(Central.getClienteLogado());
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_excluirActionPerformed

    private void nomelivrotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomelivrotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomelivrotxtActionPerformed

    private void efetuarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efetuarCompraActionPerformed
        if (produtos.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Carrinho Vazio!");
        } else {
            Central.getClienteLogado().efetuarCompra();
            JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso! A nota fiscal se encontra na pasta 'Notas Fiscais'!");
            TelaCliente telaCliente = new TelaCliente();
            telaCliente.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_efetuarCompraActionPerformed

    private void removerCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerCarrinhoActionPerformed
        DefaultTableModel carrinho = (DefaultTableModel) produtos.getModel();
        int valor = Integer.parseInt(qntdLivro.getValue().toString());
        if (produtos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi selecionada para remoção!");

        } else if (Central.getClienteLogado().excluirCarrinho(Central.consultarLivro((produtos.getValueAt(produtos.getSelectedRow(), 0)).toString()))) {
            carrinho.removeRow(produtos.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Livros removidos com sucesso!");
        }

    }//GEN-LAST:event_removerCarrinhoActionPerformed

    private void visualizarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarLivrosActionPerformed
        TelaLivrosAVenda telaLivros = new TelaLivrosAVenda(this,true);
        telaLivros.setVisible(true);
    }//GEN-LAST:event_visualizarLivrosActionPerformed

    private void produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtosMouseClicked
        if (produtos.getSelectedRow() != -1) {
            nomelivrotxt.setText(produtos.getValueAt(produtos.getSelectedRow(), 0).toString());

        }
    }//GEN-LAST:event_produtosMouseClicked

    private void editarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCarrinhoActionPerformed
        int valor = Integer.parseInt(qntdLivro.getValue().toString());
        String nome = (String) nomelivrotxt.getText();
        Livro livro = Central.consultarLivro(nome);
        if (nomelivrotxt.getText().equals("") || valor <= 0) {
            JOptionPane.showMessageDialog(null, "Valores errados!");
        } else if (produtos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Nenhuma linha foi selecionada para edição!");
        } else if (Central.getClienteLogado().editarCarrinho(livro, valor)) {
            produtos.setValueAt(qntdLivro.getValue().toString(), produtos.getSelectedRow(), 1);
        } else {
            JOptionPane.showMessageDialog(null, "Livros não disponíveis!");
        }
    }//GEN-LAST:event_editarCarrinhoActionPerformed


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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcarrinho;
    private javax.swing.JButton editarCarrinho;
    private javax.swing.JButton efetuarCompra;
    private javax.swing.JMenuItem excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomelivrotxt;
    private javax.swing.JTable produtos;
    private javax.swing.JSpinner qntdLivro;
    private javax.swing.JButton removerCarrinho;
    private javax.swing.JMenuItem sair;
    private javax.swing.JButton visualizarLivros;
    // End of variables declaration//GEN-END:variables
}
