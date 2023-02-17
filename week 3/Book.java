public class Book
{
	private String name;
	private String author;
	private boolean isHardcover;
	private double price;
	private int numberOfPages;
	private int timesRead;
	public Book(String name,String author,boolean isHardcover,double price,int numberOfPages)
	{
		this.name=name;
		this.author=author;
		this.isHardcover=isHardcover;
		this.price=price;
		this.numberOfPages=numberOfPages;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getAuthor()
	{
		return this.author;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
    public double getPrice()
	{
		return this.price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public int getReadingTime()
	{
		int readingTime=this.numberOfPages*8;
		readingTime=readingTime/10 + (readingTime%10!=0 ? 1 :0);
		return readingTime;
	}
	public String canRead()
	{
		int readingTime=getReadingTime();
		if (readingTime<=60)
			return "You can read this";
		if (readingTime>60 && readingTime<240)
			return "Are you sure you want to read this now";
		return "You should not read this now";
	}
	public void read()
	{
		this.timesRead++;
	}
}