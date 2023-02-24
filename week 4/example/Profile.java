import java.util.*;
public class Profile
{
	private List<Post> timeline;
	public Profile()
	{
		timeline=new ArrayList<>();
	}
	public Profile(List<Post> timeline)
	{
		this.timeline=timeline;
	}
	public void addPost(Post post)
	{
		timeline.add(post);
	}
	public void deletePost(Post post)
	{
		timeline.remove(post);
	}
	public void deletePost(int index)
	{
		Post postToRemove=timeline.get(index);
		timeline.remove(postToRemove);
	}
	public List<Post> getMostLikedPosts()
	{
		List<Post> result=new ArrayList<>();
		int maxLikes=0;
		for (Post currentPost: timeline)
		{
			int currentLikes=currentPost.getNumberOfLikes();
			if (maxLikes<currentLikes)
			{
				maxLikes=currentLikes;
				result.clear();
			}
			else if (maxLikes==currentLikes)
			{
				result.add(currentPost);
			}
		}
		return result;
		
	}
}