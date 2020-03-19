package co.com.emcali.sidapweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.com.emcali.sidapweb.dto.ReporteTurnosDTO;
import co.com.emcali.sidapweb.model.ReporteTurnos;

@Repository
public interface ReporteTurnosRepository extends JpaRepository<ReporteTurnos, String>{
	
	@Query(nativeQuery = true, value = "SELECT DISTINCT T1.BITAPLANTA,T1.BITAFECH,T1.BITATURN,(Case T1.BITATURN when 1 then 'Primer Turno' when 2 then 'Segundo Turno' when 3 then 'Tercer Turno' end) BITATURNLET,T1.BITATEXT,TO_CHAR(T1.BITAFECHINITRATADA,'DD-MM-YYYY HH24:MI:SS') BITAFECHINITRATADA,TO_CHAR(T1.BITAFECHFINTRATADA,'DD-MM-YYYY HH24:MI:SS') BITAFECHFINTRATADA,T1.BITARESE,	T1.BITAOPPLANTA,T2.BITAOBSERVACIONES,T2.BITABOMBTRAB1,T2.BITAFEIB,T2.BITAFEFB,T2.BITAOPBO FROM BITAOPERADOR1 T1	INNER JOIN BITAOPBOCATOMA T2 ON T1.BITAFECH = T2.BITAFECHB WHERE T1.BITAFECH BETWEEN TO_DATE(:fechaInicial,'DD/MM/YY') AND TO_DATE(:fechaFinal,'DD/MM/YY') ORDER BY T1.BITAFECH")
	List<ReporteTurnosDTO> findByfechaTurnoBetween(@Param(value = "fechaInicial")String fechaInicial,@Param(value = "fechaFinal") String fechaFinal);
	
	@Query(nativeQuery = true, value = "SELECT DISTINCT T1.BITAPLANTA,T1.BITAFECH,T1.BITATURN,(Case T1.BITATURN when 1 then 'Primer Turno' when 2 then 'Segundo Turno' when 3 then 'Tercer Turno' end) BITATURNLET,T1.BITATEXT,TO_CHAR(T1.BITAFECHINITRATADA,'DD-MM-YYYY HH24:MI:SS') BITAFECHINITRATADA,TO_CHAR(T1.BITAFECHFINTRATADA,'DD-MM-YYYY HH24:MI:SS') BITAFECHFINTRATADA,T1.BITARESE,T1.BITAOPPLANTA,T2.BITAOBSERVACIONES,T2.BITABOMBTRAB1,T2.BITAFEIB,T2.BITAFEFB,T2.BITAOPBO FROM BITAOPERADOR1 T1 INNER JOIN BITAOPBOCATOMA T2 ON T1.BITAFECH = T2.BITAFECHB WHERE T1.BITAPLANTA = :planta ORDER BY T1.BITAFECH")
	List<ReporteTurnosDTO> findByplanta(@Param(value = "planta")String planta);
	
}
