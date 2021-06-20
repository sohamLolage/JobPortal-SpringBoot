package com.job.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.portal.model.Job;
import com.job.portal.model.User;
import com.job.portal.service.CompanyService;

@RestController
@RequestMapping("/company")
@CrossOrigin
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/")
	public ResponseEntity<Job> addJob(@RequestBody Job job){
		return new ResponseEntity<Job>(companyService.addJob(job),HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteJob(@PathVariable long id){
		companyService.deleteJob(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/jobs/{companyId}")
	public ResponseEntity<List<Job>> showPostedJob(@PathVariable long companyId){
		return new ResponseEntity<List<Job>>(companyService.showJobPosted(companyId),HttpStatus.OK);
	}
	@GetMapping("/candidate/{jobId}")
	public ResponseEntity<List<User>> showCandidate(@PathVariable long jobId){
		return new ResponseEntity<List<User>>(companyService.applyCandidate(jobId),HttpStatus.OK);
	}
	
	

}
