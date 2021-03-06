package fr.ensimag.control;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author dac
 */
@ManagedBean
@SessionScoped
public class UserBean implements Serializable {
    
    private String username;
    private boolean loggedIn;

    public UserBean() {
    }
    
    public String logOut() {
        username = null;
        loggedIn = false;
        return "logout";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
    
}
