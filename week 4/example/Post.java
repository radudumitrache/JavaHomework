public class Post
{
	private String pictureLink;
	private String description;
	private int numberOfLikes;
	public void Post(String pictureLink,String description,int numberOfLikes)
	{
		this.pictureLink=pictureLink;
		this.description=description;
		this.numberOfLikes=numberOfLikes;
	}
	public String getPictureLink()
	{
		return this.pictureLink;
	}
	public void setPictureLink(String pictureLink)
	{
		this.pictureLink=pictureLink;
	}
	public void  setDescription(String description)
	{
		this.description=description;
	}
	public String getDescription()
	{
		return description;
	}
	public int getNumberOfLikes()
	{
		return numberOfLikes;
	}
	public void likePost()
	{
		numberOfLikes++;
	}
	
	
}