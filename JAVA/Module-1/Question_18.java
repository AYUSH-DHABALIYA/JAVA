/* W.A.J.STR1 to find all interleaving of given strings. The given strings are: WX YZ
The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ */
package Assignment;
import java.util.HashSet;
import java.util.Set;

public class Question_18 {

		public static void allInterleavings(String res, String STR1, String STR2, Set < String > out) 
		{
			  if (STR1.length() == 0 && STR2.length() == 0) 
			  {
			   out.add(res);
			   return;
			  }
			  if (STR1.length() > 0)
			  {
			   allInterleavings(res + STR1.charAt(0), STR1.substring(1), STR2, out);
			  }
			  if (STR2.length() > 0)
			  {
			   allInterleavings(res + STR2.charAt(0), STR1, STR2.substring(1), out);
			  }
		}

			 public static void main(String[] args) 
			 {
				 String STR1 = "WX";
				 String STR2 = "YZ";
				 System.out.println("The given strings are: " + STR1 + "  " + STR2);
				 System.out.println("The interleavings strings are: ");
				 Set < String > out = new HashSet < > ();
				 allInterleavings("", STR1, STR2, out);

				 out.stream().forEach(System.out::println);
				 
			 }
	}

