package constructor;
/*�����ڰ� �������϶� �ٸ� �������� ȣ���� ����
 * this() ���
 * ��ü�� �ڱ��ڽ��� �����Ҷ� ����ϴ� this�� �����ڸ� ȣ���ϱ� ���� this()���·� ���.
 * this()������ ȣ���� �����ڿ����� ��� ���� /�޼��忡�� ������ ȣ��Ұ�.
 * ������ ���ο��� this()������ ȣ���� �׻� �ֻ�ܿ� ��ġ�ؾ���.
 * */
public class ConstructorEx2 {
	public ConstructorEx2() {
		
		System.out.println("default constructor"); //4
	}
	public ConstructorEx2(int n) {
		this("������",n);//2
		System.out.println(n+"constructor"); //6
		}
		
	public ConstructorEx2(String str,int n) { //this(); �ڱ��ڽ��� ��ü , this ������ ȣ��
		this();  //3
		System.out.println(str+" "+n+"constructor");//5
	}
	public static void main(String[] args) {
		new ConstructorEx2(10); //1 ,7
	}
//=====================2===================================
	/*
	 * public class ConstructorEx2 { 
	 * public ConstructorEx2() { 
	 * this("������",10);//2
	 * System.out.println("default constructor"); //6 
	 * } 
	 * public ConstructorEx2(String str) { 
	 * System.out.println(str+"constructor"); //4 
	 * }
	 * 
	 * public ConstructorEx2(String str,int n) { //this(); �ڱ��ڽ��� ��ü , this ������ ȣ��
	 * this(str); //3 
	 * System.out.println(str+" "+n+"constructor");//5 
	 * } 
	 * public static void main(String[] args) { 
	 * new ConstructorEx2(); //1 ,7 
	 * }
	 */

/*
================1========================================
public class ConstructorEx2 {
	public ConstructorEx2() {
		System.out.println("default constructor"); //4
	}
	public ConstructorEx2(String str) {
		this(); //3
		System.out.println(str+"constructor"); //5
	}
	public ConstructorEx2(String str,int n) { //this(); �ڱ��ڽ��� ��ü , this ������ ȣ��
		this(str);  //2
		System.out.println(str+" "+n+"constructor");//6
	}
	public static void main(String[] args) {
		new ConstructorEx2("������",10); //1 ,7
	}*/

}
