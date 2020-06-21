/*
*
* Classname Main
*
* 21 June 2020
*
* Copyright Ivan Holovey
*
* Module 3. Task 1
*
* 1. Create ArrayList and LinkedList containing  100 000 Integer elements.
*  Compare time intervals.
* 2. Insert  new 1000 elements  on the  beginning, on  the middle
*  and on the end of ones. Compare time intervals.
* 3. Update 1000 elements  from the  beginning, from  the middle
*  and from the end of ones. Compare time intervals.
* 4. Delete 1000 elements  from the  beginning, from  the middle
*  and from the end of ones. Compare time intervals.
*
*/
package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        // 1. Creating ArrayList and LinkedList containing  10 000 Integer elements.
        // Compare time intervals

        // Array List
        LocalDateTime startI = LocalDateTime.now();

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            integers.add(i);
        }

        LocalDateTime finishI = LocalDateTime.now();

        System.out.println("Creating ArrayList takes "
                + ChronoUnit.MILLIS.between(startI, finishI) + " ms.");

        // Linked List
        LocalDateTime startIL = LocalDateTime.now();

        List<Integer> integersLinked = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            integersLinked.add(i);
        }

        System.out.println(integersLinked.size());

        LocalDateTime finishIL = LocalDateTime.now();

        System.out.println("Creating Linked List takes "
                + ChronoUnit.MILLIS.between(startIL, finishIL) + " ms.");

        if ((ChronoUnit.MILLIS.between(startIL, finishIL)
                < ChronoUnit.MILLIS.between(startI, finishI))) {
            System.out.println("Creating of Linked List is faster.");
        } else {
            System.out.println("Creating of ArrayList is faster.");
        }

        // 2. Insert  new 1000 elements  in the  beginning, in  the middle
        // and in the end of ones. Compare time intervals.

        // Array List insert new 1000 elements in the beginning

        LocalDateTime startIIns1000EInBeginning = LocalDateTime.now();

        List<Integer> integersFirst = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            integersFirst.add(i);
        }

        integers.addAll(0, integersFirst);

        LocalDateTime finishIIns1000EInBeginning = LocalDateTime.now();

        System.out.println("Inserting of new 1000 elements in the beginning" +
                " of ArrayList " + ChronoUnit.MILLIS.between(startIIns1000EInBeginning
                , finishIIns1000EInBeginning) + " ms.");

        // Linked List insert new 1000 elements in the beginning

        LocalDateTime startILIns100EInBeginning = LocalDateTime.now();

        List<Integer> integersLinkedFirst = new LinkedList<>();

        for (int i = 0; i < 1000; i++) {
            integersLinkedFirst.add(i);
        }

        integersLinked.addAll(0, integersLinkedFirst);

        LocalDateTime finishILIns100EInBeginning = LocalDateTime.now();

        System.out.println("Inserting of new 1000 elements in the beginning" +
                " of Linked List " + ChronoUnit.MILLIS.between(startILIns100EInBeginning
                , finishILIns100EInBeginning) + " ms.");

        if ((ChronoUnit.MILLIS.between(startILIns100EInBeginning
                , finishILIns100EInBeginning)
                < ChronoUnit.MILLIS.between(startIIns1000EInBeginning
                , finishIIns1000EInBeginning))) {
            System.out.println("Inserting of new 1000 elements in the beginning" +
                    " in the Linked List is faster.");
        } else {
            System.out.println("Inserting of new 1000 elements in the beginning" +
                    " in the ArrayList is faster.");
        }

        // Array List insert new 1000 elements in the middle

        LocalDateTime startIIns1000EInMiddle = LocalDateTime.now();

        List<Integer> integersMiddle = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            integersMiddle.add(i);
        }

        integers.addAll(integers.size() / 2, integersMiddle);

        LocalDateTime finishIIns1000EInMiddle = LocalDateTime.now();

        System.out.println("Inserting of new 1000 elements in the middle" +
                " of ArrayList " + ChronoUnit.MILLIS.between(startIIns1000EInMiddle
                , finishIIns1000EInMiddle) + " ms.");

        // Linked List insert new 1000 elements in the middle

        LocalDateTime startILIns1000EInMiddle = LocalDateTime.now();

        List<Integer> integersLinkedMiddle = new LinkedList<>();

        for (int i = 0; i < 1000; i++) {
            integersLinkedMiddle.add(i);
        }

        integersLinked.addAll(integersLinked.size() / 2
                , integersLinkedMiddle);

        LocalDateTime finishILIns1000EInMiddle = LocalDateTime.now();

        System.out.println("Inserting of new 1000 elements in the middle" +
                " of Linked List " + ChronoUnit.MILLIS.between(startILIns1000EInMiddle
                , finishILIns1000EInMiddle) + " ms.");

        if ((ChronoUnit.MILLIS.between(startILIns1000EInMiddle
                , finishILIns1000EInMiddle)
                < ChronoUnit.MILLIS.between(startIIns1000EInMiddle
                , finishIIns1000EInMiddle))) {
            System.out.println("Inserting of new 1000 elements in the middle" +
                    " in the Linked List is faster.");
        } else {
            System.out.println("Inserting of new 1000 elements in the middle" +
                    " in the ArrayList is faster.");
        }

        // Array List insert new 1000 elements in the end

        LocalDateTime startIIns1000EInEnd = LocalDateTime.now();

        List<Integer> integersEnd = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            integersEnd.add(i);
        }

        integers.addAll(integersEnd);

        LocalDateTime finishIIns1000EInEnd = LocalDateTime.now();

        System.out.println("Inserting of new 1000 elements in the end" +
                " of ArrayList " + ChronoUnit.MILLIS.between(startIIns1000EInEnd
                , finishIIns1000EInEnd) + " ms.");

        // Linked List insert new 1000 elements in the end

        LocalDateTime startILIns1000EInEnd = LocalDateTime.now();

        List<Integer> integersLinkedEnd = new LinkedList<>();

        for (int i = 0; i < 1000; i++) {
            integersLinkedEnd.add(i);
        }

        integersLinked.addAll (integersLinkedEnd);

        LocalDateTime finishILIns1000EInEnd = LocalDateTime.now();

        System.out.println("Inserting of new 1000 elements in the end" +
                " of Linked List " + ChronoUnit.MILLIS.between(startILIns1000EInEnd
                , finishILIns1000EInEnd) + " ms.");

        if ((ChronoUnit.MILLIS.between(startILIns1000EInEnd
                , finishILIns1000EInEnd)
                < ChronoUnit.MILLIS.between(startIIns1000EInEnd
                , finishIIns1000EInEnd))) {
            System.out.println("Inserting of new 1000 elements in the end" +
                    " in the Linked List is faster.");
        } else {
            System.out.println("Inserting of new 1000 elements in the end" +
                    " in the ArrayList is faster.");
        }

        // 3. Update 1000 elements  from the  beginning, from  the middle
        // and from the end of ones. Compare time intervals

        // Array List update new 1000 elements from the beginning

        LocalDateTime startIUpd1000InBeginning = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.set(i, i++);
        }

        LocalDateTime finishIUpd1000InBeginning = LocalDateTime.now();
        System.out.println("Updating of new 1000 elements in the beginning" +
                " of ArrayList " + ChronoUnit.MILLIS.between(startIUpd1000InBeginning
                , finishIUpd1000InBeginning) + " ms.");

        // Linked List update new 1000 elements from the beginning

        LocalDateTime startILUpd1000InBeginning = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.set(i, i);
        }

        LocalDateTime finishILUpd1000InBeginning = LocalDateTime.now();

        System.out.println("Updating of new 1000 elements in the beginning" +
                " of Linked List " + ChronoUnit.MILLIS.between(startILUpd1000InBeginning
                , finishILUpd1000InBeginning) + " ms.");

        if ((ChronoUnit.MILLIS.between(startILUpd1000InBeginning
                , finishILUpd1000InBeginning)
                < ChronoUnit.MILLIS.between(startIUpd1000InBeginning
                , finishIUpd1000InBeginning))) {
            System.out.println("Updating of new 1000 elements in the beginning" +
                    " in the Linked List is faster.");
        } else {
            System.out.println("Updating of new 1000 elements in the beginning" +
                    " in the ArrayList is faster.");
        }

        // Array List update new 1000 elements from the middle

        LocalDateTime startIUpd1000InMiddle = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.set(integers.size() / 2 + i, i++);
        }

        LocalDateTime finishIUpd1000InMiddle = LocalDateTime.now();

        System.out.println("Updating of new 1000 elements in the middle" +
                " of ArrayList " + ChronoUnit.MILLIS.between(startIUpd1000InMiddle
                , finishIUpd1000InMiddle) + " ms.");

        // Linked List update new 1000 elements from the middle

        LocalDateTime startILUpd1000InMiddle = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.set(integersLinked.size() / 2 + i, i++);
        }

        LocalDateTime finishILUpd1000InMiddle = LocalDateTime.now();

        System.out.println("Updating of new 1000 elements in the middle" +
                " of Linked List " + ChronoUnit.MILLIS.between(startILUpd1000InMiddle
                , finishILUpd1000InMiddle) + " ms.");

        if ((ChronoUnit.MILLIS.between(startILUpd1000InMiddle
                , finishILUpd1000InMiddle)
                < ChronoUnit.MILLIS.between(startIUpd1000InMiddle
                , finishIUpd1000InMiddle))) {
            System.out.println("Updating of new 1000 elements in the middle" +
                    " in the Linked List is faster.");
        } else {
            System.out.println("Updating of new 1000 elements in the middle" +
                    " in the ArrayList is faster.");
        }

        // Array List update new 1000 elements from the end

        LocalDateTime startIUpd1000InEnd = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.set(integers.size() - 1000 + i, i++);
        }

        LocalDateTime finishIUpd1000InEnd = LocalDateTime.now();

        System.out.println("Updating of new 1000 elements in the end" +
                " of ArrayList " + ChronoUnit.MILLIS.between(startIUpd1000InEnd
                , finishIUpd1000InEnd) + " ms.");

        // Linked List update new 1000 elements from the end

        LocalDateTime startILUpd1000InEnd = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.set(integersLinked.size() - 1000 + i, i++);
        }

        LocalDateTime finishILUpd1000InEnd = LocalDateTime.now();

        System.out.println("Updating of new 1000 elements in the end" +
                " of Linked List " + ChronoUnit.MILLIS.between(startILUpd1000InEnd
                , finishILUpd1000InEnd) + " ms.");
        if ((ChronoUnit.MILLIS.between(startILUpd1000InEnd
                , finishILUpd1000InEnd)
                < ChronoUnit.MILLIS.between(startIUpd1000InEnd
                , finishIUpd1000InEnd))) {
            System.out.println("Updating of new 1000 elements in the end" +
                    " in the Linked List is faster.");
        } else {
            System.out.println("Updating of new 1000 elements in the end" +
                    " in the ArrayList is faster.");
        }

        // 4. Delete 1000 elements  from the  beginning, from  the middle
        //  and from the end of ones. Compare time intervals

        // Array List delete new 1000 elements in the beginning

        LocalDateTime startIDel1000InBeginning = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.remove(i);
        }

        LocalDateTime finishIDel1000InBeginning = LocalDateTime.now();

        System.out.println("Deleting of new 1000 elements in the beginning" +
                " of ArrayList " + ChronoUnit.MILLIS.between(startIDel1000InBeginning
                , finishIDel1000InBeginning) + " ms.");

        // Linked List delete new 1000 elements in the beginning

        LocalDateTime startILDel1000InBeginning = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(i);
        }

        LocalDateTime finishILDel1000InBeginning = LocalDateTime.now();

        System.out.println("Deleting of new 1000 elements in the beginning" +
                " of Linked List " + ChronoUnit.MILLIS.between(startILDel1000InBeginning
                , finishILDel1000InBeginning) + " ms.");

        if ((ChronoUnit.MILLIS.between(startILDel1000InBeginning
                , finishILDel1000InBeginning)
                < ChronoUnit.MILLIS.between(startIDel1000InBeginning
                , finishIDel1000InBeginning))) {
            System.out.println("Deleting of new 1000 elements in the beginning" +
                    " in the Linked List is faster.");
        } else {
            System.out.println("Deleting of new 1000 elements in the beginning" +
                    " in the ArrayList is faster.");
        }

        // Array List delete new 1000 elements in the middle

        LocalDateTime startIDel1000InMiddle = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.remove(integers.size() / 2 + i);
        }

        LocalDateTime finishIDel1000InMiddle = LocalDateTime.now();

        System.out.println("Deleting of new 1000 elements in the middle" +
                " of ArrayList " + ChronoUnit.MILLIS.between(startIDel1000InMiddle
                , finishIDel1000InMiddle) + " ms.");

        // Linked List delete new 1000 elements in the middle

        LocalDateTime startILDel100InMiddle = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(integers.size() / 2 + i);
        }

        LocalDateTime finishILDel100InMiddle = LocalDateTime.now();

        System.out.println("Deleting of new 1000 elements in the middle" +
                " of Linked List " + ChronoUnit.MILLIS.between(startILDel100InMiddle
                , finishILDel100InMiddle) + " ms.");

        if ((ChronoUnit.MILLIS.between(startILDel100InMiddle
                , finishILDel100InMiddle)
                < ChronoUnit.MILLIS.between(startIDel1000InMiddle
                , finishIDel1000InMiddle))) {
            System.out.println("Deleting of new 1000 elements in the middle" +
                    " in the Linked List is faster.");
        } else {
            System.out.println("Deleting of new 1000 elements in the middle" +
                    " in the ArrayList is faster.");
        }

        // Array List delete new 1000 elements in the end

        LocalDateTime startIDel1000InEnd = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.remove(integers.size() - 1000 + i);
        }

        LocalDateTime finishIDel1000InEnd = LocalDateTime.now();
        System.out.println("Deleting of new 1000 elements in the end" +
                " of ArrayList " + ChronoUnit.MILLIS.between(startIDel1000InEnd
                , finishIDel1000InEnd) + " ms.");

        // Linked List delete new 1000 elements in the end

        LocalDateTime startILDel1000InEnd = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(integersLinked.size() - 1000 + i);
        }

        LocalDateTime finishILDel1000InEnd = LocalDateTime.now();

        System.out.println("Deleting of new 1000 elements in the end" +
                " of Linked List " + ChronoUnit.MILLIS.between(startILDel1000InEnd
                , finishILDel1000InEnd) + " ms.");

        if ((ChronoUnit.MILLIS.between(startILDel1000InEnd
                , finishILDel1000InEnd)
                < ChronoUnit.MILLIS.between(startIDel1000InEnd
                , finishIDel1000InEnd))) {
            System.out.println("Deleting of new 1000 elements in the end" +
                    " in the Linked List is faster.");
        } else {
            System.out.println("Deleting of new 1000 elements in the end" +
                    " in the ArrayList is faster.");
        }

    }
}
