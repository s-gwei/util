package com.sun.leetcode;

/**
 * author sungw
 *
 * @description ��̬�滮����
 * @date 2021/6/11
 *
 *
 * ������������¥�ݡ���Ҫ n ������ܵ���¥����
 *
 * ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�
 */
public class S70 {
    public static void main(String[] args) {
        climbStairs(3);
    }
    public static int climbStairs(int n) {
        //�����ֵ�����
        int[] db = new int[n+1];

        int result = dy(db,n);

        return result;
    }

    private static int dy(int[] db, int n) {
        //���n=1��n=1�����ݹ�
        if(n==0||n==1){
            return 1;
        }
        //����ֵ���������db[n],ֱ�ӷ���
        if(db[n] != 0){
            return db[n];
        }
        db[n] = dy(db,n-1)+dy(db,n-2);
        return db[n];
    }
}
