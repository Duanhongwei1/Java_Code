public class function4 {
    public static void main(String[] args) {
        /*
        定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
         */
        int arr[]={42,12,61,57,45,12,71,85,12,87};
        System.out.println(isExistNum(arr,11));
    }
    public static boolean isExistNum(int arr[],int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num)return true;
        }
        return false;
    }

}
