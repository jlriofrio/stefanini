package co.com.emcali.sidapweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.emcali.sidapweb.dto.ReporteParadasDTO;
import co.com.emcali.sidapweb.service.ReporteParadasService;

@RestController
@RequestMapping("/paradas")
public class ReporteParadasController {
	
	@Autowired
	private ReporteParadasService reporteParadasService;
	
	@GetMapping(value = "/porMes")
	public ResponseEntity<List<ReporteParadasDTO>> findByMes(@RequestParam(name = "mes") String mes) {
		return ResponseEntity.ok(reporteParadasService.findByMes(mes));
	}
	
	@GetMapping(value = "/porAnio")
	public ResponseEntity<List<ReporteParadasDTO>> findByAnio(@RequestParam(name = "anio") String anio) {
		return ResponseEntity.ok(reporteParadasService.findByAnio(anio));
	}
	
	@GetMapping(value = "/porPlanta")
	public ResponseEntity<List<ReporteParadasDTO>> findByPlanta(@RequestParam(name = "planta") String planta) {
		return ResponseEntity.ok(reporteParadasService.findByPlanta(planta));
	}
		
}
