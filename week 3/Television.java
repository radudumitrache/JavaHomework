public class Television
{
	private String brandName;
	private String modelName;
	private boolean isLocked;
	private String pinCode;
	private int channel,volume;
	public Television(String brandName,String modelName,String pinCode)
	{
		this.brandName=brandName;
		this.modelName=modelName;
		this.pinCode=pinCode;
		this.channel=1;
		this.volume=0;
		this.isLocked=false;
	}
	public Television(String brandName,String modelName)
	{
		this.brandName=brandName;
		this.modelName=modelName;
		this.pinCode=null;
		this.isLocked=false;
	}
	public String getBrandName()
	{
		return brandName;
	}
	public String getModelName()
	{
		return modelName;
	}
	public void lock(String pinCode)
	{
		if (this.pinCode!=null)
		{
			if (this.pinCode.equals(pinCode))
				isLocked=true;
			else
				System.out.println("please provide the correct code");
		}
		else
			System.out.println("No pin set");
	}
	public void unlock(String pinCode)
	{
		if (this.pinCode!=null)
		{
			if (this.pinCode.equals(pinCode))
				isLocked=false;
			else
				System.out.println("please provide the correct code");
		}
		else
		{
			System.out.println("No pin set");
		}
	}
	public void changePin(String pinCode)
	{
		if (this.pinCode==null)
		{
			this.pinCode=pinCode;
		}
		else
		{
			if (this.isLocked==false)
				this.pinCode=pinCode;
			else
				System.out.println("Please unlock device first");
		}
	}
	public void setChannelUp()
	{
		if (this.isLocked==false)
		{
			this.channel++;
		}
		else
			System.out.println("please unlock televivision");
	}
	public void setChannelDown()
	{
		if (isLocked==false)
		{
			this.channel--;
			
		}
		else
			System.out.println("please unlock televivision");
	}
	public void setChannel(int channel)
	{
		if (this.isLocked==false)
		{
			this.channel=channel;
		}
		else
			System.out.println("please unlock televivision");
	}
	public void increaseVolume()
	{
		this.volume++;
	}
	public void decreaseVolume()
	{
		this.volume--;
	}
}