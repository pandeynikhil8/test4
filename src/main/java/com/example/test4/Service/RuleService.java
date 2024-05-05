package com.example.test4.Service;

import com.example.test4.DAO.Rule;
import com.example.test4.Repository.RuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RuleService {
    private final RuleRepository ruleRepository;


    public RuleService(RuleRepository ruleRepository) {
        this.ruleRepository = ruleRepository;
    }

    // Create a new rule
    public Rule createRule(Rule rule) {
        return ruleRepository.save(rule);
    }

    // Retrieve a rule by its ID
    public Optional<Rule> getRuleById(String ruleId) {
        return ruleRepository.findById(ruleId);
    }

    // Retrieve all rules
    public List<Rule> getAllRules() {
        return ruleRepository.findAll();
    }

    // Update a rule
    public Rule updateRule(Rule rule) {
        return ruleRepository.save(rule);
    }

    // Delete a rule by its ID
    public void deleteRuleById(String ruleId) {
        ruleRepository.deleteById(ruleId);
    }
}
