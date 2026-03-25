package com.test;

import jakarta.persistence.Entity;

@Entity
public class ContractEmployee extends Employee {

    private int contractDuration;

    public int getContractDuration() { return contractDuration; }
    public void setContractDuration(int contractDuration) { this.contractDuration = contractDuration; }
}