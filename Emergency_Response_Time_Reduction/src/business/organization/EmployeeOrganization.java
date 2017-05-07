/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.employee.EmployeeDirectory;
import business.role.Role;
import business.useraccount.UserAccountDirectory;
//import business.useraccount.EmployeeUserAccountDirectory;
import business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author ravidra
 */
public abstract class EmployeeOrganization extends Organization {
   
  
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    

    public EmployeeOrganization(String name) {
        super(name);
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
       
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }



    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    

    @Override
    public String toString() {
        return getName();
    }
    
    
}
