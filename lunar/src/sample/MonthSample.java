package sample;

import com.nlf.calendar.Solar;
import com.nlf.calendar.SolarMonth;

/**
 * 月份示例
 * @author 6tail
 *
 */
public class MonthSample{
  public static void main(String[] args){
    //下个月
    SolarMonth month = new SolarMonth().next(1);
    //遍历每一天
    for(Solar d:month.getDays()){
      //输出阳历信息
      System.out.println(d.toFullString());
      //输出阴历信息
      System.out.println(d.getLunar().toFullString());
      System.out.println();
    }
  }
}