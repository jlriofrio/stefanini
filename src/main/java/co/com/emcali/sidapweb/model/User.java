package co.com.emcali.sidapweb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "USUARIO", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username"})
})
@JsonIgnoreProperties(value={ "password" }, allowSetters = true)
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    @Size(max = 40)
	@Column(name="first_name")
    @NotNull
	private String firstName;
	
    @Size(max = 40)
	@Column(name="last_name")
    @NotNull
	private String lastName;
	
    @Size(max = 40)
    @Column(name="username")
    @NotNull
    @Email
	private String username;
	
    @Size(min = 8, max = 1000)
    private String password;
       
    private Boolean enabled;
    
    @Column(name = "PASSWORD_DEFAULT")
    private Boolean passwordDefault;
 
    
	public User() {
		
	}
	
	public User(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }
}