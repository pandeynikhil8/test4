package com.example.test4.DAO;

import jakarta.persistence.*;

@Entity
@Table(name = "Rule")
public class Rule {

    @Id
    @Column(name = "Rule_id", length = 50)
    private String ruleId;

    @Column(name = "Version")
    private int version;

    @Column(name = "Description", length = 255)
    private String description;

    @Column(name = "Class_Name", length = 255)
    private String className;

    @Column(name = "Method_Name", length = 255)
    private String methodName;

    @Column(name = "Major_Code", length = 255)
    private String majorCode;

    @Column(name = "Minor_Code", length = 255)
    private String minorCode;

    // Getters and setters
}

