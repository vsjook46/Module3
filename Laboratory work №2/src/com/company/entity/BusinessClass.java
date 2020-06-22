package com.company.entity;

import com.company.interfaces.ICosting;

public class BusinessClass implements ICosting {

    private String name;
    private int BusinessCost;

    public BusinessClass() {
    }

    public BusinessClass(String name, int businessCost) {
        this.name = name;
        BusinessCost = businessCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBusinessCost() {
        return BusinessCost;
    }

    public void setBusinessCost(int businessCost) {
        BusinessCost = businessCost;
    }


    public int getCost() {
        return this.getBusinessCost();
    }

}
