package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//Information system 1, implemented using an unsorted arrayList and Entry class

public class KeyValueArray
{
	//List of Entry instances, each contains a key value pair.
	private ArrayList<Entry> list;
	
	//Constructor
	public KeyValueArray() 
	{
		this.list = new ArrayList<Entry>();
	}

	public int size() 
	{
		return list.size();
	}
	
	//Returns true if there is no entries in the list
	public boolean isEmpty() 
	{
		if(list.size() == 0) 
		{
			return true;
		}
		return false;
	}
	
	//Binary search function to find key-value pairs more efficiently 
	//Returns index of the value associated with the key
	//Returns -1 if the key is not in the list or the list is empty
	public Integer search(String key) 
	{
		if(list.size() > 0)
		{
			int high = list.size()-1;
			int low = 0;
			int mid;
			while(low <= high) 
			{
				mid = (low + high+1) / 2;
				if(list.get(mid).getKey().compareTo(key) == 0) 
				{
					return mid;
				}
				else if(list.get(mid).getKey().compareTo(key) < 0) 
				{
					low = mid + 1;
				}
				else if(list.get(mid).getKey().compareTo(key) > 0)
				{
					high = mid - 1;
				}
			}
			
		}
		return -1;
	}
	//Searches through array to find a value associated with the given key using search() method above
	//Returns null if empty or there is no key in the list
	public Integer get(String key) 
	{
		int i = search(key);
		if(i != -1 ) 
		{
			Integer val = list.get(i).getValue();
			return val;
		}
		return null;
	}
	
	//If the key already exists, change the value of that key, 
	//Otherwise create a new entry,insert it in the list and sort the list
	public Integer put(String key,Integer value) 
	{
		int i = search(key);
		if(i != -1 ) 
		{
			Integer oldVal = list.get(i).getValue();
			list.get(i).setValue(value);
			return oldVal;
		}
		Entry en = new Entry(key,value);
		list.add(en);
		Collections.sort(list);
		return null;
	}
	
	//Remove the key and the value associated with it
	public Integer remove(String key) 
	{
		int i = search(key);
		if(i != -1 ) 
		{
			Integer oldVal = list.get(i).getValue();
			list.remove(i);
			return oldVal;
		}
		return null;
	}
	
	//Return an array of all keys in the list
	public String[] keySet()
	{
		String[] keys = new String[list.size()];
		for(int i = 0; i<list.size();i++) 
		{
			keys[i] = list.get(i).getKey();
		}
		return keys;
	}
	
	//Return an array of all values in the list
	public int[] values() 
	{
		int[] values = new int[list.size()];
		for(int i = 0; i<list.size();i++) 
		{
			values[i] = list.get(i).getValue();
		}
		return values;
	}
	
	//Getter method for the list attributes
	public ArrayList<Entry> entrySet()
	{
		return list;
	}
	
	
	//Method that enables users to manage the infoSystem list using commands and input
	//An info system instance must be initialized
	public static void infoInput(KeyValueArray list) 
	{
		Scanner in = new Scanner(System.in);
		String command = "";
		String key;
		Integer val;
		
		System.out.println("Enter a command");
		//Accept user input until user types exit
		while(!command.equals("exit"))
		{
			command = in.nextLine();
			
			switch(command)
			{
				case "size":
					System.out.println(list.size());
					break;
				
				case "isEmpty":
					System.out.println(list.isEmpty());
					break;
					
				case "get":
					System.out.println("Enter key:");
					key = in.nextLine();
					Integer result = list.get(key);
					if(result == null) 
					{
						System.out.println("Key not found");
					}
					else 
					{
						System.out.println("The value of the key '"+key+"' is "+result);
					}
					break;
					
				
				case "put":
					System.out.println("Enter key:");
					key = in.nextLine();
					//Catch an exception if user enters a non-digit string
					try 
					{
						System.out.println("Enter Value:");
						val = Integer.valueOf(in.nextLine());
						Integer result2 = list.put(key, val);
						if(result2 == null) 
						{
							System.out.println("Inserted and entry with key '"+key+"' and value "+ val +" into the list");
						}
						else 
						{
							System.out.println("An entry with the key '"+key+"' already exists, replacing old value "+ result2 +" with the new "+val);
						}
					}
					catch(NumberFormatException e)
					{
						System.out.println("Invalid Input! Value must be a number");
					}
					break;
					
				case "remove":
					System.out.println("Enter key:");
					key = in.nextLine();
					Integer result3 = list.remove(key);
					if(result3 == null) 
					{
						System.out.println("Key not found");
					}
					else 
					{
						System.out.println("Removed an entry with the key '"+key+"' and value "+result3);
					}
					break;
					
				case "keySet":
					String[] keys;
					keys = list.keySet();
					for(String i : keys) {
						System.out.println(i);
					}
					break;
					
				case "Values":
					int[] values;
					values = list.values();
					for(int i : values) {
						System.out.println(i);
					}
					break;
					
				case "EntrySet":
					ArrayList<Entry> entries;
					entries = list.entrySet();
					System.out.println(entries);
					break;
				
				case "exit":
					System.out.println("Exiting the program...");
					break;
				
				default:
					System.out.println("Invalid command");
					break;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		KeyValueArray M = new KeyValueArray();
		
		KeyValueArray.infoInput(M);
	}
	
}
