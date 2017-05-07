/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.patient;

import java.util.ArrayList;

/**
 *
 * @author ravidra
 */
public class PatientVitalSignHistory {
    
    private ArrayList<PatientVitalSignViaSensor> patientVitalSignHistory;
    
 public PatientVitalSignHistory(){
     patientVitalSignHistory = new ArrayList<>();
 }   

    public ArrayList<PatientVitalSignViaSensor> getVitalSignHistory() {
        return patientVitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<PatientVitalSignViaSensor> patientVitalSignHistory) {
        this.patientVitalSignHistory = patientVitalSignHistory;
    }
 
    public PatientVitalSignViaSensor addVitalSign(){
        PatientVitalSignViaSensor pvs = new PatientVitalSignViaSensor();
        patientVitalSignHistory.add(pvs);
        return pvs;
        
    }
 
    public void deleteVitalSign(PatientVitalSignViaSensor vs){
        patientVitalSignHistory.remove(vs);
    }
 
}
