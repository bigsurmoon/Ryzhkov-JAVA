package org.test.main.Tasks;

public class SecondTask {

    public static void taskNumberTwo(String name) {
        String authName = "Вячеслав";
        if (name.equals(authName)) {
            System.out.println("Ответ: \nПривет, Вячеслав");
        } else {
            throw new IllegalArgumentException("\nНет такого имени");
        }
        System.out.println();
    }
}