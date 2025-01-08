
class Short
{
	public static void main(String[]args)
	{
		short s=32767;
		//short s=32768;
		//short s=10.5;
		//short s=true;
		System.out.println(s);
	}
}

// Compile Error 
//1 possible loss of precision found int require short.
//2 possible loss of precision found float require short.
//3 possible loss of precision found boolean require short.