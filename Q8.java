package cswassignGenericspart2;
import java.util.*;
class Anagrams {
	public static int count(String s,char ch)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
				c++;
		}
		return c;
		
	}
	public static void main(String[] args) {
		HashMap<Character,Integer> map1 =new HashMap<>();
		HashMap<Character,Integer> map2 =new HashMap<>();
		String s1="ITER";
		String s2="TIER";
		for(int i=0;i<s1.length();i++)
		{
			map1.put(s1.charAt(i),count(s1,s1.charAt(i)));
		}
		for(int i=0;i<s2.length();i++)
		{
			map2.put(s2.charAt(i),count(s2,s2.charAt(i)));
		}
		
			if(map1.equals(map2))
				System.out.println("Anagrams : "+s1+" , "+s2);
			else
				System.out.println("Not Anagrams : "+s1+" , "+s2);
			
		}
}

