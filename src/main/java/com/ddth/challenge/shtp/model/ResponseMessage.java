package com.ddth.challenge.shtp.model;

public class ResponseMessage {
	private String message;
	private String status;
	private String date;

	public void setDate(String date) {
		this.date = date;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public String getMessage() {
		return message;
	}

	public String getStatus() {
		return status;
	}
}
