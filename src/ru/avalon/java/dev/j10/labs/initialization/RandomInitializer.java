package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;


public class RandomInitializer implements Initializer {
    private int[] array;

    public RandomInitializer(int[] array, int min, int max){
        initialize(array, min, max);
        this.array = array;
    }


    public static void initialize(int[] array, int min, int max) {
        int[] a = array;
        for(int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * (max - min) + min);
        }
    }

    public int[] getArray() {
        return array;
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