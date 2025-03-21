/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package swing;

import entity.Produto;
import exceptions.CodigoInvalidoException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.ProdutoService;

/**
 *
 * @author Josedi
 */
public class ConsultaProduto extends javax.swing.JInternalFrame {

    private ProdutoService service = new ProdutoService();
    /** Creates new form ConsultaCliente */
    public ConsultaProduto() {
        initComponents();
        setTitle("Consultar Produto");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consultaClientePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CampoProduto = new javax.swing.JTextField();
        consultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProdutos = new javax.swing.JTable();
        Voltar = new javax.swing.JButton();
        mostrarTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Código do Produto:");

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        TabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaProdutos);

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        mostrarTodos.setText("Mostrar Todos");
        mostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout consultaClientePanelLayout = new javax.swing.GroupLayout(consultaClientePanel);
        consultaClientePanel.setLayout(consultaClientePanelLayout);
        consultaClientePanelLayout.setHorizontalGroup(
            consultaClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaClientePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consultaClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaClientePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultar, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                    .addGroup(consultaClientePanelLayout.createSequentialGroup()
                        .addComponent(mostrarTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        consultaClientePanelLayout.setVerticalGroup(
            consultaClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaClientePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consultaClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CampoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(consultaClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consultaClientePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consultaClientePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarTodosActionPerformed
        CampoProduto.setText(null);
        List<Produto> produtos = null;
        
        try{
            produtos = service.mostrarTodosProdutos();
            DefaultTableModel modelo = (DefaultTableModel) TabelaProdutos.getModel();
            modelo.setRowCount(0);
            
            for (Produto produto : produtos){
                modelo.addRow(new Object[]{produto.getPCod(),produto.getPDescription(),produto.getPPreco()});
            }
        } catch (SQLException e){
            Logger.getLogger(ConsultaProduto.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Erro ao buscar produtos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mostrarTodosActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        try{
            Integer codigo = Integer.valueOf(CampoProduto.getText());
            Produto produto = service.getProdutoByCodigo(codigo);
            
            DefaultTableModel modelo = (DefaultTableModel) TabelaProdutos.getModel();
            modelo.setRowCount(1);
            
            TabelaProdutos.setValueAt(produto.getPCod(), 0, 0);
            TabelaProdutos.setValueAt(produto.getPDescription(), 0, 1);
            TabelaProdutos.setValueAt(produto.getPPreco(), 0, 2);
            
        }catch(CodigoInvalidoException e){
            JOptionPane.showMessageDialog(this, e.getMessage(),"Código Invalido", JOptionPane.INFORMATION_MESSAGE);
        }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(this,"Insira um código valido.","Código Invalido", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this,"O produto não foi encontrado ou não existe");
        }
    }//GEN-LAST:event_consultarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoProduto;
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JButton Voltar;
    private javax.swing.JPanel consultaClientePanel;
    private javax.swing.JButton consultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrarTodos;
    // End of variables declaration//GEN-END:variables

}
