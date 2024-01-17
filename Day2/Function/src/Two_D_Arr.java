public class Two_D_Arr {
    public static void main(String[] args) {
        /*
        第一季度：22,66,44
        第二季度:77,33,88
        第三季度:25,45,65
        第四季度:11,66,99
        计算出每个季度的总营业额和全年的总营业额
         */
        int [][]sales={
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int sum=0;
        for (int i = 0; i < 4; i++) {
            int sumSeason=0;
            for (int j = 0; j < 3; j++) {
                sumSeason+=sales[i][j];
            }
            System.out.println("第"+(i+1)+"季度的总营业额为:"+sumSeason);
            sum+=sumSeason;
        }
        System.out.println("全年的总营业额为:"+sum);
    }
}
