package DesignModel;//
//  CREADO POR ALEJANDRO VICENTE Y ALBERTO MARCOS
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Usuario.java
//  @ Date : 23/05/2018
//  @ Author : 
//
//


import DesignModel.IMensajeable;
import DiagramaDeClases.Mensaje;

import java.util.ArrayList;

public class Usuario implements IMensajeable {
	private Integer idUsuario;
	private String nombre;
	private String apellidos;
	private String correoElectronico;
	private String contrasena;
	public Usuario () {
	
	}
	
	public void accederSistema() {
	
	}
	
	public Integer getIdUsuario() {
	
	}
	
	public String getNombre() {
	
	}
	
	public String getApellidos() {
	
	}
	
	public String getCorreoElectronico() {
	
	}
	
	public String getContrasena() {
	
	}
	
	public void setIdUsuario(Integer idUsuario) {
	
	}
	
	public void setNombre(String nombre) {
	
	}
	
	public void setApellidos(String apellidos) {
	
	}
	
	public void setContrasena(String contrasena) {
	
	}
	
	public void destroy() {
	
	}
	
	public ArrayList <Mensaje> listarMensajes();

	@Override
	public ArrayList<Mensaje> listarMensajes() {
		return null;
	}

	public void borrarMensaj(Integer idMensaje);
	
	public Mensaje getMensaje();
	
	public void enviarMensaje(Mensaje mensaje);
}
