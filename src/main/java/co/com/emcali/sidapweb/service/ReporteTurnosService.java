package co.com.emcali.sidapweb.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import co.com.emcali.sidapweb.dto.ReporteTurnosDTO;


public interface ReporteTurnosService {

	List<ReporteTurnosDTO> findByfechaTurnoBetween(Date fechaInicial, Date fechaFinal);
	
}
