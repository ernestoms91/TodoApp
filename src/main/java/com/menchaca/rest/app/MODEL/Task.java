package com.menchaca.rest.app.MODEL;

import jakarta.persistence.*;

@Entity
@Table(schema = "TasksCrud")
public class Task {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   public long id;
   @Column
   private String title;
   @Column
   private String description;


    public Task(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Task() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
