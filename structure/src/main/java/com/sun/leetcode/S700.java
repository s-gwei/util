package com.sun.leetcode;

/**
 * author sungw
 *
 * @description .�����������е�����
 * @date 2021/6/10
 *
 * ����������������BST���ĸ��ڵ��һ��ֵ��
 * ����Ҫ��BST���ҵ��ڵ�ֵ���ڸ���ֵ�Ľڵ㡣
 * �����Ըýڵ�Ϊ���������� ����ڵ㲻���ڣ��򷵻� NULL��
 */
public class S700 {
    public TreeNode searchBST(TreeNode root, int val) {

        if( root==null|| root.val == val  ){
            return root;
        }
        return root.val>val?searchBST(root.left,val):searchBST(root.right,val);
    }
}
