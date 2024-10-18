package Methods;

@SuppressWarnings("ALL")
public class Methods {
    /**
     * Этот метод принимает одно целое число и возвращает его квадрат.
     *
     * @param squareNubmer целое число.
     * @return Квадрат числа.
     */
    public static int square(int squareNubmer) {
        return squareNubmer * squareNubmer;
    }

    /**
     * Этот метод принимает два параметра и выводит полное имя в формате: "Full name: Имя Фамилия".
     *
     * @param name     строка с именем.
     * @param lastName строка с фамилией.
     * @return Конкатенация двух строк строк.
     */
    public static String printFullName(String name, String lastName) {
        return name + " " + lastName;

    }

    /**
     * Этот метод находит минимальное и максимальное целочисленные значения в массиве целых чисел.
     *
     * @param numbers массив целых чисел.
     * @return Возвращает массив, содержащий минимальное и максимальное целочисленные значения.
     */


    public static Integer[] cornerValuesArray(Integer[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new Integer[]{null, null};
        }
        Integer[] cornerValues = new Integer[2];
        cornerValues[0] = cornerValues[1] = numbers[0];
        for (Integer num : numbers) {
            if (num < numbers[0]) {
                cornerValues[0] = num;
            } else if (num > cornerValues[0]) {
                cornerValues[1] = num;
            }
        }
        return cornerValues;
    }

    /**
     * Этот метод находит наименьшее и наибольшее символьные значения в массиве символов.
     *
     * @param characters массив символов.
     * @return Массив, содержащий наименьшее и наибольшее символьные значения.
     */

    public static Character[] cornerValuesArray(Character[] characters) {
        if (characters == null || characters.length == 0) {
            return new Character[]{null, null};
        }
        Character[] cornerValues = new Character[]{characters[0], characters[0]};

        for (Character ch : characters) {
            if (ch < characters[0]) {
                cornerValues[0] = ch;
            } else if (ch > cornerValues[1]) {
                cornerValues[1] = ch;
            }
        }
        return cornerValues;


    }

    /**
     * Этот метод находит самые короткие и самые длинные строковые значения в массиве строк.
     *
     * @param strings массив строк.
     * @return Массив, содержащий самые короткие и самые длинные строковые значения.
     */


    public static String[] cornerValuesArray(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[]{null, null};
        }
        String[] cornerValues = new String[]{strings[0], strings[0]};

        {
            for (String str : strings) {
                if (str.length() < strings[0].length()) {
                    cornerValues[0] = str;
                } else if (str.length() > cornerValues[1].length()) {
                    cornerValues[1] = str;
                }
            }
            return cornerValues;
        }
    }

    /**
     * Этот метод находит факториал числа.
     *
     * @param number Число, факториал которого нужно найти.
     * @return Факториал введённый числа.
     */

    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}



