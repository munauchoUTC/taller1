package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class Contacto extends Model {
	public String nombre;
	public String numero;
	
	@ManyToOne 
	//relacciona laa clase grupo con la clase contaacto
	///variable grupo k contiene nombre y descripcion
	public Grupo grupo;
	
	public Contacto(String nombre, String numero, Grupo grupo) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.grupo = grupo;
	}
	
	
    
}
