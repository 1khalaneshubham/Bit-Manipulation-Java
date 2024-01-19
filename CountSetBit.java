import java.util.*;

public class CountSetBit {

    public static int CountSet(int n){
        
        int  Count = 0; 
        while (n > 0) {
            if((n & 1) != 0){  // check our LSB
                 Count++;
            }
            n = n>>1;
        } 
        return Count;
    }
    public static void main(String[] args) {
        
        System.out.println(CountSet(15));

    }
}
