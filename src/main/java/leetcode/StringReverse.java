package leetcode;

public class StringReverse {

    public static void main(String[] args) {
        printReverse("mohneesh".toCharArray());
    }

    private static void printReverse(char[] str){
        helper(0,str);
    }

    private static void helper(int index ,char[] str){
        // Breaking condition
        if(str == null || index >= str.length)
            return;

        //recursive call with decreasing input elements
        helper(index + 1, str);
        System.out.println(str[index]);
    }
}
