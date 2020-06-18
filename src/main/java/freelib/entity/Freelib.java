package freelib.entity;

public class Freelib extends Entity<Integer> {
    private int id;
    private String name;
    private String annotation;
    private String author;
    private String picture;
    private String capacity;
    private String pubdate;



    public Freelib(int id, String name, String annotation, String author, String picture,
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


}
