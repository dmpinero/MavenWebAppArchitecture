package com.tecnisev;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.util.GenericForwardComposer;

public class ClaseEjemplo extends GenericForwardComposer {

	public int variable=0;
	private String cadenaEjemplo;
	private static final Logger log = Logger.getLogger(ClaseEjemplo.class);
	
	/**
	 * @param args
	 */
	
	public void tellMeSomething(int i) 
	{
        if (i < 5) {
        	log.debug("Soy menor que cinco");
            
        	return;
        }

        if (i % 2 == 0) {
        	log.debug("Soy un número par");
            
        	return;
        }
	}	
	
	// Inyección de dependencias con Spring
	public String getCadenaEjemplo() {
		return cadenaEjemplo;
	}

	public void setCadenaEjemplo(String cadenaEjemplo) {
		this.cadenaEjemplo = cadenaEjemplo;
		log.debug("La variable cadenaEjemplo vale:" + cadenaEjemplo);
	}	
	
	public String execute()
	{
		log.debug("Ejecutando action de Struts 2...");
		return "success";
	}
}