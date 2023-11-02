public class findtheithbit {
    public static void main(String[] args) {
        int n = 67;  // The decimal value
        int i = 3;   // The bit position

        // Call the ithbit function and print the result
        System.out.println(getBit(n, i));
    }

    private static int getBit(int n, int i) {
        // Shifting 1 to the left by i positions and checking if the bit is set
        return (n & (1 << i-1)) != 0 ? 1 : 0;//(1 << i-1)this is the masking of the
    }
}
