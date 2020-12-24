package com.myweb.mysecurity.models;

public class AuthenticationRequest {

	private String userame;
	private String password;

	public AuthenticationRequest() {
	}

	public AuthenticationRequest(String userame, String password) {
		this.userame = userame;
		this.password = password;
	}

	public String getUserame() {
		return userame;
	}

	public void setUserame(String userame) {
		this.userame = userame;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
