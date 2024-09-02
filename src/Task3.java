import java.util.Scanner;

//Варіант 2
public class Task3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введіть розмір:");
        int size = sc.nextInt();

        int[][]X = new int[size][size];
        boolean[]L = new boolean[size];
        int pos = 0;
        int neg = 0;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++) {
                System.out.printf("Введіть [%d][%d] елемент:", i, j);
                X[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++) {
                if(X[i][j] > 0) pos++;
                else neg++;
            }
            if(neg > pos) L[i]=true;
            else L[i]=false;
            pos =0;
            neg = 0;
        }
        for(int i = 0; i < size; i++){
            System.out.printf("L[%d] = %b \n", i, L[i]);
        }
    }
}