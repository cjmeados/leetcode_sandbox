import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

    }

    public boolean validAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) -1);
        }

        for (Integer count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;

    }

}
