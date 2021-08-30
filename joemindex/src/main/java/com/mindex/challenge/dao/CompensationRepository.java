/*
 * CompensationRepository.java
 *
 *                 
 * Author: Joseph Lynn
 * Date: 8.29.21
 */
package com.mindex.challenge.dao;

import com.mindex.challenge.data.Compensation;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface CompensationRepository extends MongoRepository<Compensation, String> {
    //Springs mongodb json query method
	Compensation findByEmployeeId(String id);
}
