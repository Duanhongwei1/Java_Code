import java.util.Random;

public class Arrtest4 {
    public static void main(String[] args) {
        /*
        打乱数组中的数据
         */
        int arr[]={1,2,3,4,5};
        Random r=new Random();
        //索引范围0~4

        for (int i = 0; i < 3; i++) {
            int random_index=r.nextInt(arr.length);
            int temp=arr[random_index];
            arr[random_index]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
