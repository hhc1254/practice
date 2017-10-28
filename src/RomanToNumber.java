public class RomanToNumber {
    public static int romanToNumber(String roman){
        int nums [] = new int[roman.length()];
        for(int i=0; i< roman.length(); i++){
            switch(roman.charAt(i)){
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        int sum = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                sum -= nums[i];
            }
            else{
                sum += nums[i];
            }
        }
        return sum + nums[nums.length-1];
    }

    public static void main(String[]args){
        String roman = "MDCLDXVI";

        System.out.println(roman + " = " + romanToNumber(roman));
    }
}
