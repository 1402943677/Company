package com.bluedot.util.sortUtil;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/6/7 15:44
 * @Description: 归并排序
 */
public class MergeSort extends Sort {
    @Override
    public void sort(int[] array) {

        int []temp = new int[array.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        sort(array,0,array.length-1,temp);
        
    }

    private  void sort(int[] array,int left,int right,int []temp){
        if(left<right){
            int mid = (left+right)/2;
            sort(array,left,mid,temp);//左边归并排序，使得左子序列有序

            sort(array,mid+1,right,temp);//右边归并排序，使得右子序列有序

            merge(array,left,mid,right,temp);//将两个有序子数组合并操作
        }
    }
    private  void merge(int[] array,int left,int mid,int right,int[] temp){
        int i = left;//左序列指针
        int j = mid+1;//右序列指针
        int t = 0;//临时数组指针
        while (i<=mid && j<=right){
            if(array[i]<=array[j]){
                temp[t++] = array[i++];
            }else {
                temp[t++] = array[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[t++] = array[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[t++] = array[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            array[left++] = temp[t++];
        }
    }
}
