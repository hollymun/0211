//클래스 선언
public class First {
	//메인 메소드 선언
	public static void main(String[] args) {
		//@print와 println의 차이 
			//출력 후 다음 출력을 이어서 하는 것과 
			//줄바꿈을 하고 출력하는 것
		System.out.print("줄바꿈을 하지 않습니다.  ");
		System.out.println("줄바꿈을 합니다");
		//@\t는 탭, \n은 줄바꿈 
		System.out.println("줄바꿈을 \t합니다2 \n ~반갑습니당~");

		//@정수 출력
		//10진수 10
		System.out.println(10);	
		//16진수 10
		System.out.println(0x10);

		//@실수 출력
		System.out.println(3.14f);		//float 실수
		System.out.println(3.14);		//double 실수
		System.out.println(0.314E1); 	//0.314*10의 1승  

		System.out.println('A');
		System.out.println("A");
	
	}
}