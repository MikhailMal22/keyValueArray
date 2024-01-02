package model;

//Entry class in order to store keys and values together
public class Entry implements Comparable<Entry>
{
	private String key;
	private Integer value;
	
	public Entry(String key, Integer value) 
	{
		this.key = key;
		this.value = value;
	}
	
	//getters
	public String getKey() 
	{
		return key;
	}

	
	public Integer getValue() 
	{
		return value;
	}
	
	//setters
	public void setValue(Integer newValue) 
	{
		this.value = newValue;
	}
	public void setKey(String key)
	{
		this.key = key;
	}
	
	//toString method for printing entry objects on screen in this format (key,entry)
	//Example: "key" 1234
	public String toString() 
	{
		return key + " " + value;
	}

	//compare method that compares entries based on their keys in order to sort them in the array
	@Override
	public int compareTo(Entry en) 
	{
		return this.key.compareTo(en.getKey());
		
	}
}
