package object;

/*Ŭ������ Emp3
-name :String //�������
-dept :String
-salary:int
+getter
+setter
+toString():String
*/
class Emp3{
private String name;
private String dept;
private int salary;

	public String getName() {
	return name;
}

public String getDept() {
	return dept;
}

public int getSalary() {
	return salary;
}

public void setName(String name) {
	this.name = name;
}

public void setDept(String dept) {
	this.dept = dept;
}

public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return name+"�� "+dept+"�� �ٹ��ϸ� "+salary+"���� �޿��� �޽��ϴ�.";
}
}
public class ObjectTest3 {
 
	public static void main(String[] args) {
		Emp3 em=new Emp3();
		em.setName("�Ƿη�");
		em.setDept("���ߺ�");
		em.setSalary(1520000);
		System.out.println(em.toString());
		
		System.out.println("�̸� : "+em.getName());
		System.out.println("�μ� : "+em.getDept());
		System.out.println("�޿� : "+em.getSalary()+"��");
	}


}