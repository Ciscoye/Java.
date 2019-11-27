import java.util.*;
public class CompareDate {
   public static void main(String args[ ]) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("输入第一个年，月，日，时，分，秒的数据");
      System.out.print("输入年份"); 
      short yearOne = scanner.nextShort();
      System.out.print("输入月份"); 
      byte monthOne = scanner.nextByte();
      System.out.print("输入日期"); 
      byte dayOne = scanner.nextByte();
      System.out.print("输入小时"); 
      byte hourOne = scanner.nextByte();
      System.out.print("输入分钟"); 
      byte minuteOne = scanner.nextByte();
      System.out.print("输入秒"); 
      byte secondOne = scanner.nextByte();
      System.out.println("输入第二个年，月，日,时，分，秒的数据");
      System.out.print("输入年份"); 
      short yearTwo = scanner.nextShort();
      System.out.print("输入月份"); 
      byte monthTwo= scanner.nextByte();
      System.out.print("输入日期"); 
      byte dayTwo = scanner.nextByte();
      System.out.print("输入小时"); 
      byte hourTwo = scanner.nextByte();
      System.out.print("输入分钟"); 
      byte minuteTwo = scanner.nextByte();
      System.out.print("输入秒"); 
      byte secondTwo = scanner.nextByte();
      System.out.print("利息计算，请输入本金");
      double money = scanner.nextDouble();
      Calendar calendar = Calendar.getInstance();//初始化日历对象
      calendar.set(yearOne,monthOne-1,dayOne,hourOne,minuteOne,secondOne);
      long timeOne =calendar.getTimeInMillis();//calendar表示的时间转换成毫秒
      calendar.set(yearTwo,monthTwo-1,dayTwo,hourTwo,minuteTwo,secondTwo); 
      long timeTwo=calendar.getTimeInMillis();
      Date date1 = new Date(timeOne);// 用timeOne做参数构造date1
      Date date2 =new Date(timeTwo);
      if(date2.equals(date1))
          System.out.println("两个日期的年、月、日、时、分、秒完全相同");
      else if(date2.after(date1))
          System.out.println("您输入的第二个日期大于第一个日期");
      else if(date2.before(date1))
          System.out.println("您输入的第二个日期小于第一个日期");
      long days=Math.abs(timeTwo-timeOne)/(1000*60*60*24);//计算两个日期相隔天数
      long hours=Math.abs(timeTwo-timeOne)%(1000*60*60*24)/(1000*60*60)+days*24;//计算两个日期相隔小时数
      long min=Math.abs(timeTwo-timeOne)%(1000*60*60*24)%(1000*60*60)/(1000*60)+days*24*60;//计算两个日期相隔分钟数
      long sec=Math.abs(timeTwo-timeOne)%(1000*60*60*24)%(1000*60*60)%(1000*60)/(1000);//计算两个日期相隔秒数
	  System.out.println(//输出结果
			  yearOne+"年"+monthOne+"月"+dayOne+"日"+hourOne+"时"+minuteOne+"分"+secondOne+"秒和"
			  +yearTwo+"年"+monthTwo+"月"+dayTwo+"日"+hourTwo+"时"+minuteTwo+"分"+secondTwo+"秒相隔"
			  +days+"天"+(hours-days*24)+"时"+(min-days*24*60)+"分"+sec+"秒");
	  double d=(double)days;
//	  System.out.println("本金为"+money+"元天数"+days+"天的利息是："+((days*0.0015*money)-money)+"（日利率为0.15%）");
//	  System.out.printf("本金为%lf",money,"元天数%lf",days,"天的利息是：%.2f",((days*0.0015*money)-money),"（日利率为0.15%）");
	  System.out.printf("本金为%.2f",money,"元天数%.2f",d,"天的利息是：%.2f",((d*0.0015*money)-money),"（日利率为0.15%）");
   }  
}
