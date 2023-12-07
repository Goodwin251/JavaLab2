package com.solodkyi.JavaLab2.Library;

public class DVD extends Item
{
	private int duration;

	public int getDuration() 
	{
		return duration;
	}

	public DVD(String title, String uniqueID, int duration) 
	{
		super(title, uniqueID);
		this.duration = duration;
	}

	@Override
	public void borrowItem() 
	{
		isBorrowed = true;
	}

	@Override
	public void returnItem() 
	{
		isBorrowed = false;
	}
	@Override
	public String toString() 
	{
		return "Item [uniqueID=" + getUniqueID() + ", title=" + getTitle() +  ", isBorrowed=" + isBorrowed + ", duration= " + duration + "]";
	}
	
	@Override
	public boolean equals(Object o) 
	{
		if(!(o instanceof DVD)) 
		{
			return false;
		}
		
		DVD book = (DVD) o;
		
		return book.getTitle().equals(this.getTitle()) && book.getUniqueID().equals(this.getUniqueID()) 
				&& book.duration == this.duration && book.isBorrowed == this.isBorrowed;
	}
}
