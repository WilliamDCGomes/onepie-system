/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mklivre;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class MlOuEs extends javax.swing.JFrame {

    /**
     * Creates new form MlOuEs
     */
    public MlOuEs() {
        initComponents();
        URL caminhoIcone = getClass().getResource("/mklivre/icone/icone2.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
        varML1.setVisible(false);
        varML2.setVisible(false);
        varEs1.setVisible(false);
        varEs2.setVisible(false);
        varML3.setVisible(false);
        varML4.setVisible(false);
        varEs3.setVisible(false);
        varEs4.setVisible(false);
    }
    int nivel;
    String acesso="admin",nome;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        varML4 = new javax.swing.JLabel();
        varML3 = new javax.swing.JLabel();
        varEs4 = new javax.swing.JLabel();
        varEs1 = new javax.swing.JLabel();
        varEs3 = new javax.swing.JLabel();
        varEs2 = new javax.swing.JLabel();
        varML1 = new javax.swing.JLabel();
        varML2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        escolhaEstoque = new javax.swing.JButton();
        escolhaMercado = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mostrarNivel = new javax.swing.JLabel();
        acessoUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CAMINHO DO CADASTRO");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        varML4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/faixa-cinza-5.png"))); // NOI18N
        getContentPane().add(varML4);
        varML4.setBounds(140, 180, 210, 30);

        varML3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/faixa-cinza-5.png"))); // NOI18N
        getContentPane().add(varML3);
        varML3.setBounds(140, 180, 210, 30);

        varEs4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/faixa-cinza-5.png"))); // NOI18N
        getContentPane().add(varEs4);
        varEs4.setBounds(140, 270, 120, 30);

        varEs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/faixa-cinza-5.png"))); // NOI18N
        getContentPane().add(varEs1);
        varEs1.setBounds(140, 270, 120, 30);

        varEs3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/faixa-cinza-5.png"))); // NOI18N
        getContentPane().add(varEs3);
        varEs3.setBounds(30, 250, 60, 60);

        varEs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/faixa-cinza-5.png"))); // NOI18N
        getContentPane().add(varEs2);
        varEs2.setBounds(30, 250, 60, 60);

        varML1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/faixa-cinza-5.png"))); // NOI18N
        getContentPane().add(varML1);
        varML1.setBounds(30, 160, 60, 60);

        varML2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/faixa-cinza-5.png"))); // NOI18N
        getContentPane().add(varML2);
        varML2.setBounds(30, 160, 60, 60);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ESTOQUE");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(130, 240, 140, 80);

        escolhaEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ESTOQUE2.png"))); // NOI18N
        escolhaEstoque.setMaximumSize(new java.awt.Dimension(32, 32));
        escolhaEstoque.setMinimumSize(new java.awt.Dimension(32, 32));
        escolhaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaEstoqueActionPerformed(evt);
            }
        });
        escolhaEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                escolhaEstoqueKeyPressed(evt);
            }
        });
        getContentPane().add(escolhaEstoque);
        escolhaEstoque.setBounds(30, 250, 60, 58);

        escolhaMercado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MERCADO LIVEW.png"))); // NOI18N
        escolhaMercado.setMaximumSize(new java.awt.Dimension(32, 32));
        escolhaMercado.setMinimumSize(new java.awt.Dimension(32, 32));
        escolhaMercado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaMercadoActionPerformed(evt);
            }
        });
        escolhaMercado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                escolhaMercadoKeyPressed(evt);
            }
        });
        getContentPane().add(escolhaMercado);
        escolhaMercado.setBounds(30, 160, 60, 58);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("MERCADO LIVRE");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17);
        jLabel17.setBounds(120, 150, 250, 80);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("DESEJA CADASTRAR ESSE ITEM NO:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 80, 400, 60);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ESCOLHA UMA OPÇÃO");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(160, 10, 260, 60);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sem título.png"))); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 150, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo preto.png"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(1057, 340));
        jLabel1.setPreferredSize(new java.awt.Dimension(1057, 350));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 4, 450, 77);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FUNDO AMARELO.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, -331, 460, 430);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/RS.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 50, 570, 530);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/RS.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-30, 0, 390, 400);

        mostrarNivel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mostrarNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarNivel.setText("5");
        getContentPane().add(mostrarNivel);
        mostrarNivel.setBounds(520, 130, 50, 70);

        acessoUser.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        acessoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acessoUser.setText("ADMIN");
        getContentPane().add(acessoUser);
        acessoUser.setBounds(520, 220, 70, 60);

        setSize(new java.awt.Dimension(449, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void escolhaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaEstoqueActionPerformed
        if(acesso.equals("ML")&&nivel!=5){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO TEM ACESSO A ESSE MÓDULO!");
        }
        else{
            EstoqueCadastroItem es = new EstoqueCadastroItem();
            es.setVisible(true);
            es.mostrarNivel.setText(mostrarNivel.getText());
            es.acessoUser.setText(acessoUser.getText());
            this.dispose();
        }
    }//GEN-LAST:event_escolhaEstoqueActionPerformed

    private void escolhaMercadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaMercadoActionPerformed
        if(acesso.equals("ES")&&nivel!=5){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO TEM ACESSO A ESSE MÓDULO!");
        }
        else{
            CadastroNovoItem ml = new CadastroNovoItem();
            ml.setVisible(true);
            ml.mostrarNivel.setText(mostrarNivel.getText());
            ml.acessoUser.setText(acessoUser.getText());
            this.dispose();
        }
    }//GEN-LAST:event_escolhaMercadoActionPerformed

    private void escolhaMercadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escolhaMercadoKeyPressed
        if(acesso.equals("ES")&&nivel!=5){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO TEM ACESSO A ESSE MÓDULO!");
        }
        else if(evt.getKeyCode() == evt.VK_ENTER){
            CadastroNovoItem ml = new CadastroNovoItem();
            ml.setVisible(true);
            ml.mostrarNivel.setText(mostrarNivel.getText());
            ml.acessoUser.setText(acessoUser.getText());
            this.dispose();
        }
    }//GEN-LAST:event_escolhaMercadoKeyPressed

    private void escolhaEstoqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_escolhaEstoqueKeyPressed
        if(acesso.equals("ML")&&nivel!=5){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO TEM ACESSO A ESSE MÓDULO!");
        }
        else if(evt.getKeyCode() == evt.VK_ENTER){
            EstoqueCadastroItem es = new EstoqueCadastroItem();
            es.setVisible(true);
            es.mostrarNivel.setText(mostrarNivel.getText());
            es.acessoUser.setText(acessoUser.getText());
            this.dispose();
        }
    }//GEN-LAST:event_escolhaEstoqueKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        acesso = acessoUser.getText();
        nivel = Integer.parseInt(mostrarNivel.getText());
        if (acesso.equals("ES")&&nivel!=5){
            varML1.setVisible(true);
            varML2.setVisible(true);
            varML3.setVisible(true);
            varML4.setVisible(true);
        }
        else if(acesso.equals("ML")&&nivel!=5){
            varEs1.setVisible(true);
            varEs2.setVisible(true);
            varEs3.setVisible(true);
            varEs4.setVisible(true);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        if(acesso.equals("ML")&&nivel!=5){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO TEM ACESSO A ESSE MÓDULO!");
        }
        else{
            EstoqueCadastroItem es = new EstoqueCadastroItem();
            es.setVisible(true);
            es.mostrarNivel.setText(mostrarNivel.getText());
            es.acessoUser.setText(acessoUser.getText());
            this.dispose();
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        if(acesso.equals("ES")&&nivel!=5){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO TEM ACESSO A ESSE MÓDULO!");
        }
        else{
            CadastroNovoItem ml = new CadastroNovoItem();
            ml.setVisible(true);
            ml.mostrarNivel.setText(mostrarNivel.getText());
            ml.acessoUser.setText(acessoUser.getText());
            this.dispose();
        }
    }//GEN-LAST:event_jLabel17MouseClicked

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
            java.util.logging.Logger.getLogger(MlOuEs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MlOuEs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MlOuEs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MlOuEs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MlOuEs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel acessoUser;
    private javax.swing.JButton escolhaEstoque;
    private javax.swing.JButton escolhaMercado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel mostrarNivel;
    public javax.swing.JLabel varEs1;
    public javax.swing.JLabel varEs2;
    public javax.swing.JLabel varEs3;
    public javax.swing.JLabel varEs4;
    public javax.swing.JLabel varML1;
    public javax.swing.JLabel varML2;
    public javax.swing.JLabel varML3;
    public javax.swing.JLabel varML4;
    // End of variables declaration//GEN-END:variables
}