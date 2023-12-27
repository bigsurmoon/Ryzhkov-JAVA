package org.test.main.Tasks;

public class ThirdTask {

    public static void taskNumberThree(int[] arr) {
        System.out.print("\nЗадание №3: \nЭлементы массива кратные трём: ");

        boolean isFirst = true;

        for (int num : arr) {
            if (num % 3 == 0) {
                if (!isFirst) {
                    System.out.print(", ");
                }
                System.out.print(num);
                isFirst = false;
            }
        }
        System.out.println();
    }
}