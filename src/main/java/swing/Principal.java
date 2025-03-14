/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Josedi
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public Principal() {
        initComponents();
        setTitle("Principal");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrincipalPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Clientes = new javax.swing.JMenu();
        ClienteConsulta = new javax.swing.JMenuItem();
        AdcionarClientes = new javax.swing.JMenuItem();
        EditarCliente = new javax.swing.JMenuItem();
        ExcluirCliente = new javax.swing.JMenuItem();
        Produtos = new javax.swing.JMenu();
        ConsultaProdutos = new javax.swing.JMenuItem();
        AdcionarProdutos = new javax.swing.JMenuItem();
        EditarProdutos = new javax.swing.JMenuItem();
        ExcluirProdutos = new javax.swing.JMenuItem();
        Vendas = new javax.swing.JMenu();
        ConsultaVendas = new javax.swing.JMenuItem();
        AdcionarVendas = new javax.swing.JMenuItem();
        EditarVendas = new javax.swing.JMenuItem();
        ExcluirVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PrincipalPanel.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout PrincipalPanelLayout = new javax.swing.GroupLayout(PrincipalPanel);
        PrincipalPanel.setLayout(PrincipalPanelLayout);
        PrincipalPanelLayout.setHorizontalGroup(
            PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        PrincipalPanelLayout.setVerticalGroup(
            PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        Clientes.setText("Clientes");

        ClienteConsulta.setText("Consultar");
        ClienteConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteConsultaActionPerformed(evt);
            }
        });
        Clientes.add(ClienteConsulta);

        AdcionarClientes.setText("Adicionar");
        AdcionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdcionarClientesActionPerformed(evt);
            }
        });
        Clientes.add(AdcionarClientes);

        EditarCliente.setText("Editar");
        EditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarClienteActionPerformed(evt);
            }
        });
        Clientes.add(EditarCliente);

        ExcluirCliente.setText("Excluir");
        ExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirClienteActionPerformed(evt);
            }
        });
        Clientes.add(ExcluirCliente);

        jMenuBar1.add(Clientes);

        Produtos.setText("Produtos");
        Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosActionPerformed(evt);
            }
        });

        ConsultaProdutos.setText("Consultar");
        ConsultaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaProdutosActionPerformed(evt);
            }
        });
        Produtos.add(ConsultaProdutos);

        AdcionarProdutos.setText("Adicionar");
        AdcionarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdcionarProdutosActionPerformed(evt);
            }
        });
        Produtos.add(AdcionarProdutos);

        EditarProdutos.setText("Editar");
        EditarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarProdutosActionPerformed(evt);
            }
        });
        Produtos.add(EditarProdutos);

        ExcluirProdutos.setText("Excluir");
        Produtos.add(ExcluirProdutos);

        jMenuBar1.add(Produtos);

        Vendas.setText("Vendas");

        ConsultaVendas.setText("Consultar");
        ConsultaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaVendasActionPerformed(evt);
            }
        });
        Vendas.add(ConsultaVendas);

        AdcionarVendas.setText("Adicionar");
        AdcionarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdcionarVendasActionPerformed(evt);
            }
        });
        Vendas.add(AdcionarVendas);

        EditarVendas.setText("Editar");
        Vendas.add(EditarVendas);

        ExcluirVendas.setText("Excluir");
        Vendas.add(ExcluirVendas);

        jMenuBar1.add(Vendas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrincipalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrincipalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClienteConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteConsultaActionPerformed
        ConsultaCliente consultaCliente = new ConsultaCliente();
        pack();
        PrincipalPanel.add(consultaCliente);
        consultaCliente.setVisible(true);
    }//GEN-LAST:event_ClienteConsultaActionPerformed

    private void AdcionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdcionarClientesActionPerformed
        CadastrarCliente cadastrarCliente = new CadastrarCliente();
        pack();
        PrincipalPanel.add(cadastrarCliente);
        cadastrarCliente.setVisible(true);
    }//GEN-LAST:event_AdcionarClientesActionPerformed

    private void AdcionarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdcionarProdutosActionPerformed
        CadastrarProduto cadastrarProduto = new CadastrarProduto();
        pack();
        PrincipalPanel.add(cadastrarProduto);
        cadastrarProduto.setVisible(true);
    }//GEN-LAST:event_AdcionarProdutosActionPerformed

    private void ConsultaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaProdutosActionPerformed
        ConsultaProduto consultaProduto = new ConsultaProduto();
        pack();
        PrincipalPanel.add(consultaProduto);
        consultaProduto.setVisible(true);
    }//GEN-LAST:event_ConsultaProdutosActionPerformed

    private void AdcionarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdcionarVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdcionarVendasActionPerformed

    private void ConsultaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultaVendasActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
        
    }//GEN-LAST:event_ProdutosActionPerformed

    private void EditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarClienteActionPerformed
        EditarCliente editarCliente = new EditarCliente();
        pack();
        PrincipalPanel.add(editarCliente);
        editarCliente.setVisible(true);
    }//GEN-LAST:event_EditarClienteActionPerformed

    private void EditarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarProdutosActionPerformed
        EditarProduto editarProduto = new EditarProduto();
        pack();
        PrincipalPanel.add(editarProduto);
        editarProduto.setVisible(true);
    }//GEN-LAST:event_EditarProdutosActionPerformed

    private void ExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirClienteActionPerformed
        ExcluirCliente excluirCliente = new ExcluirCliente();
        pack();
        PrincipalPanel.add(excluirCliente);
        excluirCliente.setVisible(true);
    }//GEN-LAST:event_ExcluirClienteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdcionarClientes;
    private javax.swing.JMenuItem AdcionarProdutos;
    private javax.swing.JMenuItem AdcionarVendas;
    private javax.swing.JMenuItem ClienteConsulta;
    private javax.swing.JMenu Clientes;
    private javax.swing.JMenuItem ConsultaProdutos;
    private javax.swing.JMenuItem ConsultaVendas;
    private javax.swing.JMenuItem EditarCliente;
    private javax.swing.JMenuItem EditarProdutos;
    private javax.swing.JMenuItem EditarVendas;
    private javax.swing.JMenuItem ExcluirCliente;
    private javax.swing.JMenuItem ExcluirProdutos;
    private javax.swing.JMenuItem ExcluirVendas;
    private javax.swing.JPanel PrincipalPanel;
    private javax.swing.JMenu Produtos;
    private javax.swing.JMenu Vendas;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
