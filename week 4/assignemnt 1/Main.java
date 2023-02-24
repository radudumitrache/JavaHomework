import java.util.*;
public class Main
{
	public static void main(String [] args)
	{
		ArrayList<Song> songs=new ArrayList<Song>();
		Song applause=new Song("applause",11);
		songs.add(applause);
		Album gaga=new Album("Ceva","Lady Gaga",songs);
		System.out.println(gaga.getTotalPlayingTime());
		
	}
}