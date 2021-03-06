/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ObservadorController;
import dao.DaoObservadorImp;
import dao.DaoUsuarioImp;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Observador;
import model.Usuarios;
import util.CopiarDiretorio;

/**
 *
 * @author brenn
 */
public class CadObservador extends javax.swing.JInternalFrame {

    ObservadorController control = null;
    boolean salvo = true;
    File f;
    Usuarios user;
    /**
     * Creates new form CadPatrocinador
     */
    List<Observador> obs = new ArrayList<Observador>();
    DaoObservadorImp dao = new DaoObservadorImp();
    int indice;

    public CadObservador() {
        initComponents();
        txtId.setEditable(false);
        control = new ObservadorController();
        atualizaLista();
        indice = 0;
        try {
            mostrarDadosDoBancoNaTela();
        } catch (ParseException ex) {
            Logger.getLogger(CadObservador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public CadObservador(Usuarios use) {
        user = use;
        int s = use.getStatus();
        initComponents();
        txtId.setEditable(false);
        control = new ObservadorController();
        btnSalvar.setEnabled(false);
        atualizaLista();
        indice = 0;
        try {
            mostrarDadosDoBancoNaTela();
        } catch (ParseException ex) {
            Logger.getLogger(CadObservador.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (s == 2 || !txtEmail.getText().equals(use.getEmail())) {
            btnExcluir.setEnabled(false);
            bntEditar.setEnabled(false);
        }
        ///aqui apagar o ativamento do botao novo
        if (s == 1) {
            txtEmail.setEditable(true);
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

        jLabel8 = new javax.swing.JLabel();
        ltlTitulo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDatadeNascimento = new javax.swing.JLabel();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        bntEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        lblAnexo = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblAtletas = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblObs = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtAssociado = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtData = new com.toedter.calendar.JDateChooser();
        txtCpf = new javax.swing.JFormattedTextField();
        txtObs = new com.toedter.calendar.JDateChooser();
        txtCelular = new javax.swing.JFormattedTextField();
        lblImagem = new javax.swing.JLabel();
        lblImagem2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnCarregar = new javax.swing.JButton();
        CbxSexo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        CbxEstado = new javax.swing.JComboBox<>();

        jLabel8.setText("jLabel8");

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        ltlTitulo.setFont(new java.awt.Font("Georgia", 0, 28)); // NOI18N
        ltlTitulo.setText("Cadastro de Observador");

        lblId.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblId.setText("ID:");

        txtId.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lblNome.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtNome.setEnabled(false);

        lblDatadeNascimento.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblDatadeNascimento.setText("Data de Nascimento:");

        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/begin.png"))); // NOI18N
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/next.png"))); // NOI18N
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/last.png"))); // NOI18N
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        bntEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/portfolio.png"))); // NOI18N
        bntEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash.png"))); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblCpf.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblCpf.setText("CPF:");

        lblAnexo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblAnexo.setText("Anexo:");

        lblSexo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblSexo.setText("Sexo:");

        lblAtletas.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblAtletas.setText("Clube Associado:");

        lblCelular.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblCelular.setText("Celular:");

        lblCidade.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblCidade.setText("Cidade:");

        lblEmail.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblEmail.setText("Email:");

        lblObs.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblObs.setText("Observador Desde?:");

        txtCidade.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtCidade.setEnabled(false);

        txtAssociado.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtAssociado.setEnabled(false);

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtEmail.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtEmail.setEnabled(false);

        txtData.setEnabled(false);

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setEnabled(false);

        txtObs.setEnabled(false);

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setEnabled(false);

        btnBuscar.setText("Carregar imagem de anexo");
        btnBuscar.setEnabled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCarregar.setText("Carregar imagem de perfil do Observador");
        btnCarregar.setEnabled(false);
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        CbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel1.setText("Estado:");

        CbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre","Alagoas","Amapá","Amazonas","Bahia","Ceará","Distrito Federal","Espírito Santo","Goiás","Maranhão","Mato Grosso","Mato Grosso do Sul","Minas Gerais","Pará","Paraíba","Paraná","Pernambuco","Piauí","Rio de Janeiro","Rio Grande do Norte","Rio Grande do Sul","Rondônia","Roraima","Santa Catarina","São Paulo","Sergipe","Tocantins","Estrangeiro" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(255, 255, 255)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblCidade)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                        .addComponent(txtCidade))
                                    .addGap(11, 11, 11))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAnterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(94, 94, 94)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCpf)
                                .addGap(150, 150, 150)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bntEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnUltimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 65, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CbxSexo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addComponent(CbxEstado, javax.swing.GroupLayout.Alignment.TRAILING, 0, 175, Short.MAX_VALUE))
                                    .addComponent(lblSexo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAssociado)
                                    .addComponent(txtObs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblObs)
                                            .addComponent(lblAtletas))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(lblId)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNome)
                                        .addComponent(lblEmail))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addComponent(lblCelular)
                                        .addComponent(txtCelular)))
                                .addComponent(lblAnexo, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblNome)
                                .addGap(218, 218, 218)
                                .addComponent(lblDatadeNascimento)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCarregar, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                .addGap(109, 109, 109))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(ltlTitulo)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ltlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNome)
                                    .addComponent(lblDatadeNascimento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblCelular))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblImagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAnexo)
                        .addGap(5, 5, 5))
                    .addComponent(btnCarregar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCpf)
                            .addComponent(lblSexo)
                            .addComponent(lblObs))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCidade)
                            .addComponent(lblAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCidade)
                            .addComponent(txtAssociado)
                            .addComponent(CbxEstado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAnterior, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnProximo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUltimo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntEditar)
                            .addComponent(btnSalvar)
                            .addComponent(btnExcluir)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovo)))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        indice = 0;
        try {
            mostrarDadosDoBancoNaTela();
        } catch (ParseException ex) {
            Logger.getLogger(CadObservador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void bntEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditarActionPerformed
        salvo = true;
        habilitaOuNao(true);
        btnSalvar.setEnabled(true);
    }//GEN-LAST:event_bntEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        ///aqui
        habilitaOuNao(true);
        //*
        txtId.setText("");
        txtNome.setText("");
        txtData.setDate(null);
        txtCpf.setText("");
        CbxSexo.setSelectedItem("Selecionar");
        CbxEstado.setSelectedItem("Selecionar");
        txtCidade.setText("");
        txtObs.setDate(null);
        lblImagem2.setIcon(null);
        lblImagem.setIcon(null);
        txtAssociado.setText("");
        txtCelular.setText("");
        txtEmail.setText(user.getEmail());
        btnSalvar.setEnabled(true);
        btnNovo.setEnabled(false);
        /////aqui
        salvo = false;
        //*
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //primeiro pega os campos e cria o objeto
        Observador ob = new Observador();
        ob.setNome(txtNome.getText());
        Date pegainicio = txtData.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String data = sdf.format(pegainicio);
        ob.setDataNascimento(data);
        ob.setCpf(txtCpf.getText());
        ob.setSexo(CbxSexo.getSelectedItem().toString());
        ob.setEstado(CbxEstado.getSelectedItem().toString());
        ob.setCidade(txtCidade.getText());
        Date dtobs = txtObs.getDate();
        String obs1 = sdf.format(dtobs);
        ob.setObsDesde(obs1);
        ob.setClubeAssociado(txtAssociado.getText());
        ob.setCelular(txtCelular.getText());
        ob.setEmail(txtEmail.getText());
        ob.setImagem(new String[2]);
        //cria a variavel resposta
        boolean resposta;
        ///verifica se é uma informação nova ou se esta editando uma ja existente
        if (salvo) {
            ob.setId(Integer.parseInt(txtId.getText()));
            resposta = control.editar(ob);
        } else {
            resposta = control.inserir(ob);
        }
        //verifica se deu certo os dao
        if (resposta) {
            btnSalvar.setEnabled(false);
            habilitaOuNao(false);
            atualizaLista();
            indice = obs.size() - 1;
            ob.setImagem(new String[]{"src/arteVisual/Observador id " + (obs.get(indice).getId()) + " " + (new File(lblImagem.getIcon().toString())).getName(),
                "src/arteVisual/Observador id " + (obs.get(indice).getId()) + " Aut " + new File(lblImagem2.getIcon().toString()).getName()});
            control.editarSemJO(ob);
            atualizaLista();
            try {
                new CopiarDiretorio().copy(new File(lblImagem.getIcon().toString()), new File("Observador id " + (obs.get(indice).getId())));
                new CopiarDiretorio().copy(new File(lblImagem2.getIcon().toString()), new File("Observador id " + (obs.get(indice).getId() + " Aut")));
                control.editarSemJO(ob);
                atualizaLista();
                indice = obs.size() - 1;
                try {
                    mostrarDadosDoBancoNaTela();
                } catch (ParseException ex) {
                    Logger.getLogger(CadObservador.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(CadObservador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        dao.excluir(obs.get(indice));
        user.setValido(false);
        new DaoUsuarioImp().alterar(user);
        JOptionPane.showMessageDialog(null, "Observador apagado com sucesso!!");
        this.dispose();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        indice--;
        if (indice < 0) {
            indice++;
            JOptionPane.showMessageDialog(this, "Você já está no primeiro cadastro");
        } else {
            try {
                mostrarDadosDoBancoNaTela();
            } catch (ParseException ex) {
                Logger.getLogger(CadObservador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        indice++;
        if (indice > obs.size() - 1) {
            indice--;
            JOptionPane.showMessageDialog(this, "Você já está no último cadastro");
        } else {
            try {
                mostrarDadosDoBancoNaTela();
            } catch (ParseException ex) {
                Logger.getLogger(CadObservador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        indice = obs.size() - 1;
        try {
            mostrarDadosDoBancoNaTela();
        } catch (ParseException ex) {
            Logger.getLogger(CadObservador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        f = chooser.getSelectedFile();
        lblImagem2.setIcon(new ImageIcon(f.toString()));
        // JOptionPane.showMessageDialog(null,lblImagem.getIcon().toString());

        try {
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        f = chooser.getSelectedFile();
        lblImagem.setIcon(new ImageIcon(f.toString()));
        // JOptionPane.showMessageDialog(null,lblImagem.getIcon().toString());

        try {
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCarregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxEstado;
    private javax.swing.JComboBox<String> CbxSexo;
    private javax.swing.JButton bntEditar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAnexo;
    private javax.swing.JLabel lblAtletas;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDatadeNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblImagem2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel ltlTitulo;
    private javax.swing.JTextField txtAssociado;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private com.toedter.calendar.JDateChooser txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private com.toedter.calendar.JDateChooser txtObs;
    // End of variables declaration//GEN-END:variables

    public void mostrarDadosDoBancoNaTela() throws ParseException {
        if (obs.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ainda não tem observadores cadastrados");
        } else {
            if (obs.get(indice).getEmail().equals(user.getEmail())) {
                bntEditar.setEnabled(true);
                btnExcluir.setEnabled(true);
                ///aqui
                if (user.isValido()) {
                    btnNovo.setEnabled(false);
                }
                //***
            } else {
                bntEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                ///aqui
                btnNovo.setEnabled(true);
                ///***
            }
            txtId.setText("" + obs.get(indice).getId());
            txtNome.setText("" + obs.get(indice).getNome());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dteinicio = sdf.parse(obs.get(indice).getDataNascimento());
            txtData.setDate(dteinicio);
            txtCpf.setText("" + obs.get(indice).getCpf());
            CbxEstado.setSelectedItem("" + obs.get(indice).getEstado());
            CbxSexo.setSelectedItem("" + obs.get(indice).getSexo());
            txtCidade.setText("" + obs.get(indice).getCidade());
            Date observador = sdf.parse(obs.get(indice).getObsDesde());
            txtObs.setDate(observador);
            txtAssociado.setText("" + obs.get(indice).getClubeAssociado());
            txtCelular.setText("" + obs.get(indice).getCelular());
            txtEmail.setText("" + obs.get(indice).getEmail());
            lblImagem.setIcon(new ImageIcon(obs.get(indice).getImagem()[0]));
            lblImagem2.setIcon(new ImageIcon(obs.get(indice).getImagem()[1]));

        }
    }

    ///aqui
    public void habilitaOuNao(boolean b) {
        txtNome.setEnabled(b);
        txtAssociado.setEnabled(b);
        txtCelular.setEnabled(b);
        txtCidade.setEnabled(b);
        txtCpf.setEnabled(b);
        CbxSexo.setEnabled(b);
        txtData.setEnabled(b);
        txtObs.setEnabled(b);
        btnBuscar.setEnabled(b);
        btnCarregar.setEnabled(b);
    }

    //**
    public void atualizaLista() {
        obs.clear();
        obs = dao.getObservador();
    }
}
