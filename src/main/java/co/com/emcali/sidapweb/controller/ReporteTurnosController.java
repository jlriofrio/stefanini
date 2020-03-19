package co.com.emcali.sidapweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.emcali.sidapweb.dto.ReporteTurnosDTO;
import co.com.emcali.sidapweb.service.ReporteTurnosService;

@RestController
@RequestMapping("/turnos")
public class ReporteTurnosController {

	@Autowired
	private ReporteTurnosService reporteTurnoService;
	
	@GetMapping
	public ResponseEntity<List<ReporteTurnosDTO>> findByfechaTurnoBetween(@RequestParam(name = "fechaInicial") String fechaInicial,@RequestParam(name = "fechaFinal") String fechaFinal) {
		return ResponseEntity.ok(reporteTurnoService.findByfechaTurnoBetween(fechaInicial, fechaFinal));
	}
	
	@GetMapping(value = "/porPlanta")
	public ResponseEntity<List<ReporteTurnosDTO>> findByplanta(@RequestParam(name = "planta") String planta) {
		return ResponseEntity.ok(reporteTurnoService.findByplanta(planta));
	}
}
