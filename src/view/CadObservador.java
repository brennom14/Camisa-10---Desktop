/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ObservadorController;
import dao.DaoAtletaImp;
import dao.DaoObservadorImp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Atleta;
import model.Observador;

/**
 *
 * @author brenn
 */
public class CadObservador extends javax.swing.JInternalFrame {
    ObservadorController control=null;
    /**
     * Creates new form CadPatrocinador
     */
    List<Observador> obs = new ArrayList<Observador>();
    DaoObservadorImp dao = new DaoObservadorImp();
    int indice;
    public CadObservador() {
        initComponents();
        txtId.setEditable(false);
        control =  new ObservadorController();
        atualizaLista();
        indice = 0;
        try {
            mostrarDadosDoBancoNaTela();
        } catch (ParseException ex) {
            Logger.getLogger(CadObservador.class.getName()).log(Level.SEVERE, null, ex);
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
        txtSexo = new javax.swing.JTextField();
        txtAnexo = new javax.swing.JTextField();
        txtAtAssociado = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtData = new com.toedter.calendar.JDateChooser();
        txtCpf = new javax.swing.JFormattedTextField();
        txtObs = new com.toedter.calendar.JDateChooser();
        txtCelular = new javax.swing.JFormattedTextField();

        jLabel8.setText("jLabel8");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        ltlTitulo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ltlTitulo.setText("Cadastro de Observador");

        lblId.setText("ID:");

        lblNome.setText("Nome:");

        lblDatadeNascimento.setText("Data de Nascimento:");

        btnPrimeiro.setText("|<");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setText("<<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText(">>");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setText(">|");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-file.png"))); // NOI18N
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

        bntEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resume.png"))); // NOI18N
        bntEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash-can.png"))); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblCpf.setText("CPF:");

        lblAnexo.setText("Anexo:");

        lblSexo.setText("Sexo:");

        lblAtletas.setText("Atletas Associados:");

        lblCelular.setText("Celular:");

        lblCidade.setText("Cidade:");

        lblEmail.setText("Email:");

        lblObs.setText("Observador Desde?:");

        txtAtAssociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtAssociadoActionPerformed(evt);
            }
        });

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntEditar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluir)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblObs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtObs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(85, 85, 85)
                                            .addComponent(lblId))
                                        .addComponent(lblSexo, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDatadeNascimento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSexo)
                                        .addComponent(txtCidade)
                                        .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblAtletas)
                                .addGap(18, 18, 18)
                                .addComponent(txtAtAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAnexo)
                                    .addComponent(lblCpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCpf)
                                    .addComponent(txtAnexo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblCelular))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(txtCelular)))))
                    .addComponent(ltlTitulo))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ltlTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAnexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAnexo)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAtletas)
                                    .addComponent(txtAtAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDatadeNascimento)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSexo)
                                    .addComponent(lblCelular)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCidade)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmail)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblObs)
                            .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnPrimeiro, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAnterior, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnProximo)
                                .addComponent(btnUltimo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bntEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCpf)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
        Observador ob = new Observador();
        ob.setId(Integer.parseInt(txtId.getText()));
        ob.setNome(txtNome.getText());
        Date pegainicio = txtData.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String data = sdf.format(pegainicio);
        ob.setDataNascimento(data);
        System.out.println(ob.getDataNascimento());
        ob.setCpf(txtCpf.getText());
        ob.setSexo(txtSexo.getText());
        ob.setCidade(txtCidade.getText());
        Date dtobs = txtObs.getDate();
        String obs1 = sdf.format(dtobs);
        ob.setObsDesde(obs1);
        System.out.println(ob.getObsDesde());
        ob.setAnexo(txtAnexo.getText());
        ob.setAtletasAssociado(txtAtAssociado.getText());
        ob.setCelular(txtCelular.getText());
        ob.setEmail(txtEmail.getText());
        control.editar(ob
        );
         atualizaLista();
        indice= obs.size()-1;
        try {
            mostrarDadosDoBancoNaTela();
        } catch (ParseException ex) {
            Logger.getLogger(CadObservador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bntEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtId.setText("");
        txtNome.setText("");
        txtData.setDate(null);
        txtCpf.setText("");
        txtSexo.setText("");
        txtCidade.setText("");
        txtObs.setDate(null);
        txtAnexo.setText("");
        txtAtAssociado.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Observador ob = new Observador();
        ob.setNome(txtNome.getText());
        java.util.Date pegainicio = txtData.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String data1 = sdf.format(pegainicio);
        ob.setDataNascimento(data1);
        System.out.println(ob.getDataNascimento());
        ob.setCpf(txtCpf.getText());
        ob.setSexo(txtSexo.getText());
        ob.setCidade(txtCidade.getText());
        Date dtobs = txtObs.getDate();
        String obs1 = sdf.format(dtobs);
        ob.setObsDesde(obs1);
        System.out.println(ob.getObsDesde());
        ob.setAnexo(txtAnexo.getText());
        ob.setAtletasAssociado(txtAtAssociado.getText());
        ob.setCelular(txtCelular.getText());
        ob.setEmail(txtEmail.getText());
        control.inserir(ob);
        atualizaLista();
        indice= obs.size()-1;
        try {
            mostrarDadosDoBancoNaTela();
        } catch (ParseException ex) {
            Logger.getLogger(CadObservador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
     Observador ob = new Observador();
     ob.setId(Integer.parseInt(txtId.getText()));
     ob.setNome(txtNome.getText());
        Date pegainicio = txtData.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String data = sdf.format(pegainicio);
        ob.setDataNascimento(data);
        System.out.println(ob.getDataNascimento());
        ob.setCpf(txtCpf.getText());
        ob.setSexo(txtSexo.getText());
        ob.setCidade(txtCidade.getText());
        Date dtobs = txtObs.getDate();
        String obs1 = sdf.format(dtobs);
        ob.setObsDesde(obs1);
        System.out.println(ob.getObsDesde());
        ob.setAnexo(txtAnexo.getText());
        ob.setAtletasAssociado(txtAtAssociado.getText());
        ob.setCelular(txtCelular.getText());
        ob.setEmail(txtEmail.getText());
     control.excluir(ob);
     atualizaLista();
     indice= obs.size()-1;
        try {
            mostrarDadosDoBancoNaTela();
        } catch (ParseException ex) {
            Logger.getLogger(CadObservador.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        if (indice > obs.size()-1) {
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

    private void txtAtAssociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtAssociadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtAssociadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEditar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAnexo;
    private javax.swing.JLabel lblAtletas;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDatadeNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel ltlTitulo;
    private javax.swing.JTextField txtAnexo;
    private javax.swing.JTextField txtAtAssociado;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private com.toedter.calendar.JDateChooser txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private com.toedter.calendar.JDateChooser txtObs;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables

    public void mostrarDadosDoBancoNaTela() throws ParseException{
        if (obs.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Ainda não tem observadores cadastrados");
        }else{
            txtId.setText(""+obs.get(indice).getId());
            txtNome.setText(""+obs.get(indice).getNome());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
            Date dteinicio = sdf.parse(obs.get(indice).getDataNascimento());
            txtData.setDate(dteinicio);
            txtCpf.setText(""+obs.get(indice).getCpf());
            txtSexo.setText(""+obs.get(indice).getSexo());
            txtCidade.setText(""+obs.get(indice).getCidade());
            Date observador = sdf.parse(obs.get(indice).getObsDesde());
            txtObs.setDate(observador);
            txtAnexo.setText(""+obs.get(indice).getAnexo());
            txtAtAssociado.setText(""+obs.get(indice).getAtletasAssociado());
            txtCelular.setText(""+obs.get(indice).getCelular());
            txtEmail.setText(""+obs.get(indice).getEmail());
            
            
        }
    }
    public void atualizaLista(){
        obs.clear();
        obs = dao.getObservador();
    }
}
