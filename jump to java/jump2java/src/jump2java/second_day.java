package jump2java;

public class second_day {
	
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("전달되는 arguments의 갯수가 3개 이상이어야 합니다");
			return;
		}
		
		for ( int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
