package com.apap.tutorial5.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apap.tutorial5.model.FlightModel;
import com.apap.tutorial5.model.PilotModel;
import com.apap.tutorial5.repository.PilotDb;

@Service
@Transactional
public class PilotServiceImpl implements PilotService {
	
	@Autowired
	private PilotDb pilotDb;

	@Override
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		// TODO Auto-generated method stub
		return pilotDb.findByLicenseNumber(licenseNumber);
	}

	@Override
	public void addPilot(PilotModel pilot) {
		// TODO Auto-generated method stub
		pilotDb.save(pilot);
	}

	@Override
	public void deletePilot(PilotModel pilot) {
		// TODO Auto-generated method stub
		pilotDb.delete(pilot);
	}

	@Override
	public List<FlightModel> getListFlightByLicenseNumber(String licenseNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePilot(PilotModel pilot) {
		// TODO Auto-generated method stub
		
	}

}
