package com.telesens.academy.lesson11;

import java.util.ArrayList;

public class NamesCollections {
    private ArrayList aListMaleFirstName;
    private ArrayList aListMaleLastNames;
    private ArrayList aListFemaleFirstNames;
    private ArrayList aListFemaleLastNames;
    private int minimalAge;
    private int maximalAge;

    public NamesCollections(ReadPropFile file) {
        FillArrayListsFromFiles aListMaleFirstName = new FillArrayListsFromFiles(file.getPathM_FirstNames());
        FillArrayListsFromFiles aListMaleLastNames = new FillArrayListsFromFiles(file.getPathM_LastNames());
        FillArrayListsFromFiles aListFemaleFirstNames = new FillArrayListsFromFiles(file.getPathF_FirstNames());
        FillArrayListsFromFiles aListFemaleLastNames = new FillArrayListsFromFiles(file.getPathF_LastNames());
        this.aListMaleFirstName = aListMaleFirstName.getArrayList();
        this.aListMaleLastNames = aListMaleLastNames.getArrayList();
        this.aListFemaleFirstNames = aListFemaleFirstNames.getArrayList();
        this.aListFemaleLastNames = aListFemaleLastNames.getArrayList();
        minimalAge = file.getAgeFrom();
        maximalAge = file.getAgeTo();
    }

    public int getMinimalAge() {
        return minimalAge;
    }

    public int getMaximalAge() {
        return maximalAge;
    }

    public String getArListMaleFirstName(int i) {
        return String.valueOf(aListMaleFirstName.get(i));
    }

    public ArrayList getArListMaleFirstName() {
        return aListMaleFirstName;
    }

    public String getArListMaleLastNames(int i) {
        return (String) aListMaleLastNames.get(i);
    }

    public ArrayList getArListMaleLastNames() {
        return aListMaleLastNames;
    }

    public ArrayList getArListFemaleFirstNames() {
        return aListFemaleFirstNames;
    }

    public String getArListFemaleFirstNames(int i) {
        return (String) aListFemaleFirstNames.get(i);
    }

    public ArrayList getArListFemaleLastNames() {
        return aListFemaleLastNames;
    }

    public String getArListFemaleLastNames(int i) {
        return (String) aListFemaleLastNames.get(i);
    }
}
