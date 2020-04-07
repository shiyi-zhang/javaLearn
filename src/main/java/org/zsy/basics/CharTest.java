package org.zsy.basics;

import java.text.ParseException;

/**
 * @author 张世一
 * @version 1.0
 */
public class CharTest {

    /**
     * 0出现的概率为%50
     */
    public static double rate0 = 0.50;
    /**
     * 1出现的概率为%20
     */
    public static double rate1 = 0.20;
    /**
     * 2出现的概率为%15
     */
    public static double rate2 = 0.15;
    /**
     * 3出现的概率为%10
     */
    public static double rate3 = 0.10;
    /**
     * 4出现的概率为%4
     */
    public static double rate4 = 0.04;
    /**
     * 5出现的概率为%1
     */
    public static double rate5 = 0.01;

    /**
     * Math.random()产生一个double型的随机数，判断一下 例如0出现的概率为%50，则介于0到0.50中间的返回0
     *
     * @return int
     */
    private static int percentageRandom() {
        double randomNumber;
        randomNumber = Math.random();
        if (randomNumber >= 0 && randomNumber <= rate0) {
            return 0;
        } else if (randomNumber >= rate0 && randomNumber <= rate0 + rate1) {
            return 1;
        } else if (randomNumber >= rate0 + rate1 && randomNumber <= rate0 + rate1 + rate2) {
            return 2;
        } else if (randomNumber >= rate0 + rate1 + rate2 && randomNumber <= rate0 + rate1 + rate2 + rate3) {
            return 3;
        } else if (randomNumber >= rate0 + rate1 + rate2 + rate3
            && randomNumber <= rate0 + rate1 + rate2 + rate3 + rate4) {
            return 4;
        } else if (randomNumber >= rate0 + rate1 + rate2 + rate3 + rate4
            && randomNumber <= rate0 + rate1 + rate2 + rate3 + rate4 + rate5) {
            return 5;
        }
        return -1;
    }

    public static void main(String[] args) throws ParseException {
//            try {
//                CSVParser csvRecords = CSVParser.parse(new FileReader(new File("/Users/kc/Downloads/data.csv")),
//                    CSVFormat.EXCEL);
//                for (CSVRecord csvRecord : csvRecords) {
//                    System.out.println(csvRecord.get(0));
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

        int i=9;
        System.out.println(i/2);
    }


}
