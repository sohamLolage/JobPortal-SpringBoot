package com.job.portal.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class Job implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long jobId;
	
	private String jobTitle;
	
	private int userId;//companyId
	
	private String location;
	
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY)  
	private JobCategiry jobCategiry;
	
	@OneToMany( cascade = CascadeType.ALL)
	@JoinColumn(name="job_id", referencedColumnName = "jobId")
	private List<Skills> skills;
	
	
	public long getJobId() {
		return jobId;
	}
	public void setJobId(long jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public JobCategiry getJobCategiry() {
		return jobCategiry;
	}
	public void setJobCategiry(JobCategiry jobCategiry) {
		this.jobCategiry = jobCategiry;
	}
	public List<Skills> getSkills() {
		return skills;
	}
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}

	public int getUserId() {
	return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
