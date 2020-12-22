package view;

import entidades.*;
import javax.swing.JOptionPane;

public class TelaRemoverLivro extends javax.swing.JFrame {

   
    public TelaRemoverLivro() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nometxt = new javax.swing.JTextField();
        finalizar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Central de Livros - Remover Livros");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/book_open.png")).getImage());
        setResizable(false);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(850, 600));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/removebook.png"))); // NOI18N
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Nome do Livro:");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        nometxt.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLayeredPane1.add(nometxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 330, 40));

        finalizar.setBackground(new java.awt.Color(0, 204, 240));
        finalizar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        finalizar.setText("Finalizar");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });
        jLayeredPane1.add(finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 330, 40));

        voltar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_undo.png"))); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jLayeredPane1.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        TelaFuncionario telaFuncionario = new TelaFuncionario();
        telaFuncionario.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        if (nometxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo não preenchido!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            if (Central.removerCadastroLivro(nometxt.getText())) {
                JOptionPane.showMessageDialog(null, "Remoção realizada com sucesso!");
                TelaRemoverLivro telaRemoverLivro = new TelaRemoverLivro();
                telaRemoverLivro.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Livro inexistente!");
            }
        }
    }//GEN-LAST:event_finalizarActionPerformed

   
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
            java.util.logging.Logger.getLogger(TelaRemoverLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRemoverLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRemoverLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton finalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField nometxt;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
