package com.example.AdminService.exception;

//Exception handler class
public class RecruitmentException extends Exception {

	String msg;
	public RecruitmentException(String msg) {
        super(msg);
    }

	public RecruitmentException() {
		// TODO Auto-generated constructor stub
	}
}