/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import static business.organization.Organization.Type.Patient;
import business.patient.Patient;
import business.patient.PatientDirectory;
import business.role.PatientRole;
import business.role.Role;
import business.useraccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author ravidra
 */
public  class PatientOrganization extends Organization {

    
      private PatientDirectory patientDirectory;
    private UserAccountDirectory userAccountDirectory;
  
    
       public PatientOrganization() {
        super(Organization.Type.Patient.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientRole());
        return roles;
    }
     
   
    public PatientOrganization(String name) {
        super(name);
        patientDirectory = new PatientDirectory();
        userAccountDirectory = new UserAccountDirectory();
       
    }

   // public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }



    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }
    
    

    @Override
    public String toString() {
        return getName();
    }
    
  
 
    
}
