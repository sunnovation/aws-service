package com.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aws.entity.AWSUser;

@Repository
public interface AWSRepository extends JpaRepository<AWSUser, Integer> {

}
