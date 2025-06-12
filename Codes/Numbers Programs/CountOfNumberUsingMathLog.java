class CountOfNumberUsingMathLog 
{
	public static void main(String[] args) 
	{
		int num = 123121;
		System.out.println("The number is "+num);
		
		int count = (int) Math.log10(num)+1;
		System.out.println("The count of number is "+count);
	}
}
