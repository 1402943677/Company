package com.bluedot.util.DFS_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/3 16:16
 * @Description:
 */
public class GraphTraversal {

    /**
     * 深度优先遍历DFS
     * @param arr 图结构信息矩阵
     * @param visited 对应节点是否访问
     * @param list 存储结果
     * @param n 访问n节点，的子节点
     */
    public static void DFSTraversal(int[][] arr, boolean[] visited, List<Integer> list,int n){
        if(n==arr.length){
            return;
        }
        /**
         * 判断该节点是否已经被访问过
         */
        if (visited[n] == false) {
            visited[n] = true;
            list.add(n);
        }
        /**
         * 只访问矩阵的上三角
         */
        for (int i=n;i<arr.length;i++){
            /**
             * 判断该子节点是否被访问过，如果没有这访问
             */
            if(arr[n][i]==1) {
                if (visited[n] == false) {
                    visited[n] = true;
                    list.add(n);
                }
                //访问该子节点的子节点，相当于深度遍历
                DFSTraversal(arr,visited,list,i);
            }
        }
    }

    /**
     * 广度优先遍历BFS
     * @param arr 图结构信息矩阵
     * @param visited 对应节点是否访问
     * @param list 存储结果
     */
   public static void BFSTraversal(int[][] arr, boolean[] visited, List<Integer> list){
       /**
        * 构建队列
        */
       Queue<Integer> integerQueue = new LinkedList<>();
       integerQueue.add(0);
       list.add(0);
       visited[0]=true;

        while (true){
            //当队列为空时退出循环
            if(integerQueue.size()!=0) {
                //将当前父节点出栈
                int nowNode = integerQueue.poll();
                //遍历该节点的儿子节点
                for (int i = nowNode; i <arr.length;i++){
                    if(arr[nowNode][i]==1){
                        integerQueue.add(i);
                        list.add(i);
                        visited[i]=true;
                    }
                }
            }else {
                break;
            }
        }
   }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {0,1,1,0,0,0,0,0},
                {1,0,0,1,1,0,0,0},
                {1,0,0,0,0,1,1,0},
                {0,1,0,0,0,0,0,1},
                {0,1,0,0,0,0,0,1},
                {0,0,1,0,0,0,1,0},
                {0,0,1,0,0,1,0,0},
                {0,0,0,1,1,0,0,0},
        };
        /*int[][] arr = new int[][]{
                {0,1,1,0,0,0,0,0},
                {0,0,0,1,1,0,0,0},
                {0,0,0,0,0,1,1,0},
                {0,0,0,0,0,0,0,1},
                {0,0,0,0,0,0,0,1},
                {0,0,0,0,0,0,1,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
        };*/
        boolean[] visited = new boolean[]{false,false,false,false,false,false,false,false};
        List<Integer> list = new ArrayList<>();

        DFSTraversal(arr,visited,list,0);
        list.stream().forEach(System.out::println);

        boolean[] visited1 = new boolean[]{false,false,false,false,false,false,false,false};
        List<Integer> list1 = new ArrayList<>();
        BFSTraversal(arr,visited1,list1);
        list1.stream().forEach(System.out::println);
    }

}
