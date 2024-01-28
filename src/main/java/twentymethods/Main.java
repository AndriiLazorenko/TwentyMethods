package twentymethods;

public class Main {
    public static void main(String[] args) {

        //1 принимает массив чаров, выводит его на экран
        System.out.println("Testing my methods");
        System.out.println("1. takesCharsToScreen");
        TwentyMethods.printCharArrayToConsole(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println("******");
        TwentyMethods.printCharArrayToConsole(new char[]{});
        System.out.println("******");

        //2 принимает массив интов, возвращает массив чаров,
        // каждый символ в позиции массива соответствует коду символа передаваемого инта
        System.out.println("2. changeCharArrayToIntArray");
        System.out.println(TwentyMethods.modifyCharArrayToIntArray(new int[]{4, 6}));
        System.out.println("******");
        System.out.println(TwentyMethods.modifyCharArrayToIntArray(new int[]{}));
        System.out.println("******");

        //3 приминает 2 инта, а и б, возвращает большее их этих 2х чисел
        System.out.println("3.1. findMaxOfTwoIntsFirstMethod");
        System.out.println("Max of two ints is " + TwentyMethods.findMaxOfTwoIntsFirstMethod(4, 6));
        System.out.println("******");

        //3 приминает 2 инта, а и б, возвращает большее их этих 2х чисел
        System.out.println("3.2. findMaxOfTwoIntsSecondMethod");
        System.out.println("Max of two ints is " + TwentyMethods.findMaxOfTwoIntsSecondMethod(6, 6));
        System.out.println("******");

        //3 приминает 2 инта, а и б, возвращает большее их этих 2х чисел
        System.out.println("3.3. findMaxOfTwoIntsThirdMethod");
        System.out.println("Max of two ints is " + TwentyMethods.findMaxOfTwoIntsThirdMethod(6, 11));
        System.out.println("******");

        //4 принимает 3 инта, возвращает большее из них
        System.out.println("4.1. findMaxOfThreeIntsFirstMethod");
        System.out.println("Max of three ints is " + TwentyMethods.findMaxOfThreeIntsFirstMethod(new int[]{5, 6, 7}));
        System.out.println("******");
        System.out.println("Max of three ints is " + TwentyMethods.findMaxOfThreeIntsFirstMethod(new int[]{}));
        System.out.println("******");

        //4 принимает 3 инта, возвращает большее из них
        System.out.println("4.2. findMaxOfThreeIntsSecondMethod");
        System.out.println("Max of three ints is " + TwentyMethods.findMaxOfThreeIntsSecondMethod(-5, -2, -1));
        System.out.println("******");

        //4 принимает 3 инта, возвращает большее из них
        System.out.println("4.3. findMaxOfThreeIntsThirdMethod");
        System.out.println("Max of three ints is " + TwentyMethods.findMaxOfThreeIntsThirdMethod(1, 100, 3));
        System.out.println("******");

        //5 принимает 5 инта, возвращает большее из них
        System.out.println("5.1. findMaxOfFiveIntsFirstMethod");
        System.out.println("Max of five ints is " + TwentyMethods.findMaxOfFiveIntsFirstMethod(new int[]{1, 2, 20, 4, 5}));
        //5 принимает 5 инта, возвращает большее из них
        System.out.println("5.2. findMaxOfFiveIntsSecondMethod");
        System.out.println("Max of five ints is " + TwentyMethods.findMaxOfFiveIntsSecondMethod(1, 100, 3, 4, 5));


        //6 принимает массив чаров, возвращает строку состоящую из символов массива
        System.out.println("6. modifyCharArrayToString");
        System.out.println(TwentyMethods.modifyCharArrayToString(new char[]{'W', 'o', 'r', 'l', 'd'}));
        System.out.println("******");
        System.out.println(TwentyMethods.modifyCharArrayToString(new char[]{}));
        System.out.println("******");

        //8 принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с
        // передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
        System.out.println("8. findIndexOfMatchingIntValueInArrayStartingFromArrayBeginning");
        System.out.println("Value is " + TwentyMethods.findIndexOfMatchingIntValueInArrayStartingFromArrayBeginning(new int[]{}, 2));
        System.out.println("******");

        //9) принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым,
        // начиная с конца массива. Если значения в массиве нет возвращает -1
        System.out.println("9. findIndexOfMatchingIntValueInArrayStartingFromArrayEnd");
        System.out.println("Value is " + TwentyMethods.findIndexOfMatchingIntValueInArrayStartingFromArrayEnd(new int[]{5, 4, 3, 2, 1}, 1));
    }
}
