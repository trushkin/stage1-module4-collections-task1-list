package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> resultList = new LinkedList<>();
        if (sourceList.isEmpty()) {
            return resultList;
        }
        for (Integer temp : sourceList) {
            if (temp % 2 == 0) {
                resultList.addLast(temp);
            }
        } for (Integer temp : sourceList) {
            if (temp % 2 == 1) {
                resultList.addFirst(temp);
            }
        }
        return resultList;
    }
}
