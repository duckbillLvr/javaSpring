package ch04;

public class StringConcatTest {
	public static void main(String[]args) {
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString("Hello", "World");
		String s1 = "next", s2 = "Java";
		strImpl.makeString(s1, s2);
		
		StringConcat concat = (s, v)->System.out.println(s+">>"+v);//클래스 생략
		concat.makeString(s1, s2);
		
		StringConcat concat2 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+">>>>>"+s2);
			}
		};
		concat2.makeString(s1, s2);
	}
}
