# lunar
无第三方依赖的日历工具，支持公历和农历，含java和javascript版本。
> java版支持jdk1.5及以上。

[点此查看API及更多示例](http://6tail.cn/npress/calendar/api.html "点此查看API及更多示例")

java示例代码：

    import com.nlf.calendar.Lunar;

    /**
     * 阴历示例
     *
     */
    public class LunarSample{
      public static void main(String[] args){
        //今天
        Lunar date = new Lunar();
        //输出阴历信息
        System.out.println(date.toFullString());
        //输出阳历信息
        System.out.println(date.getSolar().toFullString());
        System.out.println();
        //指定阴历的某一天
        date = new Lunar(1986,4,21);
        System.out.println(date.toFullString());
        System.out.println(date.getSolar().toFullString());
      }
    }

javascript示例代码：

    <!DOCTYPE html>
    <html>
      <head>
        <meta charset="utf-8">
      </head>
      <body>
        <script src="nlf-calendar.js"></script>
        <script>
          var date = Lunar.fromDate(new Date());
          window.alert(date.toFullString());
          window.alert(date.getSolar().toFullString());
          date = Lunar.fromYmd(1986,4,21);
          window.alert(date.toFullString());
          window.alert(date.getSolar().toFullString());
        </script>
      </body>
    </html>

输出结果：

    丙申年捌月初八 猴年 北方玄武 斗木獬
    2016-09-08 闰年 星期四 处女座

    丙寅年肆月廿一 虎年 北方玄武 危月燕
    1986-05-29 星期四 双子座
