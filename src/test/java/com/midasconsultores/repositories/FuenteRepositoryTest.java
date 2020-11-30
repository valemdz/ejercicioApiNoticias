package com.midasconsultores.repositories;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;

import com.midasconsultores.models.Fuente;

@DataJpaTest
@TestPropertySource(properties = {
        "spring.jpa.hibernate.ddl-auto=create-drop"     
})
class FuenteRepositoryTest {
	
	@Autowired
	FuenteRepository fuenteRepository;

	@Test
	void whenSaved_thenFindsById() {
		
		Fuente fuente = new Fuente();
		fuente.setId("1");
		fuente.setNombre("ValeNews");
		fuente.setAlcance("Nacional");
		
		Fuente fuenteSaved = fuenteRepository.save(fuente);
		
		assertThat( fuenteRepository.findById( fuenteSaved.getId() ) ).isNotNull();	
		
		
	}

}
