public class RemoveElement {
    public static int removeElement(int[]nums, int value){
        int i = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != value){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[]args){
        int [] nums = {
                1,2,3,1,2,3,4
        };

        System.out.println("New length: " + removeElement(nums, 2));
    }
}
