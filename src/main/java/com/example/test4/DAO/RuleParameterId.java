package com.example.test4.DAO;

import java.io.Serializable;
import jakarta.persistence.*;


@Embeddable
public class RuleParameterId implements Serializable {

    @Column(name = "Rule_id", length = 50)
    private String ruleId;

    @Column(name = "Parameter_ID", length = 255)
    private String parameterId;

    // Getters and setters
}