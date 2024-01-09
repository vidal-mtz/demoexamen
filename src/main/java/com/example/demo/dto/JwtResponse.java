package com.example.demo.dto;

import java.io.Serializable;

public class JwtResponse implements Serializable {
	private static final long serialVersionUID = -7963968898320583346L;

	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}
