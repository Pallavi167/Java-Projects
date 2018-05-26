package com.fullstack.springboot.service;

import java.util.concurrent.Future;

import com.fullstack.springboot.model.FareResponse;


/**
 * Created by Pallavi.
 */
public interface FareService {

    public Future<FareResponse> findFare(String origin, String destination);
}
