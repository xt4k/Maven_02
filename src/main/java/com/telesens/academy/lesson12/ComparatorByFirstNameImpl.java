package com.telesens.academy.lesson12;

import com.telesens.academy.lesson11.SubscriberExt;

import java.util.Comparator;

public class ComparatorByFirstNameImpl implements Comparator<SubscriberExt> {

    @Override
    public int compare(SubscriberExt o1, SubscriberExt o2) {
        return compare( o1.getFirstName(),o2.getFirstName());
}

    private int compare(String firstName, String firstName1) {
        return 0;
    }


}
