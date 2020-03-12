package co.com.emcali.sidapweb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@Table(name = "USUARIO", uniqueConstraints = {
//        @UniqueConstraint(columnNames = {"username"})
//})
//@JsonIgnoreProperties(value={ "password" }, allowSetters = true)
@Table(name = "BITAOPERADOR1")

public class ReporteTurnos implements Serializable{

	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
	
	@Id
    @Size(max = 40)
	@Column(name="BITAPLANTA")
    @Null
	private String BITAPLANTA;
	
    @Size(max = 8)
	@Column(name="BITAFECH")
    @Null
	private Date BITAFECH;
	
    @Size(max = 40)
    @Column(name="BITATURN")
    @Null
	private int BITATURN;
    
    @Size(max = 13)
    @Column(name="BITATURNLET")
    @Null
	private String BITATURNLET;
    
    @Size(max = 4000)
    @Column(name="BITATEXT")
    @Null
	private String BITATEXT;
    
    @Size(max = 19)
    @Column(name="BITAFECHINITRATADA")
    @Null
	private String BITAFECHINITRATADA;
    
    @Size(max = 19)
    @Column(name="BITAFECHFINTRATADA")
    @Null
	private String BITAFECHFINTRATADA;
    
    @Size(max = 1)
    @Column(name="BITARESE")
    @Null
	private String BITARESE;
    
    @Size(max = 100)
    @Column(name="BITAOPPLANTA")
    @Null
	private String BITAOPPLANTA;
    
    @Size(max = 4000)
    @Column(name="BITAOBSERVACIONES")
    @Null
	private String BITAOBSERVACIONES;
    
    @Size(max = 50)
    @Column(name="BITABOMBTRAB1")
    @Null
	private String BITABOMBTRAB1;
    
    @Size(max = 8)
    @Column(name="BITAFEIB")
    @Null
	private String BITAFEIB;
    
    @Size(max = 8)
    @Column(name="BITAFEFB")
    @Null
	private String BITAFEFB;
    
    @Size(max = 100)
    @Column(name="BITAOPBO")
    @Null
	private String BITAOPBO;

	public ReporteTurnos(@Size(max = 40) @Null String bITAPLANTA, @Size(max = 8) @Null Date bITAFECH,
			@Size(max = 40) @Null int bITATURN, @Size(max = 13) @Null String bITATURNLET,
			@Size(max = 4000) @Null String bITATEXT, @Size(max = 19) @Null String bITAFECHINITRATADA,
			@Size(max = 19) @Null String bITAFECHFINTRATADA, @Size(max = 1) @Null String bITARESE,
			@Size(max = 100) @Null String bITAOPPLANTA, @Size(max = 4000) @Null String bITAOBSERVACIONES,
			@Size(max = 50) @Null String bITABOMBTRAB1, @Size(max = 8) @Null String bITAFEIB,
			@Size(max = 8) @Null String bITAFEFB, @Size(max = 100) @Null String bITAOPBO) {
		super();
		BITAPLANTA = bITAPLANTA;
		BITAFECH = bITAFECH;
		BITATURN = bITATURN;
		BITATURNLET = bITATURNLET;
		BITATEXT = bITATEXT;
		BITAFECHINITRATADA = bITAFECHINITRATADA;
		BITAFECHFINTRATADA = bITAFECHFINTRATADA;
		BITARESE = bITARESE;
		BITAOPPLANTA = bITAOPPLANTA;
		BITAOBSERVACIONES = bITAOBSERVACIONES;
		BITABOMBTRAB1 = bITABOMBTRAB1;
		BITAFEIB = bITAFEIB;
		BITAFEFB = bITAFEFB;
		BITAOPBO = bITAOPBO;
	}




	
//    @Size(min = 8, max = 1000)
//    private String password;
//       
//    private Boolean enabled;
//    
//    @Column(name = "PASSWORD_DEFAULT")
//    private Boolean passwordDefault;
//    
//    @Column
//    private Date fechaNacimiento;
 
	

}