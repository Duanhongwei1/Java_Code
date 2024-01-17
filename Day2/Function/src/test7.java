public class test7 {
    public static void main(String[] args) {
        int c0=0,c1=0,c2=0,c3=0,c4=0;
        for (int i=1;i<=100;i++){
            switch ((int)(Math.random()*5)){
                case 0:c0++;
                break;
                case 1:c1++;
                break;
                case 2:c2++;
                break;
                case 3:c3++;
                break;
                case 4:c4++;
                break;
                default:break;
            }
        }
        System.out.println("0的个数为："+c0);
        System.out.println("1的个数为："+c1);
        System.out.println("2的个数为："+c2);
        System.out.println("3的个数为："+c3);
        System.out.println("4的个数为："+c4);
    }
}
