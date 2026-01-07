import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] arrayOfNumbers) {

        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (seen.contains(arrayOfNumbers[i])) {
                return true;
            } else {
                seen.add(arrayOfNumbers[i]);
            }
        }
        return false;
    }

}

