package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "gopal", 40000));
		list.add(new Employee(102, "chetan", 45000));
		list.add(new Employee(103, "akash", 55000));
		list.add(new Employee(104, "yogesh", 50000));
		list.add(new Employee(102, "chetan", 45000));

		System.out.println(list.stream().
				collect(Collectors.groupingBy(p -> p.getEmpName(), 
						Collectors.counting())));
	}

}
