package co.com.emcali.sidapweb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table(name = "BITAOPERADOR1", schema = "SIDAP")

public class ReporteTurnos implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Size(max = 40)
	@NotNull
	@Column(name="BITAPLANTA")
	private String BITAPLANTA;
	
	@NotNull
    @Column(name="BITAFECH")
	private Date BITAFECH;
	
	@NotNull
    @Column(name="BITATURN")
	private int BITATURN;
    
    @Size(max = 13)
    @Column(name="BITATURNLET")
    private String BITATURNLET;
    
    @Size(max = 4000)
    @Column(name="BITATEXT")
    private String BITATEXT;
    
    @Size(max = 19)
    @Column(name="BITAFECHINITRATADA")
    private String BITAFECHINITRATADA;
    
    @Size(max = 19)
    @Column(name="BITAFECHFINTRATADA")
    private String BITAFECHFINTRATADA;
    
    @Size(max = 1)
    @Column(name="BITARESE")
    private String BITARESE;
    
    @Size(max = 100)
    @Column(name="BITAOPPLANTA")
    private String BITAOPPLANTA;
    
    @Size(max = 4000)
    @Column(name="BITAOBSERVACIONES")
	private String BITAOBSERVACIONES;
    
    @Size(max = 50)
    @Column(name="BITABOMBTRAB1")
    private String BITABOMBTRAB1;
    
    @Column(name="BITAFEIB")
	private Date BITAFEIB;
    
    @Column(name="BITAFEFB")
	private Date BITAFEFB;
    
    @Size(max = 100)
    @Column(name="BITAOPBO")
	private String BITAOPBO;

}