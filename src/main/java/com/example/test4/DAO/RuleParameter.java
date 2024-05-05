package com.example.test4.DAO;

import jakarta.persistence.*;


@Entity
@Table(name = "Rule_Parameter")
public class RuleParameter {

    @Id
    @Column(name = "Parameter_ID", length = 255)
    private String parameterId;

    @Column(name = "Parameter_Value", length = 255)
    private String parameterValue;

    @Column(name = "Description", length = 255)
    private String description;

    @Column(name = "external_parameter")
    private boolean externalParameter;

    // Getters and setters
}