class LcmMethod 
{
	public static void main(String[] args) 
	{
		System.out.println(lcm(6,8));
	}
	
	public static int lcm(int a, int b)
	{
		int ans = a>b?a:b;
		
		while (true)
		{
			if (ans%a==0 && ans%b==0)
			{
				break;
			}
			ans++;
		}
		return ans;
	}
}

