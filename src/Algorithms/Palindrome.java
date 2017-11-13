package Algorithms;

public class Palindrome {
    public static boolean isPalindrome(int num){
        if(num < 0 || (num != 0 && num % 10 == 0)){
            return false;
        }
        int reverse = 0;
        while(num > reverse){
            reverse = reverse * 10 + num % 10;
            num = num/10;
        }

        //account for reverse and digit ending in 0 reversed
        if(num == reverse || num == reverse/10){
            return true;
        }
        return false;
    }

    public static void main(String[]args){
        int x = 123321;
        //int y = 010 //leading 0 denotes a octal value 1*8^1 + 0*8^0
        int y = 10;
        int z = 0;

        System.out.println(x + " is a Algorithms.Palindrome: " + isPalindrome(x));
        System.out.println(y + " is a Algorithms.Palindrome: " + isPalindrome(y));
        System.out.println(z + " is a Algorithms.Palindrome: " + isPalindrome(z));
    }
}
