package com.company.entity;

import com.company.interfaces.ICosting;

public class BusinessClass implements ICosting {

    private String name;
    private int businessCost;

    public BusinessClass() {
    }

    public BusinessClass(String name, int businessCost) {
        this.name = name;
        this.businessCost = businessCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBusinessCost() {
        return businessCost;
    }

    public void setBusinessCost(int businessCost) {
        this.businessCost = businessCost;
    }


    public int getCost() {
        return this.getBusinessCost();
    }

}
