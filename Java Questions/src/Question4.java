/*Q4:Write a Java Program to find the duplicate characters in a string.*/
import java.util.HashMap;
import java.util.Map;

public class Question4 {
    public static void main(String[] args) {
        String str = "programming";
        
        // Create a HashMap to store characters and their frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the string to character array
        char[] charArray = str.toCharArray();
        
        // Iterate through each character in the array
        for (char ch : charArray) {
            // If character is present in the map, increment its count
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // Otherwise, add the character to the map with count as 1
                charCountMap.put(ch, 1);
            }
        }
        
        // Print duplicate characters
        System.out.println("Duplicate characters in the string \"" + str + "\":");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
