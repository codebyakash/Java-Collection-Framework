package collectionFramework;

import java.util.ArrayList;

class employee {
	public int eid;
	public String name;
	public int age;
	public String cname;

	employee(int eid, String name, int age, String cname) {
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.cname = cname;
	}
}

public class CustomObj {
	public static void main(String[] args) {
		employee em1 = new employee(01, "Akash Saini", 18, "TCS");
		employee em2 = new employee(02, "Vikas Saini", 20, "TCS");
		ArrayList<employee> ea = new ArrayList<>();
		ea.add(em1);
		ea.add(em2);
		for (employee e : ea) {
			System.out.println("Employee id: " + e.eid );
			System.out.println("Employee Name: " + e.name );
			System.out.println("Employee Age: " + e.age );
			System.out.println("Employee Company: " + e.cname );
			System.out.println();
		}
	}
}
