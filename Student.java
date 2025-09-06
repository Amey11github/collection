import java.util.*;

class Student 
{
	private String name;
	private Integer rollNo;
	private Long phoneNo;
	private String email;

	public String toString()
	{
		return "Name : "+name+" , RollNo :"+rollNo+" , Phone No :"+phoneNo+" , Email :"+email;
	} 

	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}

	public Integer getRollNo()
	{
		return rollNo;
	}

	public Long getPhoneNo()
	{
		return phoneNo;
	}

	
}