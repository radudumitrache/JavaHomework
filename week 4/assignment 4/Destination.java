public class Destination
{
	private String name;
	private String address;
	private double distanceFromPreviousDestination;
	private int numberOfPizzas;
	public Destination(String name,String address,int distanceFromPreviousDestination,int numberOfPizzas)
	{
		this.name=name;
		this.address=address;
		this.distanceFromPreviousDestination=distanceFromPreviousDestination;
		this.numberOfPizzas=numberOfPizzas;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public double getDistanceFromPreviousDestination()
	{
		return this.distanceFromPreviousDestination;
	}
	public void setDistanceFromPreviousDestination(double distanceFromPreviousDestination)
	{
		this.distanceFromPreviousDestination=distanceFromPreviousDestination;
	}
	public int getNumberOfPizzas()
	{
		return this.numberOfPizzas;
	}
	public void setNumberOfPizzas(int numberOfPizzas)
	{
		this.numberOfPizzas=numberOfPizzas;
	}
	
	
}