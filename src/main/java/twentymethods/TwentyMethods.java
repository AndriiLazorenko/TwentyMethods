package twentymethods;

public class TwentyMethods {

    //1 принимает массив чаров, выводит его на экран
    public static void printCharArrayToConsole(char[] chars) {
        System.out.println(chars);
    }

    //2) принимает массив интов, возвращает массив чаров, каждый символ в позиции массива
    //соответствует коду символа передаваемого инт
    public static char[] modifyCharArrayToIntArray(int[] ints) {
        char[] chars = new char[ints.length];
        for (int i = 0; i < ints.length; i++) {
            chars[i] = (char) ints[i];
        }
        return chars;
    }

    //3) приминает 2 инта, а и б, возвращает большее их этих 2х чисел
    public static int findMaxOfTwoIntsFirstMethod(int a, int b) {
        return Math.max(a, b);
    }

    //3.1
    public static int findMaxOfTwoIntsSecondMethod(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }

    public static int findMaxOfTwoIntsThirdMethod(int a, int b) {
        return (a >= b) ? a : b;
    }

    //4) принимает 3   инта, возвращает большее из них
    public static int findMaxOfThreeIntsFirstMethod(int[] ints) {
        if (ints.length != 3) {
            //TODO: 18.01.24 REPLACE WITH EXCEPTION
            return Integer.MAX_VALUE;
        }
        int maxIntInArray = ints[0];
        for (int i = 1; i < ints.length; i++) {
            maxIntInArray = Math.max(maxIntInArray, ints[i]);
        }
        return maxIntInArray;
    }

    //4.1
    public static int findMaxOfThreeIntsSecondMethod(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > c) {
            return b;
        }
        return c;
    }

    //4.3
    public static int findMaxOfThreeIntsThirdMethod(int a, int b, int c) {
        int max = (a > b) ? a : b;
        //  max = (max > c) ? max : c;
        max = findMaxOfTwoIntsFirstMethod(max, c);
        return max;
    }

    //5) принимает 5 инта, возвращает большее из них
    public static int findMaxOfFiveIntsFirstMethod(int[] ints) {
        if (ints.length != 5) {
            //TODO: 17/01/2024 replace with exception
            System.out.println("Incorrect length of array");
            return Integer.MAX_VALUE;
        }
        int maxIntArr = ints[0];
        for (int i = 1; i < ints.length; i++)
            maxIntArr = Math.max(maxIntArr, ints[i]);
        return maxIntArr;
    }

    //5) принимает 5 инта, возвращает большее из них
    public static int findMaxOfFiveIntsSecondMethod(int a, int b, int c, int d, int e) {
        if (a > b && a > c && a > d && a > e) {
            return a;
        }
        if (b > c && b > d && b > e) {
            return b;
        }
        if (c > d && c > e) {
            return c;
        }
        if (d > e) {
            return d;
        }
        return e;
    }

    //6) принимает массив чаров, возвращает строку состоящую из символов массива
    public static String modifyCharArrayToString(char[] chars) {
        return new String(chars);
    }

    //8) принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым,
// начиная с начала массива. Если значения в массиве нет возвращает -1
    public static int findIndexOfMatchingIntValueInArrayStartingFromArrayBeginning(int[] ints, int value) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // 9) принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым,
    // начиная с конца массива. Если значения в массиве нет возвращает -1
    public static int findIndexOfMatchingIntValueInArrayStartingFromArrayEnd(int[] ints, int value) {
        int lastIndex = ints.length - 1;
        for (int i = lastIndex; i >= 0; i--) {
            if (ints[i] == value) {
                return lastIndex - i;
            }
        }
        return -1;
    }
}