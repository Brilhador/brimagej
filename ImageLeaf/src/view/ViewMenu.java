/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ViewPrincipal.java
 *
 * Created on 26/01/2013, 11:24:52
 */
package view;

import javax.swing.JButton;

/**
 *
 * @author anderson
 */
public class ViewMenu extends javax.swing.JFrame {

    /**
     * Creates new form ViewPrincipal
     */
    public ViewMenu() {
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

        jbclassificar = new javax.swing.JButton();
        jbpdi = new javax.swing.JButton();
        jbpadrao = new javax.swing.JButton();
        jbcurvature = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jbclassificar.setText("Classificador");
        jbclassificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbclassificarActionPerformed(evt);
            }
        });

        jbpdi.setText("PDI");
        jbpdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpdiActionPerformed(evt);
            }
        });

        jbpadrao.setText("Padrão");
        jbpadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpadraoActionPerformed(evt);
            }
        });

        jbcurvature.setText("Curvature");
        jbcurvature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcurvatureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbcurvature, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbpdi, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbpadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbclassificar, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbclassificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbpadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbpdi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbcurvature, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jbpdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbpdiActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jbpdiActionPerformed

    private void jbclassificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbclassificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbclassificarActionPerformed

    private void jbpadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbpadraoActionPerformed
    }//GEN-LAST:event_jbpadraoActionPerformed

    private void jbcurvatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcurvatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbcurvatureActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbclassificar;
    private javax.swing.JButton jbcurvature;
    private javax.swing.JButton jbpadrao;
    private javax.swing.JButton jbpdi;
    // End of variables declaration//GEN-END:variables

    public JButton getJbclassificar() {
        return jbclassificar;
    }

    public void setJbclassificar(JButton jbclassificar) {
        this.jbclassificar = jbclassificar;
    }

    public JButton getJbpadrao() {
        return jbpadrao;
    }

    public void setJbpadrao(JButton jbpadrao) {
        this.jbpadrao = jbpadrao;
    }

    public JButton getJbpdi() {
        return jbpdi;
    }

    public void setJbpdi(JButton jbpdi) {
        this.jbpdi = jbpdi;
    }

    public JButton getJbcurvature() {
        return jbcurvature;
    }

    public void setJbcurvature(JButton jbcurvature) {
        this.jbcurvature = jbcurvature;
    }
}
