package tutorial2;
import java.util.logging.Logger;
public class Unit9 {
Logger l = Logger.getLogger(Unit7.class.getName());
	

	private	String nickName;
	private String firstName;
	private String lastName;
	private String fullName;
	
	public Unit9(String firstName,  String lastName, String nickName) { 
		this.firstName = firstName;
		this.lastName = lastName; 
		this.nickName = nickName;
		
	}

	public String getfullName() {
		return getFirstName().concat("").concat(getLastName()).concat("").concat(getNickName());
	}
	
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}
