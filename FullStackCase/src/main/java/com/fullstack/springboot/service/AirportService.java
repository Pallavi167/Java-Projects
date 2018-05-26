package com.fullstack.springboot.service;

import java.io.IOException;
import java.util.concurrent.Future;

import com.fullstack.springboot.model.Location;
import com.fullstack.springboot.model.LocationSearchResult;

/**
 * Created by Pallavi
 */
public interface AirportService {

	public Future<Location> findAirportByCode(String code);

	public Future<LocationSearchResult> findAirport(String searchString) throws IOException;
}
