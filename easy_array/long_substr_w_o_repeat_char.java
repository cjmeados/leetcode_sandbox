import java.util.HashSet;

public class long_substr_w_o_repeat_char {

    public static void main(String[] args) {

        System.out.println(long_substr_w_o_repeat_char.solution(""));
        System.out.println(long_substr_w_o_repeat_char.solution("aaaaaa"));
        System.out.println(long_substr_w_o_repeat_char.solution("abcdefg")); 
        System.out.println(long_substr_w_o_repeat_char.solution("abcafxxbdce"));
        System.out.println(long_substr_w_o_repeat_char.solution("pwwkew"));
        System.out.println(long_substr_w_o_repeat_char.solution("dvdf")); 

    }

    public static int solution(String s) {

        int left = 0;
        int right = 0;
        int longestLength = 0;
        HashSet<Character> seen = new HashSet<>();

        for (; right < s.length(); right++) {
            if (seen.contains(s.charAt(right)) == false) {
                seen.add(s.charAt(right));
            } else {
                if (right - left > longestLength) {
                    longestLength = right - left;
                }
                while (seen.contains(s.charAt(right))) {
                    seen.remove(s.charAt(left));
                    left += 1;
                }
                seen.add(s.charAt(right));
            }
        }
        if (right - left > longestLength) {
            longestLength = right - left;
        }
        return longestLength;
    }
}
