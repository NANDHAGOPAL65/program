package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 
{
	String CountryName;
	String capital;
	
	Map1()
	{
		
	}
	
	Map1(String CountryName,String capital)
	{
		this.CountryName=CountryName;
		this.capital=capital;
	}
	
	HashMap<String, String> M1=new HashMap<String, String>();
	HashMap<String, String> M2=new HashMap<String, String>();
	
	Set set=M1.entrySet();
	
	HashMap<String, String> saveCountryCapital(String CountryName, String capital)
	{
		M1.put(CountryName, capital);
		return M1;
	}
	
	 String getCapital(String CountryName)
	{
		 Iterator it=set.iterator();
		 while(it.hasNext())
		 {
			 Map.Entry me=(Map.Entry) it.next();
			 if(me.getKey().equals(CountryName))
			 {
				 return (String) me.getValue();
			 }
			 
		 }
		 return null;
		
	}
	String getCountry(String capitalName)
	{
		Iterator it=set.iterator();
		 while(it.hasNext())
		 {
			 Map.Entry me=(Map.Entry) it.next();
			 if(me.getValue().equals(capitalName))
			 {
				 return (String) me.getKey();
			 }
			 
		 }
		 return null;
	}
	
	HashMap<String, String> interchange()
	{
		Iterator it=set.iterator();
		 while(it.hasNext())
		 {
			 Map.Entry me=(Map.Entry) it.next();
			 M2.put((String)me.getValue(),(String) me.getKey());
		 }
		return  M2;
	}
	
	ArrayList<String> arr=new ArrayList<String>();
	ArrayList<String> change()
	{
		
		Iterator it=set.iterator();
		 while(it.hasNext())
		 {
			 Map.Entry me=(Map.Entry) it.next();
			 arr.add((String) me.getKey());
		 }
		 return arr;
	}

	public static void main(String[] args)
	{
		Map1 a=new Map1();
		
		System.out.println(a.saveCountryCapital("India", "New Delhi"));
		System.out.println(a.saveCountryCapital("China","Beijing"));
		System.out.println(a.saveCountryCapital("Japan","Tokyo"));
		System.out.println(a.getCapital("India"));
		System.out.println(a.getCountry("Tokyo"));
		a.interchange();
		System.out.println(a.M2);
		a.change();
		System.out.println(a.arr);


	}

}
