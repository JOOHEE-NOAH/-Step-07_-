package constructor;
/*Ŭ������ : UserInfo
 * +name:String
 * +addr:String
 * +UserInfo()
 * +UserInfo(name:String, addr:String) --->������
 * +getter
 * --------------------------------------
 * ***** �ּҷ� *****  <---����Ʈ �����ڿ��� ���
 * �̸� : ����   <----main �޼��忡�� getter�� �̿��Ͽ� ���
 * �ּ� : ������/���ﵿ
 * 
 * */
class UserInfo{
	public String name;
	public String addr;
	
	
	public UserInfo() { //---> ����Ʈ ������
		System.out.println("***** �ּҷ� *****");
	}
	public UserInfo(String name, String addr) {
		this();
		this.name= name;
		this.addr= addr;
		
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
}
public class ConstructorEx3 {

	public static void main(String[] args) {
		UserInfo ui=new UserInfo("����","������ ���ﵿ");
		System.out.println("�̸� : "+ui.getName());
		System.out.println("�ּ� : "+ui.getAddr());
		
	}

}
