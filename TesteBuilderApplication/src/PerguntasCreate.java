
import Repositorio.PerguntasDAO;
import Repositorio.RespostasDAO;
import Entidades.Pergunta;
import Entidades.Resposta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Murilo
 */
public class PerguntasCreate extends javax.swing.JFrame {

    /**
     * Creates new form FormJFrame
     */
    private Pergunta _pergunta;
    private ArrayList<Resposta> _respostas;
    RespostasDAO _respostaDao;
    PerguntasDAO _perguntasDao;

    public PerguntasCreate(Pergunta pergunta) throws SQLException {
        _pergunta = pergunta;
        _respostaDao = new RespostasDAO();
        _respostas = _respostaDao.RetornarRepostas(_pergunta.Id);

        initComponents();
        jButton1.setEnabled(false);
        btnEditar.setEnabled(true);

        txtEnunciado.setText(pergunta.Pergunta);

        switch (pergunta.Tipo) {
            case 0:
                rdbFacil.setSelected(true);
                break;
            case 1:
                rdbMedio.setSelected(true);
                break;
            case 2:
                rdbDificil.setSelected(true);
                break;
        }

        if (_respostas.size() >= 4) {
            txtResposta1.setText(_respostas.get(0).Resposta);
            cbxResposta1.setSelected(_respostas.get(0).EhCorreta);

            txtResposta2.setText(_respostas.get(1).Resposta);
            cbxResposta2.setSelected(_respostas.get(1).EhCorreta);

            txtResposta3.setText(_respostas.get(2).Resposta);
            cbxResposta3.setSelected(_respostas.get(2).EhCorreta);

            txtResposta4.setText(_respostas.get(3).Resposta);
            cbxResposta4.setSelected(_respostas.get(3).EhCorreta);

            txtResposta5.setText(_respostas.get(4).Resposta);
            cbxResposta5.setSelected(_respostas.get(4).EhCorreta);
        }

    }

    public PerguntasCreate() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupOptionType = new javax.swing.ButtonGroup();
        btnGroupLevel = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtEnunciado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtResposta1 = new javax.swing.JTextField();
        txtResposta2 = new javax.swing.JTextField();
        txtResposta3 = new javax.swing.JTextField();
        txtResposta4 = new javax.swing.JTextField();
        txtResposta5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbxResposta1 = new javax.swing.JCheckBox();
        cbxResposta2 = new javax.swing.JCheckBox();
        cbxResposta4 = new javax.swing.JCheckBox();
        cbxResposta3 = new javax.swing.JCheckBox();
        cbxResposta5 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        rdbDificil = new javax.swing.JRadioButton();
        rdbMedio = new javax.swing.JRadioButton();
        rdbFacil = new javax.swing.JRadioButton();
        btnEditar = new javax.swing.JButton();

        jLabel1.setText("Enunciado:");

        jLabel3.setText("Respotas:");

        txtResposta1.setPreferredSize(new java.awt.Dimension(200, 40));

        txtResposta2.setPreferredSize(new java.awt.Dimension(200, 40));

        txtResposta3.setPreferredSize(new java.awt.Dimension(200, 40));

        txtResposta4.setPreferredSize(new java.awt.Dimension(200, 40));

        txtResposta5.setPreferredSize(new java.awt.Dimension(200, 40));

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Correta:");

