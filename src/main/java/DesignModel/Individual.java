package DesignModel;//
//  CREADO POR ALEJANDRO VICENTE Y ALBERTO MARCOS
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Individual.java
//  @ Date : 23/05/2018
//  @ Author : 
//
//


import DiagramaDeClases.Conversacion;
import DiagramaDeClases.Mensaje;
import DiagramaDeClases.Usuario;

import java.util.ArrayList;

public class Individual extends Conversacion {
	public ArrayList<Mensaje> listarMensajes();
	public void borrarMensaj(Integer idMensaje);
	public Mensaje getMensaje();
	public void enviarMensaje(Mensaje mensaje);
	public Conversacion iniciarConversacion(String fechaInicio, Mensaje mensaje, ArrayList<<Usuario>> usuarios);
}
