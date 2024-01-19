import java.util.*;

public class UpdateIthBit {

    public static int ClearIth(int n , int i){
        
        int bitMask = ~( 1 << i );
        return n & bitMask;
    }

    public static int SetIth(int n, int i){

        int bitMask = 1 << i;
        return n | bitMask;

    }

    public static int UpdateIth(int n, int i, int newBit){
        
        // if(newBit == 0){
        //     return ClearIth(n,i);
        // }else{
        //     return SetIth(n,i);
        // }

        n = ClearIth(n,i);
        int BitMask = newBit<<1;
        return n | BitMask;  // 10

    }
    public static void main(String[] args) {
        
        System.out.println(UpdateIth(10, 2, 1));

    }
}
