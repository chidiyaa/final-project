package com.example.AdminService.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Persistent;


//This is the company master entity class
@XmlRootElement
@Entity
@Table(name="company_master")
public class CompanyMaster {

	@Persistent
	@javax.persistence.Id
	@Column(name="company_id")
	private String companyId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_address")
	private String companyAddress;
	
	@Column(name="company_person")
	private String contactPerson;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="contact_number")
	private String contactNumber;
	public CompanyMaster() {
		super();
	}
	public CompanyMaster(String companyId, String companyName,
			String companyAddress, String contactPerson, String emailId,
			String contactNumber) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.contactPerson = contactPerson;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
	}
	public CompanyMaster(String companyName, String companyAddress,
			String contactPerson, String emailId, String contactNumber) {
		super();
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.contactPerson = contactPerson;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "CompanyMaster [companyId=" + companyId + ", companyName="
				+ companyName + ", companyAddress=" + companyAddress
				+ ", contactPerson=" + contactPerson + ", emailId="
				+ emailId + ", contactNumber=" + contactNumber + "]";
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
}
