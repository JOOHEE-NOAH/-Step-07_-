package object;
/*Ŭ������ Emp2
 * -name: String //�������
 * -dept:String
 * -salary: int
 * +setEmp1(name: String, dept: String, salary: int):void
 * +printEmp();void
 * */
//ObjectTest1.java  ---> ObjectTest1.Class, Emp1.class
class Emp2{
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp2(String name, String dept, int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	public String printEmp2() {
		return name+"����� "+dept+"�� �ٹ��ϸ� "+salary+"���� �޿��� �޽��ϴ�."; 
	}
}
public class ObjectTest2 {
	// ũ�� ����� ���ߺο� �ٹ��ϸ� 1530000���� �޿��� �޽��ϴ�.
	
	
	
	public static void main(String[] args) {
		Emp2 ep=new Emp2();
		ep.setEmp2("ũ��","���ߺ�",1530000);
		System.out.println(ep.printEmp2());
		
	}

}
