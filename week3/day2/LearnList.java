package week3.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LearnList {

	public static void main(String[] args) {
		//List<object> learners=new ArrayList<object>(); if you use "object keyword it will accept all the data types like int,float etc
		List<String> learners=new ArrayList<String>();
		
		learners.add("Stevyn");
		learners.add("Sophia");
		learners.add("Babu");
		learners.add("Nivin");
		learners.add("Joseph");
		learners.add("Mary");
		
		//Create new list
		List<String> student=new ArrayList<String>();
		student.addAll(learners);
		//get the length of list
		int size=learners.size();
		System.out.println(size);
		System.out.println(learners.size());
		learners.add(2,"rita");
		
		//print the list
		System.out.println(learners);
		System.out.println(learners.size());
		learners.remove(0);
		System.out.println(learners.remove(1));
		
		System.out.println(learners.get(3));//particular index
		System.out.println(learners.contains("Sophia"));
		//learners.clear();
		System.out.println(learners);
		System.out.println(learners.isEmpty());// []
		
		//to arrange the list in order
		Collections.sort(learners);
		
		for(int i=0;i<learners.size();i++)
		{
			System.out.println(learners.get(i));
		}
		
	}

}
