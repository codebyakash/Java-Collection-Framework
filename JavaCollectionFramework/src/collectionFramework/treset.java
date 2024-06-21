package collectionFramework;

import java.util.Collections;
import java.util.Enumeration;
import java.util.TreeSet;
import java.util.Iterator;
class empl implements Comparable<empl>{
	private int id;
	private String name;
	private int salary;
	private String cname;
	public empl(int id,String name,int salary, String cname){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.cname=cname;
	}
	public int compareTo(empl em) {
		if(id>em.getId())
			return 1;
		else
			if(id<em.getId())
				return -1;
			else
				return 0;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
}

public class treset {
public static void main(String[] args) {
	TreeSet<empl> tr= new TreeSet<>();
	empl emp1= new empl(01,"Akash",150000,"Microsoft");
	empl emp2= new empl(02,"Vikas",180650,"Microsoft");
	empl emp3= new empl(03,"Manish",17000,"Microsoft");
    tr.add(emp1);
    tr.add(emp2);
    tr.add(emp3);
    Iterator <empl> it = tr.iterator();
    Enumeration <empl> en= Collections.enumeration(tr);
    System.out.println("Using Iterator:- ✅✅ \n");
    while(it.hasNext()) {
    	empl emp = (empl)it.next();
    	System.out.println("Employee Id.= "+emp.getId());
    	System.out.println("Employee Name.= "+emp.getName());
    	System.out.println("Employee Salary.= "+emp.getSalary());
    	System.out.println("Employee Company.= "+emp.getCname()+"\n");
    	System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖\n");
    	
    }
    System.out.println("Using Enumeration :- ✅✅  \n");
    while(en.hasMoreElements()) {
    	empl emp = (empl)en.nextElement();
    	System.out.println("Employee Id.= "+emp.getId());
    	System.out.println("Employee Name.= "+emp.getName());
    	System.out.println("Employee Salary.= "+emp.getSalary());
    	System.out.println("Employee Company.= "+emp.getCname()+"\n");
    	System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖\n");
    	
    }
}
}