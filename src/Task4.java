import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть текст: ");
        String text = sc.nextLine();
        String[] words = text.split("[ ,.:;-?!]+");
        String result = "";
        for (String word : words) {
            if(checkAlp(word)) {
                result += word + " ";
            }
        }
        System.out.println(result);
    }
    public static boolean checkAlp(String word){
        for (int i = 1; i < word.length(); i++){
            if (word.charAt(i - 1) <= word.charAt(i)){
                continue;
            }
            else return false;

        }
        return true;
    }
}