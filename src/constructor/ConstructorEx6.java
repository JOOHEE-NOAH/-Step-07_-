package constructor;

public class ConstructorEx6 {

	public static void main(String[] args) {
		Student st=new Student();
		st.setName("ȫ�浿");
		st.setKor(95);
		st.setEng(85);
		st.setMat(73);
		//ȫ�浿�� ������ 253���̸� ����� 84.33�̰� ������ B�Դϴ�
		System.out.println(st);
		/* System.out.println(st.toString()); */
	
		//���� 4�� �����ڸ� �̿��Ͽ� "�Ƿη�",90,75,88�� ������ ��
		//getter�� �̿��Ͽ� ���
		// �̸� : �Ƿη�
		// ���� : 90
		// ���� : 75
		// ���� : 88
		// ���� : 253
		// ��� : 84.33
		// ���� : B
		Student ob=new Student("�Ƿη�",90,75,88);
		
		System.out.println("�̸� : "+ ob.getName());
		System.out.println("���� : "+ ob.getKor());
		System.out.println("���� : "+ ob.getEng());
		System.out.println("���� : "+ ob.getMat());
		System.out.println("���� : "+ ob.getTotal());
		System.out.printf("��� : %.2f", ob.getAvg());
		System.out.println("���� : "+ ob.getGrade());
		
		
	}	

}



