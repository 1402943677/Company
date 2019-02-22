package com.bluedot.company.gonshang;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/16 19:38
 * @Description:
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        int index = 0;
        for (int i=1;i<=N;i++){

            int sum = 0;
            int sum1 =0;
            boolean flag = true;
            int k =i;
            int index1 =index;
            for (int j = index;j>=0;j--){

                int kk = (int)(k/(Math.pow(10,index1)));
                sum1 =  kk*(int)(Math.pow(10,index1));
                if(kk==0||kk==1||kk==2||kk==5||kk==6||kk==8||kk==9){
                    if(kk==0){
                        kk=0;
                    }else if(kk==1){
                        kk=1;
                    }else if(kk==2){
                        kk = 5;
                    }else if(kk == 5){
                        kk =2;
                    }else if(kk==6){
                        kk = 9;
                    }else if(kk ==8){
                        kk=8;
                    }else if(kk == 9){
                        kk =6;
                    }
                    sum = sum + kk*(int)(Math.pow(10,index1));
                }else {
                    flag = false;
                    break;
                }
                k = k-sum1;
                index1--;
            }
            if(flag==false){
                continue;
            }
            if(sum != i){
                count++;
            }

            if((i+1)/(Math.pow(10,index+1))==1){
                index++;
            }

        }
        System.out.println(count);
    }
}
