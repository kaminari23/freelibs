package freelib.DTO;

import java.util.Objects;

public class InventoryDTO {
    private int id;
    private String articul;
    private String name;
    private String picture;
    private String price;
    private String material;
    private String equipment;
    private String cooling;
    private String diameter;
    private String currency;
    private String description;
    private String type;

    public InventoryDTO(int id, String articul, String name, String picture, String price, String material, String equipment,
                        String cooling, String diameter, String currency, String description, String type) {
        this.id=id;
        this.articul=articul;
        this.name=name;
        this.picture=picture;
        this.price=price;
        this.material=material;
        this.equipment=equipment;
        this.cooling=cooling;
        this.diameter=diameter;
        this.currency=currency;
        this.description=description;
        this.type=type;
    }
    public String getArticul() {
        return articul;
    }

    public void setArticul(String articul) {
        this.articul = articul;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPict() {
        return picture;
    }

    public void setPict(String pict) {
        this.picture = picture;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getCooling() {
        return cooling;
    }

    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public int getId(){return id;}

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventoryDTO adviseDTO = (InventoryDTO) o;
        return type == adviseDTO.type &&
                Objects.equals(id, adviseDTO.id) &&
                Objects.equals(articul, adviseDTO.articul) &&
                Objects.equals(name, adviseDTO.name) &&
                Objects.equals(picture, adviseDTO.picture) &&
                Objects.equals(price, adviseDTO.price) &&
                Objects.equals(material, adviseDTO.material) &&
                Objects.equals(equipment, adviseDTO.equipment) &&
                Objects.equals(cooling, adviseDTO.cooling) &&
                Objects.equals(diameter, adviseDTO.diameter) &&
                Objects.equals(currency, adviseDTO.currency) &&
                Objects.equals(description, adviseDTO.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,articul, name, picture, price, material, equipment, cooling, diameter, currency, description, type);
    }

}
