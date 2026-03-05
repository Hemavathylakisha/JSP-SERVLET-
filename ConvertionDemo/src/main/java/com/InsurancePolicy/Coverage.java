package com.InsurancePolicy;

import java.util.List;

public class Coverage {

    private String type;
    private int sumInsured;
    private int premium;
    private List<Beneficiary> beneficiaries;

    public Coverage() {}

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getSumInsured() { return sumInsured; }
    public void setSumInsured(int sumInsured) { this.sumInsured = sumInsured; }

    public int getPremium() { return premium; }
    public void setPremium(int premium) { this.premium = premium; }

    public List<Beneficiary> getBeneficiaries() { return beneficiaries; }
    public void setBeneficiaries(List<Beneficiary> beneficiaries) { this.beneficiaries = beneficiaries; }
}