import java.util.*;
public class Photo
{
	private int length,width;
	private String description;
	private List<String>people;
	private int dpi;
	public Photo(int length,int width,String description,List<String> people,int dpi)
	{
		this.length=length;
		this.width=width;
		this.description=description;
		this.people.addAll(people);
	}
	public int getLength()
	{
		return this.length;
	}
	public void setLenght(int length)
	{
		this.length=length;
	}
	public int getWidth()
	{
		return this.width;
	}
	public void setWidth(int width)
	{
		this.width=width;
	}
	public String getDescription()
	{
		return this.description;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	public List<String> getPeople()
	{
		return this.people;
	}
	public int getDpi ()
	{
		return dpi;
	}
	public void setPeople(List<String> people)
	{
		this.people.clear();
		this.people.addAll(people);
	}
	public void setLenght(int length)
	{
		this.length=length;
	}
	public void setWidth(int width)
	{
		this.width=width;
	}
	public boolean isGroupPhoto()
	{
		if (this.people.size()>1)
			return true;
		else
			return false;
	}
	public boolean isPrintable()
	{
		if (this.dpi>=150 && this.width>=585 && this.length>=878)
			return true;
		else
			return false;
	}
}