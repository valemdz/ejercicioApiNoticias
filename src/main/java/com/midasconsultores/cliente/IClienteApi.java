package com.midasconsultores.cliente;

import java.time.LocalDate;
import java.util.List;
import com.midasconsultores.models.Fuente;
import com.midasconsultores.models.Noticia;

public interface IClienteApi {
	
	public static final String FORMATO_API = "yyyy-MM-dd";	 
	
	public List<Fuente> getFuentes();	
	public List<Noticia> getNoticias( LocalDate fecha );

}
