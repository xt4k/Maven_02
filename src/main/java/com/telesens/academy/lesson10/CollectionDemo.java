package com.telesens.academy.lesson10;

import com.telesens.academy.lesson08.exc.FullAbonParse;
import com.telesens.academy.lesson09.home.GenArray;
import com.telesens.academy.lesson08.exc.FullAbonParse;
import com.telesens.academy.lesson09.home.GenArray;
import com.telesens.academy.lesson04.Subscriber;
import com.telesens.academy.lesson08.exc.FullAbonParse;
import com.telesens.academy.lesson09.home.GenArray;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) throws Exception {
        String[] abonentRawArray = {
                " heLen iVanova 35 f 0501234567",
                " Андрей Сидоров 26 m 0501234568",
                " Peter Lvovich 37 m 0501234569",
        };
        String[] abonentRawArray2 = {
                " Андрей Сидоров 26 m 0501234568",
                " heLen iVanova 35 f 0501234567",
                " Peter Lvovich 37 m 0501234569",
        };

        Subscriber[] abonentArray = parseAbonents(abonentRawArray);
        Subscriber[] abonentArray2 = parseAbonents(abonentRawArray2);

        System.out.println("abonents array");
        for (int i = 0; i < abonentArray.length; i++)
            System.out.println(abonentArray[i]);

        System.out.println("generic array");
        GenArray<Subscriber[]> genSub = new GenArray(abonentArray);
        System.out.println(genSub.getArray());

        System.out.println("===list===");
        List<Subscriber> abonentList = new ArrayList<>(Arrays.asList(abonentArray));
        System.out.println(abonentList);

        List <Subscriber> abonentList2 = new ArrayList<>(Arrays.asList(abonentArray2));

        System.out.println(abonentList.equals(abonentList2));
        assert abonentList.equals(abonentList2);

        //Collections.sort(abonentList);
        //Collections.sort(abonentList2);

        System.out.println("===list===");
        Set <Subscriber> abonSet = new HashSet<>( abonentList );
        Set <Subscriber> abonSet2 = new HashSet<>( abonentList2 );
        System.out.println(abonSet.equals(abonSet2));

        System.out.println("======= The_End. ========");
    }

    private static Subscriber[] parseAbonents(String[] abonentRawArray) throws Exception {
        Subscriber[] abonents = new Subscriber[abonentRawArray.length];

        for (int i = 0; i < abonentRawArray.length; i++) {
            FullAbonParse fullAbonParsed = new FullAbonParse(abonentRawArray[i]);
            abonents[i] = fullAbonParsed.getParsedPerson();
        }
        return abonents;
    }

}