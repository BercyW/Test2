package security.bercy.com.week6fridaytest;

import java.util.Stack;

/**
 * Created by Bercy on 1/12/18.
 */

public class Test {

    public static boolean isValid(String s){

        if(s==null || s.length() ==0) return false;
        if(s.length()%2!=0) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)=='(' || s.charAt(i)=='[' ||s.charAt(i)=='{') {
                stack.push(s.charAt(i));

            }else {

                if(stack.size()==0) return false;
                char top = stack.pop();

                if(s.charAt(i)==')' && top !='(') {
                    return false;
                }else if(s.charAt(i)==']' && top !='['){
                    return false;
                }else if(s.charAt(i)=='}' && top!='{') {
                    return false;
                }



            }
        }





        return  true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("[{}]"));
    }
}
