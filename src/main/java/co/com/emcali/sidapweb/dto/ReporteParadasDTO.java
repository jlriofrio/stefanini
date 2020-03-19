package co.com.emcali.sidapweb.dto;

public interface ReporteParadasDTO {
	
	String getNOMBRE();
	String getAÑO();
	String getMES();
	String getMESLETRAS();
	String getFECHA_EVENTO();
	String getHORA_INICIO_EVENTO();
	String getHORA_FIN_EVENTO();
	int getDURACION_EVENTO_HORAS();
	int getDURACION_EVENTO_HHMM();
	String getEVENTO_PARADA();
	String getSUSPENSION();
	String getFECHA_INICIO_SUSPENSION();
	String getHORA_INICIO_SUSPENSION();
	String getHORA_FINAL_SUSPENSION();
	//int getDURACION_SUSPENSION_HORAS();
	//int getDURACION_HHMM();
	String getCODIGO_SUI();
	int getNUM_PARADAS_SUSP();
	String getNOTAS();
}
