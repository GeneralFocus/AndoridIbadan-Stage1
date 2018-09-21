package tutorial2;
import java.math.BigDecimal;
public class Unit13 extends Unit5 {
	private String taxpayerIdNumber;
	private String employeeName;
	private BigDecimal salary;
	

	public Unit13(String name, int age, int height, int weight, String eyeColor, String gender) {
		super(name, age, height, weight, eyeColor, gender);
		// TODO Auto-generated constructor stub
	}


	public String getTaxpayerIdNumber() {
		return taxpayerIdNumber;
	}


	public void setTaxpayerIdNumber(String taxpayerIdNumber) {
		this.taxpayerIdNumber = taxpayerIdNumber;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public BigDecimal getSalary() {
		return salary;
	}


	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
}
