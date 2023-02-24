import java.util.*;
public class Route
{
	private List<Destination> destinations;
	public Route()
	{
		destinations=new ArrayList();
	}
	public List<Destination> getDestinations()
	{
		return this.destinations;
	}
	public void setDestinations(List<Destination> destinations)
	{
		this.destinations=destinations;
	}
	public void addDestination(Destination destination)
	{
		this.destinations.add(destination);
	}
	public void deleteDestination(Destination destination)
	{
		this.destinations.remove(destination);
	}
	public double getTotalDistance()
	{
		double result=0.0;
		for (Destination destination: destinations)
		{
			result+=destination.getDistanceFromPreviousDestination();
		}
		return result;
	}
	public int getTotalAmountOfPizzas()
	{
		int result=0;
		for (Destination destination: destinations)
		{
			result+=destination.getNumberOfPizzas();
		}
		return result;
	}
	public double getRouteProfit()
	{
		double result=0.0;
		double totalDistance=getTotalDistance();
		result= getTotalAmountOfPizzas()*5.0 - getTotalDistance() * 0.05;
		return result;
	}
}
