package com.fcd.collections.tree;

/**
 * @author fcd
 * @date 2020/8/26 19:36
 * @version 1.0
 */
public class Node<E> {
    E    val;
    Node<E> left;
    Node<E> right;
    Node(E x) {
        val = x;
    }
}
