package day03;

public class HomeWork {

    public static void main(String[] args) {
        //打印等腰三角形。
        triangle();
        //求一百以内质数的和
        sum(100);
    }
    //等腰三角形
    public static void triangle(){
        int i,j,k;
        for (i=1;i<=6;i++){
            for(j=1;j<=7-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static boolean findPrimeNum(int n){
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void sum(int n){
        int sum = 0;
        for(int i=2;i<=n;i++){
            if(findPrimeNum(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
