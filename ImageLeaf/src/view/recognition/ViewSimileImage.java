/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.recognition;

import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.components.JImageView;

/**
 *
 * @author anderson
 */
public class ViewSimileImage extends javax.swing.JFrame {

    /**
     * Creates new form ViewSimileImage
     */
    public ViewSimileImage() {
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

        jLabel2 = new javax.swing.JLabel();
        lblCompImage = new javax.swing.JLabel();
        btnOpen1 = new javax.swing.JButton();
        btnOpen2 = new javax.swing.JButton();
        jxImage1 = new model.components.JImageView();
        jxImage2 = new model.components.JImageView();
        btnStart = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        lblDstEuclidean = new javax.swing.JLabel();
        txtDstResult = new javax.swing.JLabel();
        jxGrafico = new model.components.JImageView();
        pgBar = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        lblFourier = new javax.swing.JLabel();
        txtSeries = new javax.swing.JTextField();
        rbFourier = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        rbChainCode = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtWidth = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        rbSignature = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtAngle = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCompImage.setText("Comparision Image");

        btnOpen1.setText("Open image 1");

        btnOpen2.setText("Open image 2");

        jxImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jxImage1Layout = new javax.swing.GroupLayout(jxImage1);
        jxImage1.setLayout(jxImage1Layout);
        jxImage1Layout.setHorizontalGroup(
            jxImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jxImage1Layout.setVerticalGroup(
            jxImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jxImage2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jxImage2Layout = new javax.swing.GroupLayout(jxImage2);
        jxImage2.setLayout(jxImage2Layout);
        jxImage2Layout.setHorizontalGroup(
            jxImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jxImage2Layout.setVerticalGroup(
            jxImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );

        btnStart.setText("Start");

        lblResult.setText("Result:");

        lblDstEuclidean.setText("Distance euclidean:");

        txtDstResult.setText("0");

        jxGrafico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jxGraficoLayout = new javax.swing.GroupLayout(jxGrafico);
        jxGrafico.setLayout(jxGraficoLayout);
        jxGraficoLayout.setHorizontalGroup(
            jxGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jxGraficoLayout.setVerticalGroup(
            jxGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFourier.setText("Series");

        txtSeries.setText("126");

        rbFourier.setText("Fourier");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbFourier)
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblFourier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbFourier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFourier)
                    .addComponent(txtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rbChainCode.setText("Chain code");

        jLabel3.setText("Width");

        txtWidth.setText("480");

        jLabel4.setText("Height");

        txtHeight.setText("640");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbChainCode)
                        .addGap(0, 97, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(txtWidth))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbChainCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rbSignature.setText("Signature");

        jLabel1.setText("Angle");

        txtAngle.setText("2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbSignature)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(txtAngle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbSignature)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAngle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOpen1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCompImage)
                                        .addGap(0, 24, Short.MAX_VALUE))
                                    .addComponent(jxImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOpen2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(jxImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblResult)
                                    .addComponent(lblDstEuclidean)
                                    .addComponent(txtDstResult, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 19, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jxGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pgBar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompImage)
                    .addComponent(lblResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnOpen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOpen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jxImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jxImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDstEuclidean)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnStart)
                            .addComponent(txtDstResult))
                        .addGap(6, 6, 6)
                        .addComponent(jxGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pgBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpen1;
    private javax.swing.JButton btnOpen2;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private org.jdesktop.swingx.JXImageView jxGrafico;
    private org.jdesktop.swingx.JXImageView jxImage1;
    private org.jdesktop.swingx.JXImageView jxImage2;
    private javax.swing.JLabel lblCompImage;
    private javax.swing.JLabel lblDstEuclidean;
    private javax.swing.JLabel lblFourier;
    private javax.swing.JLabel lblResult;
    private javax.swing.JProgressBar pgBar;
    private javax.swing.JRadioButton rbChainCode;
    private javax.swing.JRadioButton rbFourier;
    private javax.swing.JRadioButton rbSignature;
    private javax.swing.JTextField txtAngle;
    private javax.swing.JLabel txtDstResult;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtSeries;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnOpen1() {
        return btnOpen1;
    }

    public void setBtnOpen1(javax.swing.JButton btnOpen1) {
        this.btnOpen1 = btnOpen1;
    }

    public javax.swing.JButton getBtnOpen2() {
        return btnOpen2;
    }

    public void setBtnOpen2(javax.swing.JButton btnOpen2) {
        this.btnOpen2 = btnOpen2;
    }

    public javax.swing.JButton getBtnStart() {
        return btnStart;
    }

    public void setBtnStart(javax.swing.JButton btnStart) {
        this.btnStart = btnStart;
    }

    public JImageView getJxGrafico() {
        return (JImageView) jxGrafico;
    }

    public void setJxGrafico(org.jdesktop.swingx.JXImageView jxGrafico) {
        this.jxGrafico = jxGrafico;
    }

    public JImageView getJxImage1() {
        return (JImageView) jxImage1;
    }

    public void setJxImage1(org.jdesktop.swingx.JXImageView jxImage1) {
        this.jxImage1 = jxImage1;
    }

    public JImageView getJxImage2() {
        return (JImageView) jxImage2;
    }

    public void setJxImage2(org.jdesktop.swingx.JXImageView jxImage2) {
        this.jxImage2 = jxImage2;
    }

    public javax.swing.JLabel getTxtDstResult() {
        return txtDstResult;
    }

    public void setTxtDstResult(javax.swing.JLabel txtDstResult) {
        this.txtDstResult = txtDstResult;
    }

    public JProgressBar getPgBar() {
        return pgBar;
    }

    public void setPgBar(JProgressBar pgBar) {
        this.pgBar = pgBar;
    }

    public JTextField getTxtSeries() {
        return txtSeries;
    }

    public void setTxtSeries(JTextField txtSeries) {
        this.txtSeries = txtSeries;
    }

    public JTextField getTxtAngle() {
        return txtAngle;
    }

    public void setTxtAngle(JTextField txtAngle) {
        this.txtAngle = txtAngle;
    }

    public JRadioButton getRbChainCode() {
        return rbChainCode;
    }

    public void setRbChainCode(JRadioButton rbChainCode) {
        this.rbChainCode = rbChainCode;
    }

    public JRadioButton getRbFourier() {
        return rbFourier;
    }

    public void setRbFourier(JRadioButton rbFourier) {
        this.rbFourier = rbFourier;
    }

    public JRadioButton getRbSignature() {
        return rbSignature;
    }

    public void setRbSignature(JRadioButton rbSignature) {
        this.rbSignature = rbSignature;
    }

    public JTextField getTxtHeight() {
        return txtHeight;
    }

    public void setTxtHeight(JTextField txtHeight) {
        this.txtHeight = txtHeight;
    }

    public JTextField getTxtWidth() {
        return txtWidth;
    }

    public void setTxtWidth(JTextField txtWidth) {
        this.txtWidth = txtWidth;
    }
    
}