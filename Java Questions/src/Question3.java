/*Q3:Write a Java Program to count the number of words in a string using HashMap*/
import java.util.HashMap;

public class Question3 {
    public static void main(String[] args) {
        String str = "This is a sample string to count the number of words in a string using HashMap";
        
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        String[] words = str.split(" ");
        
        for (String word : words) {
            
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            
            
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        
        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
