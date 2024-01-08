public class Main {
    public static void main(String[] args) {
        int arr[]={15,32,47,96,14};
        System.out.println("数组arr的地址为:"+arr);//[I@6e8dacdf     [代表是数组 I代表是int类型 @表示间隔符号 固定格式
        System.out.println("arr[0]为:"+arr[0]);
        arr[0]=10;
        System.out.println("arr[0]为:"+arr[0]);
        for (int i=0;i<arr.length;i++) System.out.println(arr[i]);//"4.fori"可以生成循环
        //快速生成数组的遍历方式  "数组名.fori"

        //数组求和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("数组arr的和为:"+sum);
    }
    //数组动态初始化
    //数组默认初始化的规律
    //整数类型，默认初始化值0
    //小数类型，          0.0
    //字符类型           '/u0000' 空格
    //bool类型          false
    //引用类型          null

}