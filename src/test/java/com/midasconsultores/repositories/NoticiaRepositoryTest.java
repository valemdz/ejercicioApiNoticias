package com.midasconsultores.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.midasconsultores.models.Fuente;
import com.midasconsultores.models.Noticia;
import com.midasconsultores.utilities.Utilities;


@DataJpaTest
class NoticiaRepositoryTest {
	
	@Autowired 
	NoticiaRepository noticiaRepository; 
	
	@Autowired
	FuenteRepository FuenteRepository; 

	@Test
	void findBeforeDate() {
		
		Fuente fuente = new Fuente();
		fuente.setId("TN");
		fuente.setNombre("tn");
		fuente.setAlcance("Nacional");
		
		FuenteRepository.save(fuente); 
		

		Date date = Utilities.stringToDate( "20/11/2020", Utilities.FORMAT_DATE );
		
		Noticia noti1 = new Noticia();
		noti1.setId("una");
		noti1.setTitulo("titulo una");
		noti1.setFechaPublicacion(Utilities.stringToDate( "20/11/2020", Utilities.FORMAT_DATE ));
		noti1.setCategoria("NACIONAL");
		noti1.setUrlNoticia("");
		noti1.setFuente( fuente );
		
		noticiaRepository.save(noti1);
		
		List<Noticia> noticias = noticiaRepository.getNoticiasByFechaPublicacion( date );
		
		assertEquals( 1 , noticias.size() );
		
	}

}
