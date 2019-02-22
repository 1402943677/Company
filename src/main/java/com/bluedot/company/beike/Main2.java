package com.bluedot.company.beike;

import java.util.*;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/3 20:35
 * @Description:
 */
public class Main2 {
   static class XY{
        int x;
        int y;

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int n =  scanner.nextInt();
        List<XY> xyList = new ArrayList<>();
        List<XY> xyListcopy = new ArrayList<>();

        for(int i=0;i<n;i++){
            XY xy = new XY();
            xy.x = scanner.nextInt();
            xy.y = scanner.nextInt();;
            xyList.add(xy);
            xyListcopy.add(xy);
        }

        for(int i=0;i<n;i++){
            Collections.sort(xyListcopy, new Comparator<XY>() {
                @Override
                public int compare(XY o1, XY o2) {
                    return o1.getX() - o2.getX();
                }
            });

            int count =0;
            for(int j=0;j<n;j++){
                if(xyListcopy.get(j).x>=xyList.get(i).x){
                    if(j!=xyListcopy.size()-1){
                        if (xyListcopy.get(j).x + xyListcopy.get(j).y > xyListcopy.get(j + 1).x) {
                            count++;
                        } else {
                            count++;
                            break;
                        }
                    }else {
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);

        }
    }
}
