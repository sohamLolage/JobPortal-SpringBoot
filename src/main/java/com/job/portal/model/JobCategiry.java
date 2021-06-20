package com.job.portal.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class JobCategiry implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long jobCategiryId;
	@Column(unique = true , nullable = true)
	private String jobCategiry;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Job> job;
	
	
	
	public long getJobCategiryId() {
		return jobCategiryId;
	}
	public void setJobCategiryId(long jobCategiryId) {
		this.jobCategiryId = jobCategiryId;
	}
	public String getJobCategiry() {
		return jobCategiry;
	}
	public void setJobCategiry(String jobCategiry) {
		this.jobCategiry = jobCategiry;
	}
	public List<Job> getJob() {
		return job;
	}
	public void setJob(List<Job> job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "JobCategiry [jobCategiryId=" + jobCategiryId + ", jobCategiry=" + jobCategiry + ", job=" + job + "]";
	}
	
	

}
