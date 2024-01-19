import java.util.*;

public class BitQuestion {

    public static void OddorEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            // Even
            System.out.println("Even Numbers ");
        }else{
            System.err.println("Odd Number ");
        }
    }
    public static void main(String[] args) {
        
        OddorEven(3);
        OddorEven(11);
        OddorEven(14);
        
    }
}
