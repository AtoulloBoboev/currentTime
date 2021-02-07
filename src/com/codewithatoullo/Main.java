package com.codewithatoullo;

/**
 * Создать строку, состоящую из чисел от 0 до 20000.
 * Важно понимать, что это одна строка, полученная конкатенацией (“склеиванием”)
 * чисел из диапазона через пробел: (0 + “ “ + 1 + “ “ + 2 + … + 20000).
 * в консоль должен вывести сразу все числа из диапазона: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 ... 19995 19996 19996 19997 19998 19999 20000
 * <p>
 * Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String)
 * и использовании StringBuilder, реализуйте описанную задачу этими двумя способами,
 * замеряя время работы программы.
 */

public class Main {

    public static void main(String[] args) {
        // Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка, полученная конкатенацией (“склеиванием”)
        String numbers = "";

        // Текущее время в мил/сек до цикла
        long before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++)
            numbers += i + " ";

        // Текущее время в мил/сек после выполнения цикла
        long after = System.currentTimeMillis();

        // Время выполнения цикла
        System.out.println("Время выполнения цикла с классом String: " + (after - before));
        System.out.println(numbers);

        // касс StringBuilder
        StringBuilder sb = new StringBuilder("");

        before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++)
            sb.append(i).append(" ");

        after = System.currentTimeMillis();

        System.out.println("Время выполнения цикла с классом StringBuilder: " + (after - before));
        System.out.println(sb);
    }
}
