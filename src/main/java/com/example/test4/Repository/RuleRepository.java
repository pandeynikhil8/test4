package com.example.test4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test4.DAO.Rule;

public interface RuleRepository extends JpaRepository<Rule, String> {
}
