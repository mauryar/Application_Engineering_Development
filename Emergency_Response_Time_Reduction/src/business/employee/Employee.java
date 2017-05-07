/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import business.applicationuser.ApplicationUser;

/**
 *
 * @author raunak
 */
public class Employee extends ApplicationUser {
    
    
    
    
    @Override
    public String toString() {
        return this.getName();
    }
    
    
}
