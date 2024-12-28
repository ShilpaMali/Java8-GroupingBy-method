package com.velocity.grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {

		// ajay, shyam, vinit, yogesh, punit, yogesh, ajay
		List<String> list = new ArrayList<String>();
		list.add("ajay");
		list.add("shyam");
		list.add("vinit");
		list.add("yogesh");
		list.add("punit");
		list.add("yogesh");
		list.add("ajay");
		System.out.println(list.stream().collect(Collectors.groupingBy(p ->p, 
				Collectors.counting())));

	}

}
