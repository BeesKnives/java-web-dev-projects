package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        Double coneCost1 = o1.getCost();
        Double coneCost2 = o2.getCost();

        return coneCost1.compareTo(coneCost2);
    }
}
