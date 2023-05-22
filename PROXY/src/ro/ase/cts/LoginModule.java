package ro.ase.cts;

public class LoginModule implements InterfaceLoginModule{
    String user;
    String password;

    public LoginModule(String user, String password) {
        super();
        this.user = user;
        this.password = password;
    }

    @Override
    public boolean login(String user, String password) {
        if(user.equals(this.user) && password.equals(this.password))
            return true;
        else
            return false;
    }
}
