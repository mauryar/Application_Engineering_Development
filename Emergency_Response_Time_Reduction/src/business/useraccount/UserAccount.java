/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.useraccount;

import business.applicationuser.ApplicationUser;
import static business.organization.Organization.Type.Patient;
import business.patient.Patient;
import business.role.Role;
import business.workqueue.WorkQueue;


/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Role role;
    private WorkQueue workQueue;
    private ApplicationUser applicationUser;

    public ApplicationUser getApplicationUser() {
        return applicationUser;
    }

    public void setApplicationUser(ApplicationUser applicationUser) {
        this.applicationUser = applicationUser;
    }
    

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

   
    public void setRole(Role role) {
        this.role = role;
    }

   
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}