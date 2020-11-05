package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

public class SelectionSort implements Sort {
    public static void sort(int[] array) {
        int[] a = array;
        for (int i = 0; i < a.length-1; i++) {
            int b = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[b]) {
                    b = j;
                }
            }
            int c = a[i];
            a[i] = a[b];
            a[b] = c;
        }
    }
}
/**
 * Сортировка выбором (англ. selection sort).
 *
 * <p>Алгоритм сортировки. Может быть как устойчивый, так и
 * неустойчивый. На массиве из n элементов имеет время
 * выполнения в худшем, среднем и лучшем случае Θ(n2),
 * предполагая что сравнения делаются за постоянное время.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%BE%D0%BC">Сортировка выбором</a>
 */