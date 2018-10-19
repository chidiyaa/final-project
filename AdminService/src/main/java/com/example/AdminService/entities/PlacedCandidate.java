package com.example.AdminService.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


//This is the placed candidate entity class
@XmlRootElement
@Entity
@Table(name="placed_candidate")
public class PlacedCandidate {
	@Id
	@Column(name="serial_no")
	private Integer sno;
	@Column(name="month")
	private String month;
	@Column(name="company_id")
	private String companyId;
	@Column(name="candidate_id")
	private String candidateId;
	@Column(name="designation")
	private String designation;
	public PlacedCandidate() {
		super();
	}
	@Override
	public String toString() {
		return "PlacedCandidate [month=" + month + ", companyId=" + companyId
				+ ", candidateId=" + candidateId + ", designation="
				+ designation + "]";
	}
	
	
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public PlacedCandidate(Integer sno, String month, String companyId,
			String candidateId, String designation) {
		super();
		this.sno = sno;
		this.month = month;
		this.companyId = companyId;
		this.candidateId = candidateId;
		this.designation = designation;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	
	
}
