public class test2 {
    //判断101-200之间有多少质数，并输出所有质数
    public static void main(String[] args) {
        //判断101-200之间有多少质数，并输出所有质数
        //2~num/2
        int count=0;
        for (int num=2;num<=200;num++)
        {
            boolean flag=true;
            for (int i=2;i<=num/2;i++){
                if(num%i==0)
                {
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.println("该数是质数:"+num);
                count++;
            }
        }
        System.out.println("质数个数为："+count);
    }
}
