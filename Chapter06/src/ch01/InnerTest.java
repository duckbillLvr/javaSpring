package ch01;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	public OutClass() {
		inClass = new InClass();
	}
	class InClass{
		int inNum = 100;

		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass snum = " + sNum + "(외부 클래스의 스태틱 변수");
			System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수");
		}
	}

	public void usingClass() {
		inClass.inTest();
	}

	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;

		void inTest() {
			System.out.println("InClass num = " + inNum + "(내부 클래스의 인스턴스 변수)");//외부 클래스의 인스턴스 변수는 사용 불가
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수");
			System.out.println("OutClass snum = " + sNum + "(외부 클래스의 스태틱 변수");
		}

		static void sTest()//외부 클래스의 생성과 별개로 사용 가능할 수 있어야 함
		{
			//			System.out.println("InClass num = " + inNum + "(내부 클래스의 인스턴스 변수)");//static 일때 인스턴스 변수 사용 불가
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수");
			System.out.println("OutClass snum = " + sNum + "(외부 클래스의 스태틱 변수");

		}
	}
}
public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingClass();

		System.out.println();
		//OutClass.InClass iinner = new OutClass.InClass(); <- 사용 불가
		OutClass.InClass inner = outClass.new InClass();//내부 클래스가 private가 아닐 경우 가능
		inner.inTest();

		System.out.println();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();

		System.out.println();
		OutClass.InStaticClass.sTest();
	}

}
