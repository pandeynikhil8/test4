package com.example.test4.DAO;

import java.io.Serializable;
import jakarta.persistence.*;


@Embeddable
public class TransformationRuleId implements Serializable {

    @Column(name = "Transform_id", length = 50)
    private String transformId;

    @Column(name = "Rule_id", length = 50)
    private String ruleId;

    // Getters and setters
}
