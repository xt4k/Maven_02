package com.telesens.academy.lesson11;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscribersExtDemo {
    private static String subscribersExtDataPATH = "F:/KypcbI/QA_JA/OutPutFile/subscriberExt.txt";

        public static void main(String[] args) throws IOException {

// Operators
            Operator operatorLife = new Operator();
            operatorLife.setId(1L);
            operatorLife.setName("Life");

            Operator operatorKievstar = new Operator();
            operatorKievstar.setId(2L);
            operatorKievstar.setName("Kievstar");

            Operator operatorVodafone = new Operator();
            operatorVodafone.setId(3L);
            operatorVodafone.setName("Vodafone");

            // Subscribers
            SubscriberExt subscriber1 = new SubscriberExt();
            subscriber1.setId(1L);
            subscriber1.setFirstName("Иван");
            subscriber1.setLastName("Васильев");
            subscriber1.setGender(Gender.MALE);
            subscriber1.setAge(23);
            subscriber1.setPhoneNumber("380630025465");
            subscriber1.setOperator(operatorLife);

            SubscriberExt subscriber2 = new SubscriberExt();
            subscriber2.setId(2L);
            subscriber2.setFirstName("Катя");
            subscriber2.setLastName("Петрова");
            subscriber2.setGender(Gender.FEMALE);
            subscriber2.setAge(34);
            subscriber2.setPhoneNumber("380670058694");
            subscriber2.setOperator(operatorKievstar);

            List<SubscriberExt> subscribers = new ArrayList<>();
            subscribers.add( subscriber1 );
            subscribers.add( subscriber2 );


            System.out.println("subscribers.toString()"+subscribers.toString());

            Map<Long, SubscriberExt> subscribersMap = new HashMap<>(  );
            subscribersMap.put( subscriber1.getId(),subscriber1 );
            subscribersMap.put( subscriber2.getId(),subscriber1 );

            System.out.println("subscribersMap: "+subscribersMap);

            for (Long key:subscribersMap.keySet())
            {

            }

            System.out.println("3 way ");
            for (SubscriberExt subscriberExt:subscribersMap.values())
            {
                System.out.println(subscriberExt);
            }
            //
            try {
                PrintWriter pw = new PrintWriter( subscribersExtDataPATH );
                System.out.println("save into file");
                pw.println( subscribersMap );
                pw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                FileReader fileReader = new FileReader( subscribersExtDataPATH );
                BufferedReader bufferedReader = new BufferedReader( fileReader );

                while ((bufferedReader.readLine()!=null)){
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
}
