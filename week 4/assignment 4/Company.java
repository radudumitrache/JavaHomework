import java.util.*;
public class Company
{
	private String name;
	private List<Driver> drivers;
	private List<Destination> destinations;
	private List<Route> routes;
	public Company (String name)
	{
		this.name=name;
		this.drivers=new ArrayList<>();
		this.destinations=new ArrayList<>();
		this.routes=new ArrayList<>();
	}
	public String getName ()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public List<Driver> getDrivers()
	{
		return this.drivers;
	}
	public void setDrivers(List<Driver> drivers)
	{
		this.drivers=drivers;
	}
	public List<Destination> getDestinations()
	{
		return this.destinations;
	}
	public void setDestinations(List<Destination> destinations)
	{
		this.destinations=destinations;
	}
	public List<Route> getRoutes()
	{
		return this.routes;
	}
	public void setRoutes(List<Route> routes)
	{
		this.routes=routes;
	}
	public double getTotalProfit()
	{
		double result=0.0;
		for (Driver driver: drivers)
		{
			result+=driver.getDriverProfit();
		}
		return result;
	}
	public Route getShortestRoute()
	{
		Route shortestRoute=routes.get(0);
		for (Route route: routes)
		{
			if (route.getTotalDistance()<shortestRoute.getTotalDistance())
				shortestRoute=route;
		}
		return shortestRoute;
	}
	public Route getLongestRoute()
	{
		Route longestRoute=routes.get(0);
		for (Route route: routes)
		{
			if (route.getTotalDistance()<longestRoute.getTotalDistance())
				longestRoute=route;
		}
		return longestRoute;
	}
	public Route getRouteWithMostPizzas()
	{
		Route routeWithMostPizzas=routes.get(0);
		for (Route route:routes)
		{
			if (route.getTotalAmountOfPizzas()>routeWithMostPizzas.getTotalAmountOfPizzas())
				routeWithMostPizzas=route;
		}
		return routeWithMostPizzas;
	}
	
	
	
}