package com.telesens.academy.lesson11;


public class HomeTask1 {
    static String PROP_FILE_PATH = "f:/KypcbI/QA_JA/lesson11/java-part.properties";

    public static void main(String[] args) {
        ReadPropFile readPropFile = null;

        readPropFile = new ReadPropFile(PROP_FILE_PATH);

        NamesCollections namesCollections = new NamesCollections(readPropFile);

        SubscriberConstructor subscriberConstructor = new SubscriberConstructor(namesCollections, 200, namesCollections.getMinimalAge(), namesCollections.getMaximalAge());

        // subscriberConstructor.sort(new ComparatorByFirstAndLastNamesImpl());

        System.out.println("compare");
        ExcelSubscriberDataTable excelSubscribersTable = new ExcelSubscriberDataTable( 200, subscriberConstructor.getArrayListSubsExt() );
        excelSubscribersTable.saveTo( readPropFile.getPath_xlsx() );

        ReadSubscriberExcelToMap mapSubscriber = new ReadSubscriberExcelToMap(readPropFile);
        mapSubscriber.saveTo( readPropFile.getPath_txt() )


        System.out.println("++");


//        d) Прочитать subscribers.xlsx в коллекцию Map<Long, Subscriber> и сохранить в текстовый файл: subscribers.txt
//                (путь к файлу взять из 'java-part.properties')
//        e) Прочитать subscribers.xlsx в коллекцию List<Subscriber> отсортировать сразу по 4 полям:
//        - оператору
//                - по возрасту
//                - по фамилии
//                - по имени
//        f) Сохранить результат сортировки в файл 'sort-subscribers.txt'
//        (путь к файлу взять из 'java-part.properties')
//        g) Прочитать 1-ый десять строк файла sort-subscribers.txt и вывести на экран
//        (путь к файлу взять из 'java-part.properties')
//        3)  Упаковать файлы 'subscribers.txt' и 'java-part.properties' в zip архив 'subscriber.zip'
//        (путь к исходным файлам и zip архиву брать из файла 'java-part.properties')
//        4)*  Написать тест, который:
//        - запускает 3 задание
//        После этого проверяет:
//        - наличие zip архива:  'subscriber.zip'
//                - кол-во упакованных файлов равно 2
//                - наличие в zip архиве файлов:
//        'subscribers.xlsx'
//        'subscribers.txt'


    }
}
