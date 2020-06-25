class UserRegistration{
	static void registerUser(String userName,String userCountry){
		try{
			if(!userCountry.equalsIgnoreCase("India"))
				throw new InvalidCountryException();
			System.out.println("User Registration Done Successfully.");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args){
		registerUser(args[0],args[1]);
	}
}
class InvalidCountryException extends Exception{
	InvalidCountryException(){
		super("User is Outside of India");
	}
}