package example_63;

public class highest_num {

	public static void main(String[] args) {
		
		int number = 1562;
		int max = 0;
		int temp;
		
		while (number > 0)
		{
			temp = number%10;
			if (temp>max)
			{
				max = temp;
				//max = number;
			}
			
			number = number/10;
			
		}
		
		// TODO Auto-generated method stub
		System.out.println("The largest number is : " + max);
	}

}

