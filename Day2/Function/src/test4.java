import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //六位评委给选手打分,分数范围时[0-100]之间的整数。选手最后的得分为:
        //去掉最高分、最低分、后的四个评委的平均分
        //1.用一个数组存放评委的打分
        int []score=new int[6];
        Scanner input=new Scanner(System.in);
        System.out.println("请输入评委的打分(0-100):");
        for (int i = 0; i < score.length; i++) {
            int num=input.nextInt();
            while (num<0||num>100){
                System.out.println("您输入的分数有误，请重新输入(0-100):");
                num=input.nextInt();
            }
            score[i]=num;
        }
        //2.去掉最高分和最低分
        int max=score[0],min=score[0],posMax=0,posMin=0;
        for (int i = 0; i < score.length; i++) {
            if (score[i]>max){
                max=score[i];
                posMax=i;
            }else if(score[i]<min){
                min=score[i];
                posMin=i;
            }
        }
        score[posMin]=0;
        score[posMax]=0;

        //3.计算平均分
        double sum=0;
        for (int i = 0; i < score.length; i++) {
            sum+=score[i];
        }
        double avg=sum/4;
        System.out.println("选手最终的得分为:"+avg);
    }
}
