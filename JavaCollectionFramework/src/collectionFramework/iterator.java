package collectionFramework;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
class employe{
	private int id;
	private String name;
	private int salary;
	private String cname;
	public employe(int id,String name,int salary, String cname){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.cname=cname;
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

public class iterator {
public static void main(String[] args) {
	HashSet<employe> al= new HashSet<>();
	employe emp1= new employe(01,"Akash",150000,"Microsoft");
	employe emp2= new employe(02,"Vikas",180650,"Microsoft");
	employe emp3= new employe(03,"Manish",17000,"Microsoft");
	employe emp4= new employe(04,"Sohit",105506,"Microsoft");
    al.add(emp1);
    al.add(emp2);
    al.add(emp3);
    al.add(emp4);
    Iterator <employe> it = al.iterator();
    Enumeration <employe> en= Collections.enumeration(al);
    System.out.println("Using Iterator:- ✅✅ \n");
    while(it.hasNext()) {
    	employe emp = it.next();
    	System.out.println("Employee Id.= "+emp.getId());
    	System.out.println("Employee Name.= "+emp.getName());
    	System.out.println("Employee Salary.= "+emp.getSalary());
    	System.out.println("Employee Company.= "+emp.getCname()+"\n");
    	System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖\n");
    	
    }
    System.out.println("Using Enumeration :- ✅✅  \n");
    while(en.hasMoreElements()) {
    	employe emp = en.nextElement();
    	System.out.println("Employee Id.= "+emp.getId());
    	System.out.println("Employee Name.= "+emp.getName());
    	System.out.println("Employee Salary.= "+emp.getSalary());
    	System.out.println("Employee Company.= "+emp.getCname()+"\n");
    	System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖\n");
    	
    }
}
}