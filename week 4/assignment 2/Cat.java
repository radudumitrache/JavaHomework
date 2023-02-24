public class Cat
{
	private String name;
	private float happinesLevel;
	
	public Cat(String name)
	{
		this.name=name;
		this.happinesLevel=3.5f;
	}
	
	public String getName()
	{
		return this.name;
	}		
	public void setName(String name)
	{
		this.name=name;
	}
	public float getHappinessLevel()
	{
		return this.happinesLevel;
	}
	public boolean isHappy()
	{
		if (this.happinesLevel>3.5f)
			return true;
		else
			return false;
	}
	public void makeHappy (float amount)
	{
		this.happinesLevel+=amount;
		if (this.happinesLevel>5.0f)
			this.happinesLevel=5.0f;
	}
	
	public void makeAngry (float amount)
	{
		this.happinesLevel-=amount;
		if (this.happinesLevel<0f)
		{
			this.happinesLevel=0f;
		}
	}
}