package com.example.test4.DAO;
import jakarta.persistence.*;

@Entity
@Table(name = "TRANSFORMATION")
public class Transformation {

    @Id
    @Column(name = "Transform_id", length = 50)
    private String transformId;

    @Column(name = "Description", length = 255)
    private String description;

    // Getters and setters
}
