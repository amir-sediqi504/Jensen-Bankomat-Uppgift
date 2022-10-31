import java.util.ArrayList;

public class User {
  public  String namn = "amir";
  public  String password = "123";

    ArrayList<Account> accounts = new ArrayList<Account>();

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