        cbxResposta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxResposta1ActionPerformed(evt);
            }
        });

        cbxResposta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxResposta2ActionPerformed(evt);
            }
        });

        cbxResposta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxResposta4ActionPerformed(evt);
            }
        });

        cbxResposta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxResposta3ActionPerformed(evt);
            }
        });

        cbxResposta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxResposta5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nível");

        btnGroupLevel.add(rdbDificil);
        rdbDificil.setText("Difícil");

        btnGroupLevel.add(rdbMedio);
        rdbMedio.setText("Médio");

        btnGroupLevel.add(rdbFacil);
        rdbFacil.setText("Fácil");

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnunciado)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbFacil)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdbMedio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdbDificil)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtResposta3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                    .addComponent(txtResposta2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtResposta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtResposta4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtResposta5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxResposta2)
                                    .addComponent(cbxResposta1)
                                    .addComponent(cbxResposta4)
                                    .addComponent(cbxResposta3)
                                    .addComponent(cbxResposta5)
                                    .addComponent(jLabel4))
                                .addGap(8, 8, 8))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(rdbFacil)
                            .addComponent(rdbDificil)
                            .addComponent(rdbMedio))
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbxResposta1)
                    .addComponent(txtResposta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResposta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxResposta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResposta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxResposta3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResposta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxResposta4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtResposta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbxResposta5)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ZerarCampos() {
        txtEnunciado.setText("");
        txtResposta1.setText("");
        txtResposta2.setText("");
        txtResposta3.setText("");
        txtResposta4.setText("");
        txtResposta5.setText("");
    }

    private boolean CamposPreenchidos() {
        if (txtEnunciado.getText().equals("")
                || txtResposta1.getText().equals("")
                || txtResposta2.getText().equals("")
                || txtResposta3.getText().equals("")
                || txtResposta4.getText().equals("")
                || txtResposta5.getText().equals("")) {
            return false;
        }

        return true;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (!CamposPreenchidos()) {
                throw new Exception("Preencha todos os dados");
            }
            _perguntasDao = new PerguntasDAO();
            Pergunta perguntas = new Pergunta();
            perguntas.Pergunta = txtEnunciado.getText();

            int tipo;
            if (rdbFacil.isSelected()) {
                tipo = 0;
            } else if (rdbMedio.isSelected()) {
                tipo = 1;
            } else //rdbDificil.isSelected()
            {
                tipo = 2;
            }

            perguntas.Tipo = tipo;
            RespostasDAO respostasClient = new RespostasDAO();
            boolean InseriuPergunta = _perguntasDao.InserirPergunta(perguntas);

            boolean InserirResposta = respostasClient.InserirResposta(new Resposta(txtResposta1.getText(), cbxResposta1.isSelected()), _perguntasDao.RetornarUltimoIndiceInserido());
            boolean InserirResposta1 = respostasClient.InserirResposta(new Resposta(txtResposta2.getText(), cbxResposta2.isSelected()), _perguntasDao.RetornarUltimoIndiceInserido());
            boolean InserirResposta2 = respostasClient.InserirResposta(new Resposta(txtResposta3.getText(), cbxResposta3.isSelected()), _perguntasDao.RetornarUltimoIndiceInserido());
            boolean InserirResposta3 = respostasClient.InserirResposta(new Resposta(txtResposta4.getText(), cbxResposta4.isSelected()), _perguntasDao.RetornarUltimoIndiceInserido());
            boolean InserirResposta4 = respostasClient.InserirResposta(new Resposta(txtResposta5.getText(), cbxResposta5.isSelected()), _perguntasDao.RetornarUltimoIndiceInserido());

            boolean inseriuTodasRespostas = InserirResposta && InserirResposta1 && InserirResposta2
                    && InserirResposta3 && InserirResposta4;



            if (InseriuPergunta && inseriuTodasRespostas) {
                JOptionPane.showMessageDialog(this, "Registro inserido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao inserir o registro!");
            }


        } catch (SQLException ex) {
            Logger.getLogger(PerguntasCreate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PerguntasCreate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(PerguntasCreate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PerguntasCreate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PerguntasCreate.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } finally {
            ZerarCampos();
            this.dispose();
            new PerguntasTable().setVisible(true);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxResposta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxResposta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxResposta1ActionPerformed

    private void cbxResposta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxResposta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxResposta2ActionPerformed

    private void cbxResposta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxResposta4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxResposta4ActionPerformed

    private void cbxResposta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxResposta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxResposta3ActionPerformed

    private void cbxResposta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxResposta5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxResposta5ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            if (!CamposPreenchidos()) {
                throw new Exception("Preencha todos os dados");
            }
            _perguntasDao = new PerguntasDAO();
            
            _pergunta.Pergunta = txtEnunciado.getText();

            int tipo;
            if (rdbFacil.isSelected()) {
                tipo = 0;
            } else if (rdbMedio.isSelected()) {
                tipo = 1;
            } else //rdbDificil.isSelected()
            {
                tipo = 2;
            }

            _pergunta.Tipo = tipo;
            RespostasDAO respostasClient = new RespostasDAO();
            boolean editouPergunta = _perguntasDao.EditarPergunta(_pergunta);

            boolean InserirResposta = respostasClient.EditarResposta(
                    new Resposta(_respostas.get(0).Id, txtResposta1.getText(), cbxResposta1.isSelected()), _pergunta.Id);
            boolean InserirResposta1 = respostasClient.EditarResposta(
                    new Resposta(_respostas.get(1).Id, txtResposta2.getText(), cbxResposta2.isSelected()), _pergunta.Id);
            boolean InserirResposta2 = respostasClient.EditarResposta(
                    new Resposta(_respostas.get(2).Id, txtResposta3.getText(), cbxResposta3.isSelected()), _pergunta.Id);
            boolean InserirResposta3 = respostasClient.EditarResposta(
                    new Resposta(_respostas.get(3).Id, txtResposta4.getText(), cbxResposta4.isSelected()), _pergunta.Id);
            boolean InserirResposta4 = respostasClient.EditarResposta(
                    new Resposta(_respostas.get(4).Id, txtResposta5.getText(), cbxResposta5.isSelected()), _pergunta.Id);

            boolean inseriuTodasRespostas = InserirResposta && InserirResposta1 && InserirResposta2
                    && InserirResposta3 && InserirResposta4;



            if (editouPergunta && inseriuTodasRespostas) {
                JOptionPane.showMessageDialog(this, "Edição efetuada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao editar o registro!");
            }


        } catch (SQLException ex) {
            Logger.getLogger(PerguntasCreate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PerguntasCreate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(PerguntasCreate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PerguntasCreate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PerguntasCreate.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } finally {
            ZerarCampos();
            this.dispose();
            new PerguntasTable().setVisible(true);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(PerguntasCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerguntasCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerguntasCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerguntasCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerguntasCreate().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.ButtonGroup btnGroupLevel;
    private javax.swing.ButtonGroup btnGroupOptionType;
    private javax.swing.JCheckBox cbxResposta1;
    private javax.swing.JCheckBox cbxResposta2;
    private javax.swing.JCheckBox cbxResposta3;
    private javax.swing.JCheckBox cbxResposta4;
    private javax.swing.JCheckBox cbxResposta5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rdbDificil;
    private javax.swing.JRadioButton rdbFacil;
    private javax.swing.JRadioButton rdbMedio;
    private javax.swing.JTextField txtEnunciado;
    private javax.swing.JTextField txtResposta1;
    private javax.swing.JTextField txtResposta2;
    private javax.swing.JTextField txtResposta3;
    private javax.swing.JTextField txtResposta4;
    private javax.swing.JTextField txtResposta5;
    // End of variables declaration//GEN-END:variables
}
