import java.util.Random;

public class test6 {
    public static void main(String[] args) {
        /*
        抢红包，分别有{2,588,888,1000,10000}五个奖金。使用代码模拟抽奖
        打印出每个奖项，奖项出现的顺序要随机且不重复。打印效果(随机顺序)
        888元的奖金被抽出
        588元的奖金被抽出
        10000元的奖金被抽出
        1000元的奖金被抽出
        2元的奖金被抽出
         */
        int []prize={2,588,888,1000,10000};
        int []temp=new int[5];
        //抽奖
        for (int i = 0; i < prize.length; i++) {
            int pos=(int)(Math.random()*5);
            while (temp[pos]==prize[pos]){
                pos=(int)(Math.random()*5);
            }
            temp[pos]=prize[pos];
            System.out.println(temp[pos]+"元的奖金被抽出");
        }



    }
}
