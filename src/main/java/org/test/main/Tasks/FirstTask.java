package org.test.main.Tasks;

public class FirstTask {
    public static void taskNumberOne(int number) throws IllegalArgumentException {
        if (number > 7) {
            System.out.println("Ответ: \nПривет");
        } else {
            throw new IllegalArgumentException("\nЧисло меньше или равно 7");
        }
        System.out.println();
    }
}