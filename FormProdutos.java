import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FormProdutos extends javax.swing.JFrame {

    
    public FormProdutos() {
        initComponents();
    }

    public ArrayList<Produto>listadeprodutos = new ArrayList<>();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        produto = new javax.swing.JLabel();
        preco = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtpreco = new javax.swing.JTextField();
        btnadicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnexcluir = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        form = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Produtos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        produto.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        produto.setText("Produto");
        getContentPane().add(produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 150, -1));

        preco.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        preco.setText("Preço");
        getContentPane().add(preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 239, 40));

        txtpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtpreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 260, 40));

        btnadicionar.setBackground(new java.awt.Color(0, 153, 0));
        btnadicionar.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        btnadicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnadicionar.setText("Adicionar");
        btnadicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnadicionarMouseClicked(evt);
            }
        });
        btnadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnadicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 150, 40));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Produto", "Valor (R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 739, 100));

        btnexcluir.setBackground(new java.awt.Color(0, 204, 0));
        btnexcluir.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        btnexcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnexcluir.setText("Excluir");
        btnexcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexcluirMouseClicked(evt);
            }
        });
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 150, 40));

        btnsair.setBackground(new java.awt.Color(0, 153, 0));
        btnsair.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        btnsair.setForeground(new java.awt.Color(255, 255, 255));
        btnsair.setText("Sair");
        btnsair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsairMouseClicked(evt);
            }
        });
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 150, 40));

        btneditar.setBackground(new java.awt.Color(0, 153, 0));
        btneditar.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        btneditar.setForeground(new java.awt.Color(255, 255, 255));
        btneditar.setText("Editar");
        btneditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditarMouseClicked(evt);
            }
        });
        getContentPane().add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 150, 40));

        titulo.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        titulo.setText("Tabela de Valores");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, -1, 50));

        form.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        form.setText("BAZAR FormProdutos");
        getContentPane().add(form, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        subtitulo.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        subtitulo.setText("Variedade é aqui");
        getContentPane().add(subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 170, -1));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgfundo.jpg"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -20, 940, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecoActionPerformed
        
    }//GEN-LAST:event_txtprecoActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        
    }//GEN-LAST:event_txtnomeActionPerformed

    private void btnadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadicionarActionPerformed
       
    }//GEN-LAST:event_btnadicionarActionPerformed

    private void btnadicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadicionarMouseClicked
 //adicionar itens na tabela
 String nome = txtnome.getText();
 double preco = Double.parseDouble(txtpreco.getText());
 
 
 Produto item = new Produto();
 
 item.setNome(nome);
 item.setPreco(preco);
 
 listadeprodutos.add(item);
 
 //atualizar a tabela
 DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
 modelo.setNumRows(0);
 
 for(int i = 0; i<listadeprodutos.size(); i++){
     modelo.addRow(new Object[]{listadeprodutos.get(i).getNome(), listadeprodutos.get(i).getPreco()});
 
     }
 
 
    }//GEN-LAST:event_btnadicionarMouseClicked

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
    

    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnexcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexcluirMouseClicked
 //remover itens da tabela 
 int posicao = tabela.getSelectedRow();
 listadeprodutos.remove(posicao);
 
 //atualizar a tabela
 DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
 modelo.setNumRows(0);
 
 for(int i = 0; i<listadeprodutos.size(); i++){
     modelo.addRow(new Object[]{listadeprodutos.get(i).getNome(), listadeprodutos.get(i).getPreco()});

     }
    
    }//GEN-LAST:event_btnexcluirMouseClicked

    private void btnsairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsairMouseClicked
System.exit(0);        
    }//GEN-LAST:event_btnsairMouseClicked

    private void btneditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarMouseClicked
 //editar a tabela
 int posicao = tabela.getSelectedRow();
 listadeprodutos.get(posicao).setNome(txtnome.getText());
 listadeprodutos.get(posicao).setPreco(Double.parseDouble(txtpreco.getText()));
   
 //atualizar a tabela     
 DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
 modelo.setNumRows(0);
 
 for(int i = 0; i<listadeprodutos.size(); i++){
     modelo.addRow(new Object[]{listadeprodutos.get(i).getNome(), listadeprodutos.get(i).getPreco()});  
     }
    }//GEN-LAST:event_btneditarMouseClicked

   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProdutos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadicionar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnsair;
    private javax.swing.JLabel form;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel preco;
    private javax.swing.JLabel produto;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpreco;
    // End of variables declaration//GEN-END:variables
}
