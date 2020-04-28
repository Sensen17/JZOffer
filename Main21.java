package JZoffer;

import java.util.Stack;

/**
给出栈元素的压入序列，判断某一个弹出序列是否可能
 */

public class Main21 {
    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,3,5,1,2};
        System.out.println(IsPopOrder(pushA,popA));
    }

    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int pushIndex = 0;
        int popIndex = 0;
        while (pushIndex < pushA.length){
            if (!stack.isEmpty() && stack.peek()==popA[popIndex]){
                System.out.println(stack.pop());
                popIndex++;
            }else {
                stack.push(pushA[pushIndex]);
                pushIndex++;
            }
        }
        while (!stack.isEmpty()){
            if (stack.peek()==popA[popIndex]){
                System.out.println(stack.pop());
                popIndex++;
            }else {
                return false;
            }
        }
        return true;
    }
}
