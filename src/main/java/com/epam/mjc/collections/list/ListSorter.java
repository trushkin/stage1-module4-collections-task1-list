package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x1 = Integer.parseInt(a);
        int x2 = Integer.parseInt(b);

        int result1 = 5 * x1 * x1 + 3;
        int result2 = 5 * x2 * x2 + 3;

        if (result1 != result2) {
            return Integer.compare(result1, result2);
        } else {
            return Integer.compare(x1, x2);
        }
    }
}
