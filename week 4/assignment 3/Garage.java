import java.util.*;
public class Garage
{
	private String name;
	private String address;
	private int maximumCapacity;
	private List< Car> cars;
	public Garage(String name, String address, int maximumCapacity)
	{
		this.name=name;
		this.address=address;
		this.maximumCapacity=maximumCapacity;
		this.cars=new ArrayList<Car>();
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
		return this.address=address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public int getMaximumCapacity()
	{
		return this.maximumCapacity;
	}
	public void setMaximumCapacity (int maximumCapacity)
	{
		this.maximumCapacity=maximumCapacity;
	}
	public void parkCar(Car car)
	{
		if (canPark(car))
			cars.add(car);
		else
			System.out.println("car cannot park here");
	}
	public int getNumberOfCars(String brand)
	{
		int number=0;
		for (Car car:cars)
		{
			if (brand.equals(car.getBrand()))
				number++;
		}
		return number;
	}
	public int getNumberOfCarsByColor(String color)
	{
		int number=0;
		for (Car car: cars)
		{
			if (color.equals(car.getColor() ) )
				number++;
		}
		return number;
	}
	public boolean isLicensePlateValid(Car car)
	{
		String licensePlate=car.getLicensePlate();
		int numberOfLetters=0;
		for (int i=0;i<licensePlate.length();i++)
		{
			if (Character.isLetter( licensePlate.charAt(i))  )
				numberOfLetters++;
		}
		if (numberOfLetters==6)
			return true;
		return false;
	}
	public boolean isFull()
	{
		if (cars.size()>=this.maximumCapacity)
			return true;
		return false;
	}
	public boolean canPark(Car car)
	{
		if (!isLicensePlateValid(car))
			return false;
		if ( (car.getColor()).equals("white") && getNumberOfCarsByColor("white")>=40)
			return false;
		if (isFull())
			return false;
		return true;
	}
	public void exit(Car car)
	{
		cars.remove(car);
	}
}