package com.example.fourfun;





import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Smile {

    @Id
    int sId;
    String ocassion;
    String dateofDelivery;
    String typeofgift,location;
    public Smile()
    {
        
    }
    public Smile(int sId, String ocassion, String dateofDelivery, String typeofgift, String location) {
        this.sId = sId;
        this.ocassion = ocassion;
        this.dateofDelivery = dateofDelivery;
        this.typeofgift = typeofgift;
        this.location = location;
    }
    public int getsId() {
        return sId;
    }
    public void setsId(int sId) {
        this.sId = sId;
    }
    public String getOcassion() {
        return ocassion;
    }
    public void setOcassion(String ocassion) {
        this.ocassion = ocassion;
    }
    public String getDateofDelivery() {
        return dateofDelivery;
    }
    public void setDateofDelivery(String dateofDelivery) {
        this.dateofDelivery = dateofDelivery;
    }
    public String getTypeofgift() {
        return typeofgift;
    }
    public void setTypeofgift(String typeofgift) {
        this.typeofgift = typeofgift;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }


   
    
}