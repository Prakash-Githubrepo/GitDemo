import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
/*
class Implementation implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return (e1.getEname().compareTo(e2.getEname()));
	}
	
}
*/
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<Employee>();
		System.out.println("Welcome to Cognizant...!");
		int i=0;
		while(i!=2) {
		System.out.println("Press 1 to enter Employee details\nPress 2 to Quit");
		i=sc.nextInt();
		if(i!=2) {
		Employee employee = new Employee();
		System.out.println("Enter the Emp Number");
		employee.setEnumber(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the Emp Name");
		employee.setEname(sc.nextLine());
		System.out.println("Enter the Emp Salary");
		employee.setEsalary(sc.nextDouble());
		list.add(employee);
		}
	}
		sc.close();
		//Collections.sort(list, new Implementation());
		Collections.sort(list,(e1,e2)->(e1.getEnumber()>e2.getEnumber())?1:(e1.getEnumber()<e2.getEnumber())?-1:0);
		System.out.println(list);

	}

}
