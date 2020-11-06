package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Пузырьковая сортировка (англ. bubble sort).
 *
 * <p>Простой алгоритм сортировки. Для понимания и
 * реализации этот алгоритм — простейший, но эффективен он
 * лишь для небольших массивов. Сложность алгоритма: O(n^2).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%BF%D1%83%D0%B7%D1%8B%D1%80%D1%8C%D0%BA%D0%BE%D0%BC">Пузырьковая сортировка</a>
 */
public class BubbleSort implements Sort {
    public static void sort(int[] array) {
        int [] a = array;
        boolean sorted = false;
        int b;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]){
                    sorted = false;

                    b = a[i];
                    a[i] = a[i+1];
                    a[i+1] = b;
                }
            }
        }
    }
}
