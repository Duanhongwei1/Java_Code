import java.util.Random;

public class Arrtest2 {
    public static void main(String[] args) {
        //生成10个1~100之间的随机数存入数组
        //1.求出所有数据的和
        //2.求所有数据的平均数
        //3.统计有多少个数据比平均数小

        //1.随机生成十个数
        Random r=new Random();
        int[]arr=new int[10];
        System.out.println("随机生成十个数:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(100)+1;
            System.out.println(arr[i]);
        }

        //2.计算数组和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("数据之和："+sum);
        int avg=sum/arr.length;
        System.out.println("平均数为:"+avg);

        //3.计算个数
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<avg)count++;
        }
        System.out.println("小于平均数的个数为:"+count);
    }
}
