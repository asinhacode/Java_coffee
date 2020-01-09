package one;

public class Simple 
{

	public static void main(String[] args) 
	{
		System.out.println(twoOrThree());
	}
	
	public static int twoOrThree()
	{
		int i = 1;
		boolean twoOrThree = true;
		
			while(twoOrThree)
			{
				if( (i % 5 == 2 ) && (i % 6 == 3) )
					break;
				
				i++;
			}
			
			return i;
	}

}
