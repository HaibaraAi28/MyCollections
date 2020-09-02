package com.fcd.collections.tree;

/**
 * @author fcd
 * @date 2020/8/26 17:37
 * @version 1.0
 */
public class BinarySearchTree extends AbstractBinaryTree {

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(int a) {
        Node node = new Node(a);
        root = node;
    }

    /**
     * 插入一个新节点，保持为搜索二叉树
     * @param a
     */
    @Override public void insert(int a) {
        if (null == root) {
            Node node = new Node(a);
            root = node;
        } else {
            insert(a, root);
        }
    }

    /**
     * 递归插入一个新值，保持为搜索二叉树
     * @param a
     * @param root
     */
    private void insert(int a, Node root)
    {
        if (root == null) {
            root.val = a;
            return;
        }

        if (a == root.val) {
            return;
        }

        if (a < root.val) {
            if (null == root.left) {
                root.left = new Node(a);
            } else {
                insert(a, root.left);
            }
        } else {
            if (null == root.right) {
                root.right = new Node(a);
            } else {
                insert(a, root.right);
            }
        }
    }
}
