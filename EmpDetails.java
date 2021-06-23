
public class EmpDetails {

	public static void main(String[] args) {
		// To print the details of employees using Employee class.
		System.out.println("Details of Employees\n");
		System.out.println("Name\tYear of Joining\tSalary\t  Address");
		Employee emp1= new Employee();
		emp1.assignNprint(1994,"Robert","64C-WallsStreet",10000);
		Employee emp2= new Employee();
		emp1.assignNprint(2000,"Sam","68D-WallsStreet",20000);
		Employee emp3= new Employee();
		emp1.assignNprint(1999,"John","26B-WallsStreet",15750);
		
		
		

	}

}
