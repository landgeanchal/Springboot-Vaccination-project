package com.project.vaccination.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registerDetails")
public class User {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String contact;
    private String id_Type;
    private String vaccine_name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    public User() {
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getIdType() {
        return id_Type;
    }
    public void setIdType(String id_Type) {
        this.id_Type = id_Type;
    }
    public String getVaccine_name() {
        return vaccine_name;
    }
    public void setVaccine_name(String vaccine_name) {
        this.vaccine_name = vaccine_name;
    }

     @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", contact=" + contact + ", id_Type=" + id_Type + ", vaccine_name="
                + vaccine_name + "]";
    }

}
