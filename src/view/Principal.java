/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AtletaController;
import controller.ObservadorController;
import java.awt.Desktop;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Atleta;
import model.Observador;

/**
 *
 * @author benep
 */
public class Principal extends javax.swing.JFrame {

    List<Atleta> lista = new ArrayList<Atleta>();
    AtletaController controller = new AtletaController();
    List<Observador> observadores = new ArrayList<Observador>();
    ObservadorController observador = new ObservadorController();

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    public Principal(int status) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        if (status==2)
        {
            menuItemAtleta.setEnabled(false);
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

        desktop = new javax.swing.JDesktopPane();
        nomeProjeto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        menuItemAtleta = new javax.swing.JMenuItem();
        menuItemObservador = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        relatorioClube = new javax.swing.JMenuItem();
        relatorioPatrocinador = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktop.setBackground(new java.awt.Color(255, 255, 255));
        desktop.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 947, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        nomeProjeto.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 48)); // NOI18N
        nomeProjeto.setText("Camisa10");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Futebol-amador-Rodrigo-Erib-2 (2).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        menuCadastrar.setText("Cadastrar");

        menuItemAtleta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuItemAtleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/soccer (2).png"))); // NOI18N
        menuItemAtleta.setText("Atleta");
        menuItemAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAtletaActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuItemAtleta);

        menuItemObservador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuItemObservador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coach.png"))); // NOI18N
        menuItemObservador.setText("Observador");
        menuItemObservador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemObservadorActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuItemObservador);

        jMenuBar1.add(menuCadastrar);

        menuRelatorio.setText("Relatório");
        menuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioActionPerformed(evt);
            }
        });

        relatorioClube.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        relatorioClube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/analysis.png"))); // NOI18N
        relatorioClube.setText("Atleta");
        relatorioClube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioClubeActionPerformed(evt);
            }
        });
        menuRelatorio.add(relatorioClube);

        relatorioPatrocinador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        relatorioPatrocinador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/analysis.png"))); // NOI18N
        relatorioPatrocinador.setText("Observador");
        relatorioPatrocinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioPatrocinadorActionPerformed(evt);
            }
        });
        menuRelatorio.add(relatorioPatrocinador);

        jMenuBar1.add(menuRelatorio);

        menuSobre.setText("Ajuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/about.png"))); // NOI18N
        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuSobre.add(jMenuItem1);

        jMenuBar1.add(menuSobre);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeProjeto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(nomeProjeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(110, Short.MAX_VALUE))
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        int sair = JOptionPane.showConfirmDialog(null, "tem certeza que deseja sair", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuSairMouseClicked

    private void relatorioPatrocinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioPatrocinadorActionPerformed
        // TODO add your handling code here:
         int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão desse relatório?","Atenção", JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION){
            observador.gerarRelatorioObservador();
        }
    }//GEN-LAST:event_relatorioPatrocinadorActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRelatorioActionPerformed

    private void relatorioClubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioClubeActionPerformed
        // TODO add your handling code here:
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão desse relatório?","Atenção", JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION){
            controller.gerarRelatorio();
        }
    }//GEN-LAST:event_relatorioClubeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuItemObservadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemObservadorActionPerformed
        // TODO add your handling code here:
        CadObservador co = new CadObservador();
        co.setVisible(true);
        desktop.add(co);
    }//GEN-LAST:event_menuItemObservadorActionPerformed

    private void menuItemAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAtletaActionPerformed
        // TODO add your handling code here:
        CadAtleta ca = new CadAtleta();
        desktop.add(ca);
        ca.setVisible(true);
    }//GEN-LAST:event_menuItemAtletaActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenuItem menuItemAtleta;
    private javax.swing.JMenuItem menuItemObservador;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JLabel nomeProjeto;
    private javax.swing.JMenuItem relatorioClube;
    private javax.swing.JMenuItem relatorioPatrocinador;
    // End of variables declaration//GEN-END:variables
}
