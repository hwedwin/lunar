package sample;

import com.nlf.calendar.Solar;

/**
 * 阳历示例
 * @author 6tail
 *
 */
public class SolarSample{
  public static void main(String[] args){
    //阳历今天
    Solar date = new Solar();
    //输出阳历信息
    System.out.println(date.toFullString());
    //输出阴历信息
    System.out.println(date.getLunar().toFullString());
    System.out.println();
    //指定某个阳历日期
    date = new Solar(1986,5,29);
    System.out.println(date.toFullString());
    System.out.println(date.getLunar().toFullString());
  }
}