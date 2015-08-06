package controllers;

import java.util.List;// libreria de list

import models.Contacto;
import models.Grupo;
import play.mvc.Controller;

public class Contactos extends Controller {

    public static void index() {
        render();
    }
    public static void nuevo() {
    	
    	List<Grupo> grupos= Grupo.findAll();
        render( grupos);
    }
    
    public static void guardarContacto(String nombre, String numero, long idGrupo){
    	Grupo grupoElegido= Grupo.findById(idGrupo);
		Contacto nuevoContacto= new Contacto(nombre, numero,grupoElegido);
		nuevoContacto.save();
		index();
	}

}
