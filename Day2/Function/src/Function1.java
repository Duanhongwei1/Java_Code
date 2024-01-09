public class Function1 {
    public static void main(String[] args) {
        //方法重载
        compareTwoNum(1,4);
        compareTwoNum((byte)1,(byte)4);

    }
    public static void compareTwoNum(byte b1,byte b2) {
        System.out.println("byte");
        System.out.println(b1==b2);
    }
    public static void compareTwoNum(int i1,int i2) {
        System.out.println("int");
        System.out.println(i1==i2);
    }
    public static void compareTwoNum(short s1,short s2) {
        System.out.println("short");
        System.out.println(s1==s2);
    }
    public static void compareTwoNum(long l1,long l2) {
        System.out.println("long");
        System.out.println(l1==l2);
    }
}
