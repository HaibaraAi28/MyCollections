package com.fcd.collections;

import com.fcd.collections.tree.BinarySearchTree;

/**
 * @author fcd
 * @date 2020/8/27 11:20
 * @version 1.0
 */
public class TreeTest {
    public static void main(String[] args) {
        BinarySearchTree root = new BinarySearchTree(56);
        root.insert(1);
        root.insert(75);
        root.insert(6);
        root.insert(67);
        root.insert(109);
        root.insert(35);
        root.insert(77);
        root.insert(12);
        root.insert(43);
        root.insert(99);
        root.insert(101);
        root.insert(4);
        root.show();
    }
}
