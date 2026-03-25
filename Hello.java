package kr.com.beak;

/*
 *  
 */

//Hello 클래스 선언
public class Hello {
	
	//print() 메서드
	public void print(String name) {
		System.out.println("Hello"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello hello  =new Hello();
		hello.print("Java");
	}

}
