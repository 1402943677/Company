package com.bluedot.util.DFS_BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: wufaping
 * @Date: 2019/2/22 17:46
 * @Description:
 */
public class GraphTraversalBinaryTree {
    static class BinaryTree {
        Integer value;
        BinaryTree leftTree;
        BinaryTree rightTree;
    }

    public static BinaryTree makeTree(List<Integer> arrayList,Integer i) {
        if (i.equals((arrayList.size()))){
            return null;
        }
        BinaryTree binaryTree = null;
        if (!arrayList.get(i-1).equals(0)){
            binaryTree = new BinaryTree();
            binaryTree.value = arrayList.get(i-1);
            binaryTree.leftTree=makeTree(arrayList,2*i-1);
            binaryTree.rightTree=makeTree(arrayList,2*i);
        }
        return binaryTree;
    }

    public static void main(String[] args) {
        int[] arr={13,65,5,97,25,0,37,22,0,4,28,0,0,32,0};
        List<Integer> arrayList = new ArrayList<>();

        for (int number : arr){
            arrayList.add(number);
        }

        BinaryTree binaryTree = makeTree(arrayList,1);
        System.out.println();

    }
}
