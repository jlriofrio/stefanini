package co.com.emcali.sidapweb.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<ReporteTurnosDTO> findByfechaTurnoBetween(@RequestParam(name = "fechaInicial") Date fechaInicial,@RequestParam(name = "fechaFinal") Date fechaFinal) {
		return reporteTurnoService.findByfechaTurnoBetween(fechaInicial, fechaFinal);
	}
}
