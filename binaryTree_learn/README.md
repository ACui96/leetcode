# [Binary Tree](https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/)
## 概述
树 是一种经常用到的数据结构，用来模拟具有树状结构性质的数据集合。

树里的每一个节点有一个值和一个包含所有子节点的列表。从图的观点来看，树也可视为一个拥有N 个节点和N-1 条边的一个有向无环图。

二叉树是一种更为典型的树状结构。如它名字所描述的那样，二叉树是每个节点最多有两个子树的树结构，通常子树被称作“左子树”和“右子树”。

完成后，你将：

掌握树和二叉树的概念
熟悉不同的遍历方法
运用递归解决二叉树相关题目

## 树的遍历
- 树的遍历-介绍
- 前序遍历
- 中序遍历
- 后续遍历
- 层序遍历
- 二叉树的层序遍历

## 运用递归解决树的问题
- 二叉树的最大深度
- 对称二叉树
- 路径总和

## 1 Traverse a tree
Goal:
- Understand the difference between different tree traversal methods;
- Be able to solve preorder, inorder and postorder traversal recursively;
- Be able to solve preorder, inorder and postorder traversal iteratively;
- Be able to do level traversal using BFS.
### 1.1 Introduction
- Pre-order traversal
ROOT-L-R
- In-order traversal
L-ROOT-R Binary search tree
- Post-order traversal
L-R-ROOT 
Note that deletion is Post-order,also it is widely used in mathmaticalexpression.
- Recursive or Iterative 递归或者迭代
### 1.2 Pre-order Traversal
