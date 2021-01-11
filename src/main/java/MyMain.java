public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 

        int len1 = arr.length / 2;
        int len2 = arr.length - len1;

        int[] shuffled = new int[arr.length];

        for (int i = 0; i < len1; i++){
            shuffled[2 * i] = arr[i];
        }
        for (int i = 0; i < len2; i++){
            shuffled[(2 * i) + 1] = arr[len1 + i];
        }

        return shuffled;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 

        int len = arr.length;
        int[] shuffled = arr;
        for (int i = 0; i < len; i++){
            int ran = (int) (Math.random() * len);
            int temp = shuffled[i];
            shuffled[i] = shuffled[ran];
            shuffled[ran] = temp;
        }
        
        return shuffled;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
