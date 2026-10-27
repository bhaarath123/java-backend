package com.java;
public class copyConstructor {
	int id;
	String name;
	copyConstructor(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	copyConstructor(copyConstructor obj)
{
		this.id=obj.id;
		this.name=obj.name;
	}
	void display()
	{
		System.out.println(id +" "+name);
	} 
	
	public static void main(String[]args) {
		copyConstructor obj1 = new copyConstructor(1, "Bhaarath");
		copyConstructor obj2 = new copyConstructor(2, "Janani");
		
		     obj1.display();
		     obj2.display();
		     
		}
	}
