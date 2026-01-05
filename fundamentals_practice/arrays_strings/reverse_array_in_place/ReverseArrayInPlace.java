public class ReverseArrayInPlace {
    
    public static void main(String[] args) {

    }

    public void reverse(int[] origArray) {

        if (origArray.length == 0) {
            return;
        }
        for (int i = 0; i < origArray.length / 2; i++) {
            int temp = origArray[i];
            origArray[i] = origArray[origArray.length - 1 - i];
            origArray[origArray.length - 1 - i] = temp;
        }
    }

}
