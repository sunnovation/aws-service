package com.aws.service;

import java.util.List;

import com.aws.entity.AWSUser;

public interface IAwsservice {

	List<AWSUser> addUsers(List<AWSUser> users);

}
