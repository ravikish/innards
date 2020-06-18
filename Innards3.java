package com.innards.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author KISHORE
 */
public class Innards3 {
	public static void main(String[] args) {
		Employee[] employees = { new Employee(1, "John", 10), new Employee(2, "Mark", 20),
				new Employee(3, "Mark", 30) };
		List<Employee> listEmployees = Arrays.asList(employees);

		Double sal = listEmployees.stream().reduce(0d, (temp, emp) -> temp + emp.getSalary(), Double::sum);

		System.out.println(sal);

		listEmployees.stream().distinct().forEach(x -> System.out.println(x.getId() + " : " + x.getName()));

		List<String> list = Arrays.asList("a", "b");

//		String res = list.stream().reduce("", (total, element) -> total + element);

//		 String res = list.stream().reduce("", String::concat);

		String res = list.stream().reduce("", (temp, element) -> temp + element.toUpperCase());

		System.out.println(res);

		System.out.println("***************");

		List<Integer> numbers = Arrays.asList(1,23,4,45,65);

		int divider = 2;

		Integer numres = numbers.stream().reduce(0, (a, b) -> {
			try {
				return a / divider + b / divider;
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				return -1;
			}
		});

		System.out.println(numres);
	}
}
