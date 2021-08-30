/*
 * CompensationService.java
 *
 *                 
 * Author: Joseph Lynn
 * Date: 8.29.21
 */

package com.mindex.challenge.service;

import com.mindex.challenge.data.Compensation;

public interface CompensationService {
    Compensation create(Compensation compensation);
    Compensation read(String id);
}
