import java.util.*;

public class ClearIBith {

    public static int ClearI(int n, int i){

        int bitMask = (~0)<<i;
        return n & bitMask;

    }
    public static void main(String[] args) {
        
        System.out.println(ClearI(15, 2)); // 1
        
    }
}
