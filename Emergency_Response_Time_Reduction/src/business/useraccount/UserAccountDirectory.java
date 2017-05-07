/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.useraccount;


import business.EcoSystem;
import business.applicationuser.ApplicationUser;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, ApplicationUser applicationUser, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setApplicationUser(applicationUser);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        // EcoSystem.getInstance().getUserAccountDirectory().createUserAccount(username, password, applicationUser, role);
         EcoSystem.getInstance().getUserAccountDirectory().userAccountAdded(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }

public void userAccountAdded(UserAccount ua){
    userAccountList.add(ua);
}

}
