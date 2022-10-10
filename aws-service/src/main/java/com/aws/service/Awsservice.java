package com.aws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws.entity.AWSUser;
import com.aws.repository.AWSRepository;

@Service
public class Awsservice implements IAwsservice {
	@Autowired
	private AWSRepository repository;

	@Override
	public List<AWSUser> addUsers(List<AWSUser> users) {
		return repository.saveAll(users);
	}
	
	

	
	
	
}
