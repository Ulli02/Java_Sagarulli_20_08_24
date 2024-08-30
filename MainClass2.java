class Sample1
{
	int y=10;
}
class Demo1 extends Sample1
{
	void test() {
	System.out.println("Hey its test..");
	}
}
class Tester1 extends Demo1 
{
	int c=10;
}
class MainClass2
{
	public static void main(String[] args) {
	Tester1 t1= new Tester1();
	t1.test();
	System.out.println(t1.y);
	System.out.println(t1.c);
	}
}