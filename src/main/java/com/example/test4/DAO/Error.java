package com.example.test4.DAO;

import jakarta.persistence.*;

@Entity
@Table(name = "Error")
public class Error {

    @Id
    @Column(name = "Major_Code", length = 50)
    private String majorCode;

    @Column(name = "Minor_Code", length = 50)
    private String minorCode;

    @Column(name = "Error_Message", length = 255)
    private String errorMessage;

    // Getters and setters
}