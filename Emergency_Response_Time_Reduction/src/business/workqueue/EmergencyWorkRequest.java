/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

/**
 *
 * @author ravidra
 */
public class EmergencyWorkRequest extends WorkRequest{
    
    private String doctorTestResult;
    private String nurseTestResult;
    private String labTestResult;
    private String ambulanceTestResult;

    public String getDoctorTestResult() {
        return doctorTestResult;
    }

    public void setDoctorTestResult(String doctorTestResult) {
        this.doctorTestResult = doctorTestResult;
    }

    public String getNurseTestResult() {
        return nurseTestResult;
    }

    public void setNurseTestResult(String nurseTestResult) {
        this.nurseTestResult = nurseTestResult;
    }

    public String getLabTestResult() {
        return labTestResult;
    }

    public void setLabTestResult(String labTestResult) {
        this.labTestResult = labTestResult;
    }

    public String getAmbulanceTestResult() {
        return ambulanceTestResult;
    }

    public void setAmbulanceTestResult(String ambulanceTestResult) {
        this.ambulanceTestResult = ambulanceTestResult;
    }

    @Override
    public String toString() {
        return getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
        
       
    

    
}
