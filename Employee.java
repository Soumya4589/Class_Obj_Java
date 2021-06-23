
public class Employee {
	int yr_of_join;
	String name= new String();
	String addr= new String();
	double salary;
	
	public  void assignNprint(int yr,String nm,String addres,double sal) {
		yr_of_join=yr;
		name=nm;
	    addr=addres;
	    salary=sal;
	    System.out.println(name+"\t   "+yr_of_join+"\t\t"+sal+"\t  "+addres);
	}

}
