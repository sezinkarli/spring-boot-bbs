package main.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: beren
 * Date: 22.06.2014
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "product")
public class Product {

    @Id
    private Long id;

    @Column(name = "material_name")
    private String materialName;

    private Integer availability;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }
}
