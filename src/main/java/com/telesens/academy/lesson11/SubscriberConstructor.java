package com.telesens.academy.lesson11;

import com.telesens.academy.lesson09.home.GeneratePhoneNumbers;

import java.util.ArrayList;
import java.util.Random;

public class SubscriberConstructor {
    private ArrayList<SubscriberExt> arrayListSubsExt = new ArrayList<>();


    public SubscriberConstructor(NamesCollections file, int subsNumbers, int min, int max) {
        Random random = new Random();

        for (int i = 0; i < subsNumbers; i++) {
            SubscriberExt currentSubscriberExt = new SubscriberExt();
            //set subscriber id
            currentSubscriberExt.setId(Integer.toUnsignedLong(i));

            //set subscriber  gender
            Gender randomGender = Gender.getRandomGender();
            currentSubscriberExt.setGender(randomGender);

            //set subscriber firstname + lastname
            if (String.valueOf(randomGender).equals("MALE")) {
                int randomNum = random.nextInt(file.getArListMaleFirstName().size());
                currentSubscriberExt.setFirstName(file.getArListMaleFirstName(randomNum));

                randomNum = random.nextInt(file.getArListMaleLastNames().size());
                currentSubscriberExt.setLastName(file.getArListMaleLastNames(randomNum));

            } else {
                int randomNum = random.nextInt(file.getArListFemaleFirstNames().size());
                currentSubscriberExt.setFirstName(String.valueOf(file.getArListFemaleFirstNames(randomNum)));

                randomNum = random.nextInt(file.getArListFemaleLastNames().size());
                currentSubscriberExt.setLastName(file.getArListFemaleLastNames(randomNum));
            }
            //set Age
            int randomNum = (int) Math.round(random.nextGaussian() * (max + min) / 2) + (max + min) / 2;
            while ((randomNum < min) | (randomNum > max))
                randomNum = (int) Math.round(Math.abs(random.nextGaussian() * (max + min) / 2));

            currentSubscriberExt.setAge(randomNum);

            //set PhoneNumber
            OperatorPrefixCode operatorPrefixCode = new OperatorPrefixCode();
            GeneratePhoneNumbers generatePhoneNumber = new GeneratePhoneNumbers();
            operatorPrefixCode.setRandom();
            currentSubscriberExt.setPhoneNumber(generatePhoneNumber.getPhoneNumber(operatorPrefixCode.getPrefixCode()));
            //System.out.println("set PhoneNumber");

            //set Operator and Prefix
            Long operatorId = Long.parseLong(operatorPrefixCode.getPrefixCode() + i);
            Operator subsOperator = new Operator(operatorId, operatorPrefixCode.getOperName());
            currentSubscriberExt.setOperator(subsOperator);
            //System.out.println("set Operator and Prefix");

            //set OperatorPrefix
            currentSubscriberExt.setOperatorPrefix(operatorPrefixCode.getPrefixCode());


            arrayListSubsExt.add(currentSubscriberExt);
            //System.out.println("add all subs info into Array.list");
        }
        //System.out.println("subs completed");
    }

    public ArrayList<SubscriberExt> getArrayListSubsExt() {
        return arrayListSubsExt;
    }
}
