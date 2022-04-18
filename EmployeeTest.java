package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
			Employee employeeH = new Employee();
			employeeH.setEmployeeName("홍길동");
			
			System.out.println(Employee.serialNum);
			
			Employee employeeKim = new Employee();
			employeeKim.setEmployeeName("김워호");
			
			System.out.println(employeeKim.getEmployeeName() +"님의 사번은 " + employeeKim.getEmployeeId());
			System.out.println(employeeH.getEmployeeName() +"님의 사번은 " + employeeH.getEmployeeId());
	}

}
