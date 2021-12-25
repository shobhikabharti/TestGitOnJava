/**
 * 
 */
package com.example.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author shobhikabharti
 *
 */
public class TestTheBranch {
	String name;
	String address;
	Integer phone;
	String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,63}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		boolean matches = matcher.matches();
		
		this.email = matches? email:"invalid";
	}

}
