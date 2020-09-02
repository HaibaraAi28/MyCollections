package com.fcd.collections.tree;

/**
 * @author fcd
 * @date 2020/8/26 19:30
 * @version 1.0
 */

public interface BinaryTree<E> {

    /**
     * 获取树的层数
     * @return
     */
    int depth();

    /**
     * 打印树的结构
     */
    void show();

    /**
     * 插入一个节点
     * @param e
     */
    void insert(E e);

    /**
     * 删除一个指定值的节点
     * @param e
     */
    void delete(E e);
}
