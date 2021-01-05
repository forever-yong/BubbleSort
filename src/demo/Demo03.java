package demo;

/**
 * 演示进制转换
 */
public class Demo03 {
    /**
     * 将字符串转换成对应的整数，其中
     * @param str 要转换的字符串
     * @param radix 进制
     * @return 十进制整数
     */
    public static int myParseInt(String str,int radix){
        //存放最终结果
        int sum = 0;
        //weight是权重(不管几进制，初始权重都是1)
        int weight = 1;
        //从最低位（最末位）开始
        for(int i = str.length() - 1; i >=0; i --){
            char c = str.charAt(i);
            //将字符转换成数字
            int n = c -'0';
            //基数 * 权重，然后相加
            sum +=n * weight;
            //变更权重
            weight *= radix;
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "1110";
        int number1 = Integer.parseInt(str,2);
        System.out.println("number1:" + number1);

        String str2 = "123";
        int number2 = Integer.parseInt(str2,7);
        System.out.println("number2:" + number2);

        int number3 = myParseInt("123",7);
        System.out.println("number3:" + number3);
    }
}
