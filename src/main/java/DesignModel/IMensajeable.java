//
//  CREADO POR ALEJANDRO VICENTE Y ALBERTO MARCOS
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : IMensajeable.java
//  @ Date : 23/05/2018
//  @ Author : 
//
//




public interface IMensajeable {
	public ArrayList <<Mensaje>> listarMensajes();
	public void borrarMensaj(Integer idMensaje);
	public Mensaje getMensaje();
	public void enviarMensaje(Mensaje mensaje);
}