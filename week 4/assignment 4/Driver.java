import java.util.*;
import java.time.LocalDate;
import java.time.Period;
public class Driver
{
	private String name;
	private String dateOfBirth;
	private List< Route> routes;
	public Driver(String name, String dateOfBirth ) throws Exception
	{
		this.name=name;
		setDateOfBirth(dateOfBirth);
		this.routes=new ArrayList();
	}
	public String getDateOfBirthday()
	{
		return this.dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) throws Exception
	{
		this.dateOfBirth=dateOfBirth;
		if (getAge()<=16)
			throw new Exception("driver is too young");
	}
	
	
	
	
	public void  addRoute(Route route)
	{
		this.routes.add(route);
	}
	public void deleteRoute(Route route)
	{
		this.routes.remove(route);
	}
	public int getAge()
	{
		LocalDate birthDay= LocalDate.parse(dateOfBirth);
		LocalDate currentDate=LocalDate.now();
		return Period.between(birthDay,currentDate).getYears();
	}
	public double getSalary()
	{
		int age= getAge();
		if (age<20)
			return 4.0;
		else if (age<=22)
			return 4.75;
		else 
			return 5.25;
	}
	public double getDriverProfit()
	{
		double result=0.0;
		
		for (Route route: routes)
			result+=route.getRouteProfit();
		result-=getSalary()*this.routes.size();
		return result;
	}
}