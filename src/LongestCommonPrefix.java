public class LongestCommonPrefix {
    public static String longestCommonPrefix(String [] strs){
        String prefix = strs[0];
        if(strs.length == 0){
            return "";
        }
        for(int i = 1; i<strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String [] args){

        String [] strs = {
                "test", "testing", "tester", "tests"
        };

        System.out.println("Longest common prefix: " + longestCommonPrefix(strs));
    }
}
