package ch01;

class Outer2{
	int outNum = 100;
	static int sNum = 200;
	
	
	Runnable getRunnable(final int i) {
		int num = 10;
		
//		class MyRunnable implements Runnable{
//			int localNum = 1000;
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
////				num = 20; <= Final 형식이므로 변경 불가능
//				System.out.println("i = " + i);
//				System.out.println("num = " + num);
//				System.out.println("localNum = " + localNum);
//				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
//				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
//			}
//			
//		}
//		return new MyRunnable();
		
		
		//익명 내부 클래스
		return new Runnable() {
				int localNum = 1000;
				@Override
				public void run() {
					// TODO Auto-generated method stub
//					num = 20; <= Final 형식이므로 변경 불가능
					System.out.println("i = " + i);
					System.out.println("num = " + num);
					System.out.println("localNum = " + localNum);
					System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
					System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
				}
				
			};
	}
	
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable class");
		}
		
	};
}
public class AnonumousInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run();
		
		System.out.println();
		out.runnable.run();
	}

}
