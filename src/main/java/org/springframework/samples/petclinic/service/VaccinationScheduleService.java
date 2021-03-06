package org.springframework.samples.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.VaccinationSchedule;
import org.springframework.samples.petclinic.repository.VaccinationScheduleRepository;
import org.springframework.stereotype.Service;

@Service
public class VaccinationScheduleService {
	
	
	@Autowired
	VaccinationScheduleRepository vSRepository;
	
	public void saveVaccSchedule(VaccinationSchedule vacSchedule) {
		this.vSRepository.save(vacSchedule);
	}

	public VaccinationSchedule findById(int id) {
		return vSRepository.findById(id);	
	}

}
