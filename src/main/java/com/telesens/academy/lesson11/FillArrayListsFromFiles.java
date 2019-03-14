package com.telesens.academy.lesson11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FillArrayListsFromFiles {
    private ArrayList arrayList;

    public FillArrayListsFromFiles(String s) {
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader br = new BufferedReader( new FileReader( s ) );
            String line;
            while ((line = br.readLine()) != null)
                arrayList.add( line );
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.arrayList = arrayList;
    }

    public ArrayList getArrayList() {
        return arrayList;
    }
}
