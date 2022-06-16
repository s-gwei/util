package com.sun.leetcode;

/**
 * author sungw
 *
 * @description ��̬�滮����
 * @date 2021/6/11
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��̨��
 * �����������һ�� n ����̨���ܹ��ж�����������
 * <p>
 * ����Ҫȡģ 1e9+7��1000000007����
 * ������ʼ���Ϊ��1000000008���뷵�� 1��
 */
public class S10 {
    public static void main(String[] args) {
        numWays(2);

    }

    public static int numWays(int n) {
        //�����ֵ�����
        int[] db = new int[n + 1];

//        int result = Dy(db, n);

        int result = Dy1(db, n);

        return result;
    }

    private static int Dy1(int[] db, int n) {
        //������ֹ�ݹ�����
        db[0]=1;

        db[1]=1;

        //״̬ת��
        for(int i=2;i<=n;i++){
            db[n] = (db[n-1]+db[n-2])%1000000007;
        }
//        db[n] = (Dy(db,n-1)+Dy(db,n-2))/1000000007;
        return db[n];
    }
    private static int Dy(int[] db, int n) {
        //������ֹ�ݹ�����
        if (n == 0 || n == 1 ) {
            return 1;
        }
        //����ֵ����������У����ڵݹ�
        if (db[n] != 0) {
            return db[n];
        }
        //״̬ת��
        for(int i=2;i<=n;i++){
            db[n] = (db[n-1]+db[n-2])/1000000007;
        }
//        db[n] = (Dy(db,n-1)+Dy(db,n-2))/1000000007;
        return db[n];
    }
}
