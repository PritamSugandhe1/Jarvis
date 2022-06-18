mn;
		int sum=0,rem;
		while(a>0)
		{
			rem=a%10;
			sum=rem*rem*rem+sum;
			a=a/10;
		}

		if(sum==n)
		System.out.println("Number is arm ");
	}

}
