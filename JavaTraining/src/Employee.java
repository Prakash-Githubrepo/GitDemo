
public class Employee {
	private Integer enumber;
	private String ename;
	private Double esalary;

	public Integer getEnumber() {
		return enumber;
	}

	public void setEnumber(Integer enumber) {
		this.enumber = enumber;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getEsalary() {
		return esalary;
	}

	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}
	public Employee(Integer enumber, String ename, Double esalary) {
		super();
		this.enumber = enumber;
		this.ename = ename;
		this.esalary = esalary;
	}
	public Employee() {
			
	}

	@Override
	public String toString() {
		return "Employee [enumber=" + enumber + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
}
