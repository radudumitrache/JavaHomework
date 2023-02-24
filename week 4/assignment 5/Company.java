import java.util.*;
public class Company
{
	private ArrayList<Member>members;
	public Company()
	{
		members=new ArrayList<>();
	}
	public ArrayList<Member> getMembers()
	{
		return this.members;
	}
	public void setMembers(ArrayList<Member> members)
	{
		this.members=members;
	}
	public void addMember(Member member)
	{
		this.members.add(member);
	}
	public void deleteMember(Member member)
	{
		this.members.remove(member);
	}
	public float GetYearlyProfit()
	{
		float rezult=0f;
		for (Member member : members)
		{
			rezult+=member.getPrice();
		}
		return rezult;
	}
	public Member getOldestMember()
	{
		Member oldestMember=members.get(0);
		for (Member member: members)
			if (oldestMember.getAge()<member.getAge())
				oldestMember=member;
		return oldestMember;
	}
	public Member getYoungestMember()
	{
		Member youngestMember=members.get(0);
		for (Member member: members)
		{
			if (youngestMember.getAge()>member.getAge())
				youngestMember=member;
		}
		return youngestMember;
	}
	public Member getLongestRunningMember()
	{
		Member longestMember=members.get(0);
		for (Member member:members)
		{
			if (longestMember.getMemberTime()<member.getMemberTime())
				longestMember=member;
		}
		return longestMember;
	}
	
}