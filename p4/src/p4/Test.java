package p4;

public class Test 
{
	static int a; 
	
	static 
	{
		a=4;
		System.out.println("inside static blockn");
		System.out.println("a = "+a);
		
	}
	Test()
	{
		System.out.println("inside construction");
		a=10;
	}
	public void func()
	{
		a=a+1;
		System.out.println("a="+a);
	}
		public static void main(String[] args)
		{
			Test obj = new Test();
			obj.func();
	
		}

	}
