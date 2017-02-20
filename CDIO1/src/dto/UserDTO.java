package dto;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//Packet imports
import validation.IException.InpExc;


public class UserDTO implements Serializable{

	private static final long serialVersionUID = 4545864587995944260L;
	private int	userId;                     
	private String userName, cpr, password, ini;                              
	private List<String> roles;
	private ArrayList<String> usrDB;
	
	public UserDTO() {
		this.roles = new ArrayList<>();
		this.usrDB = new ArrayList<>();
	}
	
	//Cpr operations
	public String getCpr() throws InpExc{
		return cpr;
	}
	
	public void setCpr(String cpr) throws InpExc{
		checkCpr(cpr);
		this.cpr = cpr;
	}
	
	public boolean checkCpr(String cpr) throws InpExc{
		if(!usrDB.contains(cpr)){
			return true;
		}
		return false;
	}
	
	//Password operations
	public String getPassword() throws InpExc{
		return password;
	}
	
	public void setPassword(String password) throws InpExc{
		this.password = password;
	}
	
	//Id operations
	public int getUserId() throws InpExc{
		return userId;
	}
	
	public void setUserId(int userId) throws InpExc{
		checkUserId(userId);
		this.userId = userId;
	}
	
	public boolean checkUserId(int userId) throws InpExc{
		if(!usrDB.contains(userId)){
			return true;
		}
		return false;
	}
	
	
	//Name operations
	public String getUserName() throws InpExc{
		return userName;
	}
	
	public void setUserName(String userName) throws InpExc{
		checkUserName(userName);
		this.userName = userName;
	}
	
	public boolean checkUserName(String userName) throws InpExc{
		if(!usrDB.contains(userName)){
			return true;
		}
		return false;
	}
	
	
	//Ini operations
	public String getIni() throws InpExc {
		checkIni(ini);
		return ini;
	}
	
	public void setIni(String ini) throws InpExc {
		checkIni(ini);
		this.ini = ini;
	}
	
	public boolean checkIni(String ini) throws InpExc{
		if(!usrDB.contains(ini)){
			return true;
		}
		return false;
	}

	
	//Role operations
	public List<String> getRoles() throws InpExc{
		return roles;
	}
	public void setRoles(List<String> roles) throws InpExc{
		this.roles = roles;
	}
	
	public void addRole(String role) throws InpExc{
		this.roles.add(role);
	}
	/**
	 * 
	 * @param role
	 * @return true if role existed, false if not
	 */
	public boolean removeRole(String role) throws InpExc{
		return this.roles.remove(role);
	}

	
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", ini=" + ini + ", roles=" + roles + "]";
	}
	
	
	
}
