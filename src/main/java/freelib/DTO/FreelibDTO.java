package freelib.DTO;

import java.util.Objects;

public class FreelibDTO {
    private int id;
    private String name;
    private String annotation;
    private String author;
    private String picture;
    private String capacity;
    private String pubdate;



    public FreelibDTO(int id, String name, String annotation, String author, String picture,
                   String capacity, String pubdate) {
        this.id = id;
        this.name = name;
        this.annotation = annotation;
        this.author = author;
        this.picture = picture;
        this.capacity = capacity;
        this.pubdate = pubdate;


    }

    public int getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreelibDTO adviseDTO = (FreelibDTO) o;
        return id == adviseDTO.id &&
                Objects.equals(name, adviseDTO.name) &&
                Objects.equals(annotation, adviseDTO.annotation) &&
                Objects.equals(author, adviseDTO.author) &&
                Objects.equals(capacity, adviseDTO.capacity) &&
                Objects.equals(picture, adviseDTO.picture) &&
                Objects.equals(pubdate, adviseDTO.pubdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name, annotation, author, picture, capacity, pubdate);
    }

}
