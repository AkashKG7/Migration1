package stringmigration;

public class StringCheck {
	public static void main(String[] args) {
		String s="Sachin Tendulkar is a great cricketer";
		char[] charArray = s.toCharArray();
		int length = charArray.length;
		System.out.println(length);
		System.out.println(charArray.getClass());			
	}

}
