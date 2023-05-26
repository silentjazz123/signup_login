package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class student
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String email;
	long mobile;
	String password;
	String gender;
	public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setGender(String gender2) {
		// TODO Auto-generated method stub
		
	}
	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(String password2) {
		// TODO Auto-generated method stub
		
	}
	public void setPhone(long parseLong) {
		// TODO Auto-generated method stub
		
	}
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPhone() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
