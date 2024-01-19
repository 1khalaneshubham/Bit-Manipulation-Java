import java.util.*;

public class TwoPower {

    public static boolean isPowerOfTwo(int n){

        return (n&(n-1)) == 0;

    }
    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(12));
        
    }
}
