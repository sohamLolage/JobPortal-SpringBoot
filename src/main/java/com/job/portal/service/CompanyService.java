package com.job.portal.service;

import java.util.List;

import com.job.portal.model.Job;
import com.job.portal.model.User;

public interface CompanyService {
	public Job addJob(Job job);
	public void deleteJob(long id);
	public List<Job> showJobPosted(long companyId);
	public List<User> applyCandidate(long jobId);

}
