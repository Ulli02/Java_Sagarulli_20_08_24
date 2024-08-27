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
class Tester1 extends Sample1
{
	int x=10;
}
class MainClass3
{
	public static void main(String[] args) {
	Demo1 d1 = new Demo1();
	d1.test();
	System.out.println(d1.y);
	Tester1 t1=new Tester1();
	System.out.println(t1.y);
	System.out.println(t1.x);
	}
}