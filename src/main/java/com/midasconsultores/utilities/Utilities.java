package com.midasconsultores.utilities;

import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utilities {
	
	 public static final DateFormatSymbols formatSymbols = new DateFormatSymbols(new java.util.Locale("es", "ES"));
	 public static final String FORMAT_DATE = "dd/MM/yyyy";		
	 public static final String FORMATO_ISO = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
	 
	 
	 public static LocalDateTime stringToLocalDateTime( String fechaStr, String pattern ) {
		return LocalDateTime.parse( fechaStr,  DateTimeFormatter.ofPattern(pattern) );
	 }
	 
	 public static LocalDate stringToLocalDate( String fechaStr, String pattern ) {
			return LocalDate.parse( fechaStr,  DateTimeFormatter.ofPattern(pattern) );
	 }
		 
	 
	 public static String localDateToString( LocalDate fecha, String pattern  ) {		 
		 String dateString = "";
		 if( fecha != null && pattern != null ) {
			 DateTimeFormatter formatter = DateTimeFormatter.ofPattern( pattern );
			 dateString = fecha.format(formatter);
		 }
		 return dateString;		 
	 }
	 
	 public static LocalDateTime fechaAddDia( LocalDateTime fecha, int dias ){		 	
			
			if( fecha != null ) {
				return fecha.plusDays( dias );
			}			
			return null;
	 }
		 
	 
	 public static LocalDate fechaAddDia( LocalDate fecha, int dias ){		 	
			
		if( fecha != null ) {
			return fecha.plusDays( dias );
		}			
		return null;
	 }
	 
	 public static LocalDate fechaMasUnDia( LocalDate fecha ){	
			
		if( fecha != null ) {
			return fecha.plusDays( 1 );
		}			
		return null;
	}
	 
	 public static LocalDateTime fechaMasUnDia( LocalDateTime fecha ){	
			
			if( fecha != null ) {
				return fecha.plusDays( 1 );
			}			
			return null;
	}
	
	 /*public static Date stringToDate( String fechaStr, String pattern ){
	        SimpleDateFormat template=null;
	        Date date = null;
	        if (pattern != null){
	            template = new SimpleDateFormat(pattern);
	            try{             
		            date = template.parse( fechaStr );            
		        }catch(java.text.ParseException e){
		            date = null;
		        }
	        }	        
	        
	        return date;
	 }
	 
	 public static Date fechaMasUnDia( Date fecha ){
			Date fechaMasUno = null;
			
			if( fecha != null ) {
				GregorianCalendar f = new GregorianCalendar();
				f.setTimeInMillis( fecha.getTime() );
				f.add( GregorianCalendar.DATE, 1 );
				fechaMasUno =   f.getTime();
			}
			
			return fechaMasUno;
	}
	 
	 public static String dateToString(java.util.Date fecha, String pattern){
		 	String date = "";
	        SimpleDateFormat template = null;	        
	        if (pattern != null){
	            template = new SimpleDateFormat( pattern );
	            if (fecha != null) {
	            	date =  template.format(fecha).toString();
		        } else {
		        	date = "";
		        }
	        }
	        return date;
	 }	    
		
	 public static Date fechaAddDia( Date fecha, int dias ){
			Date fechaRespuesta = null;
			
			if( fecha != null ) {
				GregorianCalendar f = new GregorianCalendar();
				f.setTimeInMillis( fecha.getTime() );				
				f.add( GregorianCalendar.DATE, dias );			
				fechaRespuesta =   f.getTime();
			}
			
			return fechaRespuesta;
	}
	 
	public static String cortarCadenaALongitud( String cadena, int longitud ){        
        if(  cadena != null && cadena.length() > longitud ){
            cadena = cadena.substring(0, longitud );
        }        
        return cadena;
    }*/

}
