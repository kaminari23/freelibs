package freelib.DTO;

import java.util.Objects;

public class GenreDTO {
    private int gid;
    private String gname;



    public GenreDTO(int gid, String gname) {
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenreDTO adviseDTO = (GenreDTO) o;
        return gid == adviseDTO.gid &&
                Objects.equals(gname, adviseDTO.gname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gid,gname);
    }

}
