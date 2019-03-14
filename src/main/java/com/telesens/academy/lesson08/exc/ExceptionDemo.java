package com.telesens.academy.lesson08.exc;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception {
        //String abonentRawString = "  heLen iVanova 35 f 0501234567";
        // String abonentRawString = " -helee heLen iVanova 135 f 0501234567";
        // String abonentRawString = " -helee iVanova 0-0135 f 0501234567";
        //  String abonentRawString = " helee ivanov 35 l 0501234567";
        //String abonentRawString = " helee ivanov 35 m";
        //  String abonentRawString =null;//
        String abonentRawString = "i o 9 m 7 ";//
        //  String abonentRawString =null;//
        // String abonentRawString= "d \n%j";
        // String abonentRawString = "@@@";
        // String name = null;
        // String lastname =null;
        System.out.println("=============");
        System.out.println("abonentRawString: " + abonentRawString);

        try {
            System.out.println("Abonent parsing ...");
            FullAbonParse fullAbonParsed = new FullAbonParse(abonentRawString);
        } catch (ParseAbonentException e) {
            System.out.println("Wrong gender");
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
            //System.out.println("Name is empty");
            System.out.println("Some fields are empty");
            System.out.println(e.getMessage());
            //System.out.println(e.getStackTrace());
            System.exit(1);

        } catch (NullPointerException e) {
            System.out.println("No data");
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (UniversalException e) {
            System.out.println("General error");
            System.out.println(e.getMessage());
            System.exit(1);
        }
/*
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Last Name is empty");
            System.out.println(e.getMessage());
        }*/ catch (NumberFormatException e) {
            System.out.println("Wrong Age");
            System.out.println(e.getMessage());
            System.exit(1);
        }

/*        catch (NullPointerException e) {
            System.out.println("No data");
            System.out.println(e.getMessage());
        }*/

    }
}
