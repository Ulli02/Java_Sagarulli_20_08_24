class Sample1
{
	int a=10;
}
class Demo1 extends Sample1
{
	void test() {
	System.out.println("Hey its test..");
	}
}
class Sample2
{
	int b=10;
}
class Demo2 extends Sample2
{
	void test() {
	System.out.println("Hey its test..");
	}
}
class Tester2 extends Demo2
{
	int x=10;
}

class Sample3
{
	int c=10;
}
class Demo3 extends Sample3
{
	void test() {
	System.out.println("Hey its test..");
	}
}
class Tester3 extends Sample3
{
	int y=10;
}

class MainClass4
{
	public static void main(String[] args) {
	Demo1 d1 = new Demo1();
	d1.test();
	System.out.println(d1.a);
	Tester2 t1=new Tester2();
	System.out.println(t1.b);
	System.out.println(t1.x);
	t1.test();
	Demo3 d2 = new Demo3();
	d2.test();
	System.out.println(d2.c);
	Tester3 t2 = new Tester3();
	System.out.println(t2.y);
	System.out.println(t2.c);
	}
}