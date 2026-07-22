package AT_2026_zakharova;
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
public static String getGrade(int score){
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
}