import java.util.*;
public class Owner
{
	private String name;
	private List<Cat> cats;
	public Owner(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void AddCat(Cat cat)
	{
		this.cats.add(cat);
	}
	public boolean checkHappy(Cat cat) throws Exception
	{
		if (!cats.contains(cat))
			throw new Exception("Cat is not owned by this person");
		else
			return cat.isHappy();
	}
	public void petCat(Cat cat) throws Exception
	{
		if (!cats.contains(cat))
			throw new Exception("Cat is not owned by this person");
		else
		{
			cat.makeHappy(0.3f);
		}
	}
	public String callCat(Cat cat) throws Exception
	{
		if (!cats.contains(cat))
			throw new Exception("Cat is not owned by this person");
		
		return ("Come here "+ cat.getName());  
	}
}