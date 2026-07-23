package AT_2026_zakharova;
import java.util.Arrays;//это класс для 10 задачи, используем чтобы в результате снова вывести строку
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача 1.
        System.out.println("Задача 1");
        System.out.println(isEven(62));
        System.out.println(isEven(811));
        System.out.println(isEven(53));
        System.out.println(isEven(2));
        //Задача 2.
        System.out.println("Задача 2");
        System.out.println(checkAccess(53));
        System.out.println(checkAccess(2));
        //Задача 3.
        System.out.println("Задача 3");
        System.out.println(isPositive(53));
        System.out.println(isPositive(-1));
        System.out.println(isPositive(0));
        //Задача 4.
        System.out.println("Задача 4");
        System.out.println(getGrade(15));
        System.out.println(getGrade(21));
        System.out.println(getGrade(45));
        System.out.println(getGrade(63));
        System.out.println(getGrade(90));
        System.out.println(getGrade(340));
        System.out.println(getGrade(-3));
        //Задача 5.
        System.out.println("Задача 5");
        System.out.println(blastOff(15));
        System.out.println(blastOff(3));
        //Задача 6.
        System.out.println("Задача 6");
        System.out.println(sumToN(2));
        System.out.println(sumToN(-9));
        System.out.println(sumToN(20));
        //Задача 7.
        System.out.println("Задача 7");
        System.out.println(hasBug(new String[]{"BUG", "ladybug", "supercat"}));
        System.out.println(hasBug(new String[]{"kek", "bug", "supercat"}));
        System.out.println(hasBug(new String[]{"ladybug", "9", ""}));
        System.out.println(hasBug(new String[]{"girl", "supercat", "buG"}));
        //Задача 8.
        System.out.println("Задача 8");
        System.out.println(getEvenInRange(2, 11));
        //Задача 9
        System.out.println("Задача 9");
        System.out.println(findMax(new int[]{4, 0, 90, 1, 67}));
        //Задача 10
        System.out.println("Задача 10");
        System.out.println(Arrays.toString(reverse(new String[]{"One", "Two", "Three", "Zero", "Cat"})));
    }

    //Задача 1. разработать метод с сигнатурой
// publiс static boolean isEven(int n).
// Метод возвращает true, если число чётное,
// и false — если нечётное.
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    //Задача 2: разработать метод с сигнатурой
// public static String checkAccess(int age).
// Метод возвращает Allowed, если число строго больше 18,
// и Denied — если меньше.
    public static String checkAccess(int age) {
        if (age > 18) {
            return "Allowed";
        } else {
            return "Denied";
        }
    }

    //Задача 3: разработать метод с сигнатурой
// public static boolean isPositive(int n).
// Метод должен возвращать true, если переданное число больше или равно нулю,
// и false, если переданное число меньше нуля.
// Проверка внутри метода должна происходить с помощью тернарного оператора.
    //тернарный оператор усл ? зн1 : зн2
    public static boolean isPositive(int n) {
        return n >= 0 ? true : false;
    }

    //Задача 4: разработать метод с сигнатурой public static String getGrade(int score).
// Метод возвращает строку, соответствующую строгому вхождению в границы:
//
//0–20: E;
//21–40: D;
//41–60: C;
//61–80: B;
//81–100: A.
//Если переданное число не входит в границы — вернуть строку Error.
    public static String getGrade(int score) {
        if (score < 0 || score > 100) return "Error"; //проверим что число в диапазоне 0-100
        if (score <= 20) return "E";
        if (score <= 40) return "D";
        if (score <= 60) return "C";
        if (score <= 80) return "B";
        return "A";
    }

    //Задача 5: разработать метод с сигнатурой public static String blastOff(int start).
// Метод принимает стартовое число (например, 5)
// и возвращает строку со всеми числами до 1
// и словом «Поехали!» в конце (например, «5 4 3 2 1 Поехали!»).
    public static String blastOff(int start) {
        if (start < 1) return "Поехали!";
        StringBuilder s = new StringBuilder(); //тут берем StringBuilder для построения-создания строки
        for (int i = start; i >= 1; i--) {
            s.append(i);
            if (i > 1) s.append(" ");
        }
        s.append(" Поехали!");
        return s.toString();
    }

    //Задача 6: разработать метод с сигнатурой publiс static int sumToN(int n).
// Метод возвращает сумму всех целых чисел от 1 до n.
    public static int sumToN(int n) {
        if (n <= 0) {
            return 0;
        }
        return n * (n + 1) / 2; //тут берем формулу арифметической прогрессии an = a₁ + (n – 1) · d
    }

    //Задача 7: разработать метод с сигнатурой publiс static boolean hasBug(String[] messages).
    // Метод принимает массив строк и возвращает true,
    // если хотя бы одна строка в массиве равна Bug.
    // Сравнение можно выполнять без учёта регистра.
    public static boolean hasBug(String[] messages) {
        if (messages == null || messages.length == 0) {
            return false;
        }
        for (String message : messages) {
            if (message.equalsIgnoreCase("Bug")) {
                return true;
            }
        }
        return false;
    }
    //Задача 8: разработать метод с сигнатурой
    // publiс static getEvenInRange(int start, int end).
    // Метод принимает границы диапазона и возвращает строку,
    // состоящую только из чётных чисел внутри этого промежутка (включая границы),
    // разделённых пробелом. Перед первым и после последнего числа пробел не ставится.
    // Например: (2, 5) -> “2 4”
    public static String getEvenInRange(int start, int end) {
        if (start > end) return "";
        StringBuilder s = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                if (s.length() > 0) s.append(" ");
                s.append(i);
            }
        }
        return s.toString();
    }
    //Задача 9: разработать метод с сигнатурой
    // publiс static public int findMax(int[] arr).
    // Метод находит и возвращает самое большое число в переданном массиве.
    public static int findMax(int[] arr) { //убрала лишний public из условия
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    //Задача 10: разработать метод с сигнатурой
    // publiс static String[] reverse(String[] arr).
    // Метод возвращает новый массив, в котором элементы исходного массива
    // расположены в обратном порядке.
    // Например, {“One”, “Two”, “Zero”} -> {“Zero”, “Two”, “One}.
    public static String[] reverse(String[] arr) {
        if (arr == null) return null;
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }
}