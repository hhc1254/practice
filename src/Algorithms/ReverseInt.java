package Algorithms;

public class ReverseInt {
    public static int reverseInt(int num){
        int reverse = 0;
        while(num != 0){
            int tail = num % 10;

            int newNum = reverse * 10 + tail;
            if((newNum - tail)/10 != reverse){
                return 0;
            }
            reverse = newNum;
            num = num/10;
        }
        return reverse;
    }

    public static void main(String[]args){
        int x = 12345;
        int y = 67890;
        int z = 11111;
        System.out.println("Reverse of " + x + " is " + reverseInt(x));
        System.out.println("Reverse of " + y + " is " + reverseInt(y));
        System.out.println("Reverse of " + z + " is " + reverseInt(z));
    }
}
