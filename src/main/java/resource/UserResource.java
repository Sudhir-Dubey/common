package resource;

public class UserResource extends BaseResource {
    private String userName;
    private String password;
    private String email;
    private String mob;

    public UserResource() {
    }

    public UserResource(String userName, String password, String email, String mob) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.mob = mob;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }
}
