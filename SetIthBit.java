import java.util.*;

public class SetIthBit {

    public static int SetIth(int n, int i){

        int bitMask = 1 << i;
        return n | bitMask;

    }
    public static void main(String[] args) {

        System.out.println(SetIth(10, 2));
        System.out.println(SetIth(10, 4));

    }
}
