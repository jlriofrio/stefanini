package co.com.emcali.sidapweb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table(name = "PLANTA", schema = "SIDAP")

public class ReporteParadas implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Size(max = 200)
	@Column(name="NOMBRE")
	private String NOMBRE;
	
	@Size(max = 4)
    @Column(name="AÑO")
	private String AÑO;
	
	@Size(max = 2)
    @Column(name="MES")
	private String MES;
	
	@Size(max = 10)
    @Column(name="MESLETRAS")
	private String MESLETRAS;
	
	@Size(max = 10)
    @Column(name="FECHA_EVENTO")
	private String FECHA_EVENTO;
	
	@Size(max = 5)
    @Column(name="HORA_INICIO_EVENTO")
	private String HORA_INICIO_EVENTO;
	
	@Size(max = 5)
    @Column(name="HORA_FIN_EVENTO")
	private String HORA_FIN_EVENTO;
	
	@Column(name="DURACION_EVENTO_HORAS")
	private int DURACION_EVENTO_HORAS;
	
	@Column(name="DURACION_EVENTO_HHMM")
	private int DURACION_EVENTO_HHMM;
	
	@NotNull
	@Size(max = 100)
    @Column(name="EVENTO_PARADA")
	private String EVENTO_PARADA;
	
	@Size(max = 1)
    @Column(name="SUSPENSION")
	private String SUSPENSION;
	
	@Size(max = 10)
    @Column(name="FECHA_INICIO_SUSPENSION")
	private String FECHA_INICIO_SUSPENSION;
	
	@Size(max = 5)
    @Column(name="HORA_INICIO_SUSPENSION")
	private String HORA_INICIO_SUSPENSION;
	
	@Size(max = 5)
    @Column(name="HORA_FINAL_SUSPENSION")
	private String HORA_FINAL_SUSPENSION;
	
//	@Column(name="DURACION_SUSPENSION_HORAS")
//	private int DURACION_SUSPENSION_HORAS;
//	
//	@Column(name="DURACION_HHMM")
//	private int DURACION_HHMM;
	
	@Size(max = 100)
    @Column(name="CODIGO_SUI")
	private String CODIGO_SUI;
	
	@Column(name="NUM_PARADAS_SUSP")
	private int NUM_PARADAS_SUSP;
	
	@Size(max = 300)
    @Column(name="NOTAS")
	private String NOTAS;
	
	
	
	
	
	
}
