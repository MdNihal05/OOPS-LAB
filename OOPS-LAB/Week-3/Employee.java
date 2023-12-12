import java.util.*;

class EmployeeDetails{
	int Id,age;
	double salary;
	String name,address,gender;
	EmployeeDetails(int id,String name,String address,String gender,int age){
		this.age=age;
		this.name=name;
		this.Id=id;
		this.address=address;
		this.gender=gender;
	}
}

public class Employee{
	public static void main(String ...args){
	
		System.out.println("Enter the no of Employees");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		EmployeeDetails arr[]=new EmployeeDetails[10];
		System.out.println("enter the details id,age,name,address,gender");
		
		for(int i=0;i<n;i++){
			int id=sc.nextInt();
			int age=sc.nextInt();
			String extra=sc.nextLine();
			String name=sc.nextLine();
			String address=sc.nextLine();
			String gender=sc.nextLine();
			arr[i]=new EmployeeDetails(id,name,address,gender,age);
		}
		System.out.println("\nenter id to search employee details");	
		int Id=sc.nextInt();
		for(int i=0;i<n;i++){
			if(arr[i].Id==Id){
					System.out.println(arr[i].Id+" "+arr[i].age+" "+arr[i].name+" "+arr[i].address+" "+arr[i].gender);
					break;
			}
		}
	}
}
