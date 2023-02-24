import java.util.*;
public class Album
{
	private String title;
	private String artist;
	private ArrayList<Song> songs;
	public Album(String title,String artist, ArrayList <Song> songs)
	{
		this.title=title;
		this.artist=artist;
		this.songs=songs;
		
	}
	public String getTitle()
	{
		return this.title;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getArtist()
	{
		return this.artist;
	}
	public void setArtist(String artist)
	{
		this.artist=artist;
	}
	public ArrayList<Song> getSongs()
	{
		return this.songs;
	}
	public void setSongs(ArrayList<Song> songs)
	{
		this.songs=songs;
	}
	public void addSong (Song song )
	{
		songs.add(song);
	}
	public void deleteSong (Song song) throws Exception
	{
		if (!songs.contains(song) )
			throw new Exception("song is not present in the album");
		else
		{
			songs.remove(song);
		}
	}
	public Song getMostPopularSong()
	{
		Song mostPopularSong= songs.get(0);
		for (Song song : songs)
		{
			if (mostPopularSong.getNumberOfPlays()< song.getNumberOfPlays())
				mostPopularSong=song;
		}
		return mostPopularSong;
	}
	public int getTotalPlayingTime()
	{
		int totalPlayingTime=0;
		for (Song song: songs)
		{
			totalPlayingTime+= song.getDuration();
		}
		return totalPlayingTime;
	}
	public boolean isRoadTripWorthy()
	{
		if (getTotalPlayingTime()>60)
		{
			return true;
		}
		else
			return false;
	}
	
}