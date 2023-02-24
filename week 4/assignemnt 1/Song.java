public class Song
{
	private String title;
	private int duration;
	private int numberOfPlays;
	public Song(String title,int duration)
	{
		this.title=title;
		this.duration=duration;
		this.numberOfPlays=0;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String title()
	{
		return this.title;
	}
	public void setDuration(int duration)
	{
		this.duration=duration;
	}
	public int getDuration()
	{
		return	 this.duration;
	}
	public int getNumberOfPlays()
	{
		return this.numberOfPlays;
	}
	public void play()
	{
		numberOfPlays++;
	}
}