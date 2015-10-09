/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author anderson
 */
public class viewPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form viewPrincipal
     */
    public viewPrincipal() {
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

        jPanelPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        menuOpen = new javax.swing.JMenuItem();
        mFilters = new javax.swing.JMenu();
        mFiltersBlur = new javax.swing.JMenuItem();
        mSegmenting = new javax.swing.JMenu();
        mSegmentingEdge = new javax.swing.JMenuItem();
        mSegmentingThresholding = new javax.swing.JMenuItem();
        mDescriptors = new javax.swing.JMenu();
        mCurvatureSignature = new javax.swing.JMenuItem();
        mCurvatureChainCode = new javax.swing.JMenuItem();
        mCurvatureFourier = new javax.swing.JMenuItem();
        mRecognition = new javax.swing.JMenu();
        mRecognitionGroup = new javax.swing.JMenuItem();
        mPatternGeneration = new javax.swing.JMenuItem();
        mComparisionImage = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mFile.setText("File");

        menuOpen.setText("Open");
        mFile.add(menuOpen);

        jMenuBar1.add(mFile);

        mFilters.setText("Filters");

        mFiltersBlur.setText("Blur");
        mFilters.add(mFiltersBlur);

        jMenuBar1.add(mFilters);

        mSegmenting.setText("Segmenting");

        mSegmentingEdge.setText("Edge - Detector");
        mSegmenting.add(mSegmentingEdge);

        mSegmentingThresholding.setText("Thresholding");
        mSegmenting.add(mSegmentingThresholding);

        jMenuBar1.add(mSegmenting);

        mDescriptors.setText("Descriptors");

        mCurvatureSignature.setText("Signature");
        mCurvatureSignature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCurvatureSignatureActionPerformed(evt);
            }
        });
        mDescriptors.add(mCurvatureSignature);

        mCurvatureChainCode.setText("Chain Code");
        mDescriptors.add(mCurvatureChainCode);

        mCurvatureFourier.setText("Fourier");
        mDescriptors.add(mCurvatureFourier);

        jMenuBar1.add(mDescriptors);

        mRecognition.setText("Recognition");

        mRecognitionGroup.setText("Species Group");
        mRecognition.add(mRecognitionGroup);

        mPatternGeneration.setText("Pattern Generation");
        mRecognition.add(mPatternGeneration);

        mComparisionImage.setText("Comparison of two images");
        mComparisionImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mComparisionImageActionPerformed(evt);
            }
        });
        mRecognition.add(mComparisionImage);

        jMenuBar1.add(mRecognition);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mComparisionImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mComparisionImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mComparisionImageActionPerformed

    private void mCurvatureSignatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCurvatureSignatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mCurvatureSignatureActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jPanelPrincipal;
    private javax.swing.JMenuItem mComparisionImage;
    private javax.swing.JMenuItem mCurvatureChainCode;
    private javax.swing.JMenuItem mCurvatureFourier;
    private javax.swing.JMenuItem mCurvatureSignature;
    private javax.swing.JMenu mDescriptors;
    private javax.swing.JMenu mFile;
    private javax.swing.JMenu mFilters;
    private javax.swing.JMenuItem mFiltersBlur;
    private javax.swing.JMenuItem mPatternGeneration;
    private javax.swing.JMenu mRecognition;
    private javax.swing.JMenuItem mRecognitionGroup;
    private javax.swing.JMenu mSegmenting;
    private javax.swing.JMenuItem mSegmentingEdge;
    private javax.swing.JMenuItem mSegmentingThresholding;
    private javax.swing.JMenuItem menuOpen;
    // End of variables declaration//GEN-END:variables
    
    
    //getters e setters
    public JDesktopPane getjPanelPrincipal() {
        return jPanelPrincipal;
    }

    public void setjPanelPrincipal(JDesktopPane jPanelPrincipal) {
        this.jPanelPrincipal = jPanelPrincipal;
    }

    public javax.swing.JMenuItem getMenuOpen() {
        return menuOpen;
    }
    
    public void setMenuOpen(javax.swing.JMenuItem menuOpen) {
        this.menuOpen = menuOpen;
    }

    public JMenu getmCurvature() {
        return mDescriptors;
    }

    public void setmCurvature(JMenu mCurvature) {
        this.mDescriptors = mCurvature;
    }

    public JMenu getmFile() {
        return mFile;
    }

    public void setmFile(JMenu mFile) {
        this.mFile = mFile;
    }

    public JMenu getmFilters() {
        return mFilters;
    }

    public void setmFilters(JMenu mFilters) {
        this.mFilters = mFilters;
    }

    public JMenuItem getmFiltersBlur() {
        return mFiltersBlur;
    }

    public void setmFiltersBlur(JMenuItem mFiltersBlur) {
        this.mFiltersBlur = mFiltersBlur;
    }

    public JMenuItem getmSegmentingEdge() {
        return mSegmentingEdge;
    }

    public void setmSegmentingEdge(JMenuItem mSegmentingEdge) {
        this.mSegmentingEdge = mSegmentingEdge;
    }

    public JMenuItem getmSegmentingThresholding() {
        return mSegmentingThresholding;
    }

    public void setmSegmentingThresholding(JMenuItem mSegmentingThresholding) {
        this.mSegmentingThresholding = mSegmentingThresholding;
    }

    public JMenuItem getmCurvatureChainCode() {
        return mCurvatureChainCode;
    }

    public void setmCurvatureChainCode(JMenuItem mCurvatureChainCode) {
        this.mCurvatureChainCode = mCurvatureChainCode;
    }

    public JMenuItem getmRecognitionGroup() {
        return mRecognitionGroup;
    }

    public void setmRecognitionGroup(JMenuItem mRecognitionGroup) {
        this.mRecognitionGroup = mRecognitionGroup;
    }

    public JMenuItem getmRecognitionPattern() {
        return mPatternGeneration;
    }

    public void setmRecognitionPattern(JMenuItem mRecognitionPattern) {
        this.mPatternGeneration = mRecognitionPattern;
    }

    public JMenuItem getmSimileImage() {
        return mComparisionImage;
    }

    public void setmSimileImage(JMenuItem mSimileImage) {
        this.mComparisionImage = mSimileImage;
    }

    public JMenuItem getmCurvatureSignature() {
        return mCurvatureSignature;
    }

    public void setmCurvatureSignature(JMenuItem mCurvatureSignature) {
        this.mCurvatureSignature = mCurvatureSignature;
    }

    public JMenuItem getmCurvatureFourier() {
        return mCurvatureFourier;
    }

    public void setmCurvatureFourier(JMenuItem mCurvatureFourier) {
        this.mCurvatureFourier = mCurvatureFourier;
    }
    
}