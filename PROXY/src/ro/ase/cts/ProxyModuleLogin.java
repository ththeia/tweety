package ro.ase.cts;

public class ProxyModuleLogin implements InterfaceLoginModule{
    
    InterfaceLoginModule moduleLogin;

    public ProxyModuleLogin(InterfaceLoginModule moduleLogin) {
        this.moduleLogin = moduleLogin;
    }

    @Override
    public boolean login(String user, String password) {
        int countTry = 0;
        if(countTry >= 3){
            System.out.println("Account will be suspended. Too many tries");
            return false;
        }
        
        boolean isAuthenticated =this.moduleLogin.login(user, password);
        if(!isAuthenticated)
            countTry +=1;
        else 
            countTry = 0;
            return isAuthenticated;
    }
}
