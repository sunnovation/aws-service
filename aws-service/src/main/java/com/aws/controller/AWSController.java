package com.aws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.entity.AWSUser;
import com.aws.service.IAwsservice;

@RestController
@RequestMapping("/v1/aws-service")
public class AWSController {
	
	
	@Autowired
	private IAwsservice awsservice;

	
	@GetMapping("/")
	public String initService() {
		return "AWS service is start....";
	}
	
	
	@PostMapping("/add-user")
	public List<AWSUser> addUsers(@RequestBody List<AWSUser> users){
		return awsservice.addUsers(users);
	}
	
}
