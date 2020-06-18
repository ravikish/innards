package com.innards.test;

import java.util.Optional;

/**
 * @author KISHORE
 */
public class Innard2 {
	public static void main(String[] args) {
		Student student = null;
		Student student2 = new Student(23, "2nd student");
		Student student3 = new Student(1223, "3rd student");
		Student b = Optional.ofNullable(student2).orElse(student3);
		System.out.println(b.getName());
		Student res = Optional.ofNullable(student).orElseGet(() -> createNewStudent());
		System.out.println(res.getName());

		String stdOptional = Optional.ofNullable(student).map(u -> u.getName()).orElse("RaviKishore");
		System.out.println(stdOptional);
	}

	private static Student createNewStudent() {
		Student student3 = new Student(1223, "3rd student");
		return student3;
	}
}
