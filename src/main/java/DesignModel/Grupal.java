package DesignModel;//
//  CREADO POR ALEJANDRO VICENTE Y ALBERTO MARCOS
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Grupal.java
//  @ Date : 23/05/2018
//  @ Author : 
//
//


import DiagramaDeClases.Conversacion;
import DiagramaDeClases.Mensaje;
import DiagramaDeClases.Usuario;

import java.util.ArrayList;

public class Grupal extends Conversacion {
	public void anadirParticipante(Usuario usuario) {
	
	}
	
	public void eliminarParticipante(Usuario usuario) {
	
	}
	
	public ArrayList <Mensaje> listarMensajes();
	
	public void borrarMensaj(Integer idMensaje);
	
	public Mensaje getMensaje();
	
	public void enviarMensaje(Mensaje mensaje);
	
	public Conversacion iniciarConversacion(String fechaInicio, Mensaje mensaje, ArrayList<<Usuario>> usuarios);
}
