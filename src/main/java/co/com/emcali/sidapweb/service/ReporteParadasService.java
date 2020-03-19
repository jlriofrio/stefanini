package co.com.emcali.sidapweb.service;

import java.util.List;

import co.com.emcali.sidapweb.dto.ReporteParadasDTO;



public interface ReporteParadasService {

	List<ReporteParadasDTO> findByMes(String mes);
	
	List<ReporteParadasDTO> findByAnio(String anio);
	
	List<ReporteParadasDTO> findByPlanta(String planta);
	
}
