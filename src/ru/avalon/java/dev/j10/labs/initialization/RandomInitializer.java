package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;


public class RandomInitializer implements Initializer {
    public static void initialize(int[] array) {
        int[] a = array;
        for(int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * 100 - 50);
        }
    }
}

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */