package com.apap.tutorial5.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apap.tutorial5.model.FlightModel;
import com.apap.tutorial5.repository.FlightDb;


@Service
@Transactional
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightDb flightDb;
	
	@Override
	public void addFlight(FlightModel flight) {
		flightDb.save(flight);
	}
	
	@Override
	public FlightModel getFlightDetailById(long id) {
		return flightDb.findById(id);
	}
	
	@Override
	public void deleteFlight(FlightModel flight) {
		flightDb.delete(flight);
	}
	
	@Override
	public void updateFlight(FlightModel newflight) {
		FlightModel old = this.getFlightDetailById(newflight.getId());
		System.out.println(old.getFlightNumber());
		old.setFlightNumber(newflight.getFlightNumber());
		old.setOrigin(newflight.getOrigin());
		old.setDestination(newflight.getDestination());
		old.setTime(newflight.getTime());
	}

}
