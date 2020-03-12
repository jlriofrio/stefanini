package co.com.emcali.sidapweb.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.com.emcali.sidapweb.dto.ReporteTurnosDTO;


public interface ReporteTurnosRepository extends JpaRepository<ReporteTurnosDTO, Long>{
	
//	List<ReporteTurnosDTO> findByfechaTurnoBetween(Date fechaInicial, Date fechaFinal);
	
//	@Query(nativeQuery = true,value = "select * from USUARIO where fecha_Nacimiento between :fechaInicial and :fechaFinal")
//	List<ReporteTurnosDTO> findByfechaNacimientoBetween2(@Param(value = "fechaInicial")Date fechaInicial,@Param(value = "fechaFinal") Date fechaFinal);
//
//	@Query(nativeQuery = true,value = "select username, first_name from USUARIO where fecha_Nacimiento between :fechaInicial and :fechaFinal")
//	List<ReporteTurnosDTO> findByfechaNacimientoBetween3(@Param(value = "fechaInicial")Date fechaInicial,@Param(value = "fechaFinal") Date fechaFinal);

	@Query(nativeQuery = true)
	List<ReporteTurnosDTO> findByfechaTurnoBetween(@Param(value = "fechaInicial")Date fechaInicial,@Param(value = "fechaFinal") Date fechaFinal);
	
}
