public class Car
{
	private String licensePlate;
	private String color;
	private String brand;
	public Car(String licensePlate,String color,String brand)
	{
		this.licensePlate=licensePlate;
		this.color=color;
		this.brand=brand;
		
	}
	public String getLicensePlate()
	{
		return this.licensePlate;
	}
	public void setLicensePlate(String licensePlate)
	{
		this.licensePlate=licensePlate;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getBrand()
	{
		return this.brand;	
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
}