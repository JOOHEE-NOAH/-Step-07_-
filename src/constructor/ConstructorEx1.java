package constructor;
//constructor ������ : ��ü �ʱ�ȭ ���(�޸� �Ҵ� ���)
//����:���������� Ŭ������(){}

public class ConstructorEx1 {
	//���������ڴ� ������� �ʾƵ� ���ۿ� ū �̻��� ������ ����ϱ� ����.
	public ConstructorEx1() { //����Ʈ ������ �Լ����¿� ����ϳ�, returnŸ������������ �ʴ´�.
		System.out.println("default constructor"); //1
	}
	public ConstructorEx1(String str) {
		System.out.println(str+" constructor"); //2
	}
	public ConstructorEx1(String str, int n) {
		System.out.println(str+""+n+" constructor");//3
	}	
	public static void main(String[] args) {
		new ConstructorEx1(); //��ü ���� ,(����Ʈ) ������ ȣ��
		new ConstructorEx1("�Ƿη�"); //�Ű����� ����
		new ConstructorEx1("ũ��",23);
	}

}
