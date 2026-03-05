package com.SupplyChain;

import java.util.List;

public class Distribution {

    private List<String> domestic;
    private List<String> international;

    public Distribution() {}

    public List<String> getDomestic() { return domestic; }
    public void setDomestic(List<String> domestic) { this.domestic = domestic; }

    public List<String> getInternational() { return international; }
    public void setInternational(List<String> international) { this.international = international; }
}
