package com.stream;

public class Employee {

	int empId;
	String empName;
	double empSalary;

	public Employee(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		//101==102
		if (this.getEmpId() == emp.getEmpId()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}



