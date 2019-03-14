package com.telesens.academy.lesson11;

import java.util.ArrayList;

public class NamesCollections {
  private ArrayList aListMaleFirstName;
  private ArrayList aListMaleLastNames;
  private ArrayList aListFemaleFirstNames;
  private ArrayList aListFemaleLastNames;


    public NamesCollections(ArrayList arrayList, ArrayList arrayList1, ArrayList arrayList2, ArrayList arrayList3) {
        this.aListMaleFirstName =  arrayList;
        this.aListMaleLastNames =  arrayList1;
        this.aListFemaleFirstNames = arrayList2;
        this.aListFemaleLastNames =  arrayList3;
    }

    public String getArListMaleFirstName(int i) {
        return String.valueOf(aListMaleFirstName.get( i ) );
    }

    public ArrayList getArListMaleFirstName() {
        return aListMaleFirstName;
    }

    public String getArListMaleLastNames(int i) {
        return (String) aListMaleLastNames.get( i );
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



/*  private boolean checkIndex(int i, int arrNumber) {
        if (i >= arraylist[i].lenght[arrNumber]||i<0) {
            new com.telesens.academy.lesson09.home.ArrayIndexOutOfBoundsException("wrong index for Arraylist element", i);
            System.exit(1);
        }
        return true;
    }*/
}
