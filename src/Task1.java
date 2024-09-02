import java.util.Scanner;

//Варіант 5
public class Task1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Дійсні числа , дійсний результат
        System.out.print("Введіть X (Дійсне число):");
        float x = sc.nextFloat();
        System.out.print("Введіть Y (Дійсне число):");
        float y = sc.nextFloat();
        float res = x * y + ((x + y) * (x + y) * (x + y) / (x * x + y * y) * (x - y));
        System.out.printf("Результат виразу (дійсний): %f\n", res);
        //Цілі числа , дійсний результат
        System.out.print("Введіть X (Ціле число):");
        int xInt = sc.nextInt();
        System.out.print("Введіть Y (Ціле число):");
        int yInt = sc.nextInt();
        res = xInt * yInt + ((float) ((xInt + yInt) * (xInt + yInt) * (xInt + yInt)) / (xInt * xInt + yInt * yInt) * (xInt - yInt));
        System.out.printf("Результат виразу (реальний з цілих): %f\n", res);
        //Дійсні числа , цілий результат
        System.out.print("Введіть X (Дійсне число):");
        x = sc.nextFloat();
        System.out.print("Введіть Y (Дійсне число):");
        y = sc.nextFloat();
        res = x * y + ((x + y) * (x + y) * (x + y) / (x * x + y * y) * (x - y));
        System.out.printf("Результат виразу (цілий з дійсного): %d\n", (int) res);
    }
}