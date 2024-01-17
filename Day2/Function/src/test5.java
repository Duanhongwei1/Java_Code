import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        /*
        某系统的数字密码大于0，采用加密方式进行传输
        规则:先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数
         */
        //1.用一个数组将每个数字都存进去
        int []arr=new int[50];
        Scanner input=new Scanner(System.in);
        int secret=input.nextInt();
        int temp=secret;
        int i=0;//i不但作为arr的索引，还记录数组的长度
        while (temp/10!=0){
            arr[i]=temp%10;
            temp=temp/10;
            i++;
        }
        arr[i]=temp;
        //已经得到反转的数字
        //2.将每位数都加上5后对10求余
        for (int i1 = 0; i1 <= i; i1++) {
            arr[i1]=(arr[i1]+5)%10;
        }

        //输出新数
        for (int i1 = 0; i1 <= i; i1++) {
            System.out.print(arr[i1]);
        }
    }
}
