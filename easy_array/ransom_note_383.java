import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


    }

    public boolean ransomNote(String ransomNote, String magazine) {
        
        // ransom note to be made from magazine
        HashMap<Character, Integer> letterCountNote = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            letterCountNote.put(ransomNote.charAt(i), letterCountNote.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }

        int amountOfLettersToBuild = ransomNote.length();

        for (int i = 0; i < magazine.length(); i++) {
            char letter = magazine.charAt(i);
            if (letterCountNote.getOrDefault(letter, 0) > 0) {
                letterCountNote.put(letter, letterCountNote.get(letter) - 1);
                amountOfLettersToBuild -= 1;
            }
            if (amountOfLettersToBuild == 0) {
                return true;
            }
        }

        return false;

    }

}