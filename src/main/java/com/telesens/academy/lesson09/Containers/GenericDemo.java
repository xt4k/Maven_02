package com.telesens.academy.lesson09.Containers;

public class GenericDemo {
    public static void main(String[] args) {
        Container<String> container = new Container<>();
        container.setElement("Hello");
        String msg = (String) container.getElement();
        System.out.println(msg);

        Container <Integer> integerContainer = new Container<>();
        integerContainer.setElement(23);
        Integer i = (Integer)integerContainer.getElement();
        System.out.println(i);


        PairedContainer<Integer,String> pairedContainer = new PairedContainer();
        pairedContainer.setFirstValue(2);
        pairedContainer.setSecondValue("2");

        System.out.println(pairedContainer.getFirstValue()+ "=>"+pairedContainer.getSecondValue());

        PairedContainer[] arrPairedContainers = new PairedContainer[10];

    }


}
