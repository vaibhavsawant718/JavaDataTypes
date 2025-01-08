class Int
{
	public static void main(String[]args)
	   {
		int x=2147483647;
		//int x=2147483648;  // error: integer number too large
		//int x=2147483648L;  // error: incompatible types: possible lossy conversion from long to int
		//int x=true; 	   // error: incompatible types: boolean cannot be converted to int

		System.out.println(x);
	   }
}
