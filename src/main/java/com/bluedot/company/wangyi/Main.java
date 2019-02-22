package com.bluedot.company.wangyi;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/8 16:26
 * @Description:
 */
public class Main {
    static class People{
        int id;
        int count;

        public People(int id, int count) {
            this.id = id;
            this.count = count;
        }

        public Integer getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<People> peoples = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            peoples.add(new People(scanner.nextInt(),scanner.nextInt()));
            if(map.get(i)==null){
                map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }

        }

        List<People> peopleList = new ArrayList<>();
        for(Integer key : map.keySet()){
            if(key!=0) {
                peopleList.add(new People(key, map.get(key)));
            }
        }
        if(peopleList.size()!=0) {
            List<People> overPeopleList = peopleList.stream().filter(x -> x.getCount() > map.get(0)).collect(Collectors.toList());
            if (overPeopleList.size() == 0) {
                System.out.println(0);
            }else {
               Map<Integer,List<People>> mapGoupBy= peoples.stream().collect(Collectors.groupingBy(People::getId));
            }
        }else {
            System.out.println(0);
        }
    }
}
