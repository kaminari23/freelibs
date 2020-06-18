package freelib.entity;

public class User extends Entity<Integer> {
    private int uid;
    private String uname;
    private String upass;
    private String urole;
    private String upicture;



    public User(int uid, String uname, String upass, String urole, String upicture) {
        this.uid = uid;
        this.uname = uname;
        this.upass = upass;
        this.urole = urole;
        this.upicture = upicture;



    }

    public int getuid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUrole() {
        return urole;
    }

    public void setUrole(String urole) {
        this.urole = urole;
    }

    public String getUpicture() {
        return upicture;
    }

    public void setUpicture(String upicture) {
        this.upicture = upicture;
    }


}
