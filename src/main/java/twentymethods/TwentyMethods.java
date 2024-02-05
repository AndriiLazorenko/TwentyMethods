package twentymethods;

import java.util.Arrays;

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

    //10.1) метод принимает инт, и возвращает факториал от заданого инта \
    public static int getFactorialFromIntFirst(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    //10.2) метод принимает инт, и возвращает факториал от заданого инта \
    public static int getFactorialFromIntSecond(int n) {
        int result;
        if (n == 1)
            return 1;
        result = getFactorialFromIntSecond(n - 1) * n;
        return result;
    }

    //11) принимает инт год, и возвращает тру если год высокосный
    public static boolean isLeap(int year) {
        return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }

    //12) приминает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
    public static void displayMultiplesInArrayForGivenValue(int[] ints, int value) {
        for (int i : ints) {
            if (i % value == 0) {
                System.out.printf(i + " ");
            }
        }
    }

    //13.1) метод принимает массив интов сортирует его по возрастанию
    public static int[] sortArrayInIncreasingOrderFirst(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    //13.2) Sorting метод принимает массив интов сортирует его по возрастанию
    public static void sortArrayInIncreasingOrderSecond(int[] arrSorting) {
        for (int i = 0; i < arrSorting.length; i++) {
            int position = i;
            int min = arrSorting[i];
            for (int j = i + 1; j < arrSorting.length; j++) {
                if (arrSorting[j] < min) {
                    position = j;
                    min = arrSorting[j];
                }
            }
            arrSorting[position] = arrSorting[i];
            arrSorting[i] = min;
        }
    }

    //13.3) Bubble sort метод принимает массив интов сортирует его по возрастанию
    public static void sortInIncreasingOrderWithBubbleSorting(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < ints[i - 1]) {
                int temp = ints[i];
                ints[i] = ints[i - 1];
                ints[i - 1] = temp;
            }
        }
    }

    //13.4) Insertion Sort метод принимает массив интов сортирует его по возрастанию
    public static void sortArrayInIncreasingOrderWithInsertion(int[] ints) {
        int j;
        for (int i = 1; i < ints.length; i++) {
            int temp = ints[i];
            for (j = i; j > 0 && temp < ints[j - 1]; j--) {
                ints[j] = ints[j - 1];
            }
            ints[j] = temp;
        }
    }

    //14) принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
    public static boolean findDuplicateObject(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            for (int j = i + 1; j < bytes.length; j++)
                if (bytes[i] == bytes[j]) {
                    return true;
                }
        }
        return false;
    }

    //14.1) принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
    public static boolean findDuplicateObjectWithSorting(byte[] bytes) {
        Arrays.sort(bytes);
        int i = 0;
        while (i <= bytes.length) {
            if (bytes[i] == bytes[i + 1]) {
                return true;
            }
            i++;
        }
        return false;
    }

}