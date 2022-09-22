package org.emp;

public class Employee {
//method creation
	private void empId() {
		//business logics
		System.out.println("0001");
	}
	private void empNmae() {
		//business logic
		System.out.println("iraianbu");
	}
	private void empDob() {
		//business logic
		System.out.println("16.08.1995");
	}
	private void empPhone() {
		//business logic
		System.out.println("9578865500");
	}
	private void empEmail() {
		//business logic
		System.out.println("iraianburaja@gmail.com");
	}
	private void empAddress() {
		//business logic
		System.out.println("cuddalore");
	}
	//main method
	public static void main (String[] args) {
		//object creation
		Employee employeeInfo = new Employee();
		//method call
		employeeInfo.empId();
		employeeInfo.empNmae();
		employeeInfo.empDob();
		employeeInfo.empPhone();
		employeeInfo.empEmail();
		employeeInfo.empAddress();
	}
}
