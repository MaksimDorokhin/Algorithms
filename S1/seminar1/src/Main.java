import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Создать алгоритм по простым числам

//        int number = 30, cnt = 0;
//        ArrayList<Integer> simpleList = new ArrayList<>();
//        for (int i = 1; i <= number; i++) {
//            boolean simple = true;
//            for (int j = 2; j < i; j++) {
//                cnt++;
//                if (i % j == 0) {
//                    simple = false;
//                    //break;
//                }
//            }
//            if (simple) simpleList.add(i);
//        }
//        System.out.println(simpleList);
//        System.out.println(cnt);


/*
1. Необходимо написать алгоритм поиска всех доступных комбинаций
(посчитать количество) для количества кубиков K с количеством граней N.
2. У вас есть 2 варианта на выбор – количество кубиков может быть строго
ограничено (4 кубика, например), либо их количество будет
динамическим. Выбор за вами.
3. Если вы реализуете простой вариант, обращает внимание, что данное
решение имеет сложность O(n4
), но если количество кубиков сделать
переменной, то она трансформируется в O(nk
), что будет представлять
собой экспоненциальную сложность. Для второго решения очевидно, что
его сложность O(nk
) с самого начала.
 */

//        int numberCube = 4, numberSides = 6, cnt = 0;
//        ArrayList<String> simpleList = new ArrayList<>();
//        for (int i1 = 1; i1 <= numberSides; i1++) {
//            for (int i2 = 1; i2 <= numberSides; i2++) {
//                for (int i3 = 1; i3 <= numberSides; i3++) {
//                    for (int i4 = 1; i4 <= numberSides; i4++) {
//                        simpleList.add(" " + i1 + i2 + i3 +i4);
//                        cnt++;
//                    }
//                }
//            }
//
//        }
//        System.out.println(simpleList);
//        System.out.println(cnt);
        AtomicLong cnt = new AtomicLong(0);
        long start = System.currentTimeMillis();
        System.out.println(fib(43, cnt));
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(cnt);
        cnt = new AtomicLong(0);
        start = System.currentTimeMillis();
        System.out.println(fibFor(43, cnt));
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(cnt);
    }

/*
1.Пишем алгоритм поиска нужного числа последовательности Фибоначчи, но в этот
раз откажемся от рекурсии и воспользуемся обычным алгоритмом, что даст нам
линейную сложность, т.к. вычисление каждого из чисел последовательности будет
происходить ровно 1 раз.
 */

    public static int fib(int number, AtomicLong cnt) {
        cnt.incrementAndGet();
        if (number <= 2)
            return 1;
        else
            return fib(number - 1, cnt) + fib(number - 2, cnt);
    }

    /*
    1.Вариантов решения может быть несколько, но нужно предложить студентам
считать последовательность с первого числа и далее до тех пор, пока не доберемся
до нужного номера. При этом значение предыдущих элементов нужно сохранять,
чтобы не приходилось вычислять заново, как это происходило при рекурсивном
методе.
Необходимо сравнить скорость работы 2 алгоритмов вычисления чисел
Фибоначчи и определить, какой из них работает быстрее. Так различия
начнутся уже с 40 члена последовательности.
     */

    public static int fibFor(int number, AtomicLong cnt) {
        if (number <= 2) return 1;
        int i = 2;
        int f1 = 1, f2 = 1;
        int f3 = f1 + f2;
        while (number-- > 3) {
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
            cnt.incrementAndGet();
        }
        return f3;
    }
}