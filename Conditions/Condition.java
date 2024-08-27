class Condition {
	public static void main(String[] args) {
		co1();
		co2();
		co3();
		co4();
		co5();
		co6();
		co7();
	}
	static void co1() {
		int a=20;
		int b=25;
		if(a<=b) {
			System.out.println("Hi");
		}
	}
	static void co2() {
		int a=20;
		int b=25;
		if((a!=b) && (a<b)) {
			System.out.println("Hi");
		}
		
	}
	static void co3() {
		int a=20;
		int b=(20+a);
		if((a==b)||(b==a) && (a!=b)||(b!=a)) {
			System.out.println("Hi");
		}
		else {
			System.out.println("Bye");
		}
	}
	static void co4() {
		int a=20;
		int b=(a+a)-20;
		if((a>b)||(b>a) && ((a+30)==b)||((b-30)!=a)) {
			System.out.println("Henge Naavu");
		}
		else {
			System.out.println("Yakannaa");
		}
	}
	static void co5() {
		int a=20;
		int b=30;
		if(a<=b) {
			System.out.println("Hi");		
		}
		else {
			System.out.println("Bye");
		}
	}
	static void co6() {
		int a=20;
		int b=30;
		if(true) {
			System.out.println("Hi");	
		}
		else {
			System.out.println("Bye");
		}
	}
	static void co7() {
		int a=20;
		int b=10;
		if(!false) {
			System.out.println("Hi");
		}
		else {
			System.out.println("Bye");
		}
	}
}