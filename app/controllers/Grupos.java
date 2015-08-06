package controllers;

import java.util.List;

import models.Grupo;
import play.mvc.Controller;


public class Grupos  extends Controller{
	//renderiza el index de la clase grupo
	public static void index(){
	//	String saludo=" Hola gente";
		List<Grupo> grupos =Grupo.findAll();
		
		render(grupos);
	}
	
	public static void nuevo(){
		render();
	}
	public static void guardar(String nombre, String descripcion){
		Grupo nuevoGrupo= new Grupo(nombre, descripcion);
		nuevoGrupo.save();
		index();
	}

	public static void eliminar(long id){
		Grupo grupoEliminar=Grupo.findById(id);
		grupoEliminar.delete();
		
		index();
	}
	
	public static void modificar(long id){
		Grupo grupoModificar=Grupo.findById(id);
		render(grupoModificar);

	}
	
	public static void actualizar(long id, String nombre, String descripcion){
		Grupo grupoActualizar= Grupo.findById(id) ;
		grupoActualizar.nombre= nombre;
		grupoActualizar.descripcion= descripcion;
		grupoActualizar.save();
		index();
	
	}
}
