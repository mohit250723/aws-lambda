package Entity;

public class Employee {

	private String id;
	private String name;
	private String empCode;
	
	
	public Employee(String id, String name, String empCode) {
		super();
		this.id = id;
		this.name = name;
		this.empCode = empCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	
}
