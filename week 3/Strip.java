import java.util.*;
public class Strip
{
	private int red;
	private int green;
	private int blue;
	private int dimmer;
	private List<String> colors;
	public Strip(int red,int green,int blue,int dimmer)
	{
		this.red=red;
		this.green=green;
		this.blue=blue;
		this.dimmer=dimmer;
		this.colors=new ArrayList();
		this.colors.addAll( Arrays.asList("Red","Green","Blue","Purple","Orange","Sun")  );
	}
	public Strip(String colorText,int dimmer) throws Exception
	{
		if (isValid(colorText))
		{
			switch (colorText)
			{
				case "Red":
				{
					this.red=255;
					break;
				}
				case "Green":
				{
					this.green=255;
					break;
				}
				case "Blue":
				{
					this.blue=255;
					break;
				}
				case "Purple":
				{
					this.red=255;
					this.blue=255;
					break;
				}
				case "Orange":
				{
					this.red=255;
					this.green=165;
					break;
				}
				case "Sun":
				{
					this.red=201;
					this.green=141;
					this.blue=38;
					break;
				}
				
				
			}
			this.dimmer=dimmer;
		}
		else
		{
			throw new Exception("Color invalid");
		}
	}
	public int getRed()
	{
		return this.red;
	}
	
	public void setRed(int red)
	{
		this.red = red;
	}
	public int getGreen()
	{
		return this.green;
	}
	
	public void setGreen(int green)
	{
		this.green = green;
	}
	public int getBlue()
	{
		return this.blue;
	}
	
	public void setBlue(int blue)
	{
		this.blue = blue;
	}
	public int getDimmer()
	{
		return this.dimmer;
	}
	
	public void setDimmer(int dimmer)
	{
		this.dimmer = dimmer;
	}
	
	
	
	public List<String> getColors()
	{
		return this.colors;
	}
	public void setColor(String colorText) throws Exception
	{
		if (isValid(colorText))
		{
			switch (colorText)
			{
				case "Red":
				{
					this.red=255;
					break;
				}
				case "Green":
				{
					this.green=255;
					break;
				}
				case "Blue":
				{
					this.blue=255;
					break;
				}
				case "Purple":
				{
					this.red=255;
					this.blue=255;
					break;
				}
				case "Orange":
				{
					this.red=255;
					this.green=165;
					break;
				}
				case "Sun":
				{
					this.red=201;
					this.green=141;
					this.blue=38;
					break;
				}
				
				
			}
			this.dimmer=dimmer;
		}
		else
		{
			throw new Exception("Color invalid");
		}
		
		
	}
	
	public String getSpecificColor(int index)
	{
		return this.colors.get(index - 1);
	}
	public boolean isValid(String colorText)
	{
		return this.colors.contains(colorText);
	}
	
	
	
	
}