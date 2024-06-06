package example_63;

public class reverse_num {

	public static void main(String[] args) {
		int num = 1234;
		int reminder, reverse = 0;
		
		while(num != 0)
		{
			reminder = num%10;
			//System.out.println(reminder);
			reverse = reverse*10 + reminder;
			num = num/10;
		}
		// TODO Auto-generated method stub
		System.out.println("The reverse number is : " + reverse);

	}

}
