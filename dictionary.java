import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        String meaning, word, search;
        Scanner input = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();
        do {
            System.out.print("Enter word (or exit to quit): ");
            word = input.nextLine();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter the meaning of the word: ");
            meaning = input.nextLine();
            dictionary.put(word, meaning);
            System.out.println("============================");
            System.out.println("WORD ADDED TO DICTIONARY");
             System.out.println("============================");
        } while (!word.equalsIgnoreCase("EXIT"));
        System.out.println("Dictionary Content:");
        for (Map.Entry e : dictionary.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        while (true) {
            System.out.print("Search the word you want to find: ");
            search = input.nextLine();
            if (dictionary.containsKey(search)) {

                System.out.println("The meaning of " + search + " is " + dictionary.get(search));

            } else {
                System.out.println("Invalid Input");
                break;
            }

        }
    }
}
