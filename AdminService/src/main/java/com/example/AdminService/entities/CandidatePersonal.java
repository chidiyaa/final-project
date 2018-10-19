package com.example.AdminService.entities;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Persistent;



//This is the candidate personal entity class
@XmlRootElement
@Entity
@Table(name="candidate_personal")
public class CandidatePersonal {
	
	@Persistent
	@javax.persistence.Id
	@Column(name="candidate_id")
//	@SequenceGenerator(name="candidateSeq",sequenceName="seq_candidate_id",allocationSize=1)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="candidateSeq")
	private String candidateId;
	
	@Column(name="candidate_name")
    private String candidateName;
	@Column(name="address")
    private String address;
	
	@Column(name="dob")
    private Date dob;
	
	 @Column(name="email_id")
	    private String emailId;
	    @Column(name="contact_number")
	    private String contactNumber;
	    @Column(name="marital_status")
	    private String maritalStatus;
	    @Column(name="gender")
	    private String gender;
	    @Column(name="passport_number")
	    private String passportNumber;


	    public CandidatePersonal() {
	        super();

	    }

	    public CandidatePersonal(String candidateId, String candidateName,
	            String address, Date dob, String emailId, String contactNumber,
	            String maritalStatus, String gender, String passportNumber) {
	        super();
	        this.candidateId = candidateId;
	        this.candidateName = candidateName;
	        this.address = address;
	        this.dob = dob;
	        this.emailId = emailId;
	        this.contactNumber = contactNumber;
	        this.maritalStatus = maritalStatus;
	        this.gender = gender;
	        this.passportNumber = passportNumber;

	    }

	    public String getCandidateId() {
	        return candidateId;
	    }
	    public void setCandidateId(String candidateId) {
	        this.candidateId = candidateId;
	    }
	    public String getCandidateName() {
	        return candidateName;
	    }
	    public void setCandidateName(String candidateName) {
	        this.candidateName = candidateName;
	    }
	    public String getAddress() {
	        return address;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }
	    public Date getDob() {
	        return dob;
	    }
	    public void setDob(Date dob) {
	        this.dob = dob;
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
	    public String getMaritalStatus() {
	        return maritalStatus;
	    }
	    public void setMaritalStatus(String maritalStatus) {
	        this.maritalStatus = maritalStatus;
	    }
	    public String getGender() {
	        return gender;
	    }
	    public void setGender(String gender) {
	        this.gender = gender;
	    }
	    public String getPassportNumber() {
	        return passportNumber;
	    }
	    public void setPassportNumber(String passportNumber) {
	        this.passportNumber = passportNumber;
	    }


	    @Override
	    public String toString() {
	        return "Candidate_Personal [candidateId=" + candidateId
	                + ", candidateName=" + candidateName + ", address=" + address
	                + ", dob=" + dob + ", emailId=" + emailId + ", contactNumber="
	                        + contactNumber + ", maritalStatus=" + maritalStatus
	                        + ", gender=" + gender + ", passportNumber=" + passportNumber
	                        +  "]";
	    }


}
