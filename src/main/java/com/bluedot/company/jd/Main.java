package com.bluedot.company.jd;

import java.util.*;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/9 19:50
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<ArrayList<Relation>> relationList = new ArrayList<>();
        for(int i=0;i<T;i++){
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            ArrayList<Relation> arrayList = new ArrayList<>();
            for(int j=0; j<M; j++){
                arrayList.add(new Relation(scanner.nextInt(),scanner.nextInt()));
            }
            relationList.add(arrayList);
        }
        Map<Integer,Set<Integer>> integerSetMap = new HashMap<>();
        HashMap<Integer,Object> hashMap1 = new HashMap<>();
        HashMap<Integer,Object> hashMap2 = new HashMap<>();
        for(int i=0;i<relationList.size();i++){
           for(int j=0;j< relationList.get(i).size();j++){
               if(hashMap1.get(relationList.get(i).get(j).getX())==null&&hashMap1.get(relationList.get(i).get(j).getY())==null){
                   hashMap1.put(relationList.get(i).get(j).getX(),new Object());
                   hashMap2.put(relationList.get(i).get(j).getY(),new Object());
               }
           }
        }

    }
    static class Relation{
        int x;
        int y;

        public Relation(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

}
