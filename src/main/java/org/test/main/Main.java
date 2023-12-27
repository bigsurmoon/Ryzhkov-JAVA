package org.test.main;

import java.util.Scanner;

import static org.test.main.Tasks.Errors.*;
import static org.test.main.Tasks.FirstTask.taskNumberOne;
import static org.test.main.Tasks.FourthTask.taskNumberFour;

import static org.test.main.Tasks.SecondTask.taskNumberTwo;
import static org.test.main.Tasks.ThirdTask.taskNumberThree;

class Main {

    public static void main(String[] args) throws IllegalStateException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание №1: \nВведите число: ");
        int number = scanner.nextInt();
        firstTaskError(() -> taskNumberOne(number));
        scanner.nextLine();
        System.out.println("Задание №2: \nВведите имя: ");
        String name = scanner.nextLine();
        secondTaskError(() -> taskNumberTwo(name));
        System.out.println("Задание №3: \nВведите размер массива: ");
        int size = scanner.nextInt();
        int[] array = getInputArray(size);
        taskNumberThree(array);
        taskNumberFour();
    }
}