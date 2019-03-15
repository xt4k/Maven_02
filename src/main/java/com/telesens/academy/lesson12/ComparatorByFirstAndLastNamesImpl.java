package com.telesens.academy.lesson12;

import com.telesens.academy.lesson11.SubscriberExt;

import java.util.Comparator;

public class ComparatorByFirstAndLastNamesImpl implements Comparator<SubscriberExt> {
    @Override
    public int compare(SubscriberExt o1, SubscriberExt o2) {
        if ((o1.getLastName()).equals(o2.getLastName())) {
            return compare(o2.getFirstName(), o1.getFirstName());
        } else return compare(o1.getFirstName(),(o2.getFirstName()));
    }

    private int compare(String firstName, String firstName1) {
        return 0;

    }
}
