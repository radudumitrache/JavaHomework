public class Main
{
	public static void main( String args[])
	{
		Garage vericu =new Garage("vericu Shop","Bombardier Street nr valuare",20);
		Car morocanosu=new Car("PUP-BMW-00","White","Mercedes");
		System.out.println( vericu.canPark(morocanosu) );
		vericu.parkCar(morocanosu);
		
	}
	
}