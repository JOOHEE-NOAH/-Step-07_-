package constructor;
import java.util.Scanner;

/*�����ڿ��� �μ��� �Է¹޾� ū���� �������� ����ϼ���.
 * show() ���� maxValue(), minValue()�� ȣ���� ��. //���׿����ڳ� if ���
 * Ŭ������:Max
 * -a:int
 * -b:int
 * +Max()
 * +minValue():int
 * +maxValue():int
 * +show():void   --->����� ����
 * 
 * */
/*------------------------
 * input A : 5
 * input B : 3
 * 
 * ū�� : 5
 * ������ : 3
 * 
 * */

 
 class Max {
	  private int a;
	  private int b;
	  
	  public Max() {
	  
	  Scanner sc=new Scanner(System.in);
		 System.out.print("input A : ");
		 a=sc.nextInt();
		 System.out.print("input B : ");
		 b=sc.nextInt();
		sc.close(); 
	  }
	 
	 public int minValue() {
		 return (a<b)? a:b ;
	 }
	 public int maxValue() {
		 return (a>b)? a:b ;
	 }
	 public void show() {
		 System.out.println();
		 System.out.println("ū�� : "+maxValue());
		 System.out.println("������ : "+minValue());
	 }
	 }
public class ConstructorEx5 {

	public static void main(String[] args) {
		new Max().show();
	
	}

}
