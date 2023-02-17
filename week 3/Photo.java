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
		return length;
	}
	public int getWidth()
	{
		return width;
	}
	public String getDescription()
	{
		return description;
	}
	public List<String> getPeople()
	{
		return people;
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
		if (people.size()>1)
			return true;
		else
			return false;
	}
	public boolean isPrintable()
	{
		if (dpi>=150 && width>=585 && length>=878)
			return true;
		else
			return false;
	}
}