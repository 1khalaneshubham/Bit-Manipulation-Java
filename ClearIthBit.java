import java.util.*;

public class ClearIthBit {

    public static int ClearIth(int n , int i){
        
        int bitMask = ~( 1 << i );
        return n & bitMask;
    }
    public static void main(String[] args) {

        System.out.println(ClearIth(10, 1)); // 8
        System.out.println(ClearIth(10, 3)); // 2

    }
}
