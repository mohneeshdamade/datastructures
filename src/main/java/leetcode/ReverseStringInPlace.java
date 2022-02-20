package leetcode;

public class ReverseStringInPlace {

    public static void main(String[] args) {
        revereString("AABHA".toCharArray());
    }
    private static void revereString(char[] str){
        helper(0, str.length -1, str);
        System.out.println(str);
    }

    private static void helper(int start, int end, char[] str){
        if(str == null || start >= end)
            return;
        swap(str, start, end);

        helper(start+1, end-1, str);
    }

    private static void swap(char[] str, int start, int end){
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;

    }
}

