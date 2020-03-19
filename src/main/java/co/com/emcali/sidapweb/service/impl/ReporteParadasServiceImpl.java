package co.com.emcali.sidapweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.emcali.sidapweb.dto.ReporteParadasDTO;
import co.com.emcali.sidapweb.repository.ReporteParadasRepository;
import co.com.emcali.sidapweb.service.ReporteParadasService;





@Service
public class ReporteParadasServiceImpl implements ReporteParadasService {

	@Autowired
	private ReporteParadasRepository reporteParadasRepository;
	
	public List<ReporteParadasDTO> findByMes(String mes) {
		return reporteParadasRepository.findByMes(mes);
	}
	
	public List<ReporteParadasDTO> findByAnio(String anio) {
		return reporteParadasRepository.findByAnio(anio);
	}
	
	public List<ReporteParadasDTO> findByPlanta(String planta) {
		return reporteParadasRepository.findByPlanta(planta);
	}
	
}
