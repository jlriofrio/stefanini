package co.com.emcali.sidapweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.emcali.sidapweb.dto.ReporteTurnosDTO;
import co.com.emcali.sidapweb.repository.ReporteTurnosRepository;
import co.com.emcali.sidapweb.service.ReporteTurnosService;

@Service
public class ReporteTurnosServiceImpl implements ReporteTurnosService {
	@Autowired
	private ReporteTurnosRepository reporteTurnosRepository;
	
	public List<ReporteTurnosDTO> findByfechaTurnoBetween(String fechaInicial, String fechaFinal) {
		return reporteTurnosRepository.findByfechaTurnoBetween(fechaInicial, fechaFinal);
	}
	
	public List<ReporteTurnosDTO> findByplanta(String planta) {
		return reporteTurnosRepository.findByplanta(planta);
	}
}
