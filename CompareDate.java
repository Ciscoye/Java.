import java.util.*;
public class CompareDate {
   public static void main(String args[ ]) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("�����һ���꣬�£��գ�ʱ���֣��������");
      System.out.print("�������"); 
      short yearOne = scanner.nextShort();
      System.out.print("�����·�"); 
      byte monthOne = scanner.nextByte();
      System.out.print("��������"); 
      byte dayOne = scanner.nextByte();
      System.out.print("����Сʱ"); 
      byte hourOne = scanner.nextByte();
      System.out.print("�������"); 
      byte minuteOne = scanner.nextByte();
      System.out.print("������"); 
      byte secondOne = scanner.nextByte();
      System.out.println("����ڶ����꣬�£���,ʱ���֣��������");
      System.out.print("�������"); 
      short yearTwo = scanner.nextShort();
      System.out.print("�����·�"); 
      byte monthTwo= scanner.nextByte();
      System.out.print("��������"); 
      byte dayTwo = scanner.nextByte();
      System.out.print("����Сʱ"); 
      byte hourTwo = scanner.nextByte();
      System.out.print("�������"); 
      byte minuteTwo = scanner.nextByte();
      System.out.print("������"); 
      byte secondTwo = scanner.nextByte();
      System.out.print("��Ϣ���㣬�����뱾��");
      double money = scanner.nextDouble();
      Calendar calendar = Calendar.getInstance();//��ʼ����������
      calendar.set(yearOne,monthOne-1,dayOne,hourOne,minuteOne,secondOne);
      long timeOne =calendar.getTimeInMillis();//calendar��ʾ��ʱ��ת���ɺ���
      calendar.set(yearTwo,monthTwo-1,dayTwo,hourTwo,minuteTwo,secondTwo); 
      long timeTwo=calendar.getTimeInMillis();
      Date date1 = new Date(timeOne);// ��timeOne����������date1
      Date date2 =new Date(timeTwo);
      if(date2.equals(date1))
          System.out.println("�������ڵ��ꡢ�¡��ա�ʱ���֡�����ȫ��ͬ");
      else if(date2.after(date1))
          System.out.println("������ĵڶ������ڴ��ڵ�һ������");
      else if(date2.before(date1))
          System.out.println("������ĵڶ�������С�ڵ�һ������");
      long days=Math.abs(timeTwo-timeOne)/(1000*60*60*24);//�������������������
      long hours=Math.abs(timeTwo-timeOne)%(1000*60*60*24)/(1000*60*60)+days*24;//���������������Сʱ��
      long min=Math.abs(timeTwo-timeOne)%(1000*60*60*24)%(1000*60*60)/(1000*60)+days*24*60;//���������������������
      long sec=Math.abs(timeTwo-timeOne)%(1000*60*60*24)%(1000*60*60)%(1000*60)/(1000);//�������������������
	  System.out.println(//������
			  yearOne+"��"+monthOne+"��"+dayOne+"��"+hourOne+"ʱ"+minuteOne+"��"+secondOne+"���"
			  +yearTwo+"��"+monthTwo+"��"+dayTwo+"��"+hourTwo+"ʱ"+minuteTwo+"��"+secondTwo+"�����"
			  +days+"��"+(hours-days*24)+"ʱ"+(min-days*24*60)+"��"+sec+"��");
	  double d=(double)days;
//	  System.out.println("����Ϊ"+money+"Ԫ����"+days+"�����Ϣ�ǣ�"+((days*0.0015*money)-money)+"��������Ϊ0.15%��");
//	  System.out.printf("����Ϊ%lf",money,"Ԫ����%lf",days,"�����Ϣ�ǣ�%.2f",((days*0.0015*money)-money),"��������Ϊ0.15%��");
	  System.out.printf("����Ϊ%.2f",money,"Ԫ����%.2f",d,"�����Ϣ�ǣ�%.2f",((d*0.0015*money)-money),"��������Ϊ0.15%��");
   }  
}
