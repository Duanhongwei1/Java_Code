public class Arrtest3 {
    public static void main(String[] args) {
        /*
        交换数据
        交换前：1，2，3，4，5
        交换后：5，4，3，2，1
         */

        int arr[]={1,2,3,4,5};
        System.out.print("交换前:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.print("交换后:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
