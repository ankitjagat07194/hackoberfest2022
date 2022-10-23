Hi there , 

Thank you for your intrest in hackoberfest and in helping others to make their first contribution to open source .

solve this issue 

  Q)You are given an integer , you have to convert it into a string.
  
   If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
   
   Example-1.
   Input -100
   Output - Good Job 
   
   Example-2 
   Input -200
   Output -Wrong answer
   Reason - This is not a string 
   askfhkashgjkh


//answers


import java.util.*;
import java.security.*;
public class IntToString {
	public static void main(String[] args) {
		
		Do_Not_Terminate.forbidExit();

		try{
			Scanner in = new Scanner(System.in);
			int n=in.nextInt();
      String s = Integer.toString(n);
      if(n==Integer.parseInt(s))
			{
				System.out.println("Good job");
			}
			else
			{
				System.out.println("Wrong answer.");
			}
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}

//The following class will prevent you from terminating the code using exit(0)!
class Do_Not_Terminate {
		 
	    public static class ExitTrappedException extends SecurityException {

			private static final long serialVersionUID = 1L;
	    }
	 
	    public static void forbidExit() {
	        final SecurityManager securityManager = new SecurityManager() {
	            @Override
	            public void checkPermission(Permission permission) {
	                if (permission.getName().contains("exitVM")) {
	                    throw new ExitTrappedException();
	                }
	            }
	        };
	        System.setSecurityManager(securityManager);
	    }
	}	
