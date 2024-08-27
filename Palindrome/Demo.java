class Demo {
	static String result = " ";
	static void Palindrome(String str){
		for(int i = str.length()-1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		if(str.equals(result)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
	public static void main(String[] args) {
		Palindrome("Java");
	}
}