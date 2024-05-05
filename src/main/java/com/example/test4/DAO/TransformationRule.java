package com.example.test4.DAO;

import jakarta.persistence.*;

@Entity
@Table(name = "Transformation_Rule")
public class TransformationRule {

    @EmbeddedId
    private TransformationRuleId id;

    @Column(name = "Sequence")
    private int sequence;

    // Getters and setters
}
