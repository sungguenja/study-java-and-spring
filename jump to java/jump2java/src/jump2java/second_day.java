package jump2java;

public class second_day {
	
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("���޵Ǵ� arguments�� ������ 3�� �̻��̾�� �մϴ�");
			return;
		}
		
		for ( int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
