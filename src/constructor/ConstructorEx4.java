package constructor;
/*Ŭ���� �� : ConstructorEx4
 * x:int
 * y:int
 * +ConstructorEx4()-----�Է¹ޱ� (��ĳ��)
 * +cal():int----x*y�� ����
 * +display():void-----����ϱ�
 * 
 * */
/*-----------------------
 * ���θ� �Է� : 4
 * ���θ� �Է� : 5
 * �簢���� ���� :20
 * */

import java.util.Scanner;

public class ConstructorEx4 {
		int x;
		int y;
		public ConstructorEx4() {
			Scanner sc=new Scanner(System.in);
			System.out.print("���θ� �Է� : ");
			x=sc.nextInt();
			System.out.print("���θ� �Է� : ");
			y=sc.nextInt();
		}
		public int cal() {
			return x*y;
		}
		public void display() {
			System.out.println("�簢���� ���� : "+cal());
			
			
		}
	public static void main(String[] args) {
		new ConstructorEx4().display();
		//=ConstructorEx4 ob=new ConstructorEx4();
		//ob.display();
	}

}
