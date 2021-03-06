/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.administrativerole;

import business.enterprise.Enterprise;
import business.organization.DoctorOrganization;
import business.organization.Organization;
import static business.organization.Organization.Type.Patient;
import business.patient.Patient;
import business.useraccount.UserAccount;
import business.workqueue.EmergencyWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author ravidra
 */
public class DoctorSelectionViaAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorSelectionViaAdminJPanel
     */
    private JPanel userProcessContainer;
    private Patient patient;
    private EmergencyWorkRequest request;
    private UserAccount account;
    private Enterprise enterprise;
    
    public DoctorSelectionViaAdminJPanel(JPanel userProcessContainer, Patient patient,  UserAccount account, Enterprise enterprise, EmergencyWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patient = patient;
        this.request = request;
        this.account = account;
        this.enterprise = enterprise;
        
        populateFields();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        doctorContactJTextField = new javax.swing.JTextField();
        priDoctorJTextField = new javax.swing.JTextField();
        patientIdJTextField = new javax.swing.JTextField();
        patientNameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Patient ID :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Primary Doctor :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Doctor Contact No. :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Patient Name :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Doctor Information for Patient");

        doctorContactJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorContactJTextFieldActionPerformed(evt);
            }
        });

        priDoctorJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priDoctorJTextFieldActionPerformed(evt);
            }
        });

        patientIdJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdJTextFieldActionPerformed(evt);
            }
        });

        patientNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameJTextFieldActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setForeground(new java.awt.Color(0, 51, 204));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        backJButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton1.setForeground(new java.awt.Color(0, 51, 204));
        backJButton1.setText("Send Request to Doctor");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priDoctorJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patientNameJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patientIdJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(doctorContactJTextField))
                .addGap(178, 178, 178))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(backJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backJButton1)
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientIdJTextField))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientNameJTextField))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priDoctorJTextField))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorContactJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backJButton1)
                        .addGap(24, 24, 24))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doctorContactJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorContactJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorContactJTextFieldActionPerformed

    private void priDoctorJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priDoctorJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priDoctorJTextFieldActionPerformed

    private void patientIdJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdJTextFieldActionPerformed

    private void patientNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameJTextFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminWorkAreaJPanel sysAdminwjp = (AdminWorkAreaJPanel) component;
//        //  sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        // TODO add your handling code here:
                DoctorOrganization lorg = null;
    
     
      request.setMessage("Emergency for Patient:"+patient.getId());
      request.setSender(account);
      request.setStatus("Waiting for other Team's response");
    
    
    for(Organization organizatn: enterprise.getOrganizationDirectory().getOrganizationList()){
      if(organizatn instanceof DoctorOrganization){
          lorg = (DoctorOrganization)organizatn;
          
          if (organizatn!=null){
      lorg.getWorkQueue().getWorkRequestList().add(request);
      account.getWorkQueue().getWorkRequestList().add(request);
          }
      }
    }

        
    }//GEN-LAST:event_backJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton backJButton1;
    private javax.swing.JTextField doctorContactJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField patientIdJTextField;
    private javax.swing.JTextField patientNameJTextField;
    private javax.swing.JTextField priDoctorJTextField;
    // End of variables declaration//GEN-END:variables

private void populateFields(){

    patientIdJTextField.setText(String.valueOf(patient.getId()));
        patientNameJTextField.setText(patient.getName());
        priDoctorJTextField.setText(patient.getPrimaryDoctorName());
        doctorContactJTextField.setText(patient.getPrimaryDoctorContact());
        
}

}
