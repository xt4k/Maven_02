package com.telesens.academy.lesson12;

import com.telesens.academy.lesson11.SubscriberExt;

import java.util.Comparator;

public class ComparatorByAgeImpl implements Comparator<SubscriberExt> {

    //1 scenario
/*    @Override
    public int compare(SubscriberExt o1, SubscriberExt o2) {
        if (o1.getAge() < o2.getAge())
            return -1;
        if (o1.getAge() > o2.getAge())
            return 1;
        else return 0;*/


    //2 scenario
    @Override
    public int compare(SubscriberExt o1, SubscriberExt o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
