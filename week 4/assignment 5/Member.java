import java.time.*;
public class Member
{
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private LocalDate dateOfRegistration;
	public Member(String firstName,String lastName,LocalDate dateOfBirth,LocalDate dateOfRegistration)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.dateOfBirth=dateOfBirth;
		this.dateOfRegistration=dateOfRegistration;
	}
	public String getFirstName()
	{
		return	 this.firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public void setLastName()
	{
		this.lastName=lastName;
	}
	public LocalDate getDateOfBirth()
	{
		return this.dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth)
	{
		this.dateOfBirth=dateOfBirth;
	}
	public LocalDate getDateOfRegistration()
	{
		return this.dateOfRegistration;
	}
	public void setDateOfRegistration(LocalDate dateOfRegistration)
	{
		this.dateOfRegistration=dateOfRegistration;
	}
	public int getAge()
	{
		return Period.between(this.dateOfBirth,LocalDate.now()).getYears();
	}
	public int getMemberTime()
	{
		return Period.between(this.dateOfRegistration,LocalDate.now()).getYears();
	}
	public float getPrice()
	{
		int age=this.getAge();
		int memberTime=this.getMemberTime();
		float percent=1f;
		if ( this.getMemberTime()>=5)
			percent=0.8f;
		if (age<12)
			return 5*percent;
		else if (age>=12 && age<18)
			return 7.5f * percent;
		else if (age>=18 && age<=65)
			return 10*percent;
		else 
			return 30.35f*percent;
	}
	
}