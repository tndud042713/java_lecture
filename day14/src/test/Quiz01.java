package test;
import java.util.*;
import java.text.*;
class Win7Quiz{
	private String[] name;
	private String[] info;
	public Win7Quiz(String c,String m, String cPath,String mPath){
		name = new String[2];
		name[0]=c;  name[1]=m;
		info = new String[2];
		info[0]=cPath;   info[1]=mPath;
	}
	public Win7Quiz() {
		name = new String[2];
		name[0]="����"; name[1]="�޸���";
		info = new String[2];
		info[0]="calc"; info[1]="notepad";
		System.out.println("win7 �⺻ ������");
	} 
	public void function(String funcName){
		String[] name = getName();
		String[] info = getInfo();
		HashMap map = new HashMap();
		for(int i=0;i<name.length;i++){	map.put(name[i], info[i]); }
		if(map.containsKey(funcName)){
			System.out.println(map.get(funcName)+"��� �մϴ�");
		}else{System.out.println("���� ��� �Դϴ�");}
	}
	public void funcPrint(){
		System.out.print("[��밡��] : ");
		String[] name = getName();
		for(int i=0;i<name.length;i++){
			System.out.print(name[i]+"  ");
		}
		System.out.println();
	}
	public String[] getName() {	return name;	}
	public String[] getInfo() {	return info;	}
	public void display(){
		//setName();setInfo(); //���� �ڵ�
		Scanner input = new Scanner(System.in);
		System.out.println("===== ȯ �� �� �� �� =====");
		int sel=0;
		String funcName=null;
		while(true){
			System.out.println("1.�� ��");
			System.out.println("2.off");
			System.out.print("�Է� >>>> ");
			sel = input.nextInt();
			switch(sel){
			case 1:
				funcPrint();
				System.out.print("����� ��� �Է� : ");
				funcName=input.next();
				function(funcName);break;
			case 2:return;
			}
		}
	}
}
class Login extends Win7Quiz{
	private String userId=null,userPw=null; //User
	/*
	public Login() {
		super("����","�޸���","calc.exe","notepad.exe");
	}
	*/
	public int compare(String id,String pw){
		if(getUserId() != null  && getUserPw() != null)
			if(getUserId().equals(id) && getUserPw().equals(pw)) return 0;
			else return 1;
		return 1;
	}
	public void saveId_Pw(String id,String pw){ setUserId(id); setUserPw(pw); }
	public boolean out(){	return false;	}
	public String getUserId() {	return userId;	}
	public void setUserId(String id) {	this.userId = id;	}
	public String getUserPw() {	return userPw;	}
	public void setUserPw(String pw) {	this.userPw = pw; }
}
public class Quiz01 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num=0,result=0; String inputId=null,inputPw=null;
		Login lo = new Login(); boolean flag=true;
		while(flag){
			System.out.print("1.�α���  2.�� ��  3.�α׾ƿ� \n>>>"); num = input.nextInt();
			switch(num){
			case 1:System.out.print("���̵� �Է� : ");inputId = input.next();
			System.out.print("��й�ȣ �Է� : "); inputPw = input.next();
			result = lo.compare(inputId,inputPw);
			if(result == 0) {
				System.out.println("���� ���");
				lo.display();
				//Win7Quiz win7 = new Win7Quiz("����","�޸���","calc.exe","notepad.exe");
				//win7.display();
			}
			else  System.out.println("���� ����");
			break;
			case 2: System.out.print("���� id : "); inputId = input.next();
			System.out.print("���� pw : "); inputPw = input.next();
			lo.saveId_Pw(inputId,inputPw); System.out.println("���� �Ϸ�");
			break;
			case 3:flag=lo.out();System.out.println("���� �մϴ�");
			}
		}
	}

}
/*
public class day01 {
	public static void main(String[] args){
		Win7Quiz win7 = new Win7Quiz("����","�޸���","calc.exe","notepad.exe");
		win7.display();
	}
}
 */

