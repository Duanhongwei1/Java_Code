public class function2 {
    public static void main(String[] args) {
        /*
        设计一个方法用于数组遍历，要求遍历的结果是在一行上的
         */
        int arr[]={11,22,33,44,55};
        printArr(arr);
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
