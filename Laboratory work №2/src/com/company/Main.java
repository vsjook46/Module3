/*
 * Classname Main
 *
 * Version 1.0
 *
 * Copyright Holovey Ivan
 *
 * Module 3 LabWork 2
 *
 * Laboratory work. (6 points)
 *
 * Topic: Object-oriented programming,  JavaCollectionFramework
 *
 * Air fly: low-cost and business-class
 *
 * 1. Create two appropriate classes and 5 objects of each one.
 *
 * 2. Calculate the total price.
 *
 * 3. Find the highest flight price.
 *
 * 4. Find the lowest flight price.
 *
 * 5. Average flight price.
 *
 * 6. Which is higher in price: low cost or business class?
 *
 */
package com.company;

import com.company.entity.LowCost;
import com.company.entity.BusinessClass;
import com.company.interfaces.ICosting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        // 1. Create two appropriate classes and 5 objects of each one.
        BusinessClass f1 = new BusinessClass("Lviv-Kiev",1500);
        BusinessClass f2 = new BusinessClass("Kiev-Charchiv",2500);
        BusinessClass f3 = new BusinessClass("Uzhorod-Lviv",2000);
        BusinessClass f4 = new BusinessClass("Charchiv-Lviv",4000);
        BusinessClass f5 = new BusinessClass("Kiev-Odessa",3000);

        LowCost r1 = new LowCost("Lviv-Kiev",35,45);
        LowCost r2 = new LowCost("Kiev-Charchiv",43,40);
        LowCost r3 = new LowCost("Uzhorod-Lviv",41,50);
        LowCost r4 = new LowCost("Charchiv-Lviv",50,47);
        LowCost r5 = new LowCost("Kiev-Odessa",45,38);
        //**********************************

        // Creating list and adding there
        List<ICosting> air = new ArrayList<>();
        air.add(f1);
        air.add(f2);
        air.add(f3);
        air.add(f4);
        air.add(f5);

        air.add(r1);
        air.add(r2);
        air.add(r3);
        air.add(r4);
        air.add(r5);

        // 2. Calculate the total price
        int price = air.stream().mapToInt(ICosting::getCost).sum();
        System.out.println("The total sum is " + price + " UAH.");

        // 3. Find the highest flight price.
        ICosting airWithHighestPrice =
                air.stream().max(Comparator.comparingInt(ICosting::getCost)).orElse(null);
        System.out.println("The highest price " + airWithHighestPrice + " UAH.");

        // 4. Find the lowest flight price.
        ICosting airWithLowestPrice =
                air.stream().min(Comparator.comparingInt(ICosting::getCost)).orElse(null);
        System.out.println("The lowest price " + airWithLowestPrice + " UAH.");

        // 5. Average flight price.
        double avg = air.stream().mapToInt(ICosting::getCost)
                .average().orElse(0);
        System.out.println("The average price " + avg + " UAH.");

        // 6. Which is higher in price: low cost or business class?
        int LowPrice = air.stream().filter(el->
                el instanceof LowCost).mapToInt(ICosting::getCost)
                .sum();
        int BusinessPrice = air.stream().filter(el->
                el instanceof BusinessClass).mapToInt(ICosting::getCost)
                .sum();

        if (LowPrice > BusinessPrice){
            System.out.println("Low class is higher price");
        } else {
            System.out.println("Business Class is higher price");
        }
        //**********************************

        // ------------------------Outcome------------------------
        /*The total sum is 22405 UAH.
          The highest price 4000 UAH.
          The lowest price 1575 UAH.
          The average price 2240.5 UAH.
          Business Class is higher price*/
        // ------------------------Outcome------------------------

    }
}
