import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /*
        需求:
        机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱
        按照如下规则计算机票价格:旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折
         */
        //1、键盘录入机票原价、月份、头等舱或经济舱
        Scanner input=new Scanner(System.in);
        System.out.println("请输入机票的原价:");
        int ticket=input.nextInt();
        System.out.println("请输入当前的月份:");
        int month=input.nextInt();
        System.out.println("请输入当前购买的舱位(0:头等舱 1:经济舱):");
        int seat=input.nextInt();
        //2、先判断月份时旺季还是淡季
        //快捷键 ctrl+alt+m  自动抽取方法
        if(month>=5 && month<=10){
            //旺季
            ticket = getTicket(seat, ticket, 0.9, 0.85);
        } else if ((month>=1&&month<=4)||(month>=11&&month<=12)) {
            //淡季
            ticket = getTicket(seat, ticket, 0.7, 0.65);
        }else System.out.println("您输入的月份有误!");
        System.out.println(ticket);
    }

    private static int getTicket(int seat, int ticket, double x, double x1) {
        if (seat == 0) {
            //头等舱
            ticket = (int) (ticket * x);
        } else if (seat == 1) {
            //经济舱
            ticket = (int) (ticket * x1);
        } else System.out.println("没有这个舱位!");
        return ticket;
    }
//    public static int calTic(int ticket,int seat,double v1,double v2){
//        if (seat==0){
//            //头等舱
//            ticket=(int)(ticket*v1);
//        } else if (seat==1) {
//            //经济舱
//            ticket=(int)(ticket*v2);
//        }else System.out.println("没有这个舱位!");
//        return ticket;
//    }
}
