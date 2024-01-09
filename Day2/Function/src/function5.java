public class function5 {
    public static void main(String[] args) {
        /*
        需求:定义一个方法copyOfRange(int[] arr,int from,int to)
        功能:将数组arr中从索引from(包括from)开始，到索引to结束(不包括to)
        的元素复制到新数组中，将新数组返回
         */
        int arr[]={11,22,33,44,55,66,77,88,99};
        int arr1[]=copyOfRange(arr,5,2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]+" ");
        }
    }
    public static int[] copyOfRange(int arr[],int from,int to){
        int num=Math.abs(to-from);
        int arr1[]=new int[num];
        if (from<to){
            for (int i = from,j=0; i < to; i++,j++) {
                arr1[j]=arr[i];
            }
        } else if (from>to) {
            for (int i = from, j=0; i > to; i--,j++) {
                arr1[j]=arr[i];
            }
        }
        else System.out.println("from和to数据错误!!!");
        return arr1;
    }
}
