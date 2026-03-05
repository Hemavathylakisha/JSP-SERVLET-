package com.InsurancePolicy;

import java.util.List;

public class Policy {

    private String policyId;
    private PolicyHolder policyHolder;
    private List<Coverage> coverages;
    private List<PaymentHistory> paymentHistory;
    private String status;

    public Policy() {}

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
    }

    public List<Coverage> getCoverages() {
        return coverages;
    }

    public void setCoverages(List<Coverage> coverages) {
        this.coverages = coverages;
    }

    public List<PaymentHistory> getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(List<PaymentHistory> paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
