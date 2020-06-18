package com.innards.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author KISHORE
 */
class Student {
	int age;
	String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}

public class Innard1 {

	public static void main(String[] args) {
		Student student2 = new Student(1, "vsjf");
		Student student = new Student(12, "zsdfgb");
		List<Student> lStudents = new ArrayList<>();
		lStudents.add(student);
		lStudents.add(student2);
		Collections.sort(lStudents, (o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		});
		System.out.println(lStudents.get(0).getName());
	}
}
