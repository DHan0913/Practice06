package com.javaex.ex04;


public class UserApp {

	public static void main(String[] args) {
		
		Customer j = new Customer("jws", "j1234", "정우성", 1000);
		j.showInfo();
		Customer l = new Customer("yjs", "y2345", "이효리", 2000);
		l.showInfo();
		Employee e = new Employee("master", "m7788", "운영자", 500);
		e.showInfo();

	}

}
