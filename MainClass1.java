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
class MainClass1 
{
	public static void main(String[] args) {
	Demo1 d1 = new Demo1();
	d1.test();
	System.out.println(d1.y);
	}
}