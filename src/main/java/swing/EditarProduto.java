/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package swing;

import entity.Produto;
import exceptions.CodigoInvalidoException;
import exceptions.DataFaturaException;
import exceptions.NomeInvalidoException;
import exceptions.ValorException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.ProdutoService;

/**
 *
 * @author Josedi
 */
public class EditarProduto extends javax.swing.JInternalFrame {
    
    private ProdutoService service = new ProdutoService();

    /** Creates new form ConsultaCliente */
    public EditarProduto() {
        initComponents();
        setTitle("Editar Produto");
    }
    
    private void atualizarTabela() throws SQLException {

        DefaultTableModel modelo = (DefaultTableModel) TabelaProduto.getModel();
        modelo.setRowCount(0); // 

        List<Produto> produtos = service.mostrarTodosProdutos();
        for (Produto p : produtos) {
            modelo.addRow(new Object[]{p.getPCod(),p.getPDescription(),p.getPPreco()});
        }

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
        buscarProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProduto = new javax.swing.JTable();
        Voltar = new javax.swing.JButton();
        Salvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CampoNovaDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoNovoPreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Código do Produto:");

        buscarProduto.setText("Buscar");
        buscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProdutoActionPerformed(evt);
            }
        });

        TabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
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
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaProduto);

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nova Descrição:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Novo Preço:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        CampoNovoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNovoPrecoActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("R$");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                    .addGroup(consultaClientePanelLayout.createSequentialGroup()
                        .addGroup(consultaClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(consultaClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(consultaClientePanelLayout.createSequentialGroup()
                                .addComponent(CampoNovoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(CampoNovaDescricao)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaClientePanelLayout.createSequentialGroup()
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        consultaClientePanelLayout.setVerticalGroup(
            consultaClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaClientePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consultaClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CampoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(consultaClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CampoNovaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(consultaClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CampoNovoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(consultaClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        try{
            Integer campoProdCod = Integer.valueOf(CampoProduto.getText());
            Produto produto = new Produto();
            produto.setPCod(campoProdCod);
            
            produto.setPDescription(CampoNovaDescricao != null && CampoNovaDescricao.getText().isEmpty() ? produto.getPDescription() : CampoNovaDescricao.getText());
            produto.setPPreco( CampoNovoPreco != null && CampoNovoPreco.getText().isEmpty() ?  produto.getPPreco(): new BigDecimal(CampoNovoPreco.getText()));

            service.editarProduto(produto);
            JOptionPane.showMessageDialog(this, "Produto Atualizado com Sucesso!", "Atuazização Concluida", JOptionPane.INFORMATION_MESSAGE);
            
            CampoNovaDescricao.setText("");
            CampoNovoPreco.setText("");
            atualizarTabela();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro:" + ex, "ERROR SQL", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } catch (CodigoInvalidoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Código Vazio", JOptionPane.INFORMATION_MESSAGE);
        }catch (NomeInvalidoException | ValorException | DataFaturaException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro de validação", JOptionPane.WARNING_MESSAGE);
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this,"Preencha os campos para edição", "Campo Vazio",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_SalvarActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void CampoNovoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNovoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNovoPrecoActionPerformed

    private void buscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProdutoActionPerformed
        try{
            Integer prodCod = Integer.valueOf(CampoProduto.getText());
            Produto produto = service.getProdutoByCodigo(prodCod);
            
            DefaultTableModel modelo = (DefaultTableModel) TabelaProduto.getModel();
            modelo.setRowCount(1);
            
            TabelaProduto.setValueAt(produto.getPCod(), 0, 0);
            TabelaProduto.setValueAt(produto.getPDescription(), 0, 1);
            TabelaProduto.setValueAt(produto.getPPreco(), 0, 2);
            
            CampoNovaDescricao.setText(produto.getPDescription());
            CampoNovoPreco.setText(produto.getPPreco().toString()); 
        }catch (CodigoInvalidoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Código Invalido", JOptionPane.INFORMATION_MESSAGE);
        }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(this,"Insira um código valido.","Código Invalido", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this,"O produto não foi encontrado ou não existe");
        }
    }//GEN-LAST:event_buscarProdutoActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoNovaDescricao;
    private javax.swing.JTextField CampoNovoPreco;
    private javax.swing.JTextField CampoProduto;
    private javax.swing.JButton Salvar;
    private javax.swing.JTable TabelaProduto;
    private javax.swing.JButton Voltar;
    private javax.swing.JButton buscarProduto;
    private javax.swing.JPanel consultaClientePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
