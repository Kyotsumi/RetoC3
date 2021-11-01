package com.usa.ciclo3.retociclo3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="ortopedics")
public class Ortopedic implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String  name;
    private String  brand;
    private Integer oomsr;
    private String  description;

    @ManyToOne
    @JoinColumn(name="idCategory")
    @JsonIgnoreProperties("ortopedics")
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "ortopedic")
    @JsonIgnoreProperties({"ortopedic", "client"})
    private List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "ortopedic")
    @JsonIgnoreProperties({"ortopedic", "client"})
    private List<Reservation> reservations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
