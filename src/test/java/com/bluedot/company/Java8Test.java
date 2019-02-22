package com.bluedot.company;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/20 23:23
 * @Description:
 */
public class Java8Test {
    @Test
    public void testJava8() {
        List<student> studentList = new ArrayList<>();
        studentList.add(new student("xiaoming",5));
        studentList.add(new student("xiaoming",7));
        studentList.add(new student("liming",18));
        studentList.add(new student("xiaoming",5));
        studentList.add(new student("xiaoming",9));
        studentList.add(new student("zhangshan",12));
        studentList.add(new student("liming",7));
        //过滤
        List<student> filterList = studentList.stream().filter(student -> student.getAge()>10).filter(student -> student.getAge()>11).collect(Collectors.toList());
        System.out.println(filterList);

        //排序1---利用外排序---Comparator接口
        List<student> sortList = studentList.stream().sorted(Comparator.comparing(x->x.getAge())).collect(Collectors.toList());
        System.out.println(sortList);

        //排序2---利用外排序,通过匿名内部类实现了Comparator接口的compare方法
        List<student> sortList2 = studentList.stream().sorted((x,y)->x.getAge()-y.getAge()).collect(Collectors.toList());
        System.out.println(sortList2);

        List<student> sortList4 = studentList.stream().sorted((x,y)->x.compareTo(y)).collect(Collectors.toList());
        System.out.println(sortList4);

        /**
         * 通过内排序---Comparable接口
         */
        List<student> sortList3 = new ArrayList<>(studentList);
        Collections.sort(sortList3);
        System.out.println(sortList3);

    }

    /**
     * 定义实现Comparable接口的student方法
     * 注意：声明泛型为student
     */
    private class student implements Comparable<student>{
        String name;
        int age;

        public student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }


        @Override
        public int compareTo(student o) {
            return this.getAge()-o.getAge();
        }
    }
}
