package date_6_18;

import java.util.Scanner;

public class HomeWork_6_18 {
    public static void main(String[] args) {
        int i;
        int[] arr = new int[8];
        Scanner sc = new Scanner(System.in);
        //从键盘输入8个整数，并赋值给数组arr;
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        classify(arr);
    }
    private static void classify(int [] arr){
        int i, j = 0, k = 0, x = 0, y = 0, odd[], even[];
        for (i = 0; i < arr.length; i++) { //遍历数组arr,求出奇数和偶数的个数
            if (arr[i] % 2 == 0) {
                x++;        //x为偶数个数
            } else {
                y++;        //y为奇数个数
            }
        }
        odd = new int[y];
        even = new int[x];
        for (i = 0; i < arr.length; i++) {  //遍历数组arr，分别将奇数和偶数存入两个数组
            if (arr[i] % 2 == 0) {
                even[j] = arr[i];           //even为偶数数组
                j++;
            } else {
                odd[k] = arr[i];            //odd为奇数数组
                k++;
            }
        }
        //比较奇数和偶数的个数
        if (even.length > odd.length) {//如果偶数个数较多
            for (i = 0; i <= odd.length - 1; i++) {
                System.out.print(odd[i] + " " + even[i] + " ");
            }//先按照奇数的个数交替输出
            for (i = odd.length; i <= even.length - 1; i++) {
                System.out.print(even[i] + " ");
            }//输出剩下的偶数
        } else {
            for (i = 0; i <= even.length - 1; i++) {
                System.out.print(odd[i] + " " + even[i] + " ");
            }//先按照偶数的个数交替输出
            for (i = even.length; i <= odd.length - 1; i++) {
                System.out.print(odd[i] + " ");
            }//输出剩下的奇数
        }
    }
}
