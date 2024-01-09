public class function3 {
    public static void main(String[] args) {
        /*
        设计一个方法求数组的最大值，并将最大值返回
         */
        double arr[]={11.2,22.6,55.2,33.5,44.1,66.8};
        System.out.println("最大值为:"+printMax(arr));
    }
    public static double printMax(double arr[]){
        int pos=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[pos])pos=i;
        }
        return arr[pos];
    }
}
