package org.test.main.Tasks;

import java.util.Scanner;

import static org.test.main.Tasks.SecondTask.taskNumberTwo;

public class Errors {

    public static void firstTaskError(Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void secondTaskError(Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int[] getInputArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }
}