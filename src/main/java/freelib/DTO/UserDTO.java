package freelib.DTO;

import java.util.Objects;

public class UserDTO {
    private int uid;
    private String uname;
    private String upass;
    private String urole;
    private String upicture;



    public UserDTO(int uid, String uname, String upass, String urole, String upicture) {
        this.uid = uid;
        this.uname = uname;
        this.upass = upass;
        this.urole = urole;
        this.upicture = upicture;



    }

    public int getUid() {
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO adviseDTO = (UserDTO) o;
        return uid == adviseDTO.uid &&
                Objects.equals(uname, adviseDTO.uname) &&
                Objects.equals(upass, adviseDTO.upass) &&
                Objects.equals(urole, adviseDTO.urole) &&
                Objects.equals(upicture, adviseDTO.upicture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid,uname, upass, urole, upicture);
    }

}
