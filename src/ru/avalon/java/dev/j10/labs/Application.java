package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        int[] array = new int[20];

		FibonacciInitializer.initialize(array);
		String s = Arrays.toString(array);
		System.out.println("-----------------" + "\n" + "Последовательность Фибоначчи:" + "\n" + s + "\n" + "-----------------");
		System.out.println("Последовательность Фибоначчи, сумма чисел:" + "\n" + sum(array) + "\n" + "-----------------");

		RandomInitializer.initialize(array);
		String s1 = Arrays.toString(array);
		System.out.println("Случайная последовательность" + "\n" + s1 + "\n" + "-----------------");

		BubbleSort.sort(array);
		String s2 = Arrays.toString(array);
		System.out.println("Сортировка пузырьком:" + "\n" + s2 + "\n" + "-----------------");

		RandomInitializer.initialize(array);
		String s3 = Arrays.toString(array);
		System.out.println("Случайная последовательность" + "\n" + s3 + "\n" + "-----------------");

		SelectionSort.sort(array);
		String s4 = Arrays.toString(array);
		System.out.println("Сортировка выбором:" + "\n" + s4 + "\n" + "-----------------");

		RandomInitializer.initialize(array);
		String s5 = Arrays.toString(array);
		System.out.println("Случайная последовательность" + "\n" + s5 + "\n" + "-----------------");

		ShellSort.sort(array);
		String s6 = Arrays.toString(array);
		System.out.println("Сортировка Шелла:" + "\n" + s6 + "\n" + "-----------------");

		RandomInitializer r = new RandomInitializer(new int[20]);
		String s7 = Arrays.toString(r.getArray());
		System.out.println("Инициализация через экземпляр:" + "\n" + s7 + "\n" + "-----------------");

		FibonacciInitializer f = new FibonacciInitializer (new int[20]);
		String s8 = Arrays.toString(f.getArray());
		System.out.println("Инициализация через экземпляр:" + "\n" + s8 + "\n" + "-----------------");

	}

	public static int sum (int[] array){
		int sum = 0;
    	for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
}

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.+
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.+
	     *
	     * 2. Найти сумму элементов массива.+
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.+
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.+
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.+
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.+
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.+
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */

