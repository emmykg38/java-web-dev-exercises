package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {
        int returned;
            if(o1.getCost() - o2.getCost() > 0) {
                returned = 1;
            } else if (o1.getCost() - o2.getCost() < 0) {
                returned = -1;
            } else {
                returned = 0;
            }
        return returned;
        }
    }

//have tried:
//casting to int
//if/else blocks
//unsure of how comparator works