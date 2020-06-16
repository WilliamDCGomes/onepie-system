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
import java.sql.*;
import controle.ModuloConexao;
import java.text.DecimalFormat;
/**
 *
 * @author willi
 */
public class CadastroNovoItem extends javax.swing.JFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form NewJFrame
     */
    public CadastroNovoItem() {
        initComponents();
        URL caminhoIcone = getClass().getResource("/mklivre/icone/icone2.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
        conexao = ModuloConexao.conector();
    }
    DecimalFormat df =  new DecimalFormat("0.00");
    private void adicionar(){
        String sql = "insert into tb_pecas_ml2(NOME,CÓDIGO,PREÇO_DE_CUSTO,PREÇO,MARCA,PORCENTAGEM,QUANTIDADE,QUANTIDADE_MINIMA,QUANTIDADE_RECOMENDADA,OBSERVAÇÕES,LOCALIZAÇÃO,PAUSADO,REQUISIÇÃO,QUANTIDADE_DE_REQUISIÇÃO,QUANTIDADE_DE_VENDAS,LUCRO,REQUISIÇÃO_AUTOMATICA,STATUS_DA_REQUISIÇÃO,AGUARDANDO_PEÇAS,QUANTIDADE_PENDENTE,LINK) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,cadastroNome.getText());
            pst.setString(2,cadastroCodigo.getText());
            pst.setString(3, cadastroCusto.getText().replace(",","."));
            pst.setString(4, cadastroVenda.getText().replace(",","."));
            pst.setString(5,cadastroMarca.getText());
            pst.setInt(6,Integer.parseInt(cadastroPorcentagemDoMercadoLivre.getText()));
            pst.setInt(7,Integer.parseInt(cadastroQuantidadeDisponivel.getText()));
            pst.setInt(8,Integer.parseInt(qntMinima.getText()));
            pst.setInt(9,Integer.parseInt(qntRecomendada.getText()));
            pst.setString(10,cadastroObservacoes.getText());
            if(localizacao.getText().equals("")){
                pst.setString(11,"MERCADO LIVRE");
            }
            else{
                pst.setString(11,localizacao.getText());
            }
            pst.setString(12,"NÃO");
            pst.setString(13,"NÃO");
            pst.setInt(14,0);
            pst.setInt(15,0);
            float a=Float.parseFloat(cadastroPorcentagemDoMercadoLivre.getText().replace(",","."));
            float b=a/100;
            float lucro=(Float.parseFloat(cadastroVenda.getText().replace(",","."))-Float.parseFloat(cadastroCusto.getText().replace(",","."))-(Float.parseFloat(cadastroVenda.getText().replace(",","."))*b));
            String aux=df.format(lucro);
            pst.setString(16,aux);
            pst.setString(17,"NÃO");
            pst.setString(18,"NÃO");
            pst.setString(19,"NÃO");
            pst.setInt(20,0);
            if(link.getText().equals("")){
                pst.setString(21,"");
            }
            else{
                pst.setString(21,link.getText());
            }
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"ITEM CADASTRADO COM SUCESSO");
            TodosOsItensCadastrados usuario = new TodosOsItensCadastrados();
            usuario.setVisible(true);
            usuario.nomePeca.setText(cadastroNome.getText());
            usuario.codigoCadastrado.setText(cadastroCodigo.getText());
            usuario.marcaCadastrada.setText(cadastroMarca.getText());
            usuario.quantCadastrada.setText(cadastroQuantidadeDisponivel.getText());
            usuario.custoCadastrado.setText(cadastroCusto.getText());
            usuario.precoDeVenda.setText(cadastroVenda.getText());
            usuario.lucroCadastrado.setText(aux);
            usuario.caixaLocalizada.setText("");
            usuario.localizacaoCadastrada.setText(localizacao.getText());
            usuario.mostrarNivel.setText(mostrarNivel.getText());
            usuario.acessoUser.setText(acessoUser.getText());
            usuario.cadastroObservacoes.setText(cadastroObservacoes.getText());
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel34 = new javax.swing.JLabel();
        link = new javax.swing.JTextField();
        localizacao = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        qntRecomendada = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cadastroCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cadastroMarca = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cadastroNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cadastroObservacoes = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        cadastroQuantidadeDisponivel = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cadastroPorcentagemDoMercadoLivre = new javax.swing.JTextField();
        cadastroCusto = new javax.swing.JTextField();
        botaoEntrarIniciall = new javax.swing.JButton();
        botaoEntrarIniciall1 = new javax.swing.JButton();
        cadastroVenda = new javax.swing.JTextField();
        qntMinima = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mostrarNivel = new javax.swing.JLabel();
        acessoUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE NOVOS ITENS");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("LINK DO MERCADO LIVRE");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(280, 350, 250, 17);

        link.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkActionPerformed(evt);
            }
        });
        link.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                linkKeyPressed(evt);
            }
        });
        getContentPane().add(link);
        link.setBounds(280, 380, 190, 30);

        localizacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        localizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localizacaoActionPerformed(evt);
            }
        });
        localizacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                localizacaoKeyPressed(evt);
            }
        });
        getContentPane().add(localizacao);
        localizacao.setBounds(30, 380, 190, 30);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("LOCALIZAÇÃO");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(30, 350, 130, 17);

        qntRecomendada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qntRecomendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qntRecomendadaActionPerformed(evt);
            }
        });
        qntRecomendada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qntRecomendadaKeyPressed(evt);
            }
        });
        getContentPane().add(qntRecomendada);
        qntRecomendada.setBounds(480, 300, 140, 30);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("QUANTIDADE RECOMENDADA");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(480, 270, 220, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PORCENTAGEM DO MERCADO LIVRE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 190, 270, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CÓDIGO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 110, 100, 17);

        cadastroCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastroCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastroCodigoKeyPressed(evt);
            }
        });
        getContentPane().add(cadastroCodigo);
        cadastroCodigo.setBounds(280, 140, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PREÇO DE CUSTO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 110, 130, 17);

        cadastroMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastroMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastroMarcaKeyPressed(evt);
            }
        });
        getContentPane().add(cadastroMarca);
        cadastroMarca.setBounds(280, 220, 140, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("*");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(220, 250, 40, 60);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(350, 100, 30, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("*");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(610, 110, 20, 22);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("*");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(70, 100, 30, 40);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("NOME");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(30, 110, 70, 17);

        cadastroNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastroNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastroNomeKeyPressed(evt);
            }
        });
        getContentPane().add(cadastroNome);
        cadastroNome.setBounds(30, 140, 210, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/MER-LIVRE.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(715, 5, 70, 75);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("OBSERVAÇÕES");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(30, 430, 200, 17);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("QUANTIDADE DISPONÍVEL");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(30, 270, 200, 17);

        cadastroObservacoes.setColumns(20);
        cadastroObservacoes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cadastroObservacoes.setRows(5);
        cadastroObservacoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastroObservacoesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(cadastroObservacoes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 460, 730, 140);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sem título.png"))); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-4, 0, 150, 80);

        cadastroQuantidadeDisponivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastroQuantidadeDisponivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastroQuantidadeDisponivelKeyPressed(evt);
            }
        });
        getContentPane().add(cadastroQuantidadeDisponivel);
        cadastroQuantidadeDisponivel.setBounds(30, 300, 140, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("MARCA");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(280, 190, 150, 17);

        cadastroPorcentagemDoMercadoLivre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastroPorcentagemDoMercadoLivre.setText("11");
        cadastroPorcentagemDoMercadoLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroPorcentagemDoMercadoLivreActionPerformed(evt);
            }
        });
        cadastroPorcentagemDoMercadoLivre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastroPorcentagemDoMercadoLivreKeyPressed(evt);
            }
        });
        getContentPane().add(cadastroPorcentagemDoMercadoLivre);
        cadastroPorcentagemDoMercadoLivre.setBounds(480, 220, 140, 30);

        cadastroCusto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastroCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastroCustoKeyPressed(evt);
            }
        });
        getContentPane().add(cadastroCusto);
        cadastroCusto.setBounds(480, 140, 140, 30);

        botaoEntrarIniciall.setBackground(new java.awt.Color(0, 0, 0));
        botaoEntrarIniciall.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botaoEntrarIniciall.setForeground(new java.awt.Color(255, 255, 255));
        botaoEntrarIniciall.setText("CADASTRAR");
        botaoEntrarIniciall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarIniciallActionPerformed(evt);
            }
        });
        botaoEntrarIniciall.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoEntrarIniciallKeyPressed(evt);
            }
        });
        getContentPane().add(botaoEntrarIniciall);
        botaoEntrarIniciall.setBounds(30, 640, 160, 40);

        botaoEntrarIniciall1.setBackground(new java.awt.Color(0, 0, 0));
        botaoEntrarIniciall1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botaoEntrarIniciall1.setForeground(new java.awt.Color(255, 255, 255));
        botaoEntrarIniciall1.setText("PESQUISAR");
        botaoEntrarIniciall1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarIniciall1ActionPerformed(evt);
            }
        });
        botaoEntrarIniciall1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoEntrarIniciall1KeyPressed(evt);
            }
        });
        getContentPane().add(botaoEntrarIniciall1);
        botaoEntrarIniciall1.setBounds(290, 640, 160, 40);

        cadastroVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastroVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastroVendaKeyPressed(evt);
            }
        });
        getContentPane().add(cadastroVenda);
        cadastroVenda.setBounds(30, 220, 140, 30);

        qntMinima.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qntMinima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qntMinimaKeyPressed(evt);
            }
        });
        getContentPane().add(qntMinima);
        qntMinima.setBounds(280, 300, 140, 30);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("QUANTIDADE MINIMA");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(280, 270, 200, 17);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("PREÇO PARA VENDA");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(30, 190, 150, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CADASTRO DE NOVOS ITENS");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(250, 10, 320, 60);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("*");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(330, 170, 40, 60);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 0));
        jLabel31.setText("*");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(750, 160, 30, 80);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo preto.png"))); // NOI18N
        jLabel12.setMinimumSize(new java.awt.Dimension(1057, 340));
        jLabel12.setPreferredSize(new java.awt.Dimension(1057, 350));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(-80, 4, 760, 77);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 0));
        jLabel33.setText("*");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(450, 250, 30, 60);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("*");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(690, 250, 40, 60);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("*");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(190, 170, 30, 60);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PROCURA HEHE.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(430, 610, 80, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo preto.png"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(1057, 340));
        jLabel1.setPreferredSize(new java.awt.Dimension(1057, 350));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 4, 760, 77);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/NOVO HEHE.png"))); // NOI18N
        getContentPane().add(jLabel26);
        jLabel26.setBounds(170, 610, 80, 70);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FUNDO AMARELO.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, -331, 810, 430);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/RS.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 10, 610, 530);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/RS.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 340, 570, 530);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/RS.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-20, 450, 570, 530);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/RS.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 570, 530);

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

        setSize(new java.awt.Dimension(789, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void qntRecomendadaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qntRecomendadaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            localizacao.requestFocus();
        }
    }//GEN-LAST:event_qntRecomendadaKeyPressed

    private void cadastroCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastroCodigoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            cadastroCusto.requestFocus();
        }
    }//GEN-LAST:event_cadastroCodigoKeyPressed

    private void cadastroMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastroMarcaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            cadastroPorcentagemDoMercadoLivre.requestFocus();
        }
    }//GEN-LAST:event_cadastroMarcaKeyPressed

    private void cadastroNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastroNomeKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            cadastroCodigo.requestFocus();
        }
    }//GEN-LAST:event_cadastroNomeKeyPressed

    private void cadastroObservacoesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastroObservacoesKeyPressed
        
    }//GEN-LAST:event_cadastroObservacoesKeyPressed

    private void cadastroQuantidadeDisponivelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastroQuantidadeDisponivelKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            qntMinima.requestFocus();
        }
    }//GEN-LAST:event_cadastroQuantidadeDisponivelKeyPressed

    private void cadastroPorcentagemDoMercadoLivreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastroPorcentagemDoMercadoLivreKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            cadastroQuantidadeDisponivel.requestFocus();
        }
    }//GEN-LAST:event_cadastroPorcentagemDoMercadoLivreKeyPressed

    private void cadastroCustoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastroCustoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            cadastroVenda.requestFocus();
        }
    }//GEN-LAST:event_cadastroCustoKeyPressed

    private void botaoEntrarIniciallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarIniciallActionPerformed
        if(cadastroNome.getText().equals("")||cadastroCodigo.getText().equals("")||cadastroCusto.getText().equals("")||cadastroVenda.getText().equals("")||cadastroMarca.getText().equals("")||cadastroPorcentagemDoMercadoLivre.getText().equals("")||cadastroQuantidadeDisponivel.getText().equals("")||qntMinima.getText().equals("")||qntRecomendada.getText().equals("")){
            JOptionPane.showMessageDialog(null, "POR FAVOR PREENCHA TODOS OS CAMPOS OBRIGATÓRIOS");
        }
        else{
            adicionar();
        }
    }//GEN-LAST:event_botaoEntrarIniciallActionPerformed

    private void botaoEntrarIniciall1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarIniciall1ActionPerformed
        LocalizarGlobalPecas verifica = new LocalizarGlobalPecas();
        verifica.setVisible(true);
        verifica.mostrarNivel.setText(mostrarNivel.getText());
        verifica.acessoUser.setText(acessoUser.getText());
    }//GEN-LAST:event_botaoEntrarIniciall1ActionPerformed

    private void cadastroVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastroVendaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            cadastroMarca.requestFocus();
        }
    }//GEN-LAST:event_cadastroVendaKeyPressed

    private void qntMinimaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qntMinimaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            qntRecomendada.requestFocus();
        }
    }//GEN-LAST:event_qntMinimaKeyPressed

    private void botaoEntrarIniciall1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoEntrarIniciall1KeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            LocalizarGlobalPecas verifica = new LocalizarGlobalPecas();
            verifica.setVisible(true);
            verifica.mostrarNivel.setText(mostrarNivel.getText());
            verifica.acessoUser.setText(acessoUser.getText());
        }
    }//GEN-LAST:event_botaoEntrarIniciall1KeyPressed

    private void botaoEntrarIniciallKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoEntrarIniciallKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            if(cadastroNome.getText().equals("")||cadastroCodigo.getText().equals("")||cadastroCusto.getText().equals("")||cadastroVenda.getText().equals("")||cadastroMarca.getText().equals("")||cadastroPorcentagemDoMercadoLivre.getText().equals("")||cadastroQuantidadeDisponivel.getText().equals("")||qntMinima.getText().equals("")||qntRecomendada.getText().equals("")){
                JOptionPane.showMessageDialog(null, "POR FAVOR PREENCHA TODOS OS CAMPOS OBRIGATÓRIOS");
            }
            else{
                adicionar();
            }
        }
    }//GEN-LAST:event_botaoEntrarIniciallKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        cadastroObservacoes.setWrapStyleWord(true);
    }//GEN-LAST:event_formWindowActivated

    private void cadastroPorcentagemDoMercadoLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroPorcentagemDoMercadoLivreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroPorcentagemDoMercadoLivreActionPerformed

    private void localizacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_localizacaoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            link.requestFocus();
        }
    }//GEN-LAST:event_localizacaoKeyPressed

    private void linkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linkKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            cadastroObservacoes.requestFocus();
        }
    }//GEN-LAST:event_linkKeyPressed

    private void linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkActionPerformed

    private void localizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localizacaoActionPerformed

    private void qntRecomendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qntRecomendadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qntRecomendadaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroNovoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroNovoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroNovoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroNovoItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroNovoItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel acessoUser;
    private javax.swing.JButton botaoEntrarIniciall;
    private javax.swing.JButton botaoEntrarIniciall1;
    public static javax.swing.JTextField cadastroCodigo;
    private javax.swing.JTextField cadastroCusto;
    private javax.swing.JTextField cadastroMarca;
    public static javax.swing.JTextField cadastroNome;
    private javax.swing.JTextArea cadastroObservacoes;
    private javax.swing.JTextField cadastroPorcentagemDoMercadoLivre;
    private javax.swing.JTextField cadastroQuantidadeDisponivel;
    private javax.swing.JTextField cadastroVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField link;
    public static javax.swing.JTextField localizacao;
    public static javax.swing.JLabel mostrarNivel;
    private javax.swing.JTextField qntMinima;
    private javax.swing.JTextField qntRecomendada;
    // End of variables declaration//GEN-END:variables
}