package com.example.OnlineBankingSystem.Entities;

import javax.persistence.*;
import java.util.Date;


//cette classe représente un rendez-vous de l'utilisateur
@Entity
public class Appointment {

    // Chaque rdv a son propre id , Date, localisation, description et un champs boolean pour dire si le rdv a été confirmé ou non
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private String location;
    private String description;
    private boolean confirmed;

    // Un rdv peut appartenir à un seul utilsateur
    //l'annotation @ManyToOne permet de créer une colonne ayant l'id de la table user ( qui portera le nom user_id)
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    // ## Getters et Setters ##
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    @Override
    public String toString() {
        return "Rendez-vous:{" +
                "numéro=" + id +
                ", date=" + date +
                ", localisation='" + location + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
