public class Arrtest1 {
    public static void main(String[] args) {
        //求数组中最大的值
        int arr[]={33,5,22,44,55};
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[max]<arr[i])max=i;
        }
        System.out.println("数组最大值为:"+arr[max]);
    }
}
