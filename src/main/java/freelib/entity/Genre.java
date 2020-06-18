package freelib.entity;

public class Genre extends Entity<Integer> {
    private int gid;
    private String gname;




    public Genre(int gid, String gname) {
        this.gid = gid;
        this.gname = gname;
    }

    public int getGid() {
        return gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

}
