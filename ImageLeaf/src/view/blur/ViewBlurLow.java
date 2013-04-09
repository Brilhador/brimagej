/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.blur;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JToggleButton;

/**
 *
 * @author anderson
 */
public class ViewBlurLow extends JFrame{

    /**
     * Creates new form viewBlurLow
     */
    public ViewBlurLow() {
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

        lblImagePreview = new javax.swing.JLabel();
        btnApply = new javax.swing.JToggleButton();
        lblLowPass = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        slMaskSize = new javax.swing.JSlider();
        lblMaskSize = new javax.swing.JLabel();
        btnPreview = new javax.swing.JToggleButton();
        btnRestore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);

        lblImagePreview.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnApply.setText("Apply");

        lblLowPass.setText("Low - Pass");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        slMaskSize.setMajorTickSpacing(2);
        slMaskSize.setMaximum(15);
        slMaskSize.setMinimum(3);
        slMaskSize.setMinorTickSpacing(2);
        slMaskSize.setPaintLabels(true);
        slMaskSize.setPaintTicks(true);
        slMaskSize.setSnapToTicks(true);
        slMaskSize.setValue(3);

        lblMaskSize.setText("Mask Size");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slMaskSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaskSize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(lblMaskSize)
                .addGap(18, 18, 18)
                .addComponent(slMaskSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnPreview.setText("Preview");

        btnRestore.setText("Restore");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLowPass)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnApply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRestore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagePreview, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLowPass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPreview)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRestore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApply)
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addComponent(lblImagePreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnApply;
    private javax.swing.JToggleButton btnPreview;
    private javax.swing.JButton btnRestore;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagePreview;
    private javax.swing.JLabel lblLowPass;
    private javax.swing.JLabel lblMaskSize;
    private javax.swing.JSlider slMaskSize;
    // End of variables declaration//GEN-END:variables
    
    //getters e setters

    public javax.swing.JToggleButton getBtnApply() {
        return btnApply;
    }

    public void setBtnApply(javax.swing.JToggleButton btnApply) {
        this.btnApply = btnApply;
    }

    public javax.swing.JToggleButton getBtnPreview() {
        return btnPreview;
    }

    public void setBtnPreview(javax.swing.JToggleButton btnPreview) {
        this.btnPreview = btnPreview;
    }

    public javax.swing.JLabel getLblImagePreview() {
        return lblImagePreview;
    }

    public void setLblImagePreview(javax.swing.JLabel lblImagePreview) {
        this.lblImagePreview = lblImagePreview;
    }

    public javax.swing.JSlider getSlMaskSize() {
        return slMaskSize;
    }

    public void setSlMaskSize(javax.swing.JSlider slMaskSize) {
        this.slMaskSize = slMaskSize;
    }

    public JButton getBtnRestore() {
        return btnRestore;
    }

    public void setBtnRestore(JButton btnRestore) {
        this.btnRestore = btnRestore;
    }
    
}
