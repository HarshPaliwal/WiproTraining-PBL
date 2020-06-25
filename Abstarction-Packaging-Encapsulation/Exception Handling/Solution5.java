public class Solution5{
	public static void main(String[] args){
		try{
			int age=Integer.parseInt(args[0]);
			if(!(age>=18 && age<60))
				throw new InvalidAgeException();
		}
		catch(NumberFormatException nfe){
			System.out.println(nfe);
		}
		catch(InvalidAgeException iae){
			System.out.println(iae);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Program terminated successfully");
		}
	}
}
class InvalidAgeException extends Exception{
	InvalidAgeException(){
		super("Age must be in between 18 and 60");
	}
}