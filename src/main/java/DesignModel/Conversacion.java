package DesignModel;//
//  CREADO POR ALEJANDRO VICENTE Y ALBERTO MARCOS
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Conversacion.java
//  @ Date : 23/05/2018
//  @ Author : 
//
//


import DiagramaDeClases.Mensaje;

import java.util.ArrayList;

public class Conversacion implements IMensajeable, IConversacionFactoryMethod {
	private String fechaInicio;
	public Conversacion() {
	
	}
	
	protected String getFechaInicio() {
	
	}
	
	protected void serFechaInicio(String fecha) {
	
	}
	
	protected void destroy() {
	
	}
	
	public ArrayList <Mensaje> listarMensajes();
	
	public void borrarMensaj(Integer idMensaje);
	
	public Mensaje getMensaje();
	
	public void enviarMensaje(Mensaje mensaje);
	
	public Conversacion iniciarConversacion(String fechaInicio, Mensaje mensaje, ArrayList<<Usuario>> usuarios);

	@Override
	public DiagramaDeClases.Conversacion iniciarConversacion(String fechaInicio, Mensaje mensaje, ArrayList<DiagramaDeClases.Usuario> usuarios) {
		return null;
	}
}
