package com.caffeaulait;

public class nowcoder_09 {
    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * f(n) = f(n-1) + f(n-2) + f(n-3) + ... + f(n-(n-1)) + f(n-n)
     */
    public int JumpFloorII(int target){
        return (int)Math.pow(2,target-1);
    }
}
