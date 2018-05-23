package DesignModel;//
//  CREADO POR ALEJANDRO VICENTE Y ALBERTO MARCOS
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : IContactosAgenda.java
//  @ Date : 23/05/2018
//  @ Author : 
//
//


import DiagramaDeClases.Usuario;

import java.util.ArrayList;

public interface IContactosAgenda {
	public void buscarContacto(String nombreUsuario);
	public Integer numeroContactos();
	public void borrarContacto(Integer idUsuario);
	public void anadirContacto(Usuario usuario);
	public ArrayList<Usuario> listarContacto();
}
