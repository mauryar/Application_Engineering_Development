/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.AmbulanceRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author ravidra
 */
public class AmbulanceOrganization extends EmployeeOrganization {
    
      public AmbulanceOrganization() {
        super(Organization.Type.Ambulance.getValue());
    }

     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AmbulanceRole());
        return roles;
    }
     
   
    
    
}
