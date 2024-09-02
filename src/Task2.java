import java.util.Scanner;

public class Task2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введіть розмір:");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Введіть %d елемент:", i + 1);
            array[i] = sc.nextInt();
        }

        int temp = 1;
        int result = 1;
        int num = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] == array[i - 1]) {
                temp++;
            } else {
                if (temp >= result) {
                    result = temp;
                    num = array[i - 1];
                }
                temp = 1;
            }
        }

        if (temp >= result) {
            result = temp;
            num = array[size - 1];
        }

        System.out.printf("Число %d повторюється %d разів.\n", num, result);
    }
}