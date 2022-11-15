package launchcodeproject.launchcodeproject.models;

public class LogInForm {

    String user;
    int passCode;

    public LogInForm(String user, int passCode) {

        this.user = user;
        this.passCode = passCode;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPassCode() {
        return passCode;
    }

    public void setPassCode(int passCode) {
        this.passCode = passCode;
    }
}
